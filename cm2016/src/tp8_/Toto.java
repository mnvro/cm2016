package tp8_;

import java.util.Arrays;

public class Toto implements Comparable<Toto> {
	private int num;

	@Override
	public int compareTo(Toto unAutreToto) {
		// TODO Auto-generated method stub
		return this.num - unAutreToto.num;
	}
	
	public static void main(String[] args) {
		Toto tab[] = new Toto[10];
		for (int i = 0; i < tab.length; i++) {
			tab[i] = new Toto();
			tab[i].num = (int) (Math.random()*100);
			System.out.println(tab[i]);
		}
		System.out.println("Après le tri...");
		Arrays.sort(tab);
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}

	public String toString() {
		return "Toto [num=" + num + "]";
	}
	

}
