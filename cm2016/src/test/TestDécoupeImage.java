package test;

import java.awt.Dimension;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class Carte{
	public static int nbLignes = 6;
	public static int nbColonnes = 4;
	public static int largeurCarte;
	public static int hauteurCarte;
	public static Image tabImages[][] = new Image[nbColonnes][nbLignes];
	public static BufferedImage myPicture = null;

	static{
		try {
//			myPicture = ImageIO.read(new File("./images/cartesTITUS.jpg")); //5 lignes et 13 colonnes
//			myPicture = ImageIO.read(new File("./images/cartes.png"));
//			myPicture = ImageIO.read(new File("./images/jeu 52 cartes.jpg")); // 4 lignes et 13 colonnes
			myPicture = ImageIO.read(new File("./images/cartes_pokemon_a_imprimer_jeu_zoom.jpg")); // 6 lignes et 4 colonnes
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		largeurCarte = myPicture.getWidth()/nbColonnes;
		hauteurCarte = myPicture.getHeight()/nbLignes;

		for (int c = 0; c < nbColonnes; c++) {//13 colonnes
			for (int l = 0; l < nbLignes; l++) {//4 lignes
//				System.out.println("c="+c+" - l="+l);
				tabImages[c][l] = myPicture.getSubimage( 
						c*largeurCarte, l*hauteurCarte,
						largeurCarte,hauteurCarte);
			}
		}
	}

}

public class TestDécoupeImage {


	public static void main(String[] args) {
		GridBagLayout gbl = new GridBagLayout();



		GridBagConstraints gbc = new GridBagConstraints();
		JFrame jf = new JFrame();
		jf.setLayout(gbl);

		JButton jb[][] = new JButton[Carte.nbColonnes][Carte.nbLignes];



		jf.setSize(Carte.myPicture.getWidth(null), Carte.myPicture.getHeight(null)+50);
		jf.setMinimumSize(new Dimension(Carte.myPicture.getWidth(null), Carte.myPicture.getHeight(null)+50));
		for (int c = 0; c < Carte.nbColonnes; c++){
			for (int l = 0; l < Carte.nbLignes; l++) {
				jb[c][l] = new JButton("");
				jb[c][l].setIcon(new ImageIcon(Carte.tabImages[c][l]));
				//System.out.println("c="+c+" - l="+l);
				gbc.gridx = c;
				gbc.gridy = l;
				jb[c][l].setPreferredSize(new Dimension(Carte.largeurCarte,Carte.hauteurCarte));
				jb[c][l].setMinimumSize(new Dimension(Carte.largeurCarte,Carte.hauteurCarte));

				jf.getContentPane().add(jb[c][l],gbc);
			}

		}

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



		jf.setVisible(true);


	}

}
