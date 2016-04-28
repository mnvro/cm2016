package tp13_;

public class TestJavaDoc {
	/**
	 * Cette méthode calcule la factorielle de n
	 * @param n : un entier positif
	 * @return Si n>=0 renvoie n!, sinon renvoie -1
	 */
	public static int fact(int n){
		if (n==1 || n==0)
			return 1;
		else if (n>1)
			return n*fact(n-1);
		else
			return -1;
	}
}



