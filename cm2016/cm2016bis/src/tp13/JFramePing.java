package tp13;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;

public class JFramePing extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField jTextFieldIP;
	private JLabel jLabelIP;
	private JLabel jLabelResultat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFramePing frame = new JFramePing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFramePing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		jLabelIP = new JLabel("Adresse IP :");
		GridBagConstraints gbc_jLabelIP = new GridBagConstraints();
		gbc_jLabelIP.anchor = GridBagConstraints.EAST;
		gbc_jLabelIP.insets = new Insets(0, 0, 5, 5);
		gbc_jLabelIP.gridx = 0;
		gbc_jLabelIP.gridy = 0;
		contentPane.add(jLabelIP, gbc_jLabelIP);
		
		jTextFieldIP = new JTextField();
		jTextFieldIP.setText("192.168.0.1");
		GridBagConstraints gbc_jTextFieldIP = new GridBagConstraints();
		gbc_jTextFieldIP.insets = new Insets(0, 0, 5, 0);
		gbc_jTextFieldIP.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldIP.gridx = 1;
		gbc_jTextFieldIP.gridy = 0;
		contentPane.add(jTextFieldIP, gbc_jTextFieldIP);
		jTextFieldIP.setColumns(10);
		
		jLabelResultat = new JLabel("R\u00E9sultat : recherche en cours");
		GridBagConstraints gbc_jLabelResultat = new GridBagConstraints();
		gbc_jLabelResultat.insets = new Insets(0, 0, 5, 5);
		gbc_jLabelResultat.gridx = 0;
		gbc_jLabelResultat.gridy = 1;
		contentPane.add(jLabelResultat, gbc_jLabelResultat);
		
		JButton jButtonPing = new JButton("Ping");
		jButtonPing.addActionListener(this);
		GridBagConstraints gbc_jButtonPing = new GridBagConstraints();
		gbc_jButtonPing.gridx = 1;
		gbc_jButtonPing.gridy = 2;
		contentPane.add(jButtonPing, gbc_jButtonPing);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("toto toto");
		try {
			InetAddress ia = InetAddress.getByName(jTextFieldIP.getText());
			if (ia.isReachable(10000)){
				jLabelResultat.setText("Résultat : succès");
			}else{
				jLabelResultat.setText("Résultat : échec");
			}
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
