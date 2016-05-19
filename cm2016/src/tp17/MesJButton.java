package tp17;

import javax.swing.JButton;

public class MesJButton extends JButton {
	private int ligne;
	private int colonne;
	
	
	
	public MesJButton(int ligne, int colonne) {
		super("("+ligne+","+colonne+")");
		this.ligne = ligne;
		this.colonne = colonne;
	}
	public int getLigne() {
		return ligne;
	}
	public void setLigne(int ligne) {
		this.ligne = ligne;
	}
	public int getColonne() {
		return colonne;
	}
	public void setColonne(int colonne) {
		this.colonne = colonne;
	}
	

}
