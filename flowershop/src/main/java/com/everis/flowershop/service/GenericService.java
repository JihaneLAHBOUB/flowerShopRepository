package com.everis.flowershop.service;

import java.util.List;

public interface GenericService<T, K> {
	
	T saveData(T t);
	T updateData(T t);
	void deleteData(T t);
	T getDataById(K k);
	List<T> getAllData();

}
