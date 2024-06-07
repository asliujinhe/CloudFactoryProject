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

import com.lta.bean.User;
import com.lta.dao.BaseDAO;
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
public class ChangePasswordJFrame extends javax.swing.JFrame {
	private JLabel jLabel1;
	private JTextField account;
	private JLabel name;
	private JTextField nameText;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JPasswordField repassword;
	private JPasswordField password;
	private JButton yesBtn;
	private JButton backBtn;

	/**
	* Auto-generated main method to display this JFrame
	*/
	/*public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ChangePasswordJFrame inst = new ChangePasswordJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	*/
	public ChangePasswordJFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("\u4fee\u6539\u5bc6\u7801");
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("\u60a8\u7684\u8d26\u53f7");
				jLabel1.setBounds(45, 65, 96, 30);
			}
			{
				account = new JTextField();
				getContentPane().add(account);
				account.setBounds(149, 70, 150, 20);
			}
			{
				name = new JLabel();
				getContentPane().add(name);
				name.setText("\u60a8\u7684\u771f\u5b9e\u59d3\u540d");
				name.setBounds(45, 120, 101, 24);
			}
			{
				nameText = new JTextField();
				getContentPane().add(nameText);
				nameText.setBounds(149, 120, 150, 20);
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("\u65b0\u5bc6\u7801");
				jLabel2.setBounds(45, 167, 108, 29);
			}
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("\u786e\u8ba4\u65b0\u5bc6\u7801");
				jLabel3.setBounds(45, 217, 81, 21);
			}
			{
				backBtn = new JButton();
				getContentPane().add(backBtn);
				backBtn.setText("\u8fd4\u56de");
				backBtn.setBounds(44, 315, 72, 25);
				backBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						backBtnMouseClicked(evt);
					}
				});
			}
			{
				yesBtn = new JButton();
				getContentPane().add(yesBtn);
				yesBtn.setText("\u786e\u5b9a");
				yesBtn.setBounds(235, 315, 72, 25);
				yesBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						yesBtnMouseClicked(evt);
					}
				});
			}
			{
				password = new JPasswordField();
				getContentPane().add(password);
				password.setBounds(149, 170, 150, 20);
			}
			{
				repassword = new JPasswordField();
				getContentPane().add(repassword);
				repassword.setBounds(149, 220, 150, 20);
			}
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("\u60a8\u6b63\u5728\u91cd\u7f6e\u5bc6\u7801\uff01");
				jLabel4.setBounds(12, 12, 204, 25);
				jLabel4.setFont(new java.awt.Font("黑体",0,18));
				jLabel4.setForeground(new java.awt.Color(255,255,255));
			}
			{
				jLabel5 = new JLabel();
				getContentPane().add(jLabel5);
				jLabel5.setText("jLabel5");
				jLabel5.setBounds(-17, -20, 768, 1317);
				jLabel5.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/e8fdab4e7b59e905be1bd29c7ffcb92.jpg")));
			}
			pack();
			this.setSize(377, 419);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void yesBtnMouseClicked(MouseEvent evt) {
		List<User> users = new UserDAO().getAdmin();
		User target = null;
		for(User user:users){
			if(user.getAccount().equals(account.getText()) && user.getRealName().equals(nameText.getText())){
				target = user;
			}
		}
			if(target==null){
				JOptionPane.showMessageDialog(null,"信息填写错误，请检查！");
			}else{
				if(new String(password.getPassword()).equals(new String(repassword.getPassword()))){
					for(User user:users){
						if(user.getRealName().equals(target.getRealName())){
							user.setPassword(new String(password.getPassword()));
							System.out.println(user);
							break;
						}
					}
					new BaseDAO().write("src//information//Admin.bin",users);
					JOptionPane.showMessageDialog(null,"密码修改成功！");
					LoginJFrame lj = new LoginJFrame();
					lj.setVisible(true);
					lj.setLocationRelativeTo(null);
					dispose();

					
				}else{
					JOptionPane.showMessageDialog(null,"请保证两次输入相同的密码！");
				}
	
			}
		
	}
	
	private void backBtnMouseClicked(MouseEvent evt) {
		LoginJFrame lj = new LoginJFrame();
		lj.setVisible(true);
		lj.setLocationRelativeTo(null);
		dispose();
	}

}
