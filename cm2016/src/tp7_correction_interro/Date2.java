package tp7_correction_interro;

public class Date2 implements Affichable2 {
	private int jj,mm,aaaa;
	
	public Date2(String dateS){
		String tabS[] = dateS.split("/");
		jj = Integer.parseInt(tabS[0]);
		mm = Integer.parseInt(tabS[1]);
		aaaa = Integer.parseInt(tabS[2]);
	}
	public String toString() {
		return jj+"/"+mm+"/"+aaaa;
	}
	public void affiche() {
		System.out.println(this);
	}
	public static void main(String args[]){
		Date2 d1 = new Date2("30/12/1969");
		d1.affiche();
	}
}

