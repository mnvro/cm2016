package tp1;

public class JeuVideo3 {
	
	public void d�marrer(){
		System.out.println("Le jeu est en cours");
	}
	
	public void arr�ter() {
		System.out.println("Le jeu est fini");
	}
	
	public void sauverScore(String nomJoueur, int score){
		System.out.println("le score est enregistr�");
	}
	
	public static void main (String args[]){
		JeuVideo3 monJeu = new JeuVideo3();
		
		monJeu.d�marrer();
		monJeu.arr�ter();
		
	}
}

