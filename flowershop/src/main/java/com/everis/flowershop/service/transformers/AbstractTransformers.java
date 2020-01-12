package com.everis.flowershop.service.transformers;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTransformers<D, E> {
	
	public abstract D toDTO(E e);

	public abstract E toEntity(D d);

	public List<D> toDTOList(List<E> entityList) {
		List<D> dtoList = new ArrayList<>();

		for (E e : entityList) {
			dtoList.add(toDTO(e));
		}

		return dtoList;
	}

	public List<E> toEntityList(List<D> dtoList) {
		List<E> entityList = new ArrayList<>();

		for (D d : dtoList) {
			entityList.add(toEntity(d));
		}

		return entityList;
	}
}
