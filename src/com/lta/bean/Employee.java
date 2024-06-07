package com.lta.bean;

import java.io.Serializable;


public class Employee extends Person implements Serializable{
	private String work;//负责的工作
	public Employee(String name, String number) {
		super(name, number);
	}
	
	public Employee(String name, String number,String work) {
		super(name, number);
		this.work = work;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	
}
