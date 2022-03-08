package com.zerobase.lms.member.model;


import java.time.LocalDateTime;

import lombok.Data; //롬북이 게터세터 만들기 편하게 해줌
import lombok.ToString;


public class MemberInput {

	
    @Override
	public String toString() {
		return "MemberInput [userId=" + userId + ", userName=" + userName + ", password=" + password + ", phone="
				+ phone + "]";
	}
    private String userId;
	private String userName;
    private String password;
    private String phone;
    //private LocalDateTime regDt;
    
    
    public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
