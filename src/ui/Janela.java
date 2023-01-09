package ui;

import java.awt.EventQueue;
import java.awt.Image;

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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.imageio.ImageIO;
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
	private ArrayList<JButton> cellButtons = new ArrayList<JButton>();
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
		label.setBounds(10, 44, 62, 22);
		label.setAlignment(Label.RIGHT);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, "name_202025039877300");
		panel_1.setLayout(null);
		
		JButton btnCelula4 = new JButton("4");
		btnCelula4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnCelula1 = new JButton("1");
		btnCelula1.setBounds(53, 53, 90, 90);
		panel_1.add(btnCelula1);
		
		JButton btnCelula2 = new JButton("2");
		btnCelula2.setBounds(143, 53, 90, 90);
		panel_1.add(btnCelula2);
		
		JButton btnCelula3 = new JButton("3");
		btnCelula3.setBounds(233, 53, 90, 90);
		panel_1.add(btnCelula3);
		btnCelula4.setIcon(null);
		btnCelula4.setBounds(323, 53, 90, 90);
		panel_1.add(btnCelula4);
		
		JButton btnCelula5 = new JButton("5");
		btnCelula5.setBounds(53, 144, 90, 90);
		panel_1.add(btnCelula5);
		
		JButton btnCelula6 = new JButton("6");
		btnCelula6.setBounds(143, 144, 90, 90);
		panel_1.add(btnCelula6);
		
		JButton btnCelula7 = new JButton("7");
		btnCelula7.setBounds(233, 144, 90, 90);
		panel_1.add(btnCelula7);
		
		JButton btnCelula8 = new JButton("8");
		btnCelula8.setBounds(323, 144, 90, 90);
		panel_1.add(btnCelula8);
		
		JButton btnCelula9 = new JButton("9");
		btnCelula9.setBounds(53, 235, 90, 90);
		panel_1.add(btnCelula9);
		
		JButton btnCelula10 = new JButton("10");
		btnCelula10.setBounds(143, 235, 90, 90);
		panel_1.add(btnCelula10);
		
		JButton btnCelula11 = new JButton("11");
		btnCelula11.setBounds(233, 235, 90, 90);
		panel_1.add(btnCelula11);
		
		JButton btnCelula12 = new JButton("12");
		btnCelula12.setBounds(323, 235, 90, 90);
		panel_1.add(btnCelula12);
		
		JButton btnCelula13 = new JButton("13");
		btnCelula13.setBounds(53, 326, 90, 90);
		panel_1.add(btnCelula13);
		
		JButton btnCelula14 = new JButton("14");
		btnCelula14.setBounds(143, 326, 90, 90);
		panel_1.add(btnCelula14);
		
		JButton btnCelula15 = new JButton("15");
		btnCelula15.setBounds(233, 326, 90, 90);
		panel_1.add(btnCelula15);
		
		JButton btnCelula16 = new JButton("16");
		btnCelula16.setBounds(323, 326, 90, 90);
		panel_1.add(btnCelula16);
		
		cellButtons.addAll( Arrays.asList( new JButton[]{btnCelula1, btnCelula2, btnCelula3, btnCelula4, btnCelula5, btnCelula6, btnCelula7, btnCelula8, btnCelula9, btnCelula10, btnCelula11, btnCelula12, btnCelula13, btnCelula14, btnCelula15, btnCelula16} ) );
		
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
		
		JLabel lblCurrentPlayer = new JLabel("Jogador atual:");
		lblCurrentPlayer.setBounds(492, 237, 157, 14);
		panel_1.add(lblCurrentPlayer);
		
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
		comboBoxMosaico.setModel(new DefaultComboBoxModel(new String[] {"Demon_Slayer", "Abaporu"}));
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
				partida.getTabuleiro().setImagem(comboBoxMosaico.getModel().getSelectedItem().toString());
				organizarPecas();
				panel.setVisible(false);
				panel_1.setVisible(true);
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
	
	public void organizarPecas() {
		int[] pecas = partida.getTabuleiro()
				.getPecas()
				.stream()
				.sorted((peca1, peca2) -> Integer.compare(peca1.getPosicao(), peca2.getPosicao()) )
				.mapToInt(Peca::getId)
				.toArray();
		for(int i = 0; i < pecas.length - 1; i++) {
			Image imagem;
			try 
			{
				imagem = ImageIO.read(new File(partida.getTabuleiro().getPecas().get(i).getImagem())); // eventually C:\\ImageTest\\pic2.jpg
				imagem = imagem.getScaledInstance(90, 90, imagem.SCALE_DEFAULT);
				cellButtons.get(i).setIcon( new ImageIcon(imagem) );
			} 
			catch (IOException e) 
			{
			    e.printStackTrace();
			}
			
		}		 
	}
}
