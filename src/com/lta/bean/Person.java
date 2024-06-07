package com.lta.bean;

import java.io.Serializable;

public class Person implements Serializable{
	protected String realName;//真实姓名
	protected String phoneNumber;//联系方式
	
	public Person(String name, String number) {
		this.realName = name;
		this.phoneNumber = number;
	}
	public Person(){
		
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

}
