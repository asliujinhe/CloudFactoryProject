package com.lta.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.lta.bean.Equipment;
import com.lta.bean.Factory;
import com.lta.bean.FactoryAdministrator;
import com.lta.bean.Product;
import com.lta.bean.SystemAdministrator;
import com.lta.bean.User;

public class BaseDAO{
		//初始化系统管理员以及一个默认工厂管理员
		public void initial(){
			Equipment equi1 = new Equipment("1","漂烫机","加工类","1t","关机","可用于杀菌消毒","已被租用","美味食品厂");
			Equipment equi2 = new Equipment("2","油炸机","生产类","2t","开机","油水混合油炸","工厂设备","美味食品厂");
			Equipment equi3 = new Equipment("3","制水设备","生产类","1t","关机","可用于制水","工厂设备","美味食品厂");
			Equipment equi4 = new Equipment("4","印刷机","生产类","1t","关机","可用于打印","已被租用","作文制造");
			Equipment equi5 = new Equipment("5","缝纫机","加工类","300*500","开机","可用于制造服装","已被租用","美丽服装厂");
			Equipment equi6 = new Equipment("6","金鱼生产机","生产类","100*100","关机","可用于生产草莓味金鱼","未被租用","null");
			String equiPath = "src//information//Equipment.bin";
			String path = "src//information//Admin.bin";
			String facPath = "src//information//Factory.bin";
			String proPath = "src//information//Product.bin";
			List<User> Admins = new ArrayList<User>();
			List<Factory> facs = new ArrayList<Factory>();
			List<Equipment> equips = new ArrayList<Equipment>();
			equips.add(equi1);
			equips.add(equi2);
			equips.add(equi3);
			equips.add(equi4);
			equips.add(equi5);
			equips.add(equi6);
			User sa1 = new SystemAdministrator("1","account1","111111","小美","13354365543");
			User sa2 = new SystemAdministrator("2","account2","222222","小吴","16898983787");
			User sa3 = new SystemAdministrator("3","account3","333333","小朱","13887478893");
			User sa4 = new SystemAdministrator("4","account4","444444","小陈","13892097478");
			User sa5 = new SystemAdministrator("5","account5","555555","小军","13192874398");
			Product pro1 = new Product("1","薯片","食品类","550g","原味");
			Product pro2 = new Product("2","矿泉水","食品类","550ML","大自然的搬运工");
			Product pro3 = new Product("3","英语作文","学业类","100张/份","语句优美用词连贯");
			Product pro4 = new Product("4","夹克衫","服装类","S/M/L","超级好看的哦");
			FactoryAdministrator fa = new FactoryAdministrator("6","2023","102030","霸道总裁","88888888","美味食品厂","制造各类食品");
			fa.getFactory().addProducts(pro1);
			//fa.getFactory().addEquipments(equi1);
			//fa.getFactory().addEquipments(equi2);
			//fa.getFactory().addEquipments(equi3);
			fa.getFactory().addProducts(pro2);
			FactoryAdministrator fa2 = new FactoryAdministrator("7","李华","2024","小金鱼","136993222","作文制造","制造各种主题的英语作文");
			fa2.getFactory().addProducts(pro3);
			//fa2.getFactory().addEquipments(equi4);
			FactoryAdministrator fa3 = new FactoryAdministrator("8","2025","2025","小美丽","1143434223","美丽服装厂","生产漂亮衣服");
			fa3.getFactory().addProducts(pro4);
			//fa3.getFactory().addEquipments(equi5);
			List<Product> products = new ArrayList<Product>();
			products.add(pro1);
			products.add(pro2);
			products.add(pro3);
			products.add(pro4);
			Admins.add(sa1);
			Admins.add(sa2);
			Admins.add(sa3);
			Admins.add(sa4);
			Admins.add(sa5);
			Admins.add(fa);
			Admins.add(fa2);
			Admins.add(fa3);
			facs.add(fa.getFactory());
			facs.add(fa2.getFactory());
			facs.add(fa3.getFactory());
			try {
				write(path,Admins);
				write(facPath,facs);
				write(proPath,products);
				write(equiPath,equips);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
	}
		
	private static String AdminPath = "Information//Administrator.bin";//存放管理员信息
	//写或保存文件
	public static void write(String path,Object obj){
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(path));
			os.writeObject(obj);
			os.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	//读文件
	public static Object read(String path){
		Object obj = null;
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(path));
			obj = is.readObject();
			is.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return obj;
		
	}
	public static void main(String[] args){
		new BaseDAO().initial();
	}
	
	
}
