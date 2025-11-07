package br.edu.fatecpg.swing.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Media extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_n1;
	private JTextField txt_n2;
	private JTextField txt_n3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Media frame = new Media();
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
	public Media() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_n1 = new JTextField();
		txt_n1.setBounds(150, 21, 114, 19);
		contentPane.add(txt_n1);
		txt_n1.setColumns(10);
		
		txt_n2 = new JTextField();
		txt_n2.setBounds(150, 52, 114, 19);
		contentPane.add(txt_n2);
		txt_n2.setColumns(10);
		
		txt_n3 = new JTextField();
		txt_n3.setBounds(150, 83, 114, 19);
		contentPane.add(txt_n3);
		txt_n3.setColumns(10);
		
		
		JLabel lblNewLabel = new JLabel("1º Nota");
		lblNewLabel.setBounds(86, 23, 59, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNumero = new JLabel("2º Nota");
		lblNumero.setBounds(86, 54, 59, 15);
		contentPane.add(lblNumero);
		
		JLabel lblNewLabel_1_1 = new JLabel("3º Nota");
		lblNewLabel_1_1.setBounds(86, 85, 59, 15);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lbl_resultado = new JLabel("Valor da media:");
		lbl_resultado.setBounds(153, 166, 188, 15);
		contentPane.add(lbl_resultado);
		
		JButton btn_calcular = new JButton("Calcular Media");
		btn_calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double prova = Double.parseDouble(txt_n1.getText());
			double trabalho = Double.parseDouble(txt_n2.getText());
			double apres = Double.parseDouble(txt_n3.getText());
			double media = Math.round((prova+trabalho+apres)/3);
			lbl_resultado.setText(lbl_resultado.getText() + " " + media);
			if(media>=6) {
				JOptionPane.showMessageDialog(btn_calcular, "Aprovado");
			}else {
				JOptionPane.showMessageDialog(btn_calcular, "Reprovado");
				}
			}
		});
		
		btn_calcular.setBounds(124, 129, 163, 25);
		contentPane.add(btn_calcular);
	}

}
