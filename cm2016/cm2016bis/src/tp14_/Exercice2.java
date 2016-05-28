package tp14_;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import java.awt.GridBagLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JRadioButton;
import java.awt.Insets;
import java.awt.RadialGradientPaint;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class Exercice2 extends JFrame implements ActionListener, ItemListener{

	private JPanel contentPane;
	private JButton jButtonOK;
	private JRadioButton radio1, radio2, radio3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercice2 frame = new Exercice2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Exercice2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(74, 13, 296, 60);
		panel.setBorder(new TitledBorder("Choisissez une option"));
		contentPane.add(panel);
		
		radio1 = new JRadioButton("radio 1");
		panel.add(radio1);
		radio1.addItemListener(this);
		
		buttonGroup.add(radio1);
		
		radio2 = new JRadioButton("radio 2");
		panel.add(radio2);
		radio2.addItemListener(this);
		buttonGroup.add(radio2);
		
		radio3 = new JRadioButton("radio 3");
		panel.add(radio3);
		radio3.addItemListener(this);
		buttonGroup.add(radio3);
		
		jButtonOK = new JButton("OK");
		panel.add(jButtonOK);
		jButtonOK.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == jButtonOK){
			System.out.print("Etat = ");
			System.out.println("radio 1 : "+radio1.isSelected());
			System.out.println("       radio 2 : "+radio2.isSelected());
			System.out.println("       radio 3 : "+radio3.isSelected());
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object source = e.getSource();
		if (source == radio1) System.out.println("changement sur radio 1");
		if (source == radio2) System.out.println("changement sur radio 2");
		if (source == radio3) System.out.println("changement sur radio 3");
	}
}
