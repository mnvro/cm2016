package tp6;

public class ExerciceATrou extends Exercice {
	private String debutPhrase;
	private String bonneReponse;
	private String finPhrase;

	public ExerciceATrou(int niveau, String enonce, 
			String debutPhrase, String bonneReponse, String finPhrase) {
		super(niveau, enonce, TYPE_EXERCICE_A_TROU);
		this.debutPhrase = debutPhrase;
		this.bonneReponse = bonneReponse;
		this.finPhrase = finPhrase;
	}

	public ExerciceATrou() {
		this.setType(TYPE_EXERCICE_A_TROU);
	}
	
	public String getDebutPhrase() {
		return debutPhrase;
	}
	public void setDebutPhrase(String debutPhrase) {
		this.debutPhrase = debutPhrase;
	}
	public String getBonneReponse() {
		return bonneReponse;
	}
	
	public void setBonneReponse(String bonneReponse) {
		this.bonneReponse = bonneReponse;
	}

	public String getFinPhrase() {
		return finPhrase;
	}

	public void setFinPhrase(String finPhrase) {
		this.finPhrase = finPhrase;
	}
	
	@Override
	public String toString() {
		return "bonneReponse=" + bonneReponse + 
				", " + super.toString();
	}
	
	public boolean verifierReponse(String reponse){
		return (this.bonneReponse.compareToIgnoreCase(reponse)==0);
	}
	
}
