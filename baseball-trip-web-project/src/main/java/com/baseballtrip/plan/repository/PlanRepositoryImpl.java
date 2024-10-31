package com.baseballtrip.plan.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baseballtrip.plan.mapper.PlanMapper;

@Repository
public class PlanRepositoryImpl implements PlanRepository {

	private final PlanMapper planMapper;
	
	@Autowired
	public PlanRepositoryImpl(PlanMapper planMapper) {
		this.planMapper = planMapper;
	}
	
}
