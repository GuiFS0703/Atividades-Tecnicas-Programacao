package br.edu.fatecpg.swing.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_nome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente frame = new Cliente();
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
	public Cliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Idade");
		lblNome.setBounds(52, 51, 40, 15);
		contentPane.add(lblNome);
		
		JLabel lblNome_1 = new JLabel("Nome");
		lblNome_1.setBounds(52, 24, 40, 15);
		contentPane.add(lblNome_1);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(52, 76, 62, 15);
		contentPane.add(lblGenero);
		
		txt_nome = new JTextField();
		txt_nome.setBounds(107, 22, 114, 19);
		contentPane.add(txt_nome);
		txt_nome.setColumns(10);
		
		JSpinner s_idade = new JSpinner();
		s_idade.setBounds(106, 49, 29, 20);
		contentPane.add(s_idade);
		
		JRadioButton r_masculino = new JRadioButton("Masculino");
		r_masculino.setBounds(107, 72, 149, 23);
		contentPane.add(r_masculino);
		
		JRadioButton r_feminino = new JRadioButton("Feminino");
		r_feminino.setBounds(107, 99, 149, 23);
		contentPane.add(r_feminino);
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(r_masculino);
		grupo.add(r_feminino);
		JButton btn_enviar = new JButton("Enviar");
		btn_enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn_enviar.setBounds(104, 130, 117, 25);
		contentPane.add(btn_enviar);
	}
}
