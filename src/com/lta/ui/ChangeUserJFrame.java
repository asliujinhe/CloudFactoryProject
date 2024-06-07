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
public class ChangeUserJFrame extends javax.swing.JFrame {
	private JRadioButton nameBtn;
	private JRadioButton phoneBtn;
	private ButtonGroup buttonGroup;
	private JLabel text;
	private JLabel jLabel1;
	private JButton yesBtn;
	private JRadioButton accountBen;
	private User user;

	/**
	* Auto-generated main method to display this JFrame
	*/
	/*public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ChangeUserJFrame inst = new ChangeUserJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	*/
	public ChangeUserJFrame() {
		super();
		initGUI();
	}
	
	public ChangeUserJFrame(User user) {
		this.user = user;
		initGUI();
	}
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("\u4fee\u6539\u4e2a\u4eba\u4fe1\u606f");
			{
				nameBtn = new JRadioButton();
				getContentPane().add(nameBtn);
				nameBtn.setText("    \u59d3\u540d");
				nameBtn.setBounds(86, 90, 79, 22);
				nameBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						nameBtnMouseClicked(evt);
					}
				});
			}
			{
				accountBen = new JRadioButton();
				getContentPane().add(accountBen);
				accountBen.setText("    \u8d26\u53f7");
				accountBen.setBounds(85, 127, 80, 22);
				accountBen.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						accountBenMouseClicked(evt);
					}
				});
			}
			{
				phoneBtn = new JRadioButton();
				getContentPane().add(phoneBtn);
				getContentPane().add(getText());
				getContentPane().add(getYesBtn());
				getContentPane().add(getJLabel1());
				phoneBtn.setText("    \u8054\u7cfb\u65b9\u5f0f");
				phoneBtn.setBounds(85, 166, 103, 22);
				phoneBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						phoneBtnMouseClicked(evt);
					}
				});
			}
			getButtonGroup().add(nameBtn);
			getButtonGroup().add(accountBen);
			getButtonGroup().add(phoneBtn);
			pack();
			this.setSize(303, 358);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private ButtonGroup getButtonGroup() {
		if(buttonGroup == null) {
			buttonGroup = new ButtonGroup();
		}
		return buttonGroup;
	}
	
	private void nameBtnMouseClicked(MouseEvent evt) {
		List<User> users = new UserDAO().getAdmin();
		for(User user:users){
			if(user.getRealName().equals(this.user.getRealName())){
				user.setRealName(JOptionPane.showInputDialog(null,"请输入修改后的姓名："));
				break;
			}
		}
		new BaseDAO().write("src//information//Admin.bin",users);
	}
	
	private void accountBenMouseClicked(MouseEvent evt) {
		List<User> users = new UserDAO().getAdmin();
		for(User user:users){
			if(user.getRealName().equals(this.user.getRealName())){
				user.setAccount(JOptionPane.showInputDialog(null,"请输入修改后的账号："));
				break;
			}
		}
		new BaseDAO().write("src//information//Admin.bin",users);
	}
	
	private void phoneBtnMouseClicked(MouseEvent evt) {
		List<User> users = new UserDAO().getAdmin();
		for(User user:users){
			if(user.getRealName().equals(this.user.getRealName())){
				user.setPhoneNumber(JOptionPane.showInputDialog(null,"请输入修改后的联系方式："));
				break;
			}
		}
		new BaseDAO().write("src//information//Admin.bin",users);
	}
	
	private JLabel getText() {
		if(text == null) {
			text = new JLabel();
			text.setBounds(12, 42, 305, 26);
			text.setText("您正在修改"+this.user.getRealName()+"的个人信息！");
			text.setFont(new java.awt.Font("黑体",1,16));
			text.setForeground(new java.awt.Color(255,255,255));
		}
		return text;
	}
	
	private JButton getYesBtn() {
		if(yesBtn == null) {
			yesBtn = new JButton();
			yesBtn.setText("\u786e\u5b9a");
			yesBtn.setBounds(193, 227, 70, 25);
			yesBtn.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent evt) {
					yesBtnMouseClicked(evt);
				}
			});
		}
		return yesBtn;
	}
	
	private void yesBtnMouseClicked(MouseEvent evt) {
		JOptionPane.showMessageDialog(null, "保存成功！");
		UserManageJFrame rj = new UserManageJFrame();
		rj.setVisible(true);
		rj.setLocationRelativeTo(null);
		dispose();
	}
	
	private JLabel getJLabel1() {
		if(jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("jLabel1");
			jLabel1.setBounds(0, -2, 794, 1086);
			jLabel1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/e8fdab4e7b59e905be1bd29c7ffcb92.jpg")));
		}
		return jLabel1;
	}

}
