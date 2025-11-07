package br.edu.fatecpg.tecprog.swing;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.awt.event.ActionEvent;

public class FormulariodeCadastro extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private final JLabel lblNewLabel = new JLabel("Nome");
    private JTextField nm_usuario;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FormulariodeCadastro frame = new FormulariodeCadastro();
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
    public FormulariodeCadastro() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        lblNewLabel.setBounds(45, 12, 70, 15);
        contentPane.add(lblNewLabel);
        
        JLabel lblIdade = new JLabel("Idade");
        lblIdade.setBounds(45, 39, 40, 15);
        contentPane.add(lblIdade);
        
        JLabel lblNewLabel_1_1 = new JLabel("Sexo");
        lblNewLabel_1_1.setBounds(45, 66, 70, 15);
        contentPane.add(lblNewLabel_1_1);
        
        nm_usuario = new JTextField();
        nm_usuario.setBounds(94, 10, 114, 19);
        contentPane.add(nm_usuario);
        nm_usuario.setColumns(10);
        
        SpinnerNumberModel model = new SpinnerNumberModel(0, 0, 120, 1);
        
        JSpinner selecionar_idade = new JSpinner(model);
        selecionar_idade.setBounds(94, 39, 40, 20);
        contentPane.add(selecionar_idade);
        
        JRadioButton rd_masculino = new JRadioButton("Masculino");
        rd_masculino.setBounds(90, 62, 149, 23);
        contentPane.add(rd_masculino);
        
        JRadioButton rd_feminino = new JRadioButton("Feminino");
        rd_feminino.setBounds(90, 89, 149, 23);
        contentPane.add(rd_feminino);
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rd_masculino);
        grupo.add(rd_feminino);
        
        JLabel lbl_mostrar_1 = new JLabel("New label");
        lbl_mostrar_1.setBounds(50, 169, 388, 31);
        contentPane.add(lbl_mostrar_1);
        
        JButton btnEnviar = new JButton("Enviar");
        btnEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String sexoSelecionado = "";
                String nome = nm_usuario.getText();
                Object idade = selecionar_idade.getValue();
                
                if (rd_masculino.isSelected()) {
                    sexoSelecionado = rd_masculino.getText();
                } else if (rd_feminino.isSelected()) {
                    sexoSelecionado = rd_feminino.getText();
                }
                
                if (nome.isEmpty() || idade.equals(0) || sexoSelecionado.isEmpty()) {
                    lbl_mostrar_1.setText("PREENCHA TODOS OS CAMPOS!!!!");
                } else {
                   
                    Cliente cliente = new Cliente(nome, idade.toString(), sexoSelecionado);
                    cliente.setVisible(true);
                    dispose();
                }
            }
        });
        btnEnviar.setBounds(145, 132, 117, 25);
        contentPane.add(btnEnviar);
        
    }
}
