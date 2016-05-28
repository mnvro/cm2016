package tp16_;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameListeIP extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JComboBox jComboBox;
	private InetAddress [] tabIP ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameListeIP frame = new JFrameListeIP();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws UnknownHostException 
	 */
	public JFrameListeIP() throws UnknownHostException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblIp = new JLabel("IP");
		GridBagConstraints gbc_lblIp = new GridBagConstraints();
		gbc_lblIp.insets = new Insets(0, 0, 5, 5);
		gbc_lblIp.anchor = GridBagConstraints.EAST;
		gbc_lblIp.gridx = 0;
		gbc_lblIp.gridy = 0;
		contentPane.add(lblIp, gbc_lblIp);
		
		//private InetAddress [] tabIP ;
		tabIP = InetAddress.getAllByName(InetAddress.getLocalHost().getHostName());
		String tabIpS[] = new String[tabIP.length];
		for (int i = 0; i < tabIpS.length; i++) {
			tabIpS[i] = tabIP[i].getHostAddress();
		}
		jComboBox = new JComboBox(tabIpS);
		
		GridBagConstraints gbc_jComboBox = new GridBagConstraints();
		gbc_jComboBox.insets = new Insets(0, 0, 5, 0);
		gbc_jComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_jComboBox.gridx = 1;
		gbc_jComboBox.gridy = 0;
		contentPane.add(jComboBox, gbc_jComboBox);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(this);
		GridBagConstraints gbc_btnOk = new GridBagConstraints();
		gbc_btnOk.gridx = 1;
		gbc_btnOk.gridy = 1;
		contentPane.add(btnOk, gbc_btnOk);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Vous avez choisi :"+tabIP[jComboBox.getSelectedIndex()]);
		
	}

}
