package com.baseballtrip.user.dto;

public class ResponseCheckEmailDto {
	private String msg;
	private Boolean valid;
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Boolean getValid() {
		return valid;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
	}
}
