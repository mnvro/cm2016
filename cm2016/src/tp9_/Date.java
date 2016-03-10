package tp9_;

public class Date  {
	private int jj;
	private int mm;
	private int aaaa;
	public Date(String dateS){
		String tabS[] = dateS.split("/");
		jj = Integer.parseInt(tabS[0]);
		mm = Integer.parseInt(tabS[1]);
		aaaa = Integer.parseInt(tabS[2]);
	}
	public String toString() {
		return jj+"/"+mm+"/"+aaaa;
	}
}

