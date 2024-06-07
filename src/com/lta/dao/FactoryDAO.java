package com.lta.dao;

import java.util.ArrayList;
import java.util.List;

import com.lta.bean.Factory;
import com.lta.bean.FactoryAdministrator;
import com.lta.bean.User;

public class FactoryDAO extends BaseDAO{
	
	//写入工厂
	public void addFactory(Factory factory) {
		String path = "src//information//Factory.bin";
		List<Factory> factorys = getFactory();
		factorys.add(factory);
		write(path,factorys);
		
	}
	
	//获取所有工厂
	public List<Factory> getFactory(){
		List<Factory> factorys = null;
		String path = "src//information//Factory.bin";

		try {
			//直接调用父类方法
			factorys = (List<Factory>)read(path);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return factorys;
		
		
	
	}
	

	public static void main(String[] args){
		List<Factory> facs = new FactoryDAO().getFactory();
		for(Factory fac:facs){
			System.out.println(fac);
			
	    }

}
}
