package com.everis.flowershop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.flowershop.repository.entity.Flowers;

@Repository
public interface FlowersDAO extends JpaRepository<Flowers, Long> {
	
}
