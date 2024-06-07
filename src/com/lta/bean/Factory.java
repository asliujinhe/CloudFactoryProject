package com.lta.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Factory implements Serializable{
	private String ID;
	private FactoryAdministrator owner;
	private String name;
	private String introduce;
	private String state;
	//private List<Equipment> equipments = new ArrayList<Equipment>();
	//private List<Employee> employees = new ArrayList<Employee>();
	private List<Product> products = new ArrayList<Product>();
	
	public Factory(String name,String introduce,FactoryAdministrator owner){
		this.introduce = introduce;
		this.name = name;
		this.owner = owner;
		this.ID = this.owner.getID();
		this.state = "Õý³£";
	}

	public Factory(String factoryName, String factoryIntroduce, Agency agency) {
		this.introduce = factoryIntroduce;
		this.name = factoryName;
	}

	public Factory() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/*public List<Equipment> getEquipments() {
		return equipments;
	}*/

	/*public void addEquipments(Equipment equipment) {
		equipments.add(equipment);
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void addEmployees(Employee employee) {
		employees.add(employee);
	}*/

	@Override
	public String toString() {
		return "Factory [owner=" + owner + ", name=" + name + ", introduce="
				+ introduce + ", state=" + state
				+ "]";
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public FactoryAdministrator getOwner() {
		return owner;
	}

	public void setOwner(FactoryAdministrator owner) {
		this.owner = owner;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void addProducts(Product product) {
		this.products.add(product);
	}

		
	
}
