package tp16;


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
	private JCheckBox case1, case2, case3;
	private JButton jButtonEtat;

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
		gbl_contentPane.rowHeights = new int[]{0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		case1 = new JCheckBox("case 1");
		case1.addActionListener(this);
		GridBagConstraints gbc_case1 = new GridBagConstraints();
		gbc_case1.insets = new Insets(0, 0, 0, 5);
		gbc_case1.gridx = 0;
		gbc_case1.gridy = 0;
		contentPane.add(case1, gbc_case1);
		
		case2 = new JCheckBox("case 2");
		case2.addActionListener(this);
		GridBagConstraints gbc_case2 = new GridBagConstraints();
		gbc_case2.insets = new Insets(0, 0, 0, 5);
		gbc_case2.gridx = 1;
		gbc_case2.gridy = 0;
		contentPane.add(case2, gbc_case2);
		
		case3 = new JCheckBox("case 3");
		case3.addActionListener(this);
		GridBagConstraints gbc_case3 = new GridBagConstraints();
		gbc_case3.insets = new Insets(0, 0, 0, 5);
		gbc_case3.gridx = 2;
		gbc_case3.gridy = 0;
		contentPane.add(case3, gbc_case3);
		
		jButtonEtat = new JButton("Etat");
		jButtonEtat.addActionListener(this);
		GridBagConstraints gbc_jButtonEtat = new GridBagConstraints();
		gbc_jButtonEtat.gridx = 3;
		gbc_jButtonEtat.gridy = 0;
		contentPane.add(jButtonEtat, gbc_jButtonEtat);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == case1) System.out.println("action sur la case 1");
		if (source == case2) System.out.println("action sur la case 2");
		if (source == case3) System.out.println("action sur la case 3");
		if (source == jButtonEtat) {
			System.out.println("Voici l'�tat:");
			System.out.println("Case 1 : "+case1.isSelected());
			System.out.println("Case 2 : "+case2.isSelected());
			System.out.println("Case 3 : "+case3.isSelected());
		}
		
	}

}
