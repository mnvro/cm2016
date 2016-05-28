package tp13_;

public class TestJavaDoc2 {
	/**
	 * Cette méthode calcule la factorielle de n
	 * @param n : un entier positif
	 * @return Si n>=0 renvoie n!
	 * @exception une NonPositiveException est lancée
	 * si n est négatif
	 */
	public static int fact(int n) throws NonPositiveException{
		if (n==1 || n==0)
			return 1;
		else if (n>1)
			return n*fact(n-1);
		else
			throw new NonPositiveException();
	}
	public static void main(String[] args) {
		int resultat;
		try {
			resultat = fact(-1);
			System.out.println(resultat);
		} catch (NonPositiveException e) {
			e.printStackTrace();
		}
	}
}




