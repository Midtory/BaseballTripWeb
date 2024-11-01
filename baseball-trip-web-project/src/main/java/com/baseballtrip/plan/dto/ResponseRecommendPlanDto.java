package com.baseballtrip.plan.dto;

import java.util.List;

public class ResponseRecommendPlanDto {
	private Integer planId;
	private String planName;
	private String userNickname;
	private Integer likesCount;
	private Integer reviewsCount;
	private List<String> planDetails;
	
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public Integer getLikesCount() {
		return likesCount;
	}
	public void setLikesCount(Integer likesCount) {
		this.likesCount = likesCount;
	}
	public Integer getReviewsCount() {
		return reviewsCount;
	}
	public void setReviewsCount(Integer reviewsCount) {
		this.reviewsCount = reviewsCount;
	}
	public List<String> getPlanDetails() {
		return planDetails;
	}
	public void setPlanDetails(List<String> planDetails) {
		this.planDetails = planDetails;
	}
}
