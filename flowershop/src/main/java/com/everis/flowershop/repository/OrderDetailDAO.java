package com.everis.flowershop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.flowershop.repository.entity.OrderDetail;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Integer> {

}
