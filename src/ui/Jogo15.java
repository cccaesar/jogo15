package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;

public class Jogo15 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jogo15 window = new Jogo15();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Jogo15() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("1");
		chckbxNewCheckBox.setBounds(36, 37, 31, 21);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("2");
		chckbxNewCheckBox_1.setBounds(81, 37, 31, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("4");
		chckbxNewCheckBox_1_1.setBounds(154, 37, 31, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("3");
		chckbxNewCheckBox_1_1_1.setBounds(114, 37, 31, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("5");
		chckbxNewCheckBox_2.setBounds(36, 65, 31, 21);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("6");
		chckbxNewCheckBox_1_2.setBounds(81, 65, 31, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_2);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1 = new JCheckBox("7");
		chckbxNewCheckBox_1_1_1_1.setBounds(114, 65, 31, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_2 = new JCheckBox("8");
		chckbxNewCheckBox_1_1_2.setBounds(154, 65, 31, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_2);
		
		JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("9");
		chckbxNewCheckBox_2_1.setBounds(36, 88, 31, 21);
		frame.getContentPane().add(chckbxNewCheckBox_2_1);
		
		JCheckBox chckbxNewCheckBox_1_2_1 = new JCheckBox("10");
		chckbxNewCheckBox_1_2_1.setBounds(81, 88, 31, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_2_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1_1 = new JCheckBox("11");
		chckbxNewCheckBox_1_1_1_1_1.setBounds(114, 88, 31, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_2_1 = new JCheckBox("12");
		chckbxNewCheckBox_1_1_2_1.setBounds(154, 88, 31, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_2_1);
		
		JCheckBox chckbxNewCheckBox_2_1_1 = new JCheckBox("13");
		chckbxNewCheckBox_2_1_1.setBounds(36, 118, 31, 21);
		frame.getContentPane().add(chckbxNewCheckBox_2_1_1);
		
		JCheckBox chckbxNewCheckBox_1_2_1_1 = new JCheckBox("14");
		chckbxNewCheckBox_1_2_1_1.setBounds(81, 118, 31, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_2_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1_1_1 = new JCheckBox("15");
		chckbxNewCheckBox_1_1_1_1_1_1.setBounds(114, 118, 31, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_1_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_2_1_1 = new JCheckBox("16");
		chckbxNewCheckBox_1_1_2_1_1.setBounds(154, 118, 31, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1_1_2_1_1);
	}

}