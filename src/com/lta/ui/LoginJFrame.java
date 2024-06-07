package com.lta.ui;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import com.lta.bean.SystemAdministrator;
import com.lta.bean.User;
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
public class LoginJFrame extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel title;
	private JLabel id;
	private JButton Loginbtn;
	private JButton forPasswordbtn;
	private JButton registbtn;
	private JPasswordField jPasswordField;
	private JTextField idField;
	private JLabel password;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				LoginJFrame inst = new LoginJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public LoginJFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("\u767b\u5f55");
			{
				title = new JLabel();
				getContentPane().add(title);
				title.setText("\u4e91\u5e73\u53f0\u5236\u9020");
				title.setBounds(-786, 1, 1508, 104);
				title.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/f5d5c5f4a62ee392f8b3affd43631a9.jpg")));
			}
			{
				id = new JLabel();
				getContentPane().add(id);
				id.setText("\u8d26\u53f7");
				id.setBounds(98, 122, 51, 23);
				id.setFont(new java.awt.Font("隶书",0,16));
			}
			{
				password = new JLabel();
				getContentPane().add(password);
				password.setText("\u5bc6\u7801");
				password.setBounds(98, 167, 38, 15);
				password.setFont(new java.awt.Font("隶书",0,16));
			}
			{
				idField = new JTextField();
				getContentPane().add(idField);
				idField.setText("\u8bf7\u8f93\u5165\u60a8\u7684\u8d26\u53f7\uff01");
				idField.setBounds(164, 120, 166, 25);
			}
			{
				jPasswordField = new JPasswordField();
				getContentPane().add(jPasswordField);
				jPasswordField.setText("jPasswordFi");
				jPasswordField.setBounds(164, 162, 167, 26);
				jPasswordField.setFont(new java.awt.Font("SimSun",0,11));
			}
			{
				registbtn = new JButton();
				getContentPane().add(registbtn);
				registbtn.setText("\u6ce8\u518c");
				registbtn.setBounds(92, 203, 57, 25);
				registbtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						registbtnMouseClicked(evt);
					}
				});
			}
			{
				forPasswordbtn = new JButton();
				getContentPane().add(forPasswordbtn);
				forPasswordbtn.setText("\u5fd8\u8bb0\u5bc6\u7801\uff1f");
				forPasswordbtn.setBounds(344, 241, 93, 26);
				forPasswordbtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						forPasswordbtnMouseClicked(evt);
					}
				});
			}
			{
				Loginbtn = new JButton();
				getContentPane().add(Loginbtn);
				Loginbtn.setText("\u767b\u5f55");
				Loginbtn.setBounds(278, 203, 57, 25);
				Loginbtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						LoginbtnMouseClicked(evt);
					}
				});
			}
			pack();
			this.setSize(459, 315);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void registbtnMouseClicked(MouseEvent evt) {
		ChooseJFrame rj = new ChooseJFrame();
		rj.setVisible(true);
		rj.setLocationRelativeTo(null);
		dispose();
	}
	String type;
	private void LoginbtnMouseClicked(MouseEvent evt) {
		int flag = 0;
		String inputID = idField.getText();
		String inputPassword = new String(jPasswordField.getPassword());
		List<User> Admin = new UserDAO().getAdmin();
		for(User user:Admin){
			if((user.getAccount().equals(inputID))&&(user.getPassword().equals(inputPassword))){
				type = user.getType();
				flag = 1;
				if(user.getType().equals("云工厂管理员")){
					JOptionPane.showMessageDialog(null,"欢迎你！"+user.getRealName()+"！点击确认登录云工厂管理员管理页面");
					MyEquipsJFrame emj = new MyEquipsJFrame(user);
					emj.setVisible(true);
					emj.setLocationRelativeTo(null);
					dispose();
				}
				else if(user.getType().equals("系统管理员")){
					JOptionPane.showMessageDialog(null,"欢迎你！"+user.getRealName()+"！点击确认登录系统管理员管理页面");
					MenuJFrame mj = new MenuJFrame();
					mj.setVisible(true);
					mj.setLocationRelativeTo(null);
					dispose();
				}
				else if(user.getType().equals("经销商")){
					JOptionPane.showMessageDialog(null,"无登录权限！");
				}
				
			}
			}
		if(flag == 0){
			JOptionPane.showMessageDialog(null,"账号或密码错误，请重新输入！");
		
		}
	}
	
	private void forPasswordbtnMouseClicked(MouseEvent evt) {
		ChangePasswordJFrame lj = new ChangePasswordJFrame();
		lj.setVisible(true);
		lj.setLocationRelativeTo(null);
		dispose();
	}

}
