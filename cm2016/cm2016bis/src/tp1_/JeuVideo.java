package tp1_;

public class JeuVideo {
	
	private String couleur;
	private int prix;
	private String nomJoueur;
	private int score;
	
	public void démarrer(){
	}
	public void arrêter() {
	}
	public void sauverScore(String nomJoueur, int score){
	}
	
	public static void main (String args[]){
		JeuVideo monJeu = new JeuVideo();
		monJeu.prix = 30;
		monJeu.couleur = "Rouge";
	}
}

