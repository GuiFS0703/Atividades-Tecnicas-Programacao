package br.edu.fatecpg.tecprog.atvSwingList.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import br.edu.fatecpg.tecprog.atvSwingList.model.*;
import javax.swing.JOptionPane;

public class Gerenciarfuncionarios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSalario;
	private Empresa empresa;
	private JTextField txtCargo;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gerenciarfuncionarios frame = new Gerenciarfuncionarios();
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
	public Gerenciarfuncionarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAddFuncionario = new JLabel("Adicionar funcionario:");
		lblAddFuncionario.setBounds(29, 53, 105, 13);
		contentPane.add(lblAddFuncionario);

		JLabel lblTitulo = new JLabel("Gerenciador de funcionarios");
		lblTitulo.setBounds(154, 10, 128, 13);
		contentPane.add(lblTitulo);

		JLabel lblFuncAtivos = new JLabel("Funcionarios ativos: ");
		lblFuncAtivos.setBounds(307, 53, 103, 12);
		contentPane.add(lblFuncAtivos);

		txtNome = new JTextField();
		txtNome.setToolTipText("");
		txtNome.setBounds(29, 89, 96, 18);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtSalario = new JTextField();
		txtSalario.setBounds(29, 127, 96, 18);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);

		txtCargo = new JTextField();
		txtCargo.setBounds(29, 161, 96, 18);
		contentPane.add(txtCargo);
		txtCargo.setColumns(10);

		txtNome.putClientProperty("JTextField.placeholderText", "Digite o nome");
		txtSalario.putClientProperty("JTextField.placeholderText", "Digite o salário");
		txtCargo.putClientProperty("JTextField.placeholderText", "Digite o cargo");

		JLabel lblFuncionario1 = new JLabel("Nulo");
		lblFuncionario1.setBounds(332, 75, 75, 12);
		contentPane.add(lblFuncionario1);

		JLabel lblFuncionario2 = new JLabel("Nulo");
		lblFuncionario2.setBounds(332, 92, 78, 12);
		contentPane.add(lblFuncionario2);

		JLabel lblFuncionario3 = new JLabel("Nulo");
		lblFuncionario3.setBounds(332, 110, 78, 12);
		contentPane.add(lblFuncionario3);

		JLabel lblFuncionario4 = new JLabel("Nulo");
		lblFuncionario4.setBounds(332, 127, 75, 12);
		contentPane.add(lblFuncionario4);

		JLabel lblFuncionario5 = new JLabel("Nulo");
		lblFuncionario5.setBounds(332, 146, 75, 12);
		contentPane.add(lblFuncionario5);

		JLabel lblFuncionario6 = new JLabel("Nulo");
		lblFuncionario6.setBounds(332, 164, 78, 13);
		contentPane.add(lblFuncionario6);

		JLabel lblFuncionario7 = new JLabel("Nulo");
		lblFuncionario7.setBounds(332, 185, 75, 12);
		contentPane.add(lblFuncionario7);

		JLabel lblFuncionario8 = new JLabel("Nulo");
		lblFuncionario8.setBounds(332, 204, 75, 12);
		contentPane.add(lblFuncionario8);

		JLabel lblFuncionario9 = new JLabel("Nulo");
		lblFuncionario9.setBounds(332, 222, 78, 12);
		contentPane.add(lblFuncionario9);

		JLabel lblFuncionario10 = new JLabel("Nulo");
		lblFuncionario10.setBounds(332, 241, 75, 12);
		contentPane.add(lblFuncionario10);

		this.empresa = new Empresa();
		JLabel[] LblFuncionarios = { lblFuncionario1, lblFuncionario2, lblFuncionario3, lblFuncionario4,
				lblFuncionario5, lblFuncionario6, lblFuncionario7, lblFuncionario8, lblFuncionario9, lblFuncionario10 };

		JButton btnCriar = new JButton("Adicionar");
		btnCriar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            String nome = txtNome.getText();
		            String cargo = txtCargo.getText();
		            String salarioTexto = txtSalario.getText().trim().replace(",", ".");
		            
		            double salario = Double.parseDouble(salarioTexto);
		            
		            if (nome != null && !nome.trim().isEmpty() && cargo != null && !cargo.trim().isEmpty()
		                    && salario > 0) {
		                boolean resp = empresa.addFuncionario(nome, cargo, salario);
		                if (resp == true) {
		                    JOptionPane.showMessageDialog(null, "Usuario adicionado com sucesso!");
		                    txtNome.setText("");
		                    txtCargo.setText("");
		                    txtSalario.setText("");
		                    exibirClientes(LblFuncionarios);
		                } else {
		                    JOptionPane.showMessageDialog(null, "Limite de funcionários excedido! O máximo é 10!");
		                }
		            } else {
		                JOptionPane.showMessageDialog(null, "Valores inseridos são inválidos!");
		            }
		        } catch (NumberFormatException error) {
		            JOptionPane.showMessageDialog(null, "Digite um número válido para o salário!");
		        }
		    }
		});
		btnCriar.setBounds(41, 200, 75, 20);
		contentPane.add(btnCriar);
	}

	public void exibirClientes(JLabel[] LblFuncionarios) {
		List<Funcionario> Funcionarios = new ArrayList<>();
		Funcionarios = empresa.exibirFuncionario();
		int i = 0;
		for (Funcionario f : Funcionarios) {
			LblFuncionarios[i].setText(f.getNome());
			i++;
		}
	}
	
}
