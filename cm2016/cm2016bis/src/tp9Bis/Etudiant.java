package tp9Bis;

import java.util.Arrays;

public class Etudiant extends Personne 
	implements Comparable<Etudiant> {
	private int num;
	
	public Etudiant() {
	}
	public Etudiant(String nom, String prenom, 
			Date dateNaissance,int num) {
		super(nom, prenom, dateNaissance);
		this.num = num;
	}

	public int compareTo(Etudiant o) {
		return -(this.num - o.num);
	}
	@Override
	public String toString() {
		return "Etudiant [num=" + num + ", toString()=" + super.toString() + "]";
	}
	public static void main(String[] args) {
		Etudiant tab [] = new Etudiant[3];
		Date d = new Date ("30/12/1969");
		tab[0] = new Etudiant("Vroman", "MN", d, 5);
		tab[1] = new Etudiant("Castiaux", "Julien", d, 0);
		tab[2] = new Etudiant("Castiaux", "Laurane", d, 6);
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
		System.out.println("Après le tri...");
		Arrays.sort(tab);
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}

}
