package modelview;

import javax.swing.JOptionPane;

/*
 * qw.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
public class jq7 extends javax.swing.JFrame {
	Map3View m = new Map3View();

	/** Creates new form qw */
	public jq7() {
		initComponents();
		jButton1.setOpaque(false);
		jButton2.setOpaque(false);
		jButton3.setOpaque(false);
		this.setLocationRelativeTo(null);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
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
				"/imgg/×按钮.png"))); // NOI18N
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton1);
		jButton1.setBounds(0, 0, 50, 40);

		jButton2.setBackground(new java.awt.Color(255, 255, 255));
		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imgg/剧情8按钮1.png"))); // NOI18N
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton2);
		jButton2.setBounds(40, 200, 30, 120);

		jButton3.setBackground(new java.awt.Color(255, 255, 255));
		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imgg/剧情8按钮2.png"))); // NOI18N
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton3);
		jButton3.setBounds(40, 340, 30, 120);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imgg/剧情8.png"))); // NOI18N
		jPanel1.add(jLabel1);
		jLabel1.setBounds(0, 0, 375, 530);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 375,
				Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 531,
				Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(null, "你找理由推脱了妃嫔娘娘，无事发生", "剧情",
				JOptionPane.CANCEL_OPTION);
		this.setVisible(false);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		m.m1 = m.m1 + 300;
		JOptionPane.showMessageDialog(null, "妃嫔娘娘很感谢你，获得300文钱", "剧情",
				JOptionPane.CANCEL_OPTION);
		this.setVisible(false);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new jq7().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	// End of variables declaration//GEN-END:variables

}