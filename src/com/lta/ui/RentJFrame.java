package com.lta.ui;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.SwingUtilities;

import com.lta.bean.Equipment;
import com.lta.bean.Factory;
import com.lta.bean.User;
import com.lta.dao.BaseDAO;
import com.lta.dao.EquipDAO;
import com.lta.dao.FactoryDAO;
import com.lta.dao.TableEmbedCheckbox;
import com.lta.dao.UserDAO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
public class RentJFrame extends javax.swing.JFrame {
	private JScrollPane jScrollPane1;
	private JLabel Text;
	private JButton yesBtn;
	private JTable EquipTable;
	private User user;

	/**
	* Auto-generated main method to display this JFrame
	*/
	/*public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				RentJFrame inst = new RentJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}*/
	
	public RentJFrame() {
		super();
		initGUI();
	}
	
	public RentJFrame(User user) {
		this.user = user;
		initGUI();
	}
	String[] colName = {"","ID","设备名称","设备编号","设备类别","设备规格","设备状态","设备描述","设备状态"};
	Object[][] datas;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("\u4ea7\u80fd\u4e2d\u5fc3");
			{
				jScrollPane1 = new JScrollPane();
				getContentPane().add(jScrollPane1);
				jScrollPane1.setBounds(0, 78, 828, 314);
				{
					List<Equipment> equips = new EquipDAO().getEquip();
					List<Equipment> equipments = new ArrayList<Equipment>();
					for(Equipment equip:equips){
						if(equip.getRentState().equals("未被租用")){
							equipments.add(equip);
						}
					}
					
					datas = new Object[equipments.size()][10];
					for(int i = 0;i<equipments.size();i++){
						Equipment equip = equipments.get(i);
						datas[i][0] = false;
						datas[i][1] = equip.getID();
						datas[i][2] = equip.getName();
						datas[i][3] = equip.getCode();
						datas[i][4] = equip.getType();
						datas[i][5] = equip.getSize();
						datas[i][6] = equip.getState();
						datas[i][7] = equip.getDescription();
						datas[i][8] = equip.getRentState();
						datas[i][9] = equip.getFactoryName();
					}
					TableEmbedCheckbox tec = 
						new TableEmbedCheckbox(
								datas,colName);
					EquipTable = new JTable(tec);
					jScrollPane1.setViewportView(EquipTable);
				
			}
			}
			{
				yesBtn = new JButton();
				getContentPane().add(yesBtn);
				yesBtn.setText("\u786e\u5b9a");
				yesBtn.setBounds(733, 402, 74, 25);
				yesBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						yesBtnMouseClicked(evt);
					}
				});
			}
			{
				Text = new JLabel();
				getContentPane().add(Text);
				Text.setText("\u4ea7  \u80fd  \u4e2d  \u5fc3");
				Text.setBounds(331, 35, 178, 18);
				Text.setForeground(new java.awt.Color(0,0,0));
				Text.setFont(new java.awt.Font("黑体",1,22));
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("jLabel1");
				jLabel1.setBounds(-108, 0, 1005, 77);
				jLabel1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/0c8110057b9dfaf05240bb685e063ae.png")));
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("jLabel2");
				jLabel2.setBounds(-9, 391, 881, 59);
				jLabel2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/a0d957b4a729a40b3d61d5946e0fdd5.png")));
			}
			pack();
			this.setSize(844, 477);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

	
	private void yesBtnMouseClicked(MouseEvent evt) {
		int[] rowIndexes = new int[50];
		int j = 0;
		Equipment e = new Equipment();
		int res = 0;
		for(int i = 0;i<EquipTable.getRowCount();i++){
			if(EquipTable.getValueAt(i,0).equals(true)){
				rowIndexes[j] = i;
				j++;
			}
		}
		if(j==0){
			int r = JOptionPane.showConfirmDialog(null,
	                "您未选择任何设备，是否退出？", "确认",
	                JOptionPane.YES_NO_OPTION,
	                JOptionPane.QUESTION_MESSAGE);
	        if (r != JOptionPane.YES_OPTION) {
	            return;
	        }
			MyEquipsJFrame emj = new MyEquipsJFrame(user);
			emj.setVisible(true);
			emj.setLocationRelativeTo(null);
			dispose();
            return;
		}else{
			int r = JOptionPane.showConfirmDialog(null,
	                "确定租借"+j+"台已选设备？", "确认",
	                JOptionPane.YES_NO_OPTION,
	                JOptionPane.QUESTION_MESSAGE);
	        if (r != JOptionPane.YES_OPTION) {
	            return;
	        }
	        List<Equipment> equips = new EquipDAO().getEquip();
			for(int h = 0;h<j;h++){
				for(Equipment equi:equips){
					if((EquipTable.getValueAt(rowIndexes[h],1).toString()).equals(equi.getID())){
						equi.setRentState("已被租用");
						equi.setFactoryName(new UserDAO().getFactory(this.user).getName());
				
				}
			}
			}
			new BaseDAO().write("src//information//Equipment.bin",equips);
			MyEquipsJFrame emj = new MyEquipsJFrame(user);
			emj.setVisible(true);
			emj.setLocationRelativeTo(null);
			dispose();
		}
		
		}

}
