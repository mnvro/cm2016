package tp5;

public class Test {

	public static void main(String[] args) {
		String s = "bonjour tout le monde";
		System.out.println("Le premier caractère est "+
				s.charAt(0)
		);
		System.out.println("Le deuxième caractère est "+
				s.charAt(1)
		);
		String s2 = "Salut!";
		
		if (s.compareTo(s2)<0){
			System.out.println(s + " < " + s2);
		}else{
			if (s.compareTo(s2)==0){
				System.out.println(s+" = "+s2);
			} else{
				System.out.println(s + " > " + s2);
			}
		}
		
		if (s.compareToIgnoreCase(s2)<0){
			System.out.println(s + " < " + s2);
		}else{
			if (s.compareToIgnoreCase(s2)==0){
				System.out.println(s+" = "+s2);
			} else{
				System.out.println(s + " > " + s2);
			}
		}
		double d = 5.0;
		String s3 = String.valueOf(d);
		s3 = d+"";
	}

}
