package tp6;

public class MainExercice {

	public static void main(String[] args) {
		Exercice tabEx [] = new Exercice[3];
		String tabProposition[] = {
				"x² + 36",
				"x² + 12x + 36",
				"x² + 6x + 36"
		};
		tabEx[0] = new QCM(1, "(x+6)² est égal à", 
				tabProposition, 1);
		tabEx[1] = new ExerciceATrou(2, 
		  "Complète ... au « simple present »", 
		  "Jane", "buys", "(buy) beautiful clothes");
		

	}

}
