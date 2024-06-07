package com.lta.ui;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

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
public class LregisterJFrame extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel accLb;
	private JTextField accountText;
	private JLabel jLabel2;
	private JButton yesBtn;
	private JButton backBtn;
	private JTextField phoneNumText;
	private JLabel phoneNumber;
	private JTextField nameText;
	private JLabel jLabel1;
	private JPasswordField jPasswordField;
	private JLabel passwordlb;
	private int i;

	/**
	* Auto-generated main method to display this JFrame
	*/
	/*public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				LregisterJFrame inst = new LregisterJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}*/
	
	public LregisterJFrame() {
		super();
		initGUI();
	}
	
	public LregisterJFrame(int i) {
		this.i = i;
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				accLb = new JLabel();
				getContentPane().add(accLb);
				accLb.setText("\u767b\u9646\u8d26\u53f7");
				accLb.setBounds(20, 39, 52, 18);
			}
			{
				accountText = new JTextField();
				getContentPane().add(accountText);
				accountText.setBounds(90, 35, 165, 20);
			}
			{
				passwordlb = new JLabel();
				getContentPane().add(passwordlb);
				passwordlb.setText("\u767b\u9646\u5bc6\u7801");
				passwordlb.setBounds(20, 81, 53, 22);
			}
			{
				jPasswordField = new JPasswordField();
				getContentPane().add(jPasswordField);
				jPasswordField.setBounds(90, 80, 165, 20);
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("\u771f\u5b9e\u59d3\u540d");
				jLabel1.setBounds(20, 126, 54, 18);
			}
			{
				nameText = new JTextField();
				getContentPane().add(nameText);
				nameText.setBounds(90, 125, 165, 20);
			}
			{
				phoneNumber = new JLabel();
				getContentPane().add(phoneNumber);
				phoneNumber.setBounds(20, 167, 61, 24);
				phoneNumber.setText("\u8054\u7cfb\u65b9\u5f0f");
			}
			{
				phoneNumText = new JTextField();
				getContentPane().add(phoneNumText);
				phoneNumText.setBounds(90, 170, 165, 20);
			}
			{
				backBtn = new JButton();
				getContentPane().add(backBtn);
				backBtn.setText("\u8fd4\u56de");
				backBtn.setBounds(31, 241, 60, 22);
				backBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						backBtnMouseClicked(evt);
					}
				});
			}
			{
				yesBtn = new JButton();
				getContentPane().add(yesBtn);
				yesBtn.setText("\u786e\u8ba4");
				yesBtn.setBounds(191, 241, 60, 22);
				yesBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						yesBtnMouseClicked(evt);
					}
				});
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("jLabel2");
				jLabel2.setBounds(-100, -52, 655, 1559);
				jLabel2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/e8fdab4e7b59e905be1bd29c7ffcb92.jpg")));
			}
			pack();
			this.setSize(311, 343);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void backBtnMouseClicked(MouseEvent evt) {
		if(i==0){
			ChooseJFrame cj = new ChooseJFrame();
			cj.setVisible(true);
			cj.setLocationRelativeTo(null);
			dispose();
		}else if(i==1){
			newchooseJFrame cj = new newchooseJFrame();
			cj.setVisible(true);
			cj.setLocationRelativeTo(null);
			dispose();
		}
	}	
	
	private void yesBtnMouseClicked(MouseEvent evt) {
		int size = new UserDAO().getAdmin().size();
		int newID = Integer.parseInt(new UserDAO().getAdmin().get(size-1).getID())+1;
		new UserDAO().addAdmin(newID+"",accountText.getText(),new String(jPasswordField.getPassword()),nameText.getText(),phoneNumText.getText());
		if(i==0){
			JOptionPane.showMessageDialog(null,"注册成功！欢迎来到云工厂制造！");
			dispose();
			LoginJFrame lj = new LoginJFrame();
			lj.setVisible(true);
			lj.setLocationRelativeTo(null);
		}else if(i==1){
			JOptionPane.showMessageDialog(null,"新建用户成功！");
			UserManageJFrame cj = new UserManageJFrame();
			cj.setVisible(true);
			cj.setLocationRelativeTo(null);
			dispose();
		}
	}

}
