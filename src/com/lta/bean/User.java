package com.lta.bean;

import java.io.Serializable;



public class User extends Person implements Serializable{
	protected String type; //用来判断用户类型 
	protected String ID;
	protected String password;//登录密码
	protected String account;//登陆账号
		
	public User(String id,String account,String password,String realName,String phoneNumber){
		super(realName,phoneNumber);
		this.realName = realName;
		this.phoneNumber  = phoneNumber;
		this.ID = id;
		this.password = password;
		this.account = account;
	}
	public User(){
		
	}

	public String getType() {
		return type;
	}
	
	public void setID(String id){
		this.ID = id;
	}

	public String getID() {
		return ID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

	@Override
	public String toString() {
		return "User [type=" + type + ", ID=" + ID + ", password=" + password
				+ ", account=" + account + ", realName=" + realName
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
