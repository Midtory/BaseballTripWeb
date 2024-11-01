package com.baseballtrip.plan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baseballtrip.plan.dto.ResponseAllPlanDto;
import com.baseballtrip.plan.dto.ResponseLikePlanDto;
import com.baseballtrip.plan.dto.ResponsePlanDetailDto;
import com.baseballtrip.plan.dto.ResponsePlanDto;
import com.baseballtrip.plan.dto.ResponseRecommendPlanDto;
import com.baseballtrip.plan.service.PlanService;

@RestController
@RequestMapping("/plan")
public class PlanController {

	private final PlanService planService;
	
	@Autowired
	public PlanController(PlanService planService) {
		this.planService = planService;
	}
	
	@GetMapping("/list/all")
	public ResponseEntity<?> getAllPlanList() {
		
		List<ResponseAllPlanDto> allPlanList = null;
		
		return ResponseEntity.ok(allPlanList);
	}
	
	@GetMapping("/list/like")
	public ResponseEntity<?> getLikePlanList() {
		
		List<ResponseLikePlanDto> likePlanList = null;
		
		return ResponseEntity.ok(likePlanList);
	}
	
	@GetMapping("/list/recommend")
	public ResponseEntity<?> getRecommendPlanList() {
		
		List<ResponseRecommendPlanDto> recommendPlanList = null;
		
		return ResponseEntity.ok(recommendPlanList);
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> savePlan() {
		
		return ResponseEntity.created(null).build();
	}
	
	@GetMapping("/load/{planId}")
	public ResponseEntity<?> loadPlan(@PathVariable(name = "planId") int planId) {
		
		ResponsePlanDetailDto responsePlanDetailDto = null;
		
		return ResponseEntity.ok(responsePlanDetailDto);
	}
	
	@PatchMapping("/share/{planId}")
	public ResponseEntity<?> sharePlan(@PathVariable(name = "planId") int planId) {
		
		return ResponseEntity.ok(null);
	}
	
	@PatchMapping("/noshare/{planId}")
	public ResponseEntity<?> cancleSharePlan(@PathVariable(name = "planId") int planId) {
		
		return ResponseEntity.ok(null);
	}
	
	@GetMapping("/list")
	public ResponseEntity<?> getPlanList() {
		
		return ResponseEntity.ok(null);
	}
}
