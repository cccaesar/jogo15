package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;


import negocio.Jogador;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

public class JanelaCadastro {

	private JFrame frame;
	private JTextField tfApelido;
	private JButton btJogar;
	private Jogador jogador;
	private int codigo = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastro window = new JanelaCadastro();
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
	public JanelaCadastro() {
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
		
		tfApelido = new JTextField();
		tfApelido.setBounds(179, 46, 96, 19);
		frame.getContentPane().add(tfApelido);
		tfApelido.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Apelido:");
		lblNewLabel.setBounds(124, 48, 49, 13);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(lblNewLabel);
		
		btJogar = new JButton("Jogar");
		btJogar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btJogar.setBounds(189, 84, 85, 21);
		frame.getContentPane().add(btJogar);
		
		btJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(e.getSource()==btJogar && !tfApelido.getText().isEmpty()) {
						jogador = (new Jogador(tfApelido.getText(),codigo+=1));	
						JOptionPane.showMessageDialog(btJogar, "Sucesso !!");
					}
					else {
						JOptionPane.showMessageDialog(btJogar, "Digite um Apelido !!");
					}	
			}
		});
	}

}
