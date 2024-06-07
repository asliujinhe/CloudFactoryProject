package com.lta.ui;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.Arrays;
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

import com.lta.bean.Equipment;
import com.lta.bean.Factory;
import com.lta.bean.Product;
import com.lta.bean.User;
import com.lta.dao.BaseDAO;
import com.lta.dao.EquipDAO;
import com.lta.dao.FactoryDAO;
import com.lta.dao.ProductDAO;
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
public class EquipManageJFrame extends javax.swing.JFrame {
	private JScrollPane jScrollPane1;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JButton NameBtn;
	private JButton changeBtn;
	private JTable EquipmentTable;
	private JButton backBtn;
	private JButton yesBtn;
	private JButton stateBtn;
	private JButton deleBtn;
	private JButton newBtn;
	private JButton resetBtn;
	private JTextField NameText;

	/**
	* Auto-generated main method to display this JFrame
	*/
	/*public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				EquipManageJFrame inst = new EquipManageJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}*/
	
	public EquipManageJFrame() {
		super();
		initGUI();
	}
	String[] colNames = {"","ID","设备名称","设备编号","设备类型","设备规格","设备状态","设备描述","租用状态","所属工厂"};
	Object[][] datas = null;
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("\u8bbe\u5907\u7ba1\u7406");
			{
				List<Equipment> equips = new EquipDAO().getEquip();
				Object[][] datas = new Object[equips.size()][10];
				for(int i = 0;i<equips.size();i++){
					Equipment equip = equips.get(i);
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
				jScrollPane1 = new JScrollPane();
				getContentPane().add(jScrollPane1);
				jScrollPane1.setBounds(0, 113, 953, 364);
				{
					TableEmbedCheckbox tec = 
						new TableEmbedCheckbox(
								datas,colNames);
					EquipmentTable = new JTable(tec);
					jScrollPane1.setViewportView(EquipmentTable);
				
				}
			}
			{
				NameText = new JTextField();
				getContentPane().add(NameText);
				NameText.setBounds(20, 17, 134, 23);
			}
			{
				NameBtn = new JButton();
				getContentPane().add(NameBtn);
				NameBtn.setText("\u6309\u540d\u79f0\u67e5\u8be2");
				NameBtn.setBounds(160, 17, 107, 25);
				NameBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						NameBtnMouseClicked(evt);
					}
				});
			}
			{
				resetBtn = new JButton();
				getContentPane().add(resetBtn);
				resetBtn.setText("\u91cd\u7f6e");
				resetBtn.setBounds(278, 17, 69, 25);
				resetBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						resetBtnMouseClicked(evt);
					}
				});
			}
			{
				newBtn = new JButton();
				getContentPane().add(newBtn);
				newBtn.setText("\u65b0\u5efa");
				newBtn.setBounds(20, 77, 70, 25);
				newBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						newBtnMouseClicked(evt);
					}
				});
			}
			{
				deleBtn = new JButton();
				getContentPane().add(deleBtn);
				deleBtn.setText("\u5220\u9664");
				deleBtn.setBounds(95, 77, 71, 25);
				deleBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						deleBtnMouseClicked(evt);
					}
				});
			}
			{
				changeBtn = new JButton();
				getContentPane().add(changeBtn);
				changeBtn.setText("\u4fee\u6539");
				changeBtn.setBounds(832, 72, 98, 25);
				changeBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						changeBtnMouseClicked(evt);
					}
				});
			}
			{
				stateBtn = new JButton();
				getContentPane().add(stateBtn);
				stateBtn.setText("\u8bbe\u5907\u72b6\u6001");
				stateBtn.setBounds(832, 31, 98, 30);
				stateBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						stateBtnMouseClicked(evt);
					}
				});
			}
			{
				yesBtn = new JButton();
				getContentPane().add(yesBtn);
				yesBtn.setText("\u786e\u5b9a");
				yesBtn.setBounds(723, 488, 98, 29);
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
				backBtn.setBounds(849, 489, 92, 28);
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
				jLabel1.setBounds(-149, -246, 1384, 359);
				jLabel1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/0c8110057b9dfaf05240bb685e063ae.png")));
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("jLabel2");
				jLabel2.setBounds(-1, 477, 1386, 70);
				jLabel2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/a0d957b4a729a40b3d61d5946e0fdd5.png")));
			}
			pack();
			this.setSize(969, 577);
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
	
	private void NameBtnMouseClicked(MouseEvent evt) {
		List<Equipment> equips = new EquipDAO().getEquip();
		List<Equipment> equis = new ArrayList<Equipment>();
		Equipment e = null;
		int flag = 0;
		for(Equipment equi:equips){
			if(equi.getName().equals(NameText.getText())){
				e = equi;
				flag = 1;
				
			}
		}
		if(flag == 1)
			equis.add(e);
		else
			JOptionPane.showMessageDialog(null,"无搜索结果！请检查信息是否正确！");
		show(equis);
	}
	
	private void resetBtnMouseClicked(MouseEvent evt) {
		show(new EquipDAO().getEquip());
	}
	
	private void deleBtnMouseClicked(MouseEvent evt) {
		int[] rowIndexes = new int[50];
		int j = 0;
		for(int i = 0;i<EquipmentTable.getRowCount();i++){
			if(EquipmentTable.getValueAt(i, 0).equals(true)){
				rowIndexes[j] = i;
				j++;
			}
		}
		if(j==0){
			JOptionPane.showMessageDialog(null, "请选择后再删除!");
            return;
		}
        
        int r = JOptionPane.showConfirmDialog(null,
                "你确定要删除吗？", "确认删除",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (r != JOptionPane.YES_OPTION) {
            return;
        }
 
        List<Equipment> equips = new EquipDAO().getEquip();
        List<Equipment> deleequip = new ArrayList<Equipment>();
        for(Equipment equi:equips){
        	for(int i= 0;i<j;i++){
        		if(equi.getName().equals(EquipmentTable.getValueAt(rowIndexes[i],2))){
        			deleequip.add(equi);
        		}
        	}
        }
        equips.removeAll(deleequip);
        new BaseDAO().write("src//information//Equipment.bin",equips);
        show(equips);
	}
	
	private void newBtnMouseClicked(MouseEvent evt) {
		newEquipJFrame lj = new newEquipJFrame(0);
		lj.setVisible(true);
		lj.setLocationRelativeTo(null);
		dispose();
	}
	
	private void stateBtnMouseClicked(MouseEvent evt) {
		int[] rowIndexes = new int[50];
		int j = 0;
		Equipment e = new Equipment();
		int res = 0;
		for(int i = 0;i<EquipmentTable.getRowCount();i++){
			if(EquipmentTable.getValueAt(i,0).equals(true)){
				rowIndexes[j] = i;
				j++;
			}
		}
		if(j==0){
			JOptionPane.showMessageDialog(null, "请选择要修改状态的设备！");
            return;
		}else{
			int r = JOptionPane.showConfirmDialog(null,
	                "确定更改"+j+"台已选设备状态？", "确认",
	                JOptionPane.YES_NO_OPTION,
	                JOptionPane.QUESTION_MESSAGE);
	        if (r != JOptionPane.YES_OPTION) {
	            return;
	        }
	        List<Equipment> equips = new EquipDAO().getEquip();
			for(int h = 0;h<j;h++){
				for(Equipment equi:equips){
					if((EquipmentTable.getValueAt(rowIndexes[h],1).toString()).equals(equi.getID())){
						if(equi.getState().equals("开机")){
							equi.setState("关机");
						}else{
							equi.setState("开机");
						}
				}
				}
			}
			new EquipDAO().write("src//information//Equipment.bin",equips);
			show(new EquipDAO().getEquip());
			}
			
			
		}
	
	private void changeBtnMouseClicked(MouseEvent evt) {
		int[] rowIndexes = new int[50];
		int j = 0;
		for(int i = 0;i<EquipmentTable.getRowCount();i++){
			if(EquipmentTable.getValueAt(i, 0).equals(true)){
				rowIndexes[j] = i;
				j++;
			}
		}
		if(j==0){
			JOptionPane.showMessageDialog(null, "请选择要修改的行!");
            return;
		}else if(j>1){
			JOptionPane.showMessageDialog(null, "一次仅能修改一行!");
		}else{
			 List<Equipment> equips = new EquipDAO().getEquip();
		     Equipment target = new Equipment();
		        for(Equipment equip:equips){
		        	for(int row:rowIndexes){
		        		if(equip.getName().equals(EquipmentTable.getValueAt(row,2))){
		        			target = equip;
		        		}
		        	}
		        }
		    ChangeEquipJFrame rj = new ChangeEquipJFrame(target,0);
			rj.setVisible(true);
			rj.setLocationRelativeTo(null);
			dispose();
		}
	}
	
	private void yesBtnMouseClicked(MouseEvent evt) {
		JOptionPane.showMessageDialog(null, "成功保存信息！");
	}
	
	private void show(List<Equipment> equips){
		datas = new Object[equips.size()][10];
		for(int i = 0;i<equips.size();i++){
			Equipment equip = equips.get(i);
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
			TableEmbedCheckbox tec = 
				new TableEmbedCheckbox(
						datas,colNames);
			EquipmentTable = new JTable(tec);
			jScrollPane1.setViewportView(EquipmentTable);
		}
	}

}
