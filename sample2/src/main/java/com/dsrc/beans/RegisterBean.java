package com.dsrc.beans;


public class RegisterBean 
{
	// Create the private variables for registration 
	// Create proper getters and Setters.
	// Use this bean for registration , view profile and update profiles functionalities..
	private String Name;

	private int Age;

	//private String Gender;
	private int PhoneNumber;

	private String Email;

	private String LoginId;

	private String Password;
	
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age2) {
		Age = age2;
	}
	
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getLoginId() {
		return LoginId;
	}
	public void setLoginId(String loginId) {
		LoginId = loginId;
	}

	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
	
}
