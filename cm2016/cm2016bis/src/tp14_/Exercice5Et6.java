package tp14_;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;

public class Exercice5Et6 extends JFrame implements ActionListener,
	FocusListener{

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
					Exercice5Et6 frame = new Exercice5Et6();
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
	public Exercice5Et6() {
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
		
		jTextField1 = new JTextField();
		jTextField1.addFocusListener(this);
		GridBagConstraints gbc_jTextField1 = new GridBagConstraints();
		gbc_jTextField1.insets = new Insets(0, 0, 5, 0);
		gbc_jTextField1.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextField1.gridx = 1;
		gbc_jTextField1.gridy = 0;
		contentPane.add(jTextField1, gbc_jTextField1);
		jTextField1.setColumns(10);
		
		JButton jButtonCopier = new JButton("COPIER");
		jButtonCopier.addActionListener(this);
		GridBagConstraints gbc_jButtonCopier = new GridBagConstraints();
		gbc_jButtonCopier.insets = new Insets(0, 0, 5, 0);
		gbc_jButtonCopier.gridx = 1;
		gbc_jButtonCopier.gridy = 1;
		contentPane.add(jButtonCopier, gbc_jButtonCopier);
		
		jTextField2 = new JTextField();
		jTextField2.setEditable(false);
		GridBagConstraints gbc_jTextField2 = new GridBagConstraints();
		gbc_jTextField2.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextField2.gridx = 1;
		gbc_jTextField2.gridy = 2;
		contentPane.add(jTextField2, gbc_jTextField2);
		jTextField2.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		jTextField2.setText(jTextField1.getText());
		
	}

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent arg0) {
		jTextField2.setText(jTextField1.getText());
		
	}

}
