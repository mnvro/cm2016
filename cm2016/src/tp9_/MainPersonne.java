package tp9_;

public class MainPersonne {

	public static void main(String[] args) {
		Personne tab [] = new Personne[6];
		Date d = new Date ("30/12/1969");
		tab[0] = new Personne("Vroman","Marie-Noël",d);
		tab[1] = new Personne("Vroman","Isabelle",d);
		tab[2] = new Personne("Castiaux","Julien",d);
		tab[3] = new Personne("Castiaux","Laurane",d);
		tab[4] = new Personne("BECHROURI","Abdelhafid",d);
		tab[5] = new Personne("DEANE","Thomas",d);
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
		System.out.println("Après le tri");
		
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}

}
