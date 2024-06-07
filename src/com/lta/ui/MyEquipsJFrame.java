package com.lta.ui;

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
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

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
public class MyEquipsJFrame extends javax.swing.JFrame {
	
	private User user;
	private JButton newBtn;
	private JButton deleBtn;
	private JButton stateBtn;
	private JScrollPane jScrollPane1;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JButton byeBtn;
	private JTable EquipTable;
	private JButton rentBtn;

	/**
	* Auto-generated main method to display this JFrame
	*/
	/*public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MyEquipsJFrame inst = new MyEquipsJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	*/
	public MyEquipsJFrame() {
		super();
		initGUI();
	}
	
	public MyEquipsJFrame(User user) {
		this.user = user;
		initGUI();
	}
	String[] colNames = {"","ID","设备名称","设备编号","设备类别","设备规格","设备状态","设备描述","租用状态","所属工厂"};
	Object[][] datas = null;
	private JButton returnBtn;
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("\u6211\u7684\u8bbe\u5907");
			{
				newBtn = new JButton();
				getContentPane().add(newBtn);
				newBtn.setText("\u65b0\u5efa");
				newBtn.setBounds(17, 74, 67, 25);
				newBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						newBtnMouseClicked(evt);
					}
				});
			}
			{
				rentBtn = new JButton();
				getContentPane().add(rentBtn);
				rentBtn.setText("\u79df\u7528\u8bbe\u5907");
				rentBtn.setBounds(105, 74, 83, 25);
				rentBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						rentBtnMouseClicked(evt);
					}
				});
			}
			{
				deleBtn = new JButton();
				getContentPane().add(deleBtn);
				deleBtn.setText("\u5220\u9664");
				deleBtn.setBounds(742, 79, 72, 26);
				deleBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						deleBtnMouseClicked(evt);
					}
				});
			}
			{
				stateBtn = new JButton();
				getContentPane().add(stateBtn);
				stateBtn.setText("\u8bbe\u5907\u72b6\u6001");
				stateBtn.setBounds(825, 79, 95, 26);
				stateBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						stateBtnMouseClicked(evt);
					}
				});
			}
			{
				jScrollPane1 = new JScrollPane();
				getContentPane().add(jScrollPane1);
				jScrollPane1.setBounds(0, 116, 946, 348);
				{
					showEquip();
				}
			}
			{
				byeBtn = new JButton();
				getContentPane().add(byeBtn);
				byeBtn.setText("\u6ce8\u9500");
				byeBtn.setBounds(853, 30, 62, 25);
				byeBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						byeBtnMouseClicked(evt);
					}
				});
			}
			{
				returnBtn = new JButton();
				getContentPane().add(returnBtn);
				returnBtn.setText("\u5f52\u8fd8\u8bbe\u5907");
				returnBtn.setBounds(206, 74, 84, 26);
				returnBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						returnBtnMouseClicked(evt);
					}
				});
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("jLabel1");
				jLabel1.setBounds(-164, 2, 1119, 114);
				jLabel1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/0c8110057b9dfaf05240bb685e063ae.png")));
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("jLabel2");
				jLabel2.setBounds(0, 463, 961, 41);
				jLabel2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/a0d957b4a729a40b3d61d5946e0fdd5.png")));
			}
			pack();
			this.setSize(962, 543);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void newBtnMouseClicked(MouseEvent evt) {
		newMyEquipJFrame mj = new newMyEquipJFrame(this.user);
		mj.setVisible(true);
		mj.setLocationRelativeTo(null);
		dispose();
	}
	
	private void rentBtnMouseClicked(MouseEvent evt) {
		RentJFrame mj = new RentJFrame(this.user);
		mj.setVisible(true);
		mj.setLocationRelativeTo(null);
		dispose();
	}
	
	private void byeBtnMouseClicked(MouseEvent evt) {
		JOptionPane.showMessageDialog(null,"确认退出登录吗？");
		LoginJFrame lj = new LoginJFrame();
		lj.setVisible(true);
		lj.setLocationRelativeTo(null);
		dispose();
	}
	
	private void stateBtnMouseClicked(MouseEvent evt) {
		/*//1.得到工厂的索引值
		List<Factory> factorys = new FactoryDAO().getFactory();
        int index = 0;
        for(int i =0;i<factorys.size();i++){
        	if((factorys.get(i).getID()).equals(new UserDAO().getFactory(user).getID())){
        		index = i;
        		
        	}
        		
        }*/
        //找到要更改状态的设备
		int[] rowIndexes = new int[50];
		int j = 0;
		Equipment e = new Equipment();
		for(int i = 0;i<EquipTable.getRowCount();i++){
			if(EquipTable.getValueAt(i,0).equals(true)){
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
					if((EquipTable.getValueAt(rowIndexes[h],1).toString()).equals(equi.getID())){
						if(equi.getState().equals("开机")){
							equi.setState("关机");
						}else{
							equi.setState("开机");
						}
				}
				}
			}
			new EquipDAO().write("src//information//Equipment.bin",equips);
			showEquip();
			}
			
			
			
		}
	
	
	private void deleBtnMouseClicked(MouseEvent evt) {
		int[] rowIndexes = new int[50];
		int j = 0;
		for(int i = 0;i<EquipTable.getRowCount();i++){
			if(EquipTable.getValueAt(i, 0).equals(true)){
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
        //!!不再从工厂里找到设备！
        //1.读出所有的工厂，并在其中找到当前工厂的索引值
        //2.遍历当前工厂的所有设备 找到要被删除的设备
        //3.删除后 重新写入Factory文件以及更新Equipment文件
        //List<Factory> factorys = new FactoryDAO().getFactory();
        //int index = 0;
        //System.out.println("2222222222222");
        //System.out.println(index);
        //for(int i =0;i<factorys.size();i++){
        	//System.out.println(factorys.get(i));
        	//System.out.println(factorys.get(i).getID());
        	//System.out.println(new UserDAO().getFactory(user).getID());
        	//if((factorys.get(i).getID()).equals(new UserDAO().getFactory(user).getID())){
        		//index = i;
        		//System.out.println(factorys.get(i));
        		//System.out.println(new UserDAO().getFactory(user).getID());
        		//System.out.println("3333333333333333333");
        		
        	//}
        		
        //}
        //System.out.println(index);
        //System.out.println("444444444444444444444");
        //List<Equipment> equips = new UserDAO().getFactory(user).getEquipments();
        List<Equipment> equips = new EquipDAO().getEquip();
        List<Equipment> deleequips = new ArrayList<Equipment>();
        for(Equipment equip:equips){
        	for(int i = 0;i<j;i++){
        		if(equip.getID().equals(EquipTable.getValueAt(rowIndexes[i],1))){
        			deleequips.add(equip);
        		}
        	}
        }
        
        //factorys.get(index).getEquipments().removeAll(deleequips);
        //new BaseDAO().write("src//information//Factory.bin",factorys);
        equips.removeAll(deleequips);
        new BaseDAO().write("src//information//Equipment.bin",equips);
        showEquip();
	}
	private void showEquip(){
		 List<Equipment> equips = new EquipDAO().getEquip();
		 List<Equipment> equipments = new ArrayList<Equipment>();
		 for(Equipment equip:equips){	 
			 if(new EquipDAO().getFactory(equip)!=null){
				 if((new EquipDAO().getFactory(equip).getName()).equals(new UserDAO().getFactory(this.user).getName())){
				 equipments.add(equip);
			 }
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
						datas,colNames);
			EquipTable = new JTable(tec);
			jScrollPane1.setViewportView(EquipTable);
	 }
	
	private void returnBtnMouseClicked(MouseEvent evt) {
		int[] rowIndexes = new int[50];
		int j = 0;
		for(int i = 0;i<EquipTable.getRowCount();i++){
			if(EquipTable.getValueAt(i, 0).equals(true)){
				rowIndexes[j] = i;
				j++;
			}
		}
		if(j==0){
			JOptionPane.showMessageDialog(null, "请选择后再点击归还!");
            return;
		}
        
        int r = JOptionPane.showConfirmDialog(null,
                "你确定要归还已选的"+j+"台设备吗？", "确认归还",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (r != JOptionPane.YES_OPTION) {
            return;
        }
        List<Equipment> equips = new EquipDAO().getEquip();
        for(Equipment equip:equips){
        	for(int i=0;i<j;i++){
        		if(equip.getID().equals(EquipTable.getValueAt(rowIndexes[i],1))){
        			if((equip.getRentState()).equals("已被租用")){
        				equip.setRentState("未被租用");
        				equip.setFactoryName("null");
        			}else if((equip.getRentState()).equals("工厂设备")){
        				JOptionPane.showMessageDialog(null, "工厂设备不能归还！","提示",JOptionPane.ERROR_MESSAGE);
        			}
        		}
        	}
        }
        new BaseDAO().write("src//information//Equipment.bin",equips);
        showEquip();
	}
}
