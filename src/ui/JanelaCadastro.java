package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import negocio.Jogador;
import negocio.Partida;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class JanelaCadastro {

	private JFrame frame;
	private JTextField tfApelido;
	private JButton btStart;
	private Jogador jogadorCriado;
	private Partida partida;
	private int codigo = 0;
	private ArrayList<Jogador> Jogadores;
	private JComboBox comboBox;
	
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
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(83, 133, 279, 21);
		frame.getContentPane().add(comboBox);
		
		JRadioButton rdbtnOp1 = new JRadioButton("Opcao 1");
		rdbtnOp1.setBounds(110, 168, 85, 21);
		frame.getContentPane().add(rdbtnOp1);
		rdbtnOp1.setEnabled(false);
		
		JRadioButton rdbtnOp2 = new JRadioButton("Opcao 2");
		rdbtnOp2.setBounds(281, 168, 81, 21);
		frame.getContentPane().add(rdbtnOp2);
		rdbtnOp2.setEnabled(false);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnOp1);
		bg.add(rdbtnOp2);
		
		
		btStart = new JButton("Start");
		btStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jogo15 j= new Jogo15();
				frame.dispose();
				
			}
		});
		btStart.setFont(new Font("Tahoma", Font.BOLD, 12));
		btStart.setBounds(190, 206, 85, 21);
		frame.getContentPane().add(btStart);
		
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btCadastrar.setBounds(173, 82, 106, 21);
		frame.getContentPane().add(btCadastrar);
		
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(e.getSource()==btCadastrar && !tfApelido.getText().isEmpty()) {
						jogadorCriado = (new Jogador(tfApelido.getText(),codigo+=1));
						
						if (partida == null || partida.getJogadores().size() == 0) {
							partida = new Partida(jogadorCriado, false);
							JOptionPane.showMessageDialog(btCadastrar, "j=00 !!");
						}
						if (partida.getJogadores().isEmpty()) {	
							partida.addJogadores(jogadorCriado);
							JOptionPane.showMessageDialog(btCadastrar, "Sucesso !!");
							comboBox.setModel(new DefaultComboBoxModel(new String[] {jogadorCriado.getApelido()}));
						}
						
						else if (! partida.getJogadores().isEmpty()) {
						
									partida.addJogadores(jogadorCriado);
									JOptionPane.showMessageDialog(btCadastrar, "Diferente !!");
									comboBox.addItem(jogadorCriado.getApelido());
											
						}
							btStart.setEnabled(true);
							rdbtnOp1.setEnabled(true);
							rdbtnOp2.setEnabled(true);
						}
					else {
						JOptionPane.showMessageDialog(btCadastrar, "Digite um Apelido !!");
					}		
			}
		});
		btStart.setEnabled(false);		
		
	}
}
