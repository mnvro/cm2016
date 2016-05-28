package tp9;

public class Tableau {
	public static void affiche(Affichable tab[]){
		for (int i = 0; i < tab.length; i++) {
			tab[i].affiche();
		}
	}

}
