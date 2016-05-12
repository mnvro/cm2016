package tp10;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MaJFrame1 extends JFrame implements MouseListener {
	public MaJFrame1(){
		this.setBounds(500,400,600,200);
		this.setVisible(true);
		this.setTitle("Ma première JFrame");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.addMouseListener(this);
	}
	public static void main(String[] args) {
		MaJFrame1 mjf1 = new MaJFrame1();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked");
		System.out.println("on a cliqué en ("+e.getX()+","+e.getY()+")");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouseEntered");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouseExited");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased");
	}
}
