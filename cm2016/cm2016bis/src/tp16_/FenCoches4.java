package tp16_;

import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;
import javax.swing.border.TitledBorder;

public class FenCoches4 extends JFrame implements ActionListener, ItemListener{
	private JRadioButton radio1, radio2 ,radio3 ;
	private JButton etat ;
	public FenCoches4 (){
		setTitle ("Exemple de boutons radio") ;
		setSize (400, 100) ;
		JPanel pan = new JPanel();
		pan.setBorder(new TitledBorder("Choisissez une option")) ;
		Container contenu = getContentPane() ;
		contenu.setLayout (new FlowLayout()) ;
		ButtonGroup groupe = new ButtonGroup() ;
		radio1 = new JRadioButton ("Radio 1") ;
		groupe.add(radio1) ;
		pan.add(radio1) ;
		radio1.addItemListener (this) ;
		radio1.addActionListener (this) ;
		radio1.setSelected (true) ;
		radio2 = new JRadioButton ("Radio 2") ;
		groupe.add(radio2) ;
		pan.add(radio2) ;
		radio2.addItemListener (this) ;
		radio2.addActionListener (this) ;
		radio3 = new JRadioButton ("Radio 3") ;
		groupe.add(radio3) ;
		pan.add(radio3) ;
		radio3.addItemListener (this) ;
		radio3.addActionListener (this) ;
		etat = new JButton ("�tat") ;
		contenu.add(etat) ;
		contenu.add(pan);
		etat.addActionListener (this) ;
	}
	public void itemStateChanged(ItemEvent ev){
		Object source = ev.getSource() ;
		if (source == radio1) System.out.println ("changement radio 1") ;
		if (source == radio2) System.out.println ("changement radio 2") ;
		if (source == radio3) System.out.println ("changement radio 3") ;
	}
	public void actionPerformed (ActionEvent ev){
		Object source = ev.getSource() ;
		if (source == etat)
			System.out.println ("�tat RADIOS : " + radio1.isSelected() + " "
					+ radio2.isSelected() + " " + radio3.isSelected()) ;
		if (source == radio1) System.out.println ("action radio 1") ;
		if (source == radio2) System.out.println ("action radio 2") ;
		if (source == radio3) System.out.println ("action radio 3") ;
	}

	public static void main (String args[]){
		FenCoches4 fen = new FenCoches4() ;
		fen.setVisible(true) ;
	}
}
