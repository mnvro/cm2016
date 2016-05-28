package tp16_;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

class FenCoches2 extends JFrame implements ActionListener{ 
	private JCheckBox coche1, coche2 ;
	private JButton etat ;
	public FenCoches2 (){ 
		setTitle ("Exemple de cases a cocher") ;
		setSize (400, 100) ;
		Container contenu = getContentPane() ;
		contenu.setLayout (new FlowLayout()) ;
		coche1 = new JCheckBox ("case 1") ;
		contenu.add(coche1) ;
		coche1.addActionListener (this) ;
		coche2 = new JCheckBox ("case 2") ;
		contenu.add(coche2) ;
		coche2.addActionListener (this) ;
		etat = new JButton ("État") ;
		contenu.add(etat) ;
		etat.addActionListener (this) ;
	}
	public void actionPerformed (ActionEvent ev){
		Object source = ev.getSource() ;
		if (source == coche1) System.out.println ("action case 1") ;
		if (source == coche2) System.out.println ("action case 2") ;
		if (source == etat)
			System.out.println ("État CASES : " + coche1.isSelected() + " "
					+ coche2.isSelected()) ;
	}

	public static void main (String args[]){ 
		FenCoches2 fen = new FenCoches2() ;
		fen.setVisible(true) ;
	}
}
