package com.lta.ui;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import com.lta.bean.Equipment;
import com.lta.bean.User;
import com.lta.dao.EquipDAO;
import com.lta.dao.UserDAO;
import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
public class newMyEquipJFrame extends javax.swing.JFrame {

	private User user;
	private JLabel nameBtn;
	private JTextField nameText;
	private JLabel des;
	private JLabel jLabel2;
	private JButton yesBtn;
	private JButton backBtn;
	private JTextField desText;
	private JTextField sizeText;
	private JLabel jLabel1;
	private JTextField typeText;
	private JLabel size;
	/**
	* Auto-generated main method to display this JFrame
	*/
	/*public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				newMyEquipJFrame inst = new newMyEquipJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
*/	
	public newMyEquipJFrame() {
		super();
		initGUI();
	}
	
	public newMyEquipJFrame(User user) {
		this.user = user;
		initGUI();
	}
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("\u65b0\u5efa\u8bbe\u5907");
			{
				nameBtn = new JLabel();
				getContentPane().add(nameBtn);
				nameBtn.setText("\u8bbe\u5907\u540d\u79f0");
				nameBtn.setBounds(40, 55, 52, 18);
			}
			{
				nameText = new JTextField();
				getContentPane().add(nameText);
				nameText.setBounds(110, 53, 150, 20);
			}
			{
				size = new JLabel();
				getContentPane().add(size);
				size.setText("\u8bbe\u5907\u7c7b\u522b");
				size.setBounds(40, 97, 52, 18);
			}
			{
				typeText = new JTextField();
				getContentPane().add(typeText);
				typeText.setBounds(110, 96, 150, 20);
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("\u8bbe\u5907\u89c4\u683c");
				jLabel1.setBounds(40, 138, 52, 18);
			}
			{
				sizeText = new JTextField();
				getContentPane().add(sizeText);
				sizeText.setBounds(110, 137, 150, 20);
			}
			{
				des = new JLabel();
				getContentPane().add(des);
				des.setText("\u8bbe\u5907\u63cf\u8ff0");
				des.setBounds(40, 177, 52, 18);
			}
			{
				desText = new JTextField();
				getContentPane().add(desText);
				desText.setBounds(110, 177, 150, 20);
			}
			{
				backBtn = new JButton();
				getContentPane().add(backBtn);
				backBtn.setText("\u8fd4\u56de");
				backBtn.setBounds(35, 272, 57, 25);
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
				yesBtn.setBounds(201, 272, 66, 25);
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
				jLabel2.setBounds(0, -3, 918, 1355);
				jLabel2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/e8fdab4e7b59e905be1bd29c7ffcb92.jpg")));
			}
			pack();
			this.setSize(330, 400);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	


	
	private void yesBtnMouseClicked(MouseEvent evt) {
		int size = new EquipDAO().getEquip().size();
		int newID = Integer.parseInt(new EquipDAO().getEquip().get(size-1).getID())+1;
		Equipment equip = new Equipment(newID+"",nameText.getText(),typeText.getText(),sizeText.getText(),
				"关机",desText.getText(),"工厂设备",new UserDAO().getFactory(this.user).getName());
		new EquipDAO().addEquip(equip);
		JOptionPane.showMessageDialog(null,"工厂设备创建成功！");
		MyEquipsJFrame emj = new MyEquipsJFrame(user);
		emj.setVisible(true);
		emj.setLocationRelativeTo(null);
		dispose();
	}
	
	private void backBtnMouseClicked(MouseEvent evt) {
		int r = JOptionPane.showConfirmDialog(null,
                "确认退出新建吗？", "确认",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (r != JOptionPane.YES_OPTION) {
            return;
        }
		MyEquipsJFrame emj = new MyEquipsJFrame(user);
		emj.setVisible(true);
		emj.setLocationRelativeTo(null);
		dispose();
	}

}
