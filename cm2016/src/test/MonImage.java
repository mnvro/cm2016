package test;

import java.awt.Image;
import java.awt.image.BufferedImage;

public class MonImage {
	
	private Image image;
	public static Image[][] decoupeImage(BufferedImage myPicture, int nbColonnes, int nbLignes){
		Image tabImages[][] = new Image[nbColonnes][nbLignes];
		int largeurCarte = myPicture.getWidth()/nbColonnes;
		int hauteurCarte = myPicture.getHeight()/nbLignes;

		for (int c = 0; c < nbColonnes; c++) {//13 colonnes
			for (int l = 0; l < nbLignes; l++) {//4 lignes
//				System.out.println("c="+c+" - l="+l);
				tabImages[c][l] = myPicture.getSubimage( 
						c*largeurCarte, l*hauteurCarte,
						largeurCarte,hauteurCarte);
			}
		}
		return tabImages;
	}
}
