package tp12;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MaJFrame2 extends JFrame implements MouseListener {
	public MaJFrame2(){
		this.setBounds(500,400,300,200);
		this.setVisible(true);
		this.setTitle("Ma première JFrame");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//this.addMouseListener(this);
	}
	public static void main(String[] args) {
		MaJFrame2 mjf1 = new MaJFrame2();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("on a cliqué en ("+e.getX()+","+e.getY()+")");
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
}
