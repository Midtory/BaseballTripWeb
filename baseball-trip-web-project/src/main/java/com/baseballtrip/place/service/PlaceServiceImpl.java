package com.baseballtrip.place.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baseballtrip.place.repository.PlaceRepository;

@Service
public class PlaceServiceImpl implements PlaceService {

	private final PlaceRepository placeRepository;
	
	@Autowired
	public PlaceServiceImpl(PlaceRepository placeRepository) {
		this.placeRepository = placeRepository;
	}
	
}
