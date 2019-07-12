package com.dsrc.beans;


public class LoginBean {
	
	private int loginid;
	private String password ;
	private String role ;
	
	public LoginBean()
	{
		
	}
	public LoginBean( int loginid,String password, String role)
	{
		this.loginid=loginid;
		this.password=password;
		this.role=role;
	}
	public int getLoginid() {
		return loginid;
	}
	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	
}
