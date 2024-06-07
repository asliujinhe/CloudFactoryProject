package com.lta.bean;

import java.io.Serializable;

public class Agency extends User implements Serializable{
	public Agency(){
		this.type = "经销商";
	}
	private Factory factory;
	public Agency(String id,String account, String password, String realName,
			String phoneNumber) {
		super(id, account,password, realName, phoneNumber);
		this.type = "经销商";
		
	}

	@Override
	public String toString() {
		return "Agency [type=" + type + ", ID=" + ID + ", password=" + password
				+ ", account=" + account + ", realName=" + realName
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	}

	
