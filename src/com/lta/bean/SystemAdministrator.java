package com.lta.bean;

import java.io.Serializable;



public class SystemAdministrator extends User implements Serializable{
	


	//ϵͳ����Ա��ϵͳĬ��
	public SystemAdministrator(String id, String account,String password, String realName,String phoneNumber) {
		super(id,account,password,realName,phoneNumber);
		this.ID = id;
		this.password = password;
		this.realName = realName;
		this.phoneNumber = phoneNumber;
		this.type = "ϵͳ����Ա";
	}
	
	public SystemAdministrator(){
		
	}

	@Override
	public String toString() {
		return "SystemAdministrator [type=" + type + ", ID=" + ID
				+ ", password=" + password + ", account=" + account
				+ ", realName=" + realName + ", phoneNumber=" + phoneNumber
				+ "]";
	}
	
	
	
	
	
	
}
