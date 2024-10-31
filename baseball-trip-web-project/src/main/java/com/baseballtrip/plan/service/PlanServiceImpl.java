package com.baseballtrip.plan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baseballtrip.plan.repository.PlanRepository;

@Service
public class PlanServiceImpl implements PlanService {
	
	private final PlanRepository planRepository;
	
	@Autowired
	public PlanServiceImpl(PlanRepository planRepository) {
		this.planRepository = planRepository;
	}

}
