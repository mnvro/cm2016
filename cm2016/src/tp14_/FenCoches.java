package tp14_;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

class FenCoches extends JFrame implements ActionListener, ItemListener{ 
	private JCheckBox coche1, coche2 ;
	private JButton etat ;
	public FenCoches (){ 
		setTitle ("Exemple de cases a cocher") ;
		setSize (400, 100) ;
		Container contenu = getContentPane() ;
		contenu.setLayout (new FlowLayout()) ;
		coche1 = new JCheckBox ("case 1") ;
		contenu.add(coche1) ;
		coche1.addActionListener (this) ;
		coche1.addItemListener (this) ;
		coche2 = new JCheckBox ("case 2") ;
		contenu.add(coche2) ;
		coche2.addActionListener (this) ;
		coche2.addItemListener (this) ;
		etat = new JButton ("État") ;
		contenu.add(etat) ;
		etat.addActionListener (this) ;
	}
	public void itemStateChanged (ItemEvent ev){ // écouteur d’événements Item
		Object source = ev.getSource() ;
		if (source == coche1) System.out.println ("action case 1") ;
		if (source == coche2) System.out.println ("action case 2") ;
	}
	public void actionPerformed (ActionEvent ev){ // nouvel écouteur Action
		System.out.println ("État CASES : " + coche1.isSelected() + " "
				+ coche2.isSelected()) ;
	}

	public static void main (String args[]){ 
		FenCoches fen = new FenCoches() ;
		fen.setVisible(true) ;
	}
}
