package com.everis.flowershop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.flowershop.repository.entity.Orders;

public interface OrderDAO extends JpaRepository<Orders, Integer> {

}
