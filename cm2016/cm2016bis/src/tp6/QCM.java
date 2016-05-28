package tp6;

public class QCM extends Exercice {
	private String tabProposition[];
	private int indiceBonneReponse;

	public QCM(int niveau, String enonce, 
			String tabProposition[], int indiceBonneReponse ) {
		super(niveau, enonce, TYPE_EXERCICE_QCM);
		this.indiceBonneReponse = indiceBonneReponse;
		this.tabProposition = tabProposition;
	}

	public QCM() {
		this.setType(TYPE_EXERCICE_QCM);
	}
	
	public String toString(){
		String s = super.toString()+"\n";
		for (int i = 0; i < tabProposition.length; i++) {
			s = s+"\t"+i+" : "+tabProposition[i];
			if (i == indiceBonneReponse) s = s+"*";
			s += "\n";
		}
		return s;
	}

	public String[] getTabProposition() {
		return tabProposition;
	}

	public void setTabProposition(String[] tabProposition) {
		this.tabProposition = tabProposition;
	}

	public int getIndiceBonneReponse() {
		return indiceBonneReponse;
	}

	public void setIndiceBonneReponse(int indiceBonneReponse) {
		this.indiceBonneReponse = indiceBonneReponse;
	}

}
