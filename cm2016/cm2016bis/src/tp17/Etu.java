package tp17;

import java.util.ArrayList;

public class Etu {
	private String nom;
	private int num;
	private ArrayList<Double> cotes = new ArrayList<Double>();
	public void ajouteCote(double d){
		cotes.add(d);
	}
	
	public String toString(){
		String s ="";
		
		for (Double cote : cotes) {
			s+=cote+"\n";
		}
		s+="moyenne de l'étudiant : "+moyenne()+" /20";
		return s;
	}
	
	public void afficheTout(){
		System.out.println("Voici tous les résultats :");
		for (Double cote : cotes) {
			System.out.println(cote);
		}
	}
	
	public double moyenne(){
		if (cotes.size() == 0) return 0;
		double somme=0;
		for (Double element : cotes) {
			somme += element;
		}
		return somme/cotes.size();
	}

	public static void main(String[] args) {
		Etu et = new Etu();
		et.cotes.add(new Double(15));
		et.cotes.add(5.0);
	}
}
