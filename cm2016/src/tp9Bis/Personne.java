package tp9Bis;

public class Personne  {
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
		return "nom=" + nom + ", prenom=" + 
				prenom + ", dateNaissance=" + dateNaissance;
	}
	
	
}
