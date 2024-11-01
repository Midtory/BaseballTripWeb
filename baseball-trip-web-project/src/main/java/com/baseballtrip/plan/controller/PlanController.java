package com.baseballtrip.plan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baseballtrip.plan.service.PlanService;

@RestController
@RequestMapping("/plan")
public class PlanController {

	private final PlanService planService;
	
	@Autowired
	public PlanController(PlanService planService) {
		this.planService = planService;
	}
	
	@PostMapping("/likelist")
	public ResponseEntity<?> getLikePlanList() {
		
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/save")
	public ResponseEntity<?> savePlan() {
		
		return ResponseEntity.created(null).build();
	}
	
	@PatchMapping("/share")
	public ResponseEntity<?> sharePlan() {
		
		return ResponseEntity.ok(null);
	}
	
	@GetMapping("/list")
	public ResponseEntity<?> getPlanList() {
		
		return ResponseEntity.ok(null);
	}
}
