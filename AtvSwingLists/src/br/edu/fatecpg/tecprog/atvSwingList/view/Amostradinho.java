package br.edu.fatecpg.tecprog.atvSwingList.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Label;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

import br.edu.fatecpg.tecprog.atvSwingList.model.*;

public class Amostradinho extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private Empresa empresa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Amostradinho frame = new Amostradinho();
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
	public Amostradinho() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Label txtTituloCliente = new Label("Gerenciar clientes");
		txtTituloCliente.setBounds(164, 10, 107, 21);
		contentPane.add(txtTituloCliente);

		JLabel lblQtdAtual = new JLabel("Quantidade atual: ");
		lblQtdAtual.setBounds(23, 69, 113, 19);
		contentPane.add(lblQtdAtual);

		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(47, 116, 44, 12);
		contentPane.add(lblNome);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(47, 167, 44, 12);
		contentPane.add(lblEmail);

		txtNome = new JTextField();
		txtNome.setBounds(23, 138, 96, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setBounds(23, 189, 96, 19);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);

		JLabel lblMostrarClientes = new JLabel("Clientes: ");
		lblMostrarClientes.setBounds(338, 68, 65, 21);
		contentPane.add(lblMostrarClientes);

		JLabel lblCliente1 = new JLabel("nulo");
		lblCliente1.setBounds(348, 88, 78, 12);
		contentPane.add(lblCliente1);

		JLabel lblCliente5 = new JLabel("nulo");
		lblCliente5.setBounds(348, 141, 78, 12);
		contentPane.add(lblCliente5);

		JLabel lblCliente3 = new JLabel("nulo");
		lblCliente3.setBounds(348, 116, 78, 12);
		contentPane.add(lblCliente3);

		JLabel lblCliente4 = new JLabel("nulo");
		lblCliente4.setBounds(348, 128, 78, 12);
		contentPane.add(lblCliente4);

		JLabel lblCliente2 = new JLabel("nulo");
		lblCliente2.setBounds(348, 100, 78, 12);
		contentPane.add(lblCliente2);

		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(23, 233, 96, 20);
		contentPane.add(btnAdicionar);

		JLabel lblCliente6 = new JLabel("nulo");
		lblCliente6.setBounds(348, 155, 78, 12);
		contentPane.add(lblCliente6);

		JLabel lblCliente7 = new JLabel("nulo");
		lblCliente7.setBounds(348, 167, 78, 12);
		contentPane.add(lblCliente7);

		JLabel lblCliente8 = new JLabel("nulo");
		lblCliente8.setBounds(348, 179, 78, 12);
		contentPane.add(lblCliente8);

		JLabel lblCliente10 = new JLabel("nulo");
		lblCliente10.setBounds(348, 207, 78, 12);
		contentPane.add(lblCliente10);

		JLabel lblCliente9 = new JLabel("nulo");
		lblCliente9.setBounds(348, 192, 78, 12);
		contentPane.add(lblCliente9);

		JLabel[] lblClientes = { lblCliente1, lblCliente2, lblCliente3, lblCliente4, lblCliente5, lblCliente6,
				lblCliente7, lblCliente8, lblCliente9, lblCliente10 };
		this.empresa = new Empresa();
		this.exibirClientes(lblClientes);

		btnAdicionar.addActionListener(e -> {
			String nome = txtNome.getText();
			String email = txtEmail.getText();
			if (nome != null && email != null && !nome.trim().isEmpty() && !email.trim().isEmpty()) {
				boolean resposta = empresa.addCliente(nome, email);
				if (resposta == false) {
					JOptionPane.showMessageDialog(this, "Limite de clientes alcançados ou parâmetros inválidos!");
				} else {
					JOptionPane.showMessageDialog(this, "Cliente adicionado com sucesso!!!");
					this.exibirClientes(lblClientes);
				}
			} else {
				JOptionPane.showMessageDialog(this, "Valores inseridos são inválidos!");
			}
		});

	}

	public void exibirClientes(JLabel[] lblClientes) {
		List<Cliente> Clientes = new ArrayList<>();
		Clientes = empresa.exibirClientes();
		int i = 0;
		for (Cliente c : Clientes) {
			lblClientes[i].setText(c.getNome());
			i++;
		}

	}
}
