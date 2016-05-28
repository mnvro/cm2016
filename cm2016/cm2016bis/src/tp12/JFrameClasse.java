package tp12;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;

public class JFrameClasse extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField jTextFieldIP;
	private JLabel jLabelResultat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameClasse frame = new JFrameClasse();
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
	public JFrameClasse() throws UnknownHostException {
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
		
		JLabel jLabelIP = new JLabel("IP :");
		GridBagConstraints gbc_jLabelIP = new GridBagConstraints();
		gbc_jLabelIP.anchor = GridBagConstraints.EAST;
		gbc_jLabelIP.insets = new Insets(0, 0, 5, 5);
		gbc_jLabelIP.gridx = 0;
		gbc_jLabelIP.gridy = 0;
		contentPane.add(jLabelIP, gbc_jLabelIP);
		
		jTextFieldIP = new JTextField();
		InetAddress[] tabIa = InetAddress.getAllByName("EP890");
		jTextFieldIP.setText(tabIa[2].getHostAddress());
		GridBagConstraints gbc_jTextFieldIP = new GridBagConstraints();
		gbc_jTextFieldIP.insets = new Insets(0, 0, 5, 0);
		gbc_jTextFieldIP.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldIP.gridx = 1;
		gbc_jTextFieldIP.gridy = 0;
		contentPane.add(jTextFieldIP, gbc_jTextFieldIP);
		jTextFieldIP.setColumns(10);
		
		JLabel jLabelClasse = new JLabel("Classe :");
		GridBagConstraints gbc_jLabelClasse = new GridBagConstraints();
		gbc_jLabelClasse.insets = new Insets(0, 0, 5, 5);
		gbc_jLabelClasse.gridx = 0;
		gbc_jLabelClasse.gridy = 1;
		contentPane.add(jLabelClasse, gbc_jLabelClasse);
		
		jLabelResultat = new JLabel("New label");
		GridBagConstraints gbc_jLabelResultat = new GridBagConstraints();
		gbc_jLabelResultat.insets = new Insets(0, 0, 5, 0);
		gbc_jLabelResultat.gridx = 1;
		gbc_jLabelResultat.gridy = 1;
		contentPane.add(jLabelResultat, gbc_jLabelResultat);
		
		JButton jButtonCancel = new JButton("Cancel");
		jButtonCancel.addActionListener(this);
		GridBagConstraints gbc_jButtonCancel = new GridBagConstraints();
		gbc_jButtonCancel.insets = new Insets(0, 0, 0, 5);
		gbc_jButtonCancel.gridx = 0;
		gbc_jButtonCancel.gridy = 2;
		contentPane.add(jButtonCancel, gbc_jButtonCancel);
		
		JButton jButtonOK = new JButton("OK");
		jButtonOK.addActionListener(this);
		GridBagConstraints gbc_jButtonOK = new GridBagConstraints();
		gbc_jButtonOK.gridx = 1;
		gbc_jButtonOK.gridy = 2;
		contentPane.add(jButtonOK, gbc_jButtonOK);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()){
		case "Cancel" :
			jTextFieldIP.setText("");
			jLabelResultat.setText("");
			break;
		case "OK" : 
			IP ip = new IP(jTextFieldIP.getText());
			jLabelResultat.setText(ip.getClasse()+"");
			break;
		}
		
	}

}
