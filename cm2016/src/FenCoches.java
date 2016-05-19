import java.awt.* ; import java.awt.event.* ; import javax.swing.* ;
public class FenCoches extends JFrame implements ActionListener{ 
	private JCheckBox coche1, coche2 ;
	private JButton État ;
	public FenCoches (){ 
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
		État = new JButton ("État") ;
		contenu.add(État) ;
		État.addActionListener (this) ;
	}
	public void actionPerformed (ActionEvent ev){
		Object source = ev.getSource() ;
		if (source == coche1) System.out.println ("action case 1") ;
		if (source == coche2) System.out.println ("action case 2") ;
		if (source == État)
			System.out.println ("État CASES : " + coche1.isSelected() + " "
					+ coche2.isSelected()) ;
	}

	public static void main (String args[]){
		FenCoches fen = new FenCoches() ;
		fen.setVisible(true) ;
	}
}