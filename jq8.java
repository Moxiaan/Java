package modelview;

import javax.swing.JOptionPane;

/*
 * zxcvb.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 * 
 * @author __USER__
 */
public class jq8 extends javax.swing.JFrame {
	Map3View m = new Map3View();

	/** Creates new form zxcvb */
	public jq8() {
		initComponents();
		jButton1.setOpaque(false);
		jButton2.setOpaque(false);
		jButton3.setOpaque(false);
		this.setLocationRelativeTo(null);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jPanel1.setLayout(null);

		jButton1.setBackground(new java.awt.Color(255, 255, 255));
		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/×按钮.png"))); // NOI18N
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton1);
		jButton1.setBounds(0, 0, 40, 40);

		jButton2.setBackground(new java.awt.Color(255, 255, 255));
		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/剧情6按钮2.png"))); // NOI18N
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton2);
		jButton2.setBounds(50, 310, 30, 100);

		jButton3.setBackground(new java.awt.Color(255, 255, 255));
		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/剧情6按钮1.png"))); // NOI18N
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton3);
		jButton3.setBounds(50, 180, 30, 110);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/剧情6.png"))); // NOI18N
		jPanel1.add(jLabel1);
		jLabel1.setBounds(0, 0, 370, 530);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 531,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>

	// GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		m.m1 = m.m1 + 300;
		JOptionPane.showMessageDialog(null,
				"在宴会上跳了一支妙手观音舞，皇上也因此沉浸在你曼妙的舞姿里，如痴如醉,奖励300文钱", "剧情",
				JOptionPane.CANCEL_OPTION);
		this.setVisible(false);
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		m.m1 = m.m1 - 200;
		JOptionPane.showMessageDialog(null, "得到僖贵人的嘲讽，皇上不高兴，罚200文钱", "剧情",
				JOptionPane.CANCEL_OPTION);
		this.setVisible(false);
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new jq8().setVisible(true);
			}
		});
	}

	// GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	// End of variables declaration//GEN-END:variables

}