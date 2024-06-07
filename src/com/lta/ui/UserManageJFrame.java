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
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.SwingUtilities;

import com.lta.bean.Product;
import com.lta.bean.User;
import com.lta.dao.BaseDAO;
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
public class UserManageJFrame extends javax.swing.JFrame {
	private JScrollPane jScrollPane1;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JTable UserTable;

	/**
	* Auto-generated main method to display this JFrame
	*/
	/*public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				UserManageJFrame inst = new UserManageJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	*/
	public UserManageJFrame() {
		super();
		initGUI();
	}
	String colName[] = {"","ID","登陆账号","姓名","联系方式","角色名称"};
	Object datas[][];
	private JButton backBtn;
	private JButton changeBtn;
	private JButton deleBtn;
	private JButton newBtn;
	private JButton resetBtn;
	private JButton nameBtn;
	private JTextField NameText;
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("\u7528\u6237\u7ba1\u7406\u7cfb\u7edf");
			{
				//加入真实的数据
				/*List<User> users = new UserDAO().getAdmin();
				Object[][]datas = new Object[users.size()][6];
				for(int i = 0;i<users.size();i++){
					User user = users.get(i);
					datas[i][0] = false;
					datas[i][1] = user.getID();
					datas[i][2] = user.getAccount();
					datas[i][3] = user.getRealName();
					datas[i][4] = user.getPhoneNumber();
					datas[i][5] = user.getType();*/

				//}
				jScrollPane1 = new JScrollPane();
				getContentPane().add(jScrollPane1);
				jScrollPane1.setBounds(0, 95, 686, 296);
				{
					/*TableEmbedCheckbox tec = 
						new TableEmbedCheckbox(
								datas,
								colName);*/
					/*UserTable = new JTable();
					jScrollPane1.setViewportView(UserTable);
					UserTable.setModel(UserTableModel);*/
					
					/*UserTable = new JTable(tec);
					jScrollPane1.setViewportView(UserTable);*/
					List<User> users = new UserDAO().getAdmin();
					show(users);

				}
			}
			{
				NameText = new JTextField();
				getContentPane().add(NameText);
				NameText.setBounds(22, 23, 143, 24);
			}
			{
				nameBtn = new JButton();
				getContentPane().add(nameBtn);
				nameBtn.setText("\u7528\u6237\u59d3\u540d\u67e5\u8be2");
				nameBtn.setBounds(177, 22, 117, 25);
				nameBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						nameBtnMouseClicked(evt);
					}
				});
			}
			{
				resetBtn = new JButton();
				getContentPane().add(resetBtn);
				resetBtn.setText("\u91cd\u7f6e");
				resetBtn.setBounds(299, 22, 92, 26);
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
				newBtn.setBounds(22, 59, 93, 27);
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
				deleBtn.setBounds(131, 60, 91, 25);
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
				changeBtn.setBounds(579, 59, 82, 27);
				changeBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						changeBtnMouseClicked(evt);
					}
				});
			}
			{
				backBtn = new JButton();
				getContentPane().add(backBtn);
				backBtn.setText("\u8fd4\u56de");
				backBtn.setBounds(579, 398, 80, 25);
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
				jLabel1.setBounds(-244, -1, 1136, 96);
				jLabel1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/0c8110057b9dfaf05240bb685e063ae.png")));
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("jLabel2");
				jLabel2.setBounds(-348, 391, 1131, 141);
				jLabel2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/a0d957b4a729a40b3d61d5946e0fdd5.png")));
			}
			pack();
			this.setSize(702, 473);
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
	
	private void nameBtnMouseClicked(MouseEvent evt) {
		List<User> users = new UserDAO().getAdmin();
		List<User> us = new ArrayList<User>();
		User u = null;
		int flag = 0;
		for(User user:users){
			if(user.getRealName().equals(NameText.getText())){
				u = user;
				flag = 1;
				
			}
		}
		if(flag == 1)
			us.add(u);
		else
			JOptionPane.showMessageDialog(null,"无搜索结果！请检查信息是否正确！");
		show(us);
	}
	
	private void resetBtnMouseClicked(MouseEvent evt) {
		show(new UserDAO().getAdmin());
	}
	
	private void newBtnMouseClicked(MouseEvent evt) {
		newchooseJFrame rj = new newchooseJFrame();
		rj.setVisible(true);
		rj.setLocationRelativeTo(null);
		dispose();
	}
	
	private void deleBtnMouseClicked(MouseEvent evt) {
		int[] rowIndexes = new int[50];
		int j = 0;
		for(int i = 0;i<UserTable.getRowCount();i++){
			if(UserTable.getValueAt(i, 0).equals(true)){
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
 
        List<User> users = new UserDAO().getAdmin();
        List<User> deleusers = new ArrayList<User>();
        for(User user:users){
        	for(int i = 0;i<j;i++){
        		if(user.getID().equals(UserTable.getValueAt(rowIndexes[i],1))){
        			deleusers.add(user);
        		}
        	}
        }
        users.removeAll(deleusers);
        new BaseDAO().write("src//information//Admin.bin",users);
        show(users);
    } 
 

	
	private void changeBtnMouseClicked(MouseEvent evt) {
		int[] rowIndexes = new int[50];
		int j = 0;
		for(int i = 0;i<UserTable.getRowCount();i++){
			if(UserTable.getValueAt(i, 0).equals(true)){
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
			 List<User> users = new UserDAO().getAdmin();
		     User target = new User();
		        for(User user:users){
		        	for(int i = 0;i<j;i++){
		        		if(user.getRealName().equals(UserTable.getValueAt(rowIndexes[i],3))){
		        			target = user;
		        		}
		        	}
		        }
			ChangeUserJFrame rj = new ChangeUserJFrame(target);
			rj.setVisible(true);
			rj.setLocationRelativeTo(null);
			dispose();
		}
	}
	
	public void show(List<User> users){
		Object[][]datas = new Object[users.size()][6];
		for(int i = 0;i<users.size();i++){
			User user = users.get(i);
			datas[i][0] = false;
			datas[i][1] = user.getID();
			datas[i][2] = user.getAccount();
			datas[i][3] = user.getRealName();
			datas[i][4] = user.getPhoneNumber();
			datas[i][5] = user.getType();
			TableEmbedCheckbox tec = 
				new TableEmbedCheckbox(
						datas,
						colName);
			UserTable = new JTable(tec);
			jScrollPane1.setViewportView(UserTable);
			
	}
	}
}
