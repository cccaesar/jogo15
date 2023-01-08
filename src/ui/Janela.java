package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import java.awt.Component;

import javax.swing.JTabbedPane;
import java.awt.Label;
import java.awt.List;

import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.Jogador;
import negocio.Partida;
import negocio.Peca;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Janela {

	private JFrame frame;
	private JTextField textFieldApelido;
	private DefaultListModel<String> model = new DefaultListModel<>();
	private Partida partida;
	private Jogador jogadorCriado;
	private JPanel panel_1;
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
		label.setBounds(10, 44, 62, 22);
		label.setAlignment(Label.RIGHT);
		panel.add(label);
		
		panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, "name_202025039877300");
		panel_1.setLayout(null);
		
		JButton btnCelula4 = new JButton("4");
		btnCelula4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnCelula1 = new JButton("1");
		btnCelula1.setBounds(53, 72, 80, 80);
		btnCelula1.setIcon(new ImageIcon("Img/01.png"));
		panel_1.add(btnCelula1);
		
		JButton btnCelula2 = new JButton("2");
		btnCelula2.setBounds(143, 72, 80, 80);
		btnCelula2.setIcon(new ImageIcon("Img/02 (1).png"));
		panel_1.add(btnCelula2);
		
		JButton btnCelula3 = new JButton("3");
		btnCelula3.setBounds(233, 72, 80, 80);
		btnCelula3.setIcon(new ImageIcon("Img/03x.png"));
		panel_1.add(btnCelula3);
		btnCelula4.setIcon(null);
		btnCelula4.setBounds(323, 72, 80, 80);
		btnCelula4.setIcon(new ImageIcon("Img/04.png"));
		panel_1.add(btnCelula4);
		
		JButton btnCelula5 = new JButton("5");
		btnCelula5.setBounds(53, 163, 80, 80);
		btnCelula5.setIcon(new ImageIcon("Img/05.png"));
		panel_1.add(btnCelula5);
		
		JButton btnCelula6 = new JButton("6");
		btnCelula6.setIcon(new ImageIcon("Img/06.png"));
		btnCelula6.setBounds(143, 163, 80, 80);
		panel_1.add(btnCelula6);
		
		JButton btnCelula7 = new JButton("7");
		btnCelula7.setIcon(new ImageIcon("Img/07.png"));
		btnCelula7.setBounds(233, 163, 80, 80);
		panel_1.add(btnCelula7);
		
		JButton btnCelula8 = new JButton("8");
		btnCelula8.setIcon(new ImageIcon("Img/08.png"));
		btnCelula8.setBounds(323, 163, 80, 80);
		panel_1.add(btnCelula8);
		
		JButton btnCelula9 = new JButton("9");
		btnCelula9.setIcon(new ImageIcon("Img/09.png"));
		btnCelula9.setBounds(53, 254, 80, 80);
		panel_1.add(btnCelula9);
		
		JButton btnCelula10 = new JButton("10");
		btnCelula10.setIcon(new ImageIcon("Img/10.png"));
		btnCelula10.setBounds(143, 254, 80, 80);
		panel_1.add(btnCelula10);
		
		JButton btnCelula11 = new JButton("11");
		btnCelula11.setIcon(new ImageIcon("Img/11.png"));
		btnCelula11.setBounds(233, 254, 80, 80);
		panel_1.add(btnCelula11);
		
		JButton btnCelula12 = new JButton("12");
		btnCelula12.setIcon(new ImageIcon("Img/12.png"));
		btnCelula12.setBounds(323, 254, 80, 80);
		panel_1.add(btnCelula12);
		
		JButton btnCelula13 = new JButton("13");
		btnCelula13.setIcon(new ImageIcon("Img/13.png"));
		btnCelula13.setBounds(53, 345, 80, 80);
		panel_1.add(btnCelula13);
		
		JButton btnCelula14 = new JButton("14");
		btnCelula14.setIcon(new ImageIcon("Img/14.png"));
		btnCelula14.setBounds(143, 345, 80, 80);
		panel_1.add(btnCelula14);
		
		JButton btnCelula15 = new JButton("15");
		btnCelula15.setIcon(new ImageIcon("Img/15.png"));
		btnCelula15.setBounds(233, 345, 80, 80);
		panel_1.add(btnCelula15);
		
		JButton btnCelula16 = new JButton("16");
		btnCelula16.setIcon(null);
		btnCelula16.setBounds(323, 345, 80, 80);
		panel_1.add(btnCelula16);
		
		JLabel lblNewLabel = new JLabel("Jogo");
		lblNewLabel.setBounds(187, 28, 116, 14);
		panel_1.add(lblNewLabel);
		
		JButton btnPause = new JButton("Pausar");
		btnPause.setBounds(520, 72, 89, 23);
		panel_1.add(btnPause);
		
		JButton btnSave = new JButton("Salvar");
		btnSave.setBounds(520, 118, 89, 23);
		panel_1.add(btnSave);
		
		JButton btnDesistir = new JButton("Desistir");
		btnDesistir.setBounds(520, 166, 89, 23);
		panel_1.add(btnDesistir);
		
		JLabel lblNewLabel_1 = new JLabel("Jogador atual:");
		lblNewLabel_1.setBounds(492, 237, 157, 14);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, "name_202031338613200");
		
		textFieldApelido = new JTextField();
		textFieldApelido.setBounds(78, 46, 190, 20);
		panel.add(textFieldApelido);
		textFieldApelido.setColumns(10);
		
		
		JComboBox comboBoxEmbaralhamento = new JComboBox();
		comboBoxEmbaralhamento.setBounds(226, 234, 206, 22);
		comboBoxEmbaralhamento.setToolTipText("OBS: Tabuleiros criados por uma permuta\u00E7\u00E3o impar ser\u00E3o impossiveis de se resolver.");
		comboBoxEmbaralhamento.setModel(new DefaultComboBoxModel(new String[] {"Embaralhamento par", "Embaralhamento impar"}));
		panel.add(comboBoxEmbaralhamento);
		
		JComboBox comboBoxMosaico = new JComboBox();
		comboBoxMosaico.setBounds(226, 267, 206, 22);
		comboBoxMosaico.setModel(new DefaultComboBoxModel(new String[] {"Demon Slayer"}));
		comboBoxMosaico.setToolTipText("Imagem exibida pelas pe\u00E7as do quebra-cabe\u00E7a");
		panel.add(comboBoxMosaico);
		
		JButton btnJogar = new JButton("Jogar");
		btnJogar.setBounds(238, 306, 182, 23);
		btnJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(comboBoxEmbaralhamento.getModel().getSelectedItem().toString()) {
					case "Embaralhamento par":
						partida.getTabuleiro().embaralharPar();
						break;
					case "Embaralhamento impar":
						partida.getTabuleiro().embaralharImpar();
						break;
				}
				//Organizar as pecas
				//panel.setVisible(false);
				//panel_1.setVisible(true);
			}
		});
		btnJogar.setEnabled(false);
		panel.add(btnJogar);
		
		JList list = new JList();
		list.setBounds(289, 44, 356, 143);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panel.add(list);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(59, 72, 190, 23);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnCadastrar && !textFieldApelido.getText().isEmpty()) {
					jogadorCriado = (new Jogador(textFieldApelido.getText(), 0));
					
					if (partida == null || partida.getJogadores().size() == 0) {
						try {
							partida = new Partida(jogadorCriado, false);
							model.addElement(jogadorCriado.getApelido());
							list.setModel(model);
							btnJogar.setEnabled(true);
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
								model.addElement(jogadorCriado.getApelido());
								list.setModel(model);
							} catch(Exception exception) {
								if(exception.getMessage().indexOf("[SQLITE_CONSTRAINT_UNIQUE] A UNIQUE constraint failed (UNIQUE constraint failed: Jogador.apelido") != -1) {
									JOptionPane.showMessageDialog(btnCadastrar, "ESSE APELIDO JÁ SE ENCONTRA CADASTRADO.");
								} else if(exception.getMessage().indexOf("Partida possui o maximo de jogadores") != -1) {
									JOptionPane.showMessageDialog(btnCadastrar, "A PARTIDA JÁ POSSUI O MÁXIMO DE JOGADORES (3).");
								}
							}
						}
						}	
					}
				else {
					JOptionPane.showMessageDialog(btnCadastrar, "Digite um Apelido!");
				}	
			}
		});
		panel.add(btnCadastrar);
		
		Label label_1 = new Label("Tipo de embaralhamento:");
		label_1.setBounds(59, 234, 161, 22);
		label_1.setAlignment(Label.RIGHT);
		panel.add(label_1);
		
		Label label_2 = new Label("Mosaico:");
		label_2.setBounds(77, 267, 143, 22);
		label_2.setAlignment(Label.RIGHT);
		panel.add(label_2);
		
	}
}
