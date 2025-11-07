package br.edu.fatecpg.tecprog.swing;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class Cliente extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public Cliente(String nome, String idade, String sexoSelecionado) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Seja Bem-Vindo, " + nome + "!");
        lblNewLabel.setBounds(159, 12, 200, 15);
        contentPane.add(lblNewLabel);
        
        JLabel lbl_mostrarinfos = new JLabel("Idade: " + idade + " | Sexo: " + sexoSelecionado);
        lbl_mostrarinfos.setBounds(50, 80, 350, 15);
        contentPane.add(lbl_mostrarinfos);
    }
}
