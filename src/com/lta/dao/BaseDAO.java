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
		//��ʼ��ϵͳ����Ա�Լ�һ��Ĭ�Ϲ�������Ա
		public void initial(){
			Equipment equi1 = new Equipment("1","Ư�̻�","�ӹ���","1t","�ػ�","������ɱ������","�ѱ�����","��ζʳƷ��");
			Equipment equi2 = new Equipment("2","��ը��","������","2t","����","��ˮ�����ը","�����豸","��ζʳƷ��");
			Equipment equi3 = new Equipment("3","��ˮ�豸","������","1t","�ػ�","��������ˮ","�����豸","��ζʳƷ��");
			Equipment equi4 = new Equipment("4","ӡˢ��","������","1t","�ػ�","�����ڴ�ӡ","�ѱ�����","��������");
			Equipment equi5 = new Equipment("5","���һ�","�ӹ���","300*500","����","�����������װ","�ѱ�����","������װ��");
			Equipment equi6 = new Equipment("6","����������","������","100*100","�ػ�","������������ݮζ����","δ������","null");
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
			User sa1 = new SystemAdministrator("1","account1","111111","С��","13354365543");
			User sa2 = new SystemAdministrator("2","account2","222222","С��","16898983787");
			User sa3 = new SystemAdministrator("3","account3","333333","С��","13887478893");
			User sa4 = new SystemAdministrator("4","account4","444444","С��","13892097478");
			User sa5 = new SystemAdministrator("5","account5","555555","С��","13192874398");
			Product pro1 = new Product("1","��Ƭ","ʳƷ��","550g","ԭζ");
			Product pro2 = new Product("2","��Ȫˮ","ʳƷ��","550ML","����Ȼ�İ��˹�");
			Product pro3 = new Product("3","Ӣ������","ѧҵ��","100��/��","��������ô�����");
			Product pro4 = new Product("4","�п���","��װ��","S/M/L","�����ÿ���Ŷ");
			FactoryAdministrator fa = new FactoryAdministrator("6","2023","102030","�Ե��ܲ�","88888888","��ζʳƷ��","�������ʳƷ");
			fa.getFactory().addProducts(pro1);
			//fa.getFactory().addEquipments(equi1);
			//fa.getFactory().addEquipments(equi2);
			//fa.getFactory().addEquipments(equi3);
			fa.getFactory().addProducts(pro2);
			FactoryAdministrator fa2 = new FactoryAdministrator("7","�","2024","С����","136993222","��������","������������Ӣ������");
			fa2.getFactory().addProducts(pro3);
			//fa2.getFactory().addEquipments(equi4);
			FactoryAdministrator fa3 = new FactoryAdministrator("8","2025","2025","С����","1143434223","������װ��","����Ư���·�");
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
		
	private static String AdminPath = "Information//Administrator.bin";//��Ź���Ա��Ϣ
	//д�򱣴��ļ�
	public static void write(String path,Object obj){
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(path));
			os.writeObject(obj);
			os.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	//���ļ�
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
