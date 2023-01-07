package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\charm\\OneDrive\\\u00C1rea de Trabalho\\Jogo15\\jogo15\\Img\\01.png"));
		btnNewButton_1.setBounds(10, 10, 66, 58);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\charm\\OneDrive\\\u00C1rea de Trabalho\\Jogo15\\jogo15\\Img\\08.png"));
		btnNewButton_1_1.setBounds(10, 69, 66, 58);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("New button");
		btnNewButton_1_1_1.setIcon(new ImageIcon("C:\\Users\\charm\\OneDrive\\\u00C1rea de Trabalho\\Jogo15\\jogo15\\Img\\09.png"));
		btnNewButton_1_1_1.setBounds(10, 125, 66, 58);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("New button");
		btnNewButton_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\charm\\OneDrive\\\u00C1rea de Trabalho\\Jogo15\\jogo15\\Img\\11 (1).png"));
		btnNewButton_1_1_1_1.setBounds(10, 182, 66, 58);
		frame.getContentPane().add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_2 = new JButton("New button");
		btnNewButton_1_2.setIcon(new ImageIcon("C:\\Users\\charm\\OneDrive\\\u00C1rea de Trabalho\\Jogo15\\jogo15\\Img\\02 (1).png"));
		btnNewButton_1_2.setBounds(77, 10, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("New button");
		btnNewButton_1_2_1.setIcon(new ImageIcon("C:\\Users\\charm\\OneDrive\\\u00C1rea de Trabalho\\Jogo15\\jogo15\\Img\\03x.png"));
		btnNewButton_1_2_1.setBounds(144, 10, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_1_1 = new JButton("New button");
		btnNewButton_1_2_1_1.setIcon(new ImageIcon("C:\\Users\\charm\\OneDrive\\\u00C1rea de Trabalho\\Jogo15\\jogo15\\Img\\07.png"));
		btnNewButton_1_2_1_1.setBounds(77, 69, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2_1_1);
		
		JButton btnNewButton_1_2_1_1_1 = new JButton("New button");
		btnNewButton_1_2_1_1_1.setIcon(new ImageIcon("C:\\Users\\charm\\OneDrive\\\u00C1rea de Trabalho\\Jogo15\\jogo15\\Img\\10.png"));
		btnNewButton_1_2_1_1_1.setBounds(77, 125, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2_1_1_1);
		
		JButton btnNewButton_1_2_1_1_2 = new JButton("New button");
		btnNewButton_1_2_1_1_2.setIcon(new ImageIcon("C:\\Users\\charm\\OneDrive\\\u00C1rea de Trabalho\\Jogo15\\jogo15\\Img\\15.png"));
		btnNewButton_1_2_1_1_2.setBounds(77, 182, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2_1_1_2);
		
		JButton btnNewButton_1_2_1_1_3 = new JButton("New button");
		btnNewButton_1_2_1_1_3.setIcon(new ImageIcon("C:\\Users\\charm\\OneDrive\\\u00C1rea de Trabalho\\Jogo15\\jogo15\\Img\\14.png"));
		btnNewButton_1_2_1_1_3.setBounds(144, 182, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2_1_1_3);
		
		JButton btnNewButton_1_2_1_1_4 = new JButton("");
		btnNewButton_1_2_1_1_4.setBounds(211, 182, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2_1_1_4);
		
		JButton btnNewButton_1_2_1_1_5 = new JButton("New button");
		btnNewButton_1_2_1_1_5.setIcon(new ImageIcon("C:\\Users\\charm\\OneDrive\\\u00C1rea de Trabalho\\Jogo15\\jogo15\\Img\\11.png"));
		btnNewButton_1_2_1_1_5.setBounds(144, 125, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2_1_1_5);
		
		JButton btnNewButton_1_2_1_1_6 = new JButton("New button");
		btnNewButton_1_2_1_1_6.setIcon(new ImageIcon("C:\\Users\\charm\\OneDrive\\\u00C1rea de Trabalho\\Jogo15\\jogo15\\Img\\06.png"));
		btnNewButton_1_2_1_1_6.setBounds(144, 69, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2_1_1_6);
		
		JButton btnNewButton_1_2_1_1_7 = new JButton("New button");
		btnNewButton_1_2_1_1_7.setIcon(new ImageIcon("C:\\Users\\charm\\OneDrive\\\u00C1rea de Trabalho\\Jogo15\\jogo15\\Img\\12.png"));
		btnNewButton_1_2_1_1_7.setBounds(211, 125, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2_1_1_7);
		
		JButton btnNewButton_1_2_1_1_8 = new JButton("New button");
		btnNewButton_1_2_1_1_8.setIcon(new ImageIcon("C:\\Users\\charm\\OneDrive\\\u00C1rea de Trabalho\\Jogo15\\jogo15\\Img\\05.png"));
		btnNewButton_1_2_1_1_8.setBounds(211, 69, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2_1_1_8);
		
		JButton btnNewButton_1_2_1_1_8_1 = new JButton("New button");
		btnNewButton_1_2_1_1_8_1.setIcon(new ImageIcon("C:\\Users\\charm\\OneDrive\\\u00C1rea de Trabalho\\Jogo15\\jogo15\\Img\\04.png"));
		btnNewButton_1_2_1_1_8_1.setBounds(211, 10, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2_1_1_8_1);
	}

}
