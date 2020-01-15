package com.everis.flowershop.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.flowershop.repository.AccountDAO;
import com.everis.flowershop.repository.crypt.BCrypt;
import com.everis.flowershop.repository.entity.Account;
import com.everis.flowershop.repository.entity.Category;
import com.everis.flowershop.service.AccountService;
import com.everis.flowershop.service.dto.AccountDTO;
import com.everis.flowershop.service.dto.CategoryDTO;
import com.everis.flowershop.service.transformers.AccountTransformer;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDAO accountDAO;
	AccountTransformer transformer = new AccountTransformer();
	
	@Override
	public AccountDTO create(AccountDTO accountDTO) {
		
		Account accountToCreate = transformer.toEntity(accountDTO);
		Account accountCreated = accountDAO.save(accountToCreate);
		AccountDTO createdAccountDTO = transformer.toDTO(accountCreated);

		return createdAccountDTO;
	}

	@Override
	public AccountDTO login(String username, String password) {
			
		Account account = this.findUser(username);
		if(account != null) {
			if(BCrypt.checkpw(password, account.getPassword())) {
				AccountDTO accountDTO = transformer.toDTO(account);
				return accountDTO;
			}
		}
		
		return null;
	}

	@Override
	public Account findUser(String username) {
		
		Optional<Account> account = accountDAO.findById(username);
		if(account.isPresent()) {
			return account.get();
		}
		return null;
	}

}
