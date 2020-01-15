package com.everis.flowershop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.flowershop.repository.entity.Account;

public interface AccountDAO extends JpaRepository<Account, String> {

}
