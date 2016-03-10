package tp1;

public class Personne {
	private String nom;
	private String prenom;
	
	public static void main(String[] args) {
		
		Personne p1 = new Personne();
		
		p1.nom = "Vroman";
		p1.prenom = "Marie-Noël";
		System.out.println(p1);
		Personne p2 = new Personne();
		p2.nom = "Castiaux";
		p2.prenom = "Julien";
		System.out.println(p2);
		
	}
}


