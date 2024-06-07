package com.lta.ui;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.SwingUtilities;

import com.lta.dao.BaseDAO;
import com.lta.dao.EquipDAO;
import com.lta.dao.ProductDAO;
import com.lta.dao.TableEmbedCheckbox;
import com.lta.bean.Equipment;
import com.lta.bean.Product;


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
public class ProTypeManageJFrame extends javax.swing.JFrame {
	private JTextField NameText;
	private JButton NameBtn;
	private JScrollPane jScrollPane1;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JButton changeBtn;
	private JTable ProductTable;
	private JButton backBtn;
	private JButton deleBtn;
	private JButton newBtn;
	private JButton resetBtn;

	/**
	* Auto-generated main method to display this JFrame
	*/
	/*public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ProTypeManageJFrame inst = new ProTypeManageJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}*/
	String[] colNames = {"","ID","类别名称"};
	Object[][] datas = null;
	public ProTypeManageJFrame() {
		super();
		initGUI();
	}
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("\u4ea7\u54c1\u7c7b\u578b\u7ba1\u7406");
			{
				NameText = new JTextField();
				getContentPane().add(NameText);
				NameText.setBounds(12, 25, 128, 23);
			}
			{
				NameBtn = new JButton();
				getContentPane().add(NameBtn);
				NameBtn.setText("\u7c7b\u522b\u540d\u79f0\u67e5\u8be2");
				NameBtn.setBounds(150, 23, 123, 25);
				NameBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						NameBtnMouseClicked(evt);
					}
				});
			}
			{
				resetBtn = new JButton();
				getContentPane().add(resetBtn);
				resetBtn.setText("\u91cd\u7f6e");
				resetBtn.setBounds(284, 23, 74, 25);
				resetBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						resetBtnMouseClicked(evt);
					}
				});
			}
			{
				List<Product> pros = new ProductDAO().getProduct();
				datas = new Object[pros.size()][3];
				for(int i=0;i<pros.size();i++){
					Product pro = pros.get(i);
					datas[i][0] = false;
					datas[i][1] = pro.getID();
					datas[i][2] = pro.getType();
				}
				jScrollPane1 = new JScrollPane();
				getContentPane().add(jScrollPane1);
				jScrollPane1.setBounds(0, 102, 589, 209);
				{
					TableEmbedCheckbox tec = 
						new TableEmbedCheckbox(
								datas,colNames);
					ProductTable = new JTable(tec);
					jScrollPane1.setViewportView(ProductTable);
				
				}
			}
			{
				newBtn = new JButton();
				getContentPane().add(newBtn);
				newBtn.setText("\u65b0\u5efa");
				newBtn.setBounds(12, 66, 71, 23);
				newBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						newBtnMouseClicked(evt);
					}
				});
			}
			{
				deleBtn = new JButton();
				getContentPane().add(deleBtn);
				deleBtn.setText("\u5220\u9664");
				deleBtn.setBounds(94, 66, 71, 23);
				deleBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						deleBtnMouseClicked(evt);
					}
				});
			}
			{
				changeBtn = new JButton();
				getContentPane().add(changeBtn);
				changeBtn.setText("\u4fee\u6539");
				changeBtn.setBounds(478, 66, 71, 25);
				changeBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						changeBtnMouseClicked(evt);
					}
				});
			}
			{
				backBtn = new JButton();
				getContentPane().add(backBtn);
				backBtn.setText("\u8fd4\u56de");
				backBtn.setBounds(498, 325, 73, 28);
				backBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						backBtnMouseClicked(evt);
					}
				});
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("jLabel1");
				jLabel1.setBounds(-354, 2, 1011, 99);
				jLabel1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/0c8110057b9dfaf05240bb685e063ae.png")));
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("jLabel2");
				jLabel2.setBounds(-275, 311, 940, 77);
				jLabel2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/a0d957b4a729a40b3d61d5946e0fdd5.png")));
			}
			pack();
			this.setSize(605, 400);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void backBtnMouseClicked(MouseEvent evt) {
		System.out.println("正在返回...");
		MenuJFrame mj = new MenuJFrame();
		mj.setVisible(true);
		mj.setLocationRelativeTo(null);
		dispose();
	}
	
	private void NameBtnMouseClicked(MouseEvent evt) {
		List<Product> products = new ProductDAO().getProduct();
		List<Product> pros = new ArrayList<Product>();
		Product p = null;
		int flag = 0;
		for(Product pro:products){
			if(pro.getType().equals(NameText.getText())){
				pros.add(pro);
				flag = 1;
				
			}
		}
		if(flag == 0)
			JOptionPane.showMessageDialog(null,"无搜索结果！请检查信息是否正确！");
		show(pros);
	}
	

	private void newBtnMouseClicked(MouseEvent evt) {
		newProJFrame lj = new newProJFrame(1);
		lj.setVisible(true);
		lj.setLocationRelativeTo(null);
		dispose();
	}
	
	private void deleBtnMouseClicked(MouseEvent evt) {
		int[] rowIndexes = new int[50];
		int j = 0;
		for(int i = 0;i<ProductTable.getRowCount();i++){
			if(ProductTable.getValueAt(i, 0).equals(true)){
				rowIndexes[j] = i;
				j++;
			}
		}
		if(j==0){
			JOptionPane.showMessageDialog(null, "请选择后再删除!");
            return;
		}
        
        int r = JOptionPane.showConfirmDialog(null,
                "你确定要删除吗？", "确认删除",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (r != JOptionPane.YES_OPTION) {
            return;
        }
 
        List<Product> products = new ProductDAO().getProduct();
        List<Product> delepros = new ArrayList<Product>();
        for(Product pro:products){
        	for(int i = 0;i<j;i++){
        		if(pro.getID().equals(ProductTable.getValueAt(rowIndexes[i],1))){
        			delepros.add(pro);
        		}
        	}
        }
       products.removeAll(delepros);
        new BaseDAO().write("src//information//Product.bin",products);
        show(products);
	}
	
	private void resetBtnMouseClicked(MouseEvent evt) {
		show(new ProductDAO().getProduct());
	}
	
	private void changeBtnMouseClicked(MouseEvent evt) {
		int[] rowIndexes = new int[50];
		Arrays.fill(rowIndexes,999);
		int j = 0;
		for(int i = 0;i<ProductTable.getRowCount();i++){
			if(ProductTable.getValueAt(i, 0).equals(true)){
				rowIndexes[j] = i;
				j++;
			}
		}
		if(j==0){
			JOptionPane.showMessageDialog(null, "请选择要修改的行!");
            return;
		}else if(j>1){
			JOptionPane.showMessageDialog(null, "一次仅能修改一行!");
		}else{
			 List<Product> products = new ProductDAO().getProduct();
		     Product target = new Product();
		        for(Product product:products){
		        	for(int i = 0;i<j;i++){
		        		if(product.getID().equals(ProductTable.getValueAt(rowIndexes[i],1))){
		        			target = product;
		        		}
		        	}
		        }
		    ChangeProduct rj = new ChangeProduct(target,1);
			rj.setVisible(true);
			rj.setLocationRelativeTo(null);
			dispose();
		}
	}

	
	private void show(List<Product> products){
		datas = new Object[products.size()][3];
		for(int i=0;i<products.size();i++){
			Product pro = products.get(i);
			datas[i][0] = false;
			datas[i][1] = pro.getID();
			datas[i][2] = pro.getType();
			TableEmbedCheckbox tec = 
				new TableEmbedCheckbox(
						datas,colNames);
			ProductTable = new JTable(tec);
			jScrollPane1.setViewportView(ProductTable);
		}
	}
}
