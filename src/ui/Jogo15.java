package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jogo15 {

	private JFrame frame;
	private JButton buttonSelecionado;
	private Icon iconButtonSelecionado1;
	private Icon iconButtonSelecionado2;
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
		
		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(btnNewButton_1)) {
					if(buttonSelecionado == null) {
						iconButtonSelecionado1 = btnNewButton_1.getIcon();
						buttonSelecionado = btnNewButton_1;
					} else {
						iconButtonSelecionado2 = btnNewButton_1.getIcon();
						btnNewButton_1.setIcon(iconButtonSelecionado1);
						buttonSelecionado.setIcon(iconButtonSelecionado2);
						buttonSelecionado = null;
						iconButtonSelecionado1 = null;
					}
				}
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("Img/01.png"));
		btnNewButton_1.setBounds(10, 10, 66, 58);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton();
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon("Img/05.png"));

		btnNewButton_1_1.setBounds(10, 69, 66, 58);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton();
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1.setIcon(new ImageIcon("Img/09.png"));
		btnNewButton_1_1_1.setBounds(10, 125, 66, 58);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton();
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1_1.setIcon(new ImageIcon("Img/13.png"));
		btnNewButton_1_1_1_1.setBounds(10, 182, 66, 58);
		frame.getContentPane().add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_2 = new JButton();
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(btnNewButton_1_2)) {
					if(buttonSelecionado == null) {
						iconButtonSelecionado1 = btnNewButton_1_2.getIcon();
						buttonSelecionado = btnNewButton_1_2;
					} else {
						iconButtonSelecionado2 = btnNewButton_1_2.getIcon();
						btnNewButton_1_2.setIcon(iconButtonSelecionado1);
						buttonSelecionado.setIcon(iconButtonSelecionado2);
						buttonSelecionado = null;
						iconButtonSelecionado1 = null;
					}
				}
			}
		});
		btnNewButton_1_2.setIcon(new ImageIcon("Img/02 (1).png"));
		btnNewButton_1_2.setBounds(77, 10, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton();
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2_1.setIcon(new ImageIcon("Img/03x.png"));
		btnNewButton_1_2_1.setBounds(144, 10, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_1_1 = new JButton();
		btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2_1_1.setIcon(new ImageIcon("Img/06.png"));

		btnNewButton_1_2_1_1.setBounds(77, 69, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2_1_1);
		
		JButton btnNewButton_1_2_1_1_1 = new JButton();
		btnNewButton_1_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2_1_1_1.setIcon(new ImageIcon("Img/10.png"));
		btnNewButton_1_2_1_1_1.setBounds(77, 125, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2_1_1_1);
		
		JButton btnNewButton_1_2_1_1_2 = new JButton();
		btnNewButton_1_2_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2_1_1_2.setIcon(new ImageIcon("Img/14.png"));
		btnNewButton_1_2_1_1_2.setBounds(77, 182, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2_1_1_2);
		
		JButton btnNewButton_1_2_1_1_3 = new JButton();
		btnNewButton_1_2_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2_1_1_3.setIcon(new ImageIcon("Img/15.png"));
		btnNewButton_1_2_1_1_3.setBounds(144, 182, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2_1_1_3);
		
		JButton btnNewButton_1_2_1_1_4 = new JButton("");
		btnNewButton_1_2_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2_1_1_4.setBounds(211, 182, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2_1_1_4);
		
		JButton btnNewButton_1_2_1_1_5 = new JButton();
		btnNewButton_1_2_1_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2_1_1_5.setIcon(new ImageIcon("Img/11.png"));
		btnNewButton_1_2_1_1_5.setBounds(144, 125, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2_1_1_5);
		
		JButton btnNewButton_1_2_1_1_6 = new JButton();
		btnNewButton_1_2_1_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2_1_1_6.setIcon(new ImageIcon("Img/07.png"));
		btnNewButton_1_2_1_1_6.setBounds(144, 69, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2_1_1_6);
		
		JButton btnNewButton_1_2_1_1_7 = new JButton();
		btnNewButton_1_2_1_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2_1_1_7.setIcon(new ImageIcon("Img/12.png"));
		btnNewButton_1_2_1_1_7.setBounds(220, 125, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2_1_1_7);
		
		JButton btnNewButton_1_2_1_1_8 = new JButton();
		btnNewButton_1_2_1_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2_1_1_8.setIcon(new ImageIcon("Img/05.png"));
		btnNewButton_1_2_1_1_8.setBounds(211, 69, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2_1_1_8);
		
		JButton btnNewButton_1_2_1_1_8_1 = new JButton();
		btnNewButton_1_2_1_1_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2_1_1_8_1.setIcon(new ImageIcon("Img/04.png"));
		btnNewButton_1_2_1_1_8_1.setBounds(211, 10, 66, 58);
		frame.getContentPane().add(btnNewButton_1_2_1_1_8_1);
	}

}
