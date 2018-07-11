package com.blankj.custom.anotition;

@Table(name = "tb_user")
public class User {

	@Col(name = "user_name")
	private String userName;
	@Col(name = "user_sex")
	private String userSex;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

}
