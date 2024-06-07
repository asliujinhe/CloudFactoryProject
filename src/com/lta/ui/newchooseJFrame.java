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
public class newchooseJFrame extends javax.swing.JFrame {
	private JLabel text;
	private JLabel jLabel1;
	private JButton back;
	private ButtonGroup buttonGroup1;
	private JRadioButton facBtn;
	private JRadioButton leaderBtn;

	/**
	* Auto-generated main method to display this JFrame
	*/
	/*public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				newchooseJFrame inst = new newchooseJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}*/
	
	public newchooseJFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("\u6dfb\u52a0\u7528\u6237");
			{
				text = new JLabel();
				getContentPane().add(text);
				text.setText("\u8bf7\u9009\u62e9\u6dfb\u52a0\u7528\u6237\u7c7b\u578b\uff01");
				text.setBounds(74, 61, 211, 23);
				text.setFont(new java.awt.Font("ºÚÌå",1,18));
				text.setForeground(new java.awt.Color(255,255,255));
			}
			{
				leaderBtn = new JRadioButton();
				getContentPane().add(leaderBtn);
				leaderBtn.setText("\u7ecf\u9500\u5546");
				leaderBtn.setBounds(57, 114, 70, 22);
				leaderBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						leaderBtnMouseClicked(evt);
					}
				});
			}
			{
				facBtn = new JRadioButton();
				getContentPane().add(facBtn);
				getContentPane().add(getBack());
				getContentPane().add(getJLabel1());
				facBtn.setText("\u4e91\u5de5\u5382\u7ba1\u7406\u5458");
				facBtn.setBounds(178, 114, 109, 22);
				facBtn.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						facBtnMouseClicked(evt);
					}
				});
			}
			getButtonGroup1().add(leaderBtn);
			getButtonGroup1().add(facBtn);
			pack();
			this.setSize(356, 363);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private ButtonGroup getButtonGroup1() {
		if(buttonGroup1 == null) {
			buttonGroup1 = new ButtonGroup();
		}
		return buttonGroup1;
	}
	
	private void leaderBtnMouseClicked(MouseEvent evt) {
		LregisterJFrame lej = new LregisterJFrame(1);
		lej.setVisible(true);
		lej.setLocationRelativeTo(null);
		dispose();
	}
	
	private void facBtnMouseClicked(MouseEvent evt) {
		RegisterJFrame rj = new RegisterJFrame(1);
		rj.setVisible(true);
		rj.setLocationRelativeTo(null);
		dispose();
	}
	
	private JButton getBack() {
		if(back == null) {
			back = new JButton();
			back.setText("\u8fd4\u56de");
			back.setBounds(204, 242, 61, 25);
			back.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent evt) {
					backMouseClicked(evt);
				}
			});
		}
		return back;
	}
	
	private void backMouseClicked(MouseEvent evt) {
		UserManageJFrame rj = new UserManageJFrame();
		rj.setVisible(true);
		rj.setLocationRelativeTo(null);
		dispose();
	}
	
	private JLabel getJLabel1() {
		if(jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("jLabel1");
			jLabel1.setBounds(0, -9, 922, 1278);
			jLabel1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/lta/images/e8fdab4e7b59e905be1bd29c7ffcb92.jpg")));
		}
		return jLabel1;
	}

}
