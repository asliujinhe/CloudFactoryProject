package com.lta.ui;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
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
public class ChooseJFrame extends javax.swing.JFrame {
	private JRadioButton leadBtn;
	private JRadioButton faBtn;
	private JLabel jLabel1;
	private JButton backBtn;
	private ButtonGroup choGroup;
	private JLabel chosText;

	/**
	* Auto-generated main method to display this JFrame
	*/
	/*public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ChooseJFrame inst = new ChooseJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}*/
	
	public ChooseJFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				leadBtn = new JRadioButton();
				getContentPane().add(leadBtn);
				leadBtn.setText("\u7ecf\u9500\u5546");
				leadBtn.setBounds(76, 133, 70, 24);
				leadBtn.setFont(new java.awt.Font("ºÚÌå",0,14));
				leadBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						leadBtnMouseClicked(evt);
					}
				});
			}
			{
				chosText = new JLabel();
				getContentPane().add(chosText);
				chosText.setText("\u8bf7\u9009\u62e9\u8981\u6ce8\u518c\u7684\u7528\u6237\u7c7b\u578b\uff01");
				chosText.setBounds(56, 87, 249, 18);
				chosText.setFont(new java.awt.Font("ºÚÌå",1,18));
				chosText.setForeground(new java.awt.Color(255,255,255));
			}
			{
				faBtn = new JRadioButton();
				getContentPane().add(faBtn);
				getContentPane().add(getBackBtn());
				getContentPane().add(getJLabel1());
				faBtn.setText("\u4e91\u5de5\u5382");
				faBtn.setBounds(187, 133, 70, 24);
				faBtn.setFont(new java.awt.Font("ºÚÌå",0,14));
				faBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						faBtnMouseClicked(evt);
					}
				});
			}
			pack();
			getChoGroup().add(leadBtn);
			getChoGroup().add(faBtn);
			this.setSize(346, 367);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private ButtonGroup getChoGroup() {
		if(choGroup == null) {
			choGroup = new ButtonGroup();
		}
		return choGroup;
	}
	
	private void leadBtnMouseClicked(MouseEvent evt) {
		LregisterJFrame lej = new LregisterJFrame(0);
		lej.setVisible(true);
		lej.setLocationRelativeTo(null);
		dispose();
	}
	
	private void faBtnMouseClicked(MouseEvent evt) {
		RegisterJFrame rj = new RegisterJFrame(0);
		rj.setVisible(true);
		rj.setLocationRelativeTo(null);
		dispose();
	}
	
	private JButton getBackBtn() {
		if(backBtn == null) {
			backBtn = new JButton();
			backBtn.setText("\u8fd4\u56de");
			backBtn.setBounds(190, 216, 63, 24);
			backBtn.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent evt) {
					backBtnMouseClicked(evt);
				}
			});
		}
		return backBtn;
	}
	
	private void backBtnMouseClicked(MouseEvent evt) {
		LoginJFrame lj = new LoginJFrame();
		lj.setVisible(true);
		lj.setLocationRelativeTo(null);
		dispose();
	}
	
	private JLabel getJLabel1() {
		if(jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("jLabel1");
			jLabel1.setBounds(0, -7, 949, 1334);
			jLabel1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/e8fdab4e7b59e905be1bd29c7ffcb92.jpg")));
		}
		return jLabel1;
	}

}
