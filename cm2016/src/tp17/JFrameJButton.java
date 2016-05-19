package tp17;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.GridBagConstraints;

public class JFrameJButton extends JFrame implements ActionListener{

	private JPanel contentPane;
	private int nbLignes = 5;
	private int nbColonnes = 3;
	private MesJButton[][] tabJButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					JFrameJButton frame = new JFrameJButton();
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
	public JFrameJButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nbLignes = Integer.parseInt(JOptionPane.showInputDialog(
				"Combien de lignes voulez-vous?"
		));
		nbColonnes = Integer.parseInt(JOptionPane.showInputDialog(
				"Combien de colonnes voulez-vous?"
		));
		tabJButton = new MesJButton[nbLignes][nbColonnes];
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		for (int i = 0; i < nbLignes; i++) {
			for (int j= 0; j < nbColonnes; j++) {
				tabJButton[i][j] = new MesJButton(i,j);
				tabJButton[i][j].addActionListener(this);
				GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
				gbc_btnNewButton.gridx = j;
				gbc_btnNewButton.gridy = i;
				contentPane.add(tabJButton[i][j], gbc_btnNewButton);
			}
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		MesJButton mj = (MesJButton)arg0.getSource();
		System.out.println("on a cliqué en ("+mj.getLigne()+","+
				mj.getColonne()+")"
		);
		
	}

}
