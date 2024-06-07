package com.lta.bean;

import java.io.Serializable;

import com.lta.dao.BaseDAO;
import com.lta.dao.FactoryDAO;

public class FactoryAdministrator extends User implements Serializable{
	private Factory factory;
	public FactoryAdministrator(String id,String account, String password, String realName,
			String phoneNumber,String factoryName,String factoryIntroduce) {
		super(id, account,password, realName, phoneNumber);
		this.type = "云工厂管理员";
		/*this.factoryName = factoryName;
		Factory factory = new Factory(factoryName,factoryIntroduce);*/
		this.factory = new Factory(factoryName,factoryIntroduce,this);
		//new FactoryDAO().addFactory(factory);
	}
	public FactoryAdministrator(){
		this.type = "云工厂管理员";
	}
	@Override
	public String toString() {
		return "FactoryAdministrator [type=" + type 
				+ ", ID:" + getID() + ", Password:" + getPassword()
				+ ", RealName:" + getRealName() + ", PhoneNumber:"
				+ getPhoneNumber() + ",FactroyName:"+this.factory.getName()+"]";
	}
	/*public String getFactoryName() {
		return factoryName;
	}
	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}*/
	
	public void setFactory(String name,String introduce){
		this.factory =  new Factory(name,introduce,this);
	}
	public Factory getFactory() {
		return factory;
	}
	public void setFactory(Factory factory) {
		this.factory = factory;
	}
	
}
