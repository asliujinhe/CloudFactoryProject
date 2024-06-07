package com.lta.dao;

import java.util.ArrayList;
import java.util.List;

import com.lta.bean.Equipment;
import com.lta.bean.Factory;
import com.lta.bean.FactoryAdministrator;
import com.lta.bean.User;

public class EquipDAO extends BaseDAO{
	
	public static List<Equipment> Equipments = new ArrayList<Equipment>();
	

	/*//在Equipment中更新设备时先将设备加入到Factory中 然后遍历所有的Factory将设备写入文件
	public void updateEquipment(){
		List<Factory> facs = new FactoryDAO().getFactory();
		//System.out.println(facs.size());
		List<Equipment> equips = new ArrayList<Equipment>(); //注意要开辟内存空间！！！
		for(Factory fac:facs){
			//System.out.println(fac.getEquipments().size());
			if(fac.getEquipments().size()>0){
				//System.out.println(fac.getEquipments().size());
				equips.addAll(fac.getEquipments());
				//System.out.println("1111111111");
				
			}
		}
		equips.addAll(Equipments);
		write("src//information//Equipment.bin",equips);
	}*/
	//读出所有设备
	public List<Equipment> getEquip(){
		List<Equipment>Equips = null;
		String path = "src//information//Equipment.bin";

		try {
			//直接调用父类方法
			Equips = (List<Equipment>)read(path);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return Equips;
			
	}
	
	//在产能中心中添加设备
	public void addEquip(Equipment e){
		List<Equipment> Equips = new EquipDAO().getEquip();
		Equips.add(e);
		write("src//information//Equipment.bin",Equips);
		
	}
	
	public Factory getFactory(Equipment e){
		Factory f = null;
		List<Factory> factorys = new FactoryDAO().getFactory();
		for(Factory fa:factorys){
			if(fa.getName().equals(e.getFactoryName())){
				f = fa;
				return f;
			}
		}
		return null;
		
	}

	//添加设备
	//public Equipment(String ID,String name,String type,String size,String state,
			  //String description,String rentState,String factoryName){
	/*public void addEquip(String id,String name, String type, String size,
			String phoneNumber,String factoryName,String factoryIntroduce){
		
		String path = "src//information//Equipment.bin";*/
		/*List<Equipment> Equips = getEquip();
		Equipment fa = new FactoryAdministrator(id,account,password,realName,phoneNumber,
					factoryName,factoryIntroduce);*/
		/*Equips.add(fa);
		write(path,Equips);
		*/
		
	//}
	public static void main(String[] args){
		List<Equipment> equis = new EquipDAO().getEquip();
		for(Equipment equi:equis)
			System.out.println(equi);
		//new EquipDAO().updateEquipment();
	}

}
