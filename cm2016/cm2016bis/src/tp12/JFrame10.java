package tp12;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrame10 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField jTextField2;
	private JTextField jTextField1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame10 frame = new JFrame10();
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
	public JFrame10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel jPanelHaut = new JPanel();
		contentPane.add(jPanelHaut, BorderLayout.NORTH);
		
		JPanel jPanelBas = new JPanel();
		contentPane.add(jPanelBas, BorderLayout.SOUTH);
		jPanelBas.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton jButtonOK = new JButton("OK");
		jButtonOK.addActionListener(this);
		jPanelBas.add(jButtonOK);
		
		JButton jButtonCancel = new JButton("Cancel");
		jButtonCancel.addActionListener(this);
		jPanelBas.add(jButtonCancel);
		
		JPanel jPanelCentre = new JPanel();
		contentPane.add(jPanelCentre, BorderLayout.CENTER);
		GridBagLayout gbl_jPanelCentre = new GridBagLayout();
		gbl_jPanelCentre.columnWidths = new int[]{0, 0, 0};
		gbl_jPanelCentre.rowHeights = new int[]{0, 0, 0};
		gbl_jPanelCentre.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_jPanelCentre.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		jPanelCentre.setLayout(gbl_jPanelCentre);
		
		JLabel jLabelNiko = new JLabel("Niko");
		GridBagConstraints gbc_jLabelNiko = new GridBagConstraints();
		gbc_jLabelNiko.insets = new Insets(0, 0, 5, 5);
		gbc_jLabelNiko.anchor = GridBagConstraints.EAST;
		gbc_jLabelNiko.gridx = 0;
		gbc_jLabelNiko.gridy = 0;
		jPanelCentre.add(jLabelNiko, gbc_jLabelNiko);
		
		jTextField1 = new JTextField();
		GridBagConstraints gbc_jTextField1 = new GridBagConstraints();
		gbc_jTextField1.insets = new Insets(0, 0, 5, 0);
		gbc_jTextField1.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextField1.gridx = 1;
		gbc_jTextField1.gridy = 0;
		jPanelCentre.add(jTextField1, gbc_jTextField1);
		jTextField1.setColumns(10);
		
		JLabel jLabelSalma = new JLabel("Salma");
		GridBagConstraints gbc_jLabelSalma = new GridBagConstraints();
		gbc_jLabelSalma.insets = new Insets(0, 0, 0, 5);
		gbc_jLabelSalma.anchor = GridBagConstraints.EAST;
		gbc_jLabelSalma.gridx = 0;
		gbc_jLabelSalma.gridy = 1;
		jPanelCentre.add(jLabelSalma, gbc_jLabelSalma);
		
		jTextField2 = new JTextField();
		GridBagConstraints gbc_jTextField2 = new GridBagConstraints();
		gbc_jTextField2.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextField2.gridx = 1;
		gbc_jTextField2.gridy = 1;
		jPanelCentre.add(jTextField2, gbc_jTextField2);
		jTextField2.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()){
		case "Cancel" : 
			jTextField1.setText("");
			jTextField2.setText("");
			break;
		case "OK" :
			String s = jTextField1.getText();
			jTextField1.setText(jTextField2.getText());
			jTextField2.setText(s);
			//System.out.println("on a cliqué sur OK");
			break;
		}
		
	}

}
