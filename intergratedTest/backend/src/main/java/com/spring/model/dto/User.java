package com.spring.model.dto;

public class User {
	private String id;
	private String password;
	private String nickName;
	
	//기본 생성자
	public User() {

	}
	//변수가 들어가는 생성자
	public User(String id, String password, String nickName) {
		this.id = id;
		this.password = password;
		this.nickName = nickName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", nickName=" + nickName + "]";
	}
	
}
