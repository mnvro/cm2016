package tp9;

public class Date implements Comparable<Date>  {
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
	@Override
	public int compareTo(Date o) {
		// TODO Auto-generated method stub
		return this.aaaa*10000 + this.mm*100 + this.jj -
				(o.aaaa*10000 + o.mm*100 + o.jj);
	}
}

