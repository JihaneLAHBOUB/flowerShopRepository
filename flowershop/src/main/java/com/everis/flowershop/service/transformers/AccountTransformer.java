package com.everis.flowershop.service.transformers;

import com.everis.flowershop.repository.entity.Account;
import com.everis.flowershop.service.dto.AccountDTO;

public class AccountTransformer extends AbstractTransformers<AccountDTO, Account> {

	@Override
	public AccountDTO toDTO(Account entity) {

		AccountDTO dto = new AccountDTO();

		dto.setUsername(entity.getUsername());
		dto.setPassword(entity.getPassword());
		dto.setFullname(entity.getFullname());
		dto.setEmail(entity.getEmail());

		return dto;
	}

	@Override
	public Account toEntity(AccountDTO dto) {

		Account entity = new Account();

		entity.setUsername(dto.getUsername());
		entity.setPassword(dto.getPassword());
		entity.setFullname(dto.getFullname());
		entity.setEmail(dto.getEmail());

		return entity;
	}

}
