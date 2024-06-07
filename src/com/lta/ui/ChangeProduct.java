package com.lta.ui;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import com.lta.bean.Product;
import com.lta.bean.User;
import com.lta.dao.BaseDAO;
import com.lta.dao.ProductDAO;
import com.lta.dao.UserDAO;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class ChangeProduct extends javax.swing.JFrame {
	private JLabel text;
	private JRadioButton desBtn;
	private JButton yesBtn;
	private JRadioButton sizeBtn;
	private JRadioButton typeBtn;
	private JRadioButton nameBtn;
	private Product product;
	private JLabel jLabel1;
	private ButtonGroup buttonGroup1;
	private int i;

	/**
	* Auto-generated main method to display this JFrame
	*/
	/*public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ChangeProduct inst = new ChangeProduct();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}*/
	
	public ChangeProduct() {
		super();
		initGUI();
	}
	
	public ChangeProduct(Product target,int i) {
		this.product = target;
		this.i = i;
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("\u4fee\u6539\u4ea7\u54c1\u4fe1\u606f");
			{
				text = new JLabel();
				getContentPane().add(text);
				text.setText("您正在修改"+this.product.getName()+"的信息");
				text.setBounds(12, 30, 267, 18);
				text.setFont(new java.awt.Font("黑体",1,18));
				text.setForeground(new java.awt.Color(255,255,255));
			}
			{
				nameBtn = new JRadioButton();
				getContentPane().add(nameBtn);
				nameBtn.setText("\u4ea7\u54c1\u540d\u79f0");
				nameBtn.setBounds(75, 86, 84, 16);
				nameBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						nameBtnMouseClicked(evt);
					}
				});
			}
			{
				typeBtn = new JRadioButton();
				getContentPane().add(typeBtn);
				typeBtn.setText("\u4ea7\u54c1\u7c7b\u522b");
				typeBtn.setBounds(75, 126, 84, 22);
				typeBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						typeBtnMouseClicked(evt);
					}
				});
			}
			{
				sizeBtn = new JRadioButton();
				getContentPane().add(sizeBtn);
				sizeBtn.setText("\u4ea7\u54c1\u89c4\u683c");
				sizeBtn.setBounds(75, 168, 84, 22);
				sizeBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						sizeBtnMouseClicked(evt);
					}
				});
			}
			{
				desBtn = new JRadioButton();
				getContentPane().add(desBtn);
				desBtn.setText("\u4ea7\u54c1\u63cf\u8ff0");
				desBtn.setBounds(75, 207, 84, 22);
				desBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						desBtnMouseClicked(evt);
					}
				});
			}
			{
				yesBtn = new JButton();
				getContentPane().add(yesBtn);
				getContentPane().add(getJLabel1());
				yesBtn.setText("\u786e\u8ba4");
				yesBtn.setBounds(166, 274, 69, 25);
				yesBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						yesBtnMouseClicked(evt);
					}
				});
			}
			getButtonGroup1().add(desBtn);
			getButtonGroup1().add(nameBtn);
			getButtonGroup1().add(sizeBtn);
			getButtonGroup1().add(desBtn);
			pack();
			this.setSize(296, 384);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void nameBtnMouseClicked(MouseEvent evt) {
		List<Product> products = new ProductDAO().getProduct();
		for(Product product:products){
			if(product.getName().equals(this.product.getName())){
				product.setName(JOptionPane.showInputDialog(null,"请输入修改后的产品名称："));
				break;
			}
		}
		new BaseDAO().write("src//information//Product.bin",products);
	}
	
	private void typeBtnMouseClicked(MouseEvent evt) {
		List<Product> products = new ProductDAO().getProduct();
		for(Product product:products){
			if(product.getName().equals(this.product.getName())){
				product.setType(JOptionPane.showInputDialog(null,"请输入修改后的产品类型："));
				break;
			}
		}
		new BaseDAO().write("src//information//Product.bin",products);
	}
	
	private void sizeBtnMouseClicked(MouseEvent evt) {
		List<Product> products = new ProductDAO().getProduct();
		for(Product product:products){
			if(product.getName().equals(this.product.getName())){
				product.setSize(JOptionPane.showInputDialog(null,"请输入修改后的产品规格："));
				break;
			}
		}
		new BaseDAO().write("src//information//Product.bin",products);
	}
	
	private void desBtnMouseClicked(MouseEvent evt) {
		List<Product> products = new ProductDAO().getProduct();
		for(Product product:products){
			if(product.getName().equals(this.product.getName())){
				product.setDescription(JOptionPane.showInputDialog(null,"请输入修改后的产品描述："));
				break;
			}
		}
		new BaseDAO().write("src//information//Product.bin",products);
	}
	
	private void yesBtnMouseClicked(MouseEvent evt) {
		JOptionPane.showMessageDialog(null, "保存成功！");
		if(i==1){
			ProTypeManageJFrame rj = new ProTypeManageJFrame();
			rj.setVisible(true);
			rj.setLocationRelativeTo(null);
		}else if(i==0){
			ProInfoManageJFrame rj = new ProInfoManageJFrame();
			rj.setVisible(true);
			rj.setLocationRelativeTo(null);
		}
		dispose();
	}
	
	private ButtonGroup getButtonGroup1() {
		if(buttonGroup1 == null) {
			buttonGroup1 = new ButtonGroup();
		}
		return buttonGroup1;
	}
	
	private JLabel getJLabel1() {
		if(jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("jLabel1");
			jLabel1.setBounds(-53, -5, 348, 1090);
			jLabel1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/e8fdab4e7b59e905be1bd29c7ffcb92.jpg")));
		}
		return jLabel1;
	}

}
