package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import java.awt.Label;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.Jogador;
import negocio.Partida;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;

public class Janela {

	private JFrame frame;
	private JTextField textFieldApelido;
	private DefaultListModel<String> model = new DefaultListModel<>();
	private Partida partida;
	private Jogador jogadorCriado;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela window = new Janela();
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
	public Janela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 796, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_202004467468000");
		panel.setLayout(null);
		
		Label label = new Label("Apelido:");
		label.setBounds(10, 65, 62, 22);
		panel.add(label);
		
		textFieldApelido = new JTextField();
		textFieldApelido.setBounds(78, 67, 190, 20);
		panel.add(textFieldApelido);
		textFieldApelido.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Jogar");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBounds(238, 274, 182, 23);
		panel.add(btnNewButton_1);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(289, 65, 356, 143);
		panel.add(list);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnCadastrar && !textFieldApelido.getText().isEmpty()) {
					jogadorCriado = (new Jogador(textFieldApelido.getText(), 0));
					
					if (partida == null || partida.getJogadores().size() == 0) {
						try {
							partida = new Partida(jogadorCriado, false);
							model.addElement(jogadorCriado.getApelido());
							list.setModel(model);
						} catch(Exception exception) {
															
							if(exception.getMessage().indexOf("[SQLITE_CONSTRAINT_UNIQUE] A UNIQUE constraint failed (UNIQUE constraint failed: Jogador.apelido") != -1) {
								JOptionPane.showMessageDialog(btnCadastrar, "ESSE APELIDO JÁ SE ENCONTRA CADASTRADO.");
							}
						}
					} else {
						if (partida.getJogadores().isEmpty()) {	
							try {
								partida.addJogador(jogadorCriado);
							} catch (Exception e1) {
								if(e1.getMessage().indexOf("[SQLITE_CONSTRAINT_UNIQUE] A UNIQUE constraint failed (UNIQUE constraint failed: Jogador.apelido") != -1) {
									JOptionPane.showMessageDialog(btnCadastrar, "ESSE APELIDO JÁ SE ENCONTRA CADASTRADO.");
								}
							}
							JOptionPane.showMessageDialog(btnCadastrar, "Sucesso !!");
							model.addElement(jogadorCriado.getApelido());
							list.setModel(model);
						}
						
						else {
							try {
								partida.addJogador(jogadorCriado);
								JOptionPane.showMessageDialog(btnCadastrar, "Diferente !!");
								model.addElement(jogadorCriado.getApelido());
								list.setModel(model);
							} catch(Exception exception) {
								if(exception.getMessage().indexOf("[SQLITE_CONSTRAINT_UNIQUE] A UNIQUE constraint failed (UNIQUE constraint failed: Jogador.apelido") != -1) {
									JOptionPane.showMessageDialog(btnCadastrar, "ESSE APELIDO JÁ SE ENCONTRA CADASTRADO.");
								}
							}
						}
						}	
					}
				else {
					JOptionPane.showMessageDialog(btnCadastrar, "Digite um Apelido !!");
				}	
			}
		});
		btnCadastrar.setBounds(59, 93, 89, 23);
		panel.add(btnCadastrar);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, "name_202025039877300");
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, "name_202031338613200");
		
	}
}
