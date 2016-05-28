package tp8_;

public class Cercle extends FormeGeometrique {
	private double rayon;
	@Override
	public double aire() {
		return Math.PI * rayon * rayon;
	}

}
