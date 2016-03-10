package tp3;

import javax.swing.JOptionPane;

public class Etu {
	private String nom;
	private String prenom;
	private int nbCalculs = 0;
	private int nbBonnesReponses = 0;
	public double moyenne(){
		if (nbCalculs == 0){
			return 0;
		}
		return (double)nbBonnesReponses/nbCalculs *100;
	}
	
	
	public static void main(String[] args) {
		Etu et = new Etu();
		et.nom = JOptionPane.showInputDialog("Nom : ");
		et.prenom = JOptionPane.showInputDialog("Prénom :");  
		for (int i = 0; i < 3; i++) {
			int a = (int) (Math.random()*20);
			int b = (int) (Math.random()*20);
			String s = JOptionPane.showInputDialog(a + " + "+ b + " = ");
			int reponse = Integer.parseInt(s);
			et.nbCalculs++;
			if(reponse == a+b) {
				et.nbBonnesReponses++;
			}
		}
		JOptionPane.showMessageDialog(null, et.nom+
				" "+et.prenom+" tu as eu "+ 
				et.moyenne()+"%");
			
	}
}
