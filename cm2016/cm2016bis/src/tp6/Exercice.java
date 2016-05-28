package tp6;

public class Exercice {
	private int niveau;
	private String enonce;
	private int type;
	
	public final static int TYPE_EXERCICE_QCM = 1;
	public final static int TYPE_EXERCICE_A_TROU = 2;
	public final static int TYPE_EXERCICE_VRAI_OU_FAUX = 3;
	public final static int TYPE_EXERCICE_AUTRE = 4;
	
	public Exercice(int niveau, String enonce, int type) {
		this.niveau = niveau;
		this.enonce = enonce;
		this.type = type;
	}
	public Exercice() {
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	public String getEnonce() {
		return enonce;
	}
	public void setEnonce(String enonce) {
		this.enonce = enonce;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		if ((type <=0) || (type >=5)) this.type = 4;
		else
		this.type = type;
	}
	@Override
	public String toString() {
		return "énoncé=" + enonce;
	}
	

}
