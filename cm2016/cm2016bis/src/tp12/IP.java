package tp12;

public class IP extends TrenteDeuxBits {
	public char getClasse(){
		if((this.getOct1()>=0)&&(this.getOct1()<=127))
			return 'A';
		if((this.getOct1()>=128)&&(this.getOct1()<=191))
			return 'B';
		if((this.getOct1()>=192)&&(this.getOct1()<=223))
			return 'C';
		if((this.getOct1()>=224)&&(this.getOct1()<=239))
			return 'D';
		return 'Z';
	}
	
	public int getDefaultSlash(){
		if (this.getClasse() == 'A') return 8;
		if (this.getClasse() == 'B') return 16;
		if (this.getClasse() == 'C') return 24;
		return 32;		
	}
	
	public boolean estPrive(){
		if(getOct1() == 10) return true;
		if ((this.getOct1() == 192) && (this.getOct2() == 168)) return true;
		if ((this.getOct1()==172) && (this.getOct2()>=16) && 
		 (this.getOct2()<=31)) return true;
		return false; 
	}
	
	public IP(String s){
		super(s);
	}
	
	public static void main(String[] args) {
		IP ip1 = new IP("19.168.0.1");
		System.out.println(ip1 + "est privé ? "+ip1.estPrive());
		System.out.println("Le masque par défaut est /"+ip1.getDefaultSlash());
		
	}

}
