package tp3;

import javax.swing.JOptionPane;

public class Etu2 {
	private String nom;
	private String prenom;
	private double tabCotes[] = new double [5];
	public void encodeCote(){
		for (int i = 0; i < 5; i++) {
			do{
				tabCotes[i]=
				  Integer.parseInt(
				    JOptionPane.showInputDialog("tabCotes["+i+"]=")
				  );
			}while(!(tabCotes[i]>=0 && tabCotes[i]<=20));
		}
	}


	public static void main(String[] args) {
	}
}
