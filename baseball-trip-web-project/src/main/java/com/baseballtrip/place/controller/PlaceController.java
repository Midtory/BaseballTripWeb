package com.baseballtrip.place.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baseballtrip.place.service.PlaceService;

@RestController
@RequestMapping("/place")
public class PlaceController {

	private final PlaceService placeService;
	
	@Autowired
	public PlaceController(PlaceService placeService) {
		this.placeService = placeService;
	}
	
}
