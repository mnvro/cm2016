package tp12;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.GridBagConstraints;

public class MaJFrameGridBagLayout extends JFrame implements ActionListener  {

	private JPanel contentPane;
	private int nbLignes = 4;
	private int nbColonnes = 5;
	JButton tabJButton[][] = new JButton[nbLignes][nbColonnes];

	public static void main(String[] args) {
		MaJFrameGridBagLayout frame = new MaJFrameGridBagLayout();
		frame.setVisible(true);
	}

	public MaJFrameGridBagLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		contentPane.setLayout(gbl_contentPane);
		GridBagConstraints gbc = new GridBagConstraints();
		for (int i = 0 ; i < nbColonnes ; i++){
			for (int j = 0 ; j < nbLignes ; j++){
				tabJButton[j][i] = new JButton("Bouton "+((j+1)+i*nbLignes));
				tabJButton[j][i].addActionListener(this);
				gbc.gridx = j;
				gbc.gridy = i;
				contentPane.add(tabJButton[j][i], gbc);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()){
		case "Bouton 1" : System.out.println("on a cliqué sur le bouton 1");break;
		case "Bouton 2" : System.out.println("on a cliqué sur le bouton 2");break;
		case "Bouton 5" : System.out.println("on a cliqué sur :"+e.getActionCommand());
		break;
		case "Quitter" : this.dispose(); break;
		default :  System.out.println("on a cliqué ailleurs");
		}


	}
}
