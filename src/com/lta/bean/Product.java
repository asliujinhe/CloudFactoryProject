package com.lta.bean;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Product implements Serializable{
	private String code;//产品编号
	private String ID;
	private String name;
	private String type; //类别名称
	private String size;//产品规格
	private String description;//产品描述
	Calendar calendar = Calendar.getInstance();

	public Product(String ID,String name,String type,String size,String description){
		//编码由PNO与创建日期以及产品ID组成
		this.name = name;
		this.code = "PNO"+calendar.get(Calendar.YEAR)+
					(calendar.get(Calendar.MONTH) + 1)+calendar.get(Calendar.DATE)+ID;
		this.ID = ID;
		this.type = type;
		this.size = size;
		this.description = description;
		
	}


	public Product() {
		
	}


	public String getCode() {
		return code;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", ID=" + ID + ", name=" + name
				+ ", type=" + type + ", size=" + size + ", description="
				+ description + "]";
	}
	
	
}
