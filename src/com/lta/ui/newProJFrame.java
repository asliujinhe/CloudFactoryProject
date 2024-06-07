package com.lta.ui;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import com.lta.bean.Product;
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
public class newProJFrame extends javax.swing.JFrame {
	private JLabel text;
	private JLabel jLabel1;
	private JButton yesBtn;
	private JButton cancelBtn;
	private JTextField desText;
	private JTextField sizeText;
	private JLabel description;
	private JLabel size;
	private JTextField typeText;
	private JLabel type;
	private JTextField name;
	private JLabel nameText;
	private int back;

	/**
	* Auto-generated main method to display this JFrame
	*/
	/*public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				newProJFrame inst = new newProJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}*/
	
	public newProJFrame() {
		super();
		initGUI();
	}
	
	public newProJFrame(int back) {
		this.back = back;
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("\u65b0\u5efa\u4ea7\u54c1");
			{
				text = new JLabel();
				getContentPane().add(text);
				text.setText("\u65b0\u5efa\u4ea7\u54c1");
				text.setBounds(100, 23, 90, 18);
				text.setFont(new java.awt.Font("黑体",1,16));
				text.setForeground(new java.awt.Color(255,255,255));
			}
			{
				nameText = new JLabel();
				getContentPane().add(nameText);
				nameText.setText("\u540d\u79f0");
				nameText.setBounds(31, 70, 62, 18);
			}
			{
				name = new JTextField();
				getContentPane().add(name);
				name.setBounds(80, 70, 150, 20);
			}
			{
				type = new JLabel();
				getContentPane().add(type);
				type.setText("\u7c7b\u522b");
				type.setBounds(31, 121, 43, 18);
			}
			{
				typeText = new JTextField();
				getContentPane().add(typeText);
				typeText.setBounds(80, 120, 150, 20);
			}
			{
				size = new JLabel();
				getContentPane().add(size);
				size.setText("\u89c4\u683c");
				size.setBounds(31, 171, 49, 18);
			}
			{
				description = new JLabel();
				getContentPane().add(description);
				description.setText("\u63cf\u8ff0");
				description.setBounds(31, 221, 55, 18);
			}
			{
				sizeText = new JTextField();
				getContentPane().add(sizeText);
				sizeText.setBounds(80, 170, 150, 20);
			}
			{
				desText = new JTextField();
				getContentPane().add(desText);
				desText.setBounds(80, 220, 150, 20);
			}
			{
				cancelBtn = new JButton();
				getContentPane().add(cancelBtn);
				cancelBtn.setText("\u53d6\u6d88");
				cancelBtn.setBounds(26, 293, 77, 25);
				cancelBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						cancelBtnMouseClicked(evt);
					}
				});
			}
			{
				yesBtn = new JButton();
				getContentPane().add(yesBtn);
				yesBtn.setText("\u786e\u5b9a");
				yesBtn.setBounds(166, 293, 77, 25);
				yesBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						yesBtnMouseClicked(evt);
					}
				});
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("jLabel1");
				jLabel1.setBounds(0, -8, 1049, 1213);
				jLabel1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/e8fdab4e7b59e905be1bd29c7ffcb92.jpg")));
			}
			pack();
			this.setSize(293, 413);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void cancelBtnMouseClicked(MouseEvent evt) {
		int r = JOptionPane.showConfirmDialog(null,
                "确认退出新建吗？", "确认",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (r != JOptionPane.YES_OPTION) {
            return;
        }
		if(back==1){  //返回类别管理
			ProTypeManageJFrame lj = new ProTypeManageJFrame();
			lj.setVisible(true);
			lj.setLocationRelativeTo(null);
			dispose();
		}else if(back==0){  //返回信息管理
			ProInfoManageJFrame lj = new ProInfoManageJFrame();
			lj.setVisible(true);
			lj.setLocationRelativeTo(null);
			dispose();
		}
	}
	
	private void yesBtnMouseClicked(MouseEvent evt) {
		int size = new ProductDAO().getProduct().size();
		int newID = Integer.parseInt(new ProductDAO().getProduct().get(size-1).getID())+1;
		Product product = new Product(newID+"",name.getText(),typeText.getText(),sizeText.getText(),desText.getText());
		new ProductDAO().addProduct(product);
		if(back==1){  //返回类别管理
			ProTypeManageJFrame lj = new ProTypeManageJFrame();
			lj.setVisible(true);
			lj.setLocationRelativeTo(null);
			dispose();
		}else if(back==0){  //返回信息管理
			ProInfoManageJFrame lj = new ProInfoManageJFrame();
			lj.setVisible(true);
			lj.setLocationRelativeTo(null);
			dispose();
		}
		JOptionPane.showMessageDialog(null,"产品创建成功！");

	}

}
