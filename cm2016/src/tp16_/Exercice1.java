package tp16_;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JCheckBox;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercice1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton jButtonOK;
	private JCheckBox case1;
	private JCheckBox case2;
	private JCheckBox case3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercice1 frame = new Exercice1();
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
	public Exercice1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		case1 = new JCheckBox("case1");
		case1.addActionListener(this);
		GridBagConstraints gbc_case1 = new GridBagConstraints();
		gbc_case1.insets = new Insets(0, 0, 0, 5);
		gbc_case1.gridx = 0;
		gbc_case1.gridy = 1;
		contentPane.add(case1, gbc_case1);
		
		case2 = new JCheckBox("case 2");
		case2.addActionListener(this);
		GridBagConstraints gbc_case2 = new GridBagConstraints();
		gbc_case2.insets = new Insets(0, 0, 0, 5);
		gbc_case2.gridx = 1;
		gbc_case2.gridy = 1;
		contentPane.add(case2, gbc_case2);
		
		case3 = new JCheckBox("case 3");
		case3.addActionListener(this);
		GridBagConstraints gbc_case3 = new GridBagConstraints();
		gbc_case3.insets = new Insets(0, 0, 0, 5);
		gbc_case3.gridx = 2;
		gbc_case3.gridy = 1;
		contentPane.add(case3, gbc_case3);
		
		jButtonOK = new JButton("OK");
		jButtonOK.addActionListener(this);
		
		GridBagConstraints gbc_jButtonOK = new GridBagConstraints();
		gbc_jButtonOK.gridx = 3;
		gbc_jButtonOK.gridy = 1;
		contentPane.add(jButtonOK, gbc_jButtonOK);
		//System.out.println(jButtonOK);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == jButtonOK){
			System.out.println("Voici l'état des cases:");
			System.out.println("case 1 : "+case1.isSelected());
			System.out.println("case 2 : "+case2.isSelected());
			System.out.println("case 3 : "+case3.isSelected());
		}
		if (source == case1){
			System.out.println("on a cliqué sur case 1");
		}
	}

}
