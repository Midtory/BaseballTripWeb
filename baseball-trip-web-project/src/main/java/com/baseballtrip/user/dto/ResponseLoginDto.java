package com.baseballtrip.user.dto;

public class ResponseLoginDto {
	private String email;
	private String nickname;
	private String team;
	private String profileImg;
	private Integer wins;
	private Integer loses;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getProfileImg() {
		return profileImg;
	}
	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}
	public Integer getWins() {
		return wins;
	}
	public void setWins(Integer wins) {
		this.wins = wins;
	}
	public Integer getLoses() {
		return loses;
	}
	public void setLoses(Integer loses) {
		this.loses = loses;
	}
}
