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

import com.lta.bean.Equipment;
import com.lta.bean.Product;
import com.lta.dao.EquipDAO;
import com.lta.dao.ProductDAO;


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
public class newEquipJFrame extends javax.swing.JFrame {
	private JLabel text;
	private JLabel jLabel1;
	private JButton yesBtn;
	private JButton cancelBtn;
	private JTextField desText;
	private JTextField sizeText;
	private JTextField typeText;
	private JTextField jTextField1;
	private JLabel aa;
	private JLabel size;
	private JLabel type;
	private JLabel name;
	private int back;

	/**
	* Auto-generated main method to display this JFrame
	*/
	/*public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				newEquipJFrame inst = new newEquipJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}*/
	
	public newEquipJFrame() {
		super();
		initGUI();
	}
	
	public newEquipJFrame(int back) {
		this.back = back;
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("\u65b0\u589e\u8bbe\u5907");
			{
				text = new JLabel();
				getContentPane().add(text);
				text.setText("\u65b0\u5efa\u8bbe\u5907");
				text.setBounds(107, 21, 89, 22);
				text.setFont(new java.awt.Font("Microsoft YaHei UI",1,16));
				text.setForeground(new java.awt.Color(255,255,255));
			}
			{
				name = new JLabel();
				getContentPane().add(name);
				name.setText("\u540d\u79f0");
				name.setBounds(28, 69, 56, 18);
			}
			{
				type = new JLabel();
				getContentPane().add(type);
				type.setText("\u7c7b\u522b");
				type.setBounds(28, 115, 40, 18);
			}
			{
				size = new JLabel();
				getContentPane().add(size);
				size.setText("\u89c4\u683c");
				size.setBounds(28, 161, 63, 19);
			}
			{
				aa = new JLabel();
				getContentPane().add(aa);
				aa.setText("\u63cf\u8ff0");
				aa.setBounds(28, 206, 42, 19);
			}
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1);
				jTextField1.setBounds(80, 70, 155, 20);
			}
			{
				typeText = new JTextField();
				getContentPane().add(typeText);
				typeText.setBounds(80, 115, 155, 20);
			}
			{
				sizeText = new JTextField();
				getContentPane().add(sizeText);
				sizeText.setBounds(80, 160, 155, 20);
			}
			{
				desText = new JTextField();
				getContentPane().add(desText);
				desText.setBounds(80, 205, 155, 20);
			}
			{
				cancelBtn = new JButton();
				getContentPane().add(cancelBtn);
				cancelBtn.setText("\u53d6\u6d88");
				cancelBtn.setBounds(25, 297, 73, 25);
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
				yesBtn.setBounds(165, 297, 71, 25);
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
				jLabel1.setBounds(-6, -5, 967, 1236);
				jLabel1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/e8fdab4e7b59e905be1bd29c7ffcb92.jpg")));
			}
			pack();
			this.setSize(292, 387);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void yesBtnMouseClicked(MouseEvent evt) {
		int size = new EquipDAO().getEquip().size();
		int newID = Integer.parseInt(new EquipDAO().getEquip().get(size-1).getID())+1;
		Equipment equip = new Equipment(newID+"",jTextField1.getText(),
				typeText.getText(),sizeText.getText(),"关机",desText.getText(),"未被租用",null);
		new EquipDAO().addEquip(equip);
		if(back==1){  //返回类别管理
			JOptionPane.showMessageDialog(null,"设备创建成功！");
			EquipTypeManageJFrame lj = new EquipTypeManageJFrame();
			lj.setVisible(true);
			lj.setLocationRelativeTo(null);
			dispose();
		}else if(back==0){  //返回信息管理
			JOptionPane.showMessageDialog(null,"设备创建成功！");
			EquipManageJFrame lj = new EquipManageJFrame();
			lj.setVisible(true);
			lj.setLocationRelativeTo(null);
			dispose();
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
			EquipTypeManageJFrame lj = new EquipTypeManageJFrame();
			lj.setVisible(true);
			lj.setLocationRelativeTo(null);
			dispose();
		}else if(back==0){  //返回信息管理
			EquipManageJFrame lj = new EquipManageJFrame();
			lj.setVisible(true);
			lj.setLocationRelativeTo(null);
			dispose();
		}

	}

}
