package com.lta.ui;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import com.lta.bean.Agency;
import com.lta.bean.FactoryAdministrator;
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
public class RegisterJFrame extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel idjLabel;
	private JLabel passwordjLabel;
	private JLabel jLabel1;
	private ButtonGroup buttonGroup;
	private JButton backBtn;
	private JButton yesBtn;
	private JTextField namejTextField;
	private JPasswordField password;
	private JTextField facIntrojTextField;
	private JTextField facNamejTextField;
	private JTextField phoneNumjTextField;
	private JTextField idjTextField;
	private JLabel facIntrojLabel;
	private JLabel facNamejLabel;
	private JLabel phonenjLabel;
	private JLabel realNamejLabel;
	private int i;
	int type;

	/**
	* Auto-generated main method to display this JFrame
	*/
	/*public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				RegisterJFrame inst = new RegisterJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}*/
	
	public RegisterJFrame() {
		super();
		initGUI();
	}
	public RegisterJFrame(int i) {
		this.i = i;
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("\u6ce8\u518c");
			this.addWindowListener(new WindowAdapter() {
				/*public void windowClosed(WindowEvent evt) {
					thisWindowClosed(evt);
				}*/
			});
			{
				idjLabel = new JLabel();
				getContentPane().add(idjLabel);
				idjLabel.setText("\u767b\u9646\u8d26\u53f7");
				idjLabel.setBounds(26, 33, 55, 14);
			}
			{
				realNamejLabel = new JLabel();
				getContentPane().add(realNamejLabel);
				realNamejLabel.setText("\u771f\u5b9e\u59d3\u540d");
				realNamejLabel.setBounds(26, 112, 55, 16);
			}
			{
				passwordjLabel = new JLabel();
				getContentPane().add(passwordjLabel);
				passwordjLabel.setText("\u767b\u9646\u5bc6\u7801");
				passwordjLabel.setBounds(26, 68, 57, 24);
			}
			{
				phonenjLabel = new JLabel();
				getContentPane().add(phonenjLabel);
				phonenjLabel.setText("\u8054\u7cfb\u65b9\u5f0f");
				phonenjLabel.setBounds(28, 148, 53, 22);
			}
			{
				facNamejLabel = new JLabel();
				getContentPane().add(facNamejLabel);
				facNamejLabel.setText("\u5de5\u5382\u540d\u79f0");
				facNamejLabel.setBounds(26, 186, 62, 26);
			}
			{
				facIntrojLabel = new JLabel();
				getContentPane().add(facIntrojLabel);
				facIntrojLabel.setText("\u5de5\u5382\u4ecb\u7ecd");
				facIntrojLabel.setBounds(26, 228, 57, 23);
			}
			{
				idjTextField = new JTextField();
				getContentPane().add(idjTextField);
				idjTextField.setBounds(100, 30, 165, 20);
			}
			{
				namejTextField = new JTextField();
				getContentPane().add(namejTextField);
				namejTextField.setBounds(100, 110, 165, 20);
			}
			{
				phoneNumjTextField = new JTextField();
				getContentPane().add(phoneNumjTextField);
				phoneNumjTextField.setBounds(100, 150, 165, 20);
			}
			{
				facNamejTextField = new JTextField();
				getContentPane().add(facNamejTextField);
				facNamejTextField.setBounds(100, 190, 165, 20);
			}
			{
				facIntrojTextField = new JTextField();
				getContentPane().add(facIntrojTextField);
				facIntrojTextField.setBounds(100, 230, 165, 20);
			}
			{
				password = new JPasswordField();
				getContentPane().add(password);
				password.setBounds(100, 70, 165, 20);
			}
			{
				yesBtn = new JButton();
				getContentPane().add(yesBtn);
				yesBtn.setText("\u786e\u5b9a");
				yesBtn.setBounds(193, 292, 67, 25);
				yesBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						yesBtnMouseClicked(evt);
					}
				});
			}
			{
				backBtn = new JButton();
				getContentPane().add(backBtn);
				backBtn.setText("\u8fd4\u56de");
				backBtn.setBounds(31, 292, 67, 25);
				backBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						backBtnMouseClicked(evt);
					}
				});
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("\u6ce8\u518c");
				jLabel1.setBounds(-5, -8, 925, 1309);
				jLabel1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/e8fdab4e7b59e905be1bd29c7ffcb92.jpg")));
			}
			pack();
			this.setSize(317, 405);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
/*	private void thisWindowClosed(WindowEvent evt) {
		//关闭时关闭整个程序
		System.exit(0);
	}
	*/
	private void yesBtnMouseClicked(MouseEvent evt) {
		int size = new UserDAO().getAdmin().size();
		int newID = Integer.parseInt(new UserDAO().getAdmin().get(size-1).getID())+1;
			/*User user = new FactoryAdministrator(idjTextField.getText(),new String(password.getPassword()),
					namejTextField.getText(),phoneNumjTextField.getText(),facNamejTextField.getText(),facIntrojTextField.getText());*/
		//if(idjTextField.getText()!=null && new String(password.getPassword())!=null && namejTextField.getText()!=null && phoneNumjTextField.getText()!=null
				//&& facNamejTextField.getText()!=null && facIntrojTextField.getText()!=null){
			new UserDAO().addAdmin(newID+"",idjTextField.getText(),new String(password.getPassword()),
					namejTextField.getText(),phoneNumjTextField.getText(),facNamejTextField.getText(),facIntrojTextField.getText());
		/*else if(type == 2){
			new UserDAO().addAdmin((size+1)+"",idjTextField.getText(),new String(password.getPassword()),namejTextField.getText(),phoneNumjTextField.getText());
		}*/
		if(i==0){
			JOptionPane.showMessageDialog(null,"注册成功！欢迎来到云工厂制造！");
			dispose();
			LoginJFrame lj = new LoginJFrame();
			lj.setVisible(true);
			lj.setLocationRelativeTo(null);
		}else if(i==1){
			JOptionPane.showMessageDialog(null,"新增用户成功！");
			dispose();
			UserManageJFrame lj = new UserManageJFrame();
			lj.setVisible(true);
			lj.setLocationRelativeTo(null);
		}
		
		
		//}else{
			//JOptionPane.showMessageDialog(null,"请将信息输入完整！");
		}
		
	
	
	/*private ButtonGroup getButtonGroup() {
		if(buttonGroup == null) {
			buttonGroup = new ButtonGroup();
		}
		return buttonGroup;
	}
	*/
/*	private void factorybtnMouseClicked(MouseEvent evt) {
		type = 1;//云工厂管理员
	}
	
	private void dealerBtnMouseClicked(MouseEvent evt) {
		type = 2;//经销商
	}*/
	
	private void backBtnMouseClicked(MouseEvent evt) {
		if(i==0){
			dispose();
			ChooseJFrame lj = new ChooseJFrame();
			lj.setVisible(true);
			lj.setLocationRelativeTo(null);
		}else if(i==1){
			dispose();
			newchooseJFrame lj = new newchooseJFrame();
			lj.setVisible(true);
			lj.setLocationRelativeTo(null);
		}
		
	}

}
