package com.everis.flowershop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.flowershop.repository.entity.Category;

@Repository
public interface CategoryDAO extends JpaRepository<Category, Long> {

}
