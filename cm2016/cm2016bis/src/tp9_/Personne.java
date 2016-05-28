package tp9_;

public class Personne implements Comparable<Personne> {
	private String nom;
	private String prenom;
	private Date dateNaissance;
	public Personne(){
	}
	public Personne(String nom, String prenom, Date dateNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + "]";
	}
	@Override
	public int compareTo(Personne o) {
		return (this.nom+this.prenom).compareToIgnoreCase(
				o.nom+o.prenom
		);
	}
	
}
