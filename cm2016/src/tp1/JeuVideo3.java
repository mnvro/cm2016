package tp1;

public class JeuVideo3 {
	
	public void démarrer(){
		System.out.println("Le jeu est en cours");
	}
	
	public void arrêter() {
		System.out.println("Le jeu est fini");
	}
	
	public void sauverScore(String nomJoueur, int score){
		System.out.println("le score est enregistré");
	}
	
	public static void main (String args[]){
		JeuVideo3 monJeu = new JeuVideo3();
		
		monJeu.démarrer();
		monJeu.arrêter();
		
	}
}

