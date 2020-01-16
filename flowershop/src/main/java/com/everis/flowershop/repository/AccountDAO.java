package com.everis.flowershop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.flowershop.repository.entity.Account;

@Repository
public interface AccountDAO extends JpaRepository<Account, String> {

}
