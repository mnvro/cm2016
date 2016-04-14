package tp12;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MaNouvelleJFrame extends JFrame {
	private JButton jb;
	public MaNouvelleJFrame(){
		this.setTitle("Nouvelle JFrame");
		this.setVisible(true);
		this.setBounds(200,200,300,400);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.addMouseListener(new ImplementationMouseListener());
		jb = new JButton("OK");
		this.getContentPane().add(jb);
	}
	public static void main(String[] args) {
		MaNouvelleJFrame mnjf = new MaNouvelleJFrame();
	}

}
