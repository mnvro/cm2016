package tp1;

public class JeuVideo2 {
	
	private String couleur;
	private int prix;
	private String nomJoueur;
	private int score;
	
	public void d�marrer(){
		System.out.println("Le jeu est en cours");
	}
	
	public void arr�ter() {
		System.out.println("Le jeu est fini");
	}
	
	public void sauverScore(String nomJoueur, int score){
		System.out.println("le score est enregistr�");
	}
	
	public String toString() {
		return "couleur=" + couleur + ", prix=" + prix + ", nomJoueur=" + nomJoueur + ", score=" + score;
	}

	public static void main (String args[]){
		JeuVideo2 monJeu = new JeuVideo2();
		monJeu.prix = 30;
		monJeu.couleur = "Rouge";
		monJeu.d�marrer();
		monJeu.arr�ter();
	}
}



