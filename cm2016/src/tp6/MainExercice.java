package tp6;

public class MainExercice {

	public static void main(String[] args) {
		Exercice tabEx [] = new Exercice[3];
		String tabProposition[] = {
				"x� + 36",
				"x� + 12x + 36",
				"x� + 6x + 36"
		};
		tabEx[0] = new QCM(1, "(x+6)� est �gal �", 
				tabProposition, 1);
		tabEx[1] = new ExerciceATrou(2, 
		  "Compl�te ... au � simple present �", 
		  "Jane", "buys", "(buy) beautiful clothes");
		

	}

}
