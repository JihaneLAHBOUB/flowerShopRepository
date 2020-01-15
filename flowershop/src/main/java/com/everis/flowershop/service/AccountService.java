package com.everis.flowershop.service;

import com.everis.flowershop.repository.entity.Account;
import com.everis.flowershop.service.dto.AccountDTO;

public interface AccountService {

	public AccountDTO create(AccountDTO account);
	
	public AccountDTO login(String username, String password);
	
	public Account findUser(String username);
	
}
