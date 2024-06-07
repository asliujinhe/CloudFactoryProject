package com.lta.dao;

import java.util.ArrayList;
import java.util.List;

import com.lta.bean.Factory;
import com.lta.bean.Product;
import com.lta.bean.User;

public class ProductDAO extends BaseDAO{

	//д���Ʒ
	public void addProduct(Product product) {
		String path = "src//information//Product.bin";
		List<Product> products = getProduct();
		products.add(product);
		write(path,products);
		
	}
	//�������в�Ʒ
	public List<Product> getProduct(){
		List<Product> products = null;
		String path = "src//information//Product.bin";
		try {
			//ֱ�ӵ��ø��෽��
			products = (List<Product>)read(path);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return products;
			
	}
	public static void main(String[] args){
		List<Product> pros = new ProductDAO().getProduct();
		for(Product pro:pros){
			System.out.println(pro);
		}
	}
}
