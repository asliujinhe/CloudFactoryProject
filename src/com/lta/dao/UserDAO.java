package com.lta.dao;

import java.util.ArrayList;
import java.util.List;

import com.lta.bean.Agency;
import com.lta.bean.Factory;
import com.lta.bean.FactoryAdministrator;
import com.lta.bean.Product;
import com.lta.bean.SystemAdministrator;
import com.lta.bean.User;

public class UserDAO extends BaseDAO{
	
	
	//增加云工厂管理员
	public void addAdmin(String id,String account, String password, String realName,
			String phoneNumber,String factoryName,String factoryIntroduce){
		
		String path = "src//information//Admin.bin";
		List<User> Admins = getAdmin();
		FactoryAdministrator fa = new FactoryAdministrator(id,account,password,realName,phoneNumber,
					factoryName,factoryIntroduce);
		Admins.add(fa);
		String facPath = "src//information//Factory.bin";
		new FactoryDAO().addFactory(fa.getFactory());
		write(path,Admins);
		
		
		
	}
	public void addAdmin(User user){
		String path = "src//information//Admin.bin";
		List<User> Admins = getAdmin();
		Admins.add(user);
		write(path,Admins);
		
	}
	//增加经销商
	public void addAdmin(String id, String account,String password, String realName,
			String phoneNumber){
		
		String path = "src//information//Admin.bin";
		List<User> Admins = getAdmin();
		User fa = new Agency(id,account,password,realName,phoneNumber);
		Admins.add(fa);
		write(path,Admins);
		
		
	}
	//读出所有管理员
	public List<User> getAdmin(){
		List<User> Admins = null;
		String path = "src//information//Admin.bin";

		try {
			//直接调用父类方法
			Admins = (List<User>)read(path);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return Admins;
			
	}
	

	
	public Factory getFactory(User user){
		List<Factory> facs = new FactoryDAO().getFactory();
		Factory fa = new Factory();
		for(Factory fac:facs){
			if((user.getRealName()).equals(fac.getOwner().getRealName())){
				fa = fac;
				break;
			}
						
		}
		return fa;
		}
	
	public static void main(String[] args){
		List<User> Admins = new UserDAO().getAdmin();
		for(User user:Admins){
			System.out.println(user);
		}
		
	}
}
