package tp10;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MaJFrame3 extends JFrame {
	private JButton jButtonOK;

	public MaJFrame3()  {
		
		this.setTitle("Toto");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		jButtonOK = new JButton("ok");
		this.getContentPane().add(jButtonOK);
		this.setBounds(500,400,300,200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		MaJFrame3 mjf3 = new MaJFrame3();
	}

}
