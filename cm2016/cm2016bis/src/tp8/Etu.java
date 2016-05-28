package tp8;

import java.util.Arrays;

public class Etu implements Comparable<Etu> {
	private int num;
	public Etu(int num){
		this.num = num;
	}
	public String toString() {
		return "num=" + num;
	}
	public static void main(String[] args) {
		Etu tab[] = new Etu[3];
		tab[0] = new Etu(50);
		tab[1] = new Etu(40);
		tab[2] = new Etu(45);
		Arrays.sort(tab);
	}
	public int compareTo(Etu o) {
		return this.num - o.num;
	}
}
