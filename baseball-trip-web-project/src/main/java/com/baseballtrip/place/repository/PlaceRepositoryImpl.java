package com.baseballtrip.place.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baseballtrip.place.mapper.PlaceMapper;

@Repository
public class PlaceRepositoryImpl implements PlaceRepository {

	private final PlaceMapper placeMapper;
	
	@Autowired
	public PlaceRepositoryImpl(PlaceMapper placeMapper) {
		this.placeMapper = placeMapper;
	}
	
}
