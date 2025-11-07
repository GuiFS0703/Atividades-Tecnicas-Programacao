package br.edu.fatecpg.swing.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

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
					Frame frame = new Frame();
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
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_Saudacao = new JLabel("Salve Praneta");
		lbl_Saudacao.setBounds(160, 144, 117, 25);
		contentPane.add(lbl_Saudacao);
		
		JButton btn_enviar = new JButton("Enviar ");
		btn_enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txt_nome.getText();
				lbl_Saudacao.setText("Salve " + nome);
			}
		});
		btn_enviar.setBounds(160, 108, 117, 25);
		contentPane.add(btn_enviar);
		
		txt_nome = new JTextField();
		txt_nome.setBounds(163, 77, 114, 19);
		contentPane.add(txt_nome);
		txt_nome.setColumns(10);
		
}
	}
