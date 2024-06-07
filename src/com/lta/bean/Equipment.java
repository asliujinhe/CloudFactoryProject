package com.lta.bean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import com.lta.dao.EquipDAO;

public class Equipment implements Serializable{
	private String ID;
	private String name;
	private String code;
	private String type;
	private String size;
	private String state;
	private String description;
	private String rentState;
	private String factoryName;
	Calendar calendar = Calendar.getInstance();
	public Equipment(String ID,String name,String type,String size,String state,
			  String description,String rentState,String factoryName){
		this.code = "PNI"+calendar.get(Calendar.YEAR)+
		(calendar.get(Calendar.MONTH) + 1)+calendar.get(Calendar.DATE)+ID;
		this.ID = ID;
		this.rentState = rentState;
		this.state = state;
		this.name = name;
		this.type = type;
		this.size = size;
		this.description = description;
		this.factoryName = factoryName;
		
	}

	public Equipment() {
		// TODO Auto-generated constructor stub
	}

	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
		}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRentState() {
		return rentState;
	}
	public void setRentState(String rentState) {
		this.rentState = rentState;
	}
	public String getFactoryName() {
		return factoryName;
	}
	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}
	@Override
	public String toString() {
		return "Equipment [ID=" + ID + ", name=" + name + ", code=" + code
				+ ", type=" + type + ", size=" + size + ", state=" + state
				+ ", description=" + description + ", rentState=" + rentState
				+ ", factoryName=" + factoryName + "]";
	}
	
}
