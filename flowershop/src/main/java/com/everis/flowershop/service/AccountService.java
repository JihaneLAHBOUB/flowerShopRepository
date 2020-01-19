package com.everis.flowershop.service;

import com.everis.flowershop.service.dto.AccountDTO;

public interface AccountService {

	public AccountDTO create(AccountDTO account);

	public AccountDTO login(String username, String password);

	public AccountDTO findUser(String username);

}
