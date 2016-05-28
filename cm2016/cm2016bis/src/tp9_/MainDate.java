package tp9_;

import java.util.Arrays;

public class MainDate {

	public static void main(String[] args) {
		Date tab[] = new Date[6];
		tab[0] = new Date ("3/03/1996");
		tab[1] = new Date ("1/01/1980");
		tab[2] = new Date ("30/9/1993");
		tab[3] = new Date ("28/02/1992");
		tab[4] = new Date ("31/12/1967");
		tab[5] = new Date ("15/08/1990");
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
		Arrays.sort(tab);
		System.out.println("Après le tri");
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}

}
