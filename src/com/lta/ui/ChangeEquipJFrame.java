package com.lta.ui;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import com.lta.bean.Equipment;
import com.lta.bean.Product;
import com.lta.dao.BaseDAO;
import com.lta.dao.EquipDAO;
import com.lta.dao.ProductDAO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

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
public class ChangeEquipJFrame extends javax.swing.JFrame {

	private int i;
	private Equipment equip;
	private JLabel jLabel2;
	private JButton yesBtn;
	private JRadioButton desBtn;
	private JRadioButton sizeBtn;
	private JRadioButton typeBtn;
	private JRadioButton nameBtn;
	private JLabel jLabel1;
	/**
	* Auto-generated main method to display this JFrame
	*/
	/*public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ChangeEquipJFrame inst = new ChangeEquipJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}*/
	
	public ChangeEquipJFrame() {
		super();
		initGUI();
	}
	
	public ChangeEquipJFrame(Equipment target,int i) {
		this.i = i;
		this.equip = target;
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("\u4fee\u6539\u8bbe\u5907\u4fe1\u606f");
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("您正在修改设备"+this.equip.getName()+"的信息！");
				jLabel1.setBounds(12, 25, 310, 25);
				jLabel1.setFont(new java.awt.Font("幼圆",1,16));
				jLabel1.setForeground(new java.awt.Color(255,255,255));
			}
			{
				nameBtn = new JRadioButton();
				getContentPane().add(nameBtn);
				nameBtn.setText("\u8bbe\u5907\u540d\u79f0");
				nameBtn.setBounds(42, 71, 87, 22);
				nameBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						nameBtnMouseClicked(evt);
					}
				});
			}
			{
				typeBtn = new JRadioButton();
				getContentPane().add(typeBtn);
				typeBtn.setText("\u8bbe\u5907\u7c7b\u522b");
				typeBtn.setBounds(42, 114, 87, 22);
				typeBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						typeBtnMouseClicked(evt);
					}
				});
			}
			{
				sizeBtn = new JRadioButton();
				getContentPane().add(sizeBtn);
				sizeBtn.setText("\u8bbe\u5907\u89c4\u683c");
				sizeBtn.setBounds(42, 158, 87, 22);
				sizeBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						sizeBtnMouseClicked(evt);
					}
				});
			}
			{
				desBtn = new JRadioButton();
				getContentPane().add(desBtn);
				desBtn.setText("\u8bbe\u5907\u63cf\u8ff0");
				desBtn.setBounds(42, 204, 87, 22);
				desBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						desBtnMouseClicked(evt);
					}
				});
			}
			{
				yesBtn = new JButton();
				getContentPane().add(yesBtn);
				yesBtn.setText("\u786e\u8ba4");
				yesBtn.setBounds(180, 296, 67, 25);
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
				jLabel2.setBounds(-19, -64, 431, 1343);
				jLabel2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/e8fdab4e7b59e905be1bd29c7ffcb92.jpg")));
			}
			pack();
			this.setSize(361, 430);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void nameBtnMouseClicked(MouseEvent evt) {
		List<Equipment> equipments = new EquipDAO().getEquip();
		for(Equipment equip:equipments){
			if(equip.getName().equals(this.equip.getName())){
				equip.setName(JOptionPane.showInputDialog(null,"请输入修改后的设备名称："));
				break;
			}
		}
		new BaseDAO().write("src//information//Equipment.bin",equipments);
	}
	
	private void typeBtnMouseClicked(MouseEvent evt) {
		List<Equipment> equipments = new EquipDAO().getEquip();
		for(Equipment equip:equipments){
			if(equip.getName().equals(this.equip.getName())){
				equip.setType(JOptionPane.showInputDialog(null,"请输入修改后的设备类型："));
				break;
			}
		}
		new BaseDAO().write("src//information//Equipment.bin",equipments);
	}
	
	private void sizeBtnMouseClicked(MouseEvent evt) {
		List<Equipment> equipments = new EquipDAO().getEquip();
		for(Equipment equip:equipments){
			if(equip.getName().equals(this.equip.getName())){
				equip.setSize(JOptionPane.showInputDialog(null,"请输入修改后的设备规格："));
				break;
			}
		}
		new BaseDAO().write("src//information//Equipment.bin",equipments);
	}
	
	private void desBtnMouseClicked(MouseEvent evt) {
		List<Equipment> equipments = new EquipDAO().getEquip();
		for(Equipment equip:equipments){
			if(equip.getName().equals(this.equip.getName())){
				equip.setDescription(JOptionPane.showInputDialog(null,"请输入修改后的设备描述："));
				break;
			}
		}
		new BaseDAO().write("src//information//Equipment.bin",equipments);
	}
	
	private void yesBtnMouseClicked(MouseEvent evt) {
		JOptionPane.showMessageDialog(null, "保存成功！");
		if(i==1){
			EquipTypeManageJFrame rj = new EquipTypeManageJFrame();
			rj.setVisible(true);
			rj.setLocationRelativeTo(null);
		}else if(i==0){
			EquipManageJFrame rj = new EquipManageJFrame();
			rj.setVisible(true);
			rj.setLocationRelativeTo(null);
		}
		dispose();
	}
	

}
