package com.lta.ui;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


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
public class MenuJFrame extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JButton UserManagebtn;
	private JButton CloudInformationbtn;
	private JButton ProductCategoryManagebtn;
	private JButton EquiManagebtn;
	private JRadioButton byeBtn;
	private JLabel jLabel1;
	private JButton EquiCateManagebtn;
	private JButton ProInfoManagebtn;

	/**
	* Auto-generated main method to display this JFrame
	*/
	/*public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MenuJFrame inst = new MenuJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}*/
	
	public MenuJFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("\u83dc\u5355");
			{
				UserManagebtn = new JButton();
				getContentPane().add(UserManagebtn);
				UserManagebtn.setText("\u7528\u6237\u7ba1\u7406");
				UserManagebtn.setBounds(100, 125, 167, 25);
				UserManagebtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						UserManagebtnMouseClicked(evt);
					}
				});
			}
			{
				CloudInformationbtn = new JButton();
				getContentPane().add(CloudInformationbtn);
				CloudInformationbtn.setText("\u4e91\u5de5\u5382\u4fe1\u606f");
				CloudInformationbtn.setBounds(100, 164, 167, 25);
				CloudInformationbtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						CloudInformationbtnMouseClicked(evt);
					}
				});
			}
			{
				ProductCategoryManagebtn = new JButton();
				getContentPane().add(ProductCategoryManagebtn);
				ProductCategoryManagebtn.setText("\u4ea7\u54c1\u7c7b\u522b\u7ba1\u7406");
				ProductCategoryManagebtn.setBounds(100, 203, 167, 25);
				ProductCategoryManagebtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						ProductCategoryManagebtnMouseClicked(evt);
					}
				});
			}
			{
				ProInfoManagebtn = new JButton();
				getContentPane().add(ProInfoManagebtn);
				ProInfoManagebtn.setText("\u4ea7\u54c1\u4fe1\u606f\u7ba1\u7406");
				ProInfoManagebtn.setBounds(100, 241, 167, 25);
				ProInfoManagebtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						ProInfoManagebtnMouseClicked(evt);
					}
				});
			}
			{
				EquiCateManagebtn = new JButton();
				getContentPane().add(EquiCateManagebtn);
				EquiCateManagebtn.setText("\u8bbe\u5907\u7c7b\u578b\u7ba1\u7406");
				EquiCateManagebtn.setBounds(100, 280, 167, 25);
				EquiCateManagebtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						EquiCateManagebtnMouseClicked(evt);
					}
				});
			}
			{
				EquiManagebtn = new JButton();
				getContentPane().add(EquiManagebtn);
				EquiManagebtn.setText("\u8bbe\u5907\u7ba1\u7406");
				EquiManagebtn.setBounds(100, 316, 167, 25);
				EquiManagebtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						EquiManagebtnMouseClicked(evt);
					}
				});
			}
			{
				byeBtn = new JRadioButton();
				getContentPane().add(byeBtn);
				byeBtn.setText("\u6ce8\u9500");
				byeBtn.setBounds(290, 19, 51, 26);
				byeBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						byeBtnMouseClicked(evt);
					}
				});
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("jLabel1");
				jLabel1.setBounds(-556, -25, 1353, 1407);
				jLabel1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/e8fdab4e7b59e905be1bd29c7ffcb92.jpg")));
				jLabel1.setToolTipText("\u83dc\u5355");
			}
			pack();
			this.setSize(382, 421);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void UserManagebtnMouseClicked(MouseEvent evt) {
		dispose();
		UserManageJFrame umj = new UserManageJFrame();
		umj.setVisible(true);
		umj.setLocationRelativeTo(null);
	}
	
	private void CloudInformationbtnMouseClicked(MouseEvent evt) {
		dispose();
		FacInfoJFrame fij = new FacInfoJFrame();
		fij.setVisible(true);
		fij.setLocationRelativeTo(null);
	}
	
	private void ProductCategoryManagebtnMouseClicked(MouseEvent evt) {
		dispose();
		ProTypeManageJFrame ptmj = new ProTypeManageJFrame();
		ptmj.setVisible(true);
		ptmj.setLocationRelativeTo(null);
	}
	
	private void ProInfoManagebtnMouseClicked(MouseEvent evt) {
		dispose();
		ProInfoManageJFrame pimj = new ProInfoManageJFrame();
		pimj.setVisible(true);
		pimj.setLocationRelativeTo(null);
	}
	
	private void EquiCateManagebtnMouseClicked(MouseEvent evt) {
		dispose();
		EquipTypeManageJFrame etmj = new EquipTypeManageJFrame();
		etmj.setVisible(true);
		etmj.setLocationRelativeTo(null);
	}
	
	private void EquiManagebtnMouseClicked(MouseEvent evt) {
		dispose();
		EquipManageJFrame emj = new EquipManageJFrame();
		emj.setVisible(true);
		emj.setLocationRelativeTo(null);
	}
	
	private void byeBtnMouseClicked(MouseEvent evt) {
		dispose();
		LoginJFrame pimj = new LoginJFrame();
		pimj.setVisible(true);
		pimj.setLocationRelativeTo(null);
	}

}
