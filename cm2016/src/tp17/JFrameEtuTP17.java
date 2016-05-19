package tp17;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JTextArea;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameEtuTP17 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField jTextFieldCote;
	private JTextArea jTextAreaResultat;
	private Etu et;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameEtuTP17 frame = new JFrameEtuTP17();
					frame.et = new Etu();
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
	public JFrameEtuTP17() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNouvelleCote = new JLabel("Nouvelle cote :");
		GridBagConstraints gbc_lblNouvelleCote = new GridBagConstraints();
		gbc_lblNouvelleCote.anchor = GridBagConstraints.EAST;
		gbc_lblNouvelleCote.insets = new Insets(0, 0, 5, 5);
		gbc_lblNouvelleCote.gridx = 0;
		gbc_lblNouvelleCote.gridy = 0;
		contentPane.add(lblNouvelleCote, gbc_lblNouvelleCote);
		
		jTextFieldCote = new JTextField();
		GridBagConstraints gbc_jTextFieldCote = new GridBagConstraints();
		gbc_jTextFieldCote.insets = new Insets(0, 0, 5, 5);
		gbc_jTextFieldCote.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldCote.gridx = 1;
		gbc_jTextFieldCote.gridy = 0;
		contentPane.add(jTextFieldCote, gbc_jTextFieldCote);
		jTextFieldCote.setColumns(10);
		
		JButton jButtonAjouter = new JButton("ajouter");
		jButtonAjouter.addActionListener(this);
		GridBagConstraints gbc_jButtonAjouter = new GridBagConstraints();
		gbc_jButtonAjouter.insets = new Insets(0, 0, 5, 0);
		gbc_jButtonAjouter.gridx = 2;
		gbc_jButtonAjouter.gridy = 0;
		contentPane.add(jButtonAjouter, gbc_jButtonAjouter);
		
		jTextAreaResultat = new JTextArea();
		GridBagConstraints gbc_jTextAreaResultat = new GridBagConstraints();
		gbc_jTextAreaResultat.insets = new Insets(0, 0, 0, 5);
		gbc_jTextAreaResultat.fill = GridBagConstraints.BOTH;
		gbc_jTextAreaResultat.gridx = 1;
		gbc_jTextAreaResultat.gridy = 1;
		contentPane.add(jTextAreaResultat, gbc_jTextAreaResultat);
		
		JButton jButtonRafraichir = new JButton("Rafra\u00EEchir");
		jButtonRafraichir.addActionListener(this);
		GridBagConstraints gbc_jButtonRafraichir = new GridBagConstraints();
		gbc_jButtonRafraichir.gridx = 2;
		gbc_jButtonRafraichir.gridy = 1;
		contentPane.add(jButtonRafraichir, gbc_jButtonRafraichir);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()){
		case "ajouter" :
			et.ajouteCote(Double.parseDouble(
					jTextFieldCote.getText())
			);
			jTextAreaResultat.setText(et.toString());
			break;
		case "Rafra\u00EEchir" :
			jTextAreaResultat.setText(et.toString());
			break;
		}
		
	}

}
