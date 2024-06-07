package com.lta.ui;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
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

import com.lta.bean.Factory;
import com.lta.bean.User;
import com.lta.dao.FactoryDAO;
import com.lta.dao.TableEmbedCheckbox;
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
public class FacInfoJFrame extends javax.swing.JFrame {
	private JScrollPane jScrollPane1;
	private JTextField NameBtn;
	private JButton jButton1;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JButton backBtn;
	private JButton changeBtn;
	private JTable FactoryTable;

	/**
	* Auto-generated main method to display this JFrame
	*/
/*	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				FacInfoJFrame inst = new FacInfoJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}*/
	
	public FacInfoJFrame() {
		super();
		initGUI();
	}
	String[] colNames = {"","ID","工厂名称","工厂简介","负责人","联系方式","登陆账号","工厂状态"};
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("\u5de5\u5382\u4fe1\u606f\u7ba1\u7406");
			{
				List<Factory> facs = new FactoryDAO().getFactory();
				Object[][] datas = new Object[facs.size()][8];
				for(int i = 0;i<facs.size();i++){
					Factory factory = facs.get(i);
					 datas[i][0] = false;
					 datas[i][1] = factory.getID();
					 datas[i][2] = factory.getName();
					 datas[i][3] = factory.getIntroduce();
					 datas[i][4] = factory.getOwner().getRealName();
					 datas[i][5] = factory.getOwner().getPhoneNumber();
					 datas[i][6] = factory.getOwner().getAccount();
					 datas[i][7] = factory.getState();
					 
				}
				
				jScrollPane1 = new JScrollPane();
				getContentPane().add(jScrollPane1);
				jScrollPane1.setBounds(0, 95, 891, 343);
				{
					TableEmbedCheckbox tec = 
						new TableEmbedCheckbox(
								datas,
								colNames);
					FactoryTable = new JTable(tec);
					jScrollPane1.setViewportView(FactoryTable);
				}
			}
			{
				NameBtn = new JTextField();
				getContentPane().add(NameBtn);
				NameBtn.setBounds(21, 23, 126, 23);
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("\u5de5\u5382\u540d\u79f0\u67e5\u8be2");
				jButton1.setBounds(153, 21, 127, 25);
				jButton1.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						jButton1MouseClicked(evt);
					}
				});
			}
			{
				changeBtn = new JButton();
				getContentPane().add(changeBtn);
				changeBtn.setText("\u5207\u6362");
				changeBtn.setBounds(21, 58, 81, 25);
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
				backBtn.setBounds(791, 450, 89, 27);
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
				jLabel1.setBounds(-19, -3, 949, 98);
				jLabel1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/0c8110057b9dfaf05240bb685e063ae.png")));
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("jLabel2");
				jLabel2.setBounds(-3, 435, 1053, 73);
				jLabel2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/a0d957b4a729a40b3d61d5946e0fdd5.png")));
			}
			pack();
			this.setSize(907, 522);
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
	
	private void jButton1MouseClicked(MouseEvent evt) {
		List<Factory> facs = new FactoryDAO().getFactory();
		List<Factory> fs = new ArrayList<Factory>();
		Factory factory = null;
		int flag = 0;
		for(Factory f:facs){
			if(f.getName().equals(NameBtn.getText())){
				factory = f;
				flag = 1;
				
			}
		}
		if(flag == 1)
			fs.add(factory);
		else
			JOptionPane.showMessageDialog(null,"无搜索结果！请检查信息是否正确！");
		show(fs);
	}
	public void show(List<Factory> fs){
		Object[][]datas = new Object[fs.size()][8];
		for(int i = 0;i<fs.size();i++){
			Factory factory = fs.get(i);
			datas[i][0] = false;
			 datas[i][1] = factory.getID();
			 datas[i][2] = factory.getName();
			 datas[i][3] = factory.getIntroduce();
			 datas[i][4] = factory.getOwner().getRealName();
			 datas[i][5] = factory.getOwner().getPhoneNumber();
			 datas[i][6] = factory.getOwner().getAccount();
			 datas[i][7] = factory.getState();
			TableEmbedCheckbox tec = 
				new TableEmbedCheckbox(
						datas,
						colNames);
			FactoryTable = new JTable(tec);
			jScrollPane1.setViewportView(FactoryTable);
			
	}
	}
	
	private void changeBtnMouseClicked(MouseEvent evt) {
		show(new FactoryDAO().getFactory());
	}
}
