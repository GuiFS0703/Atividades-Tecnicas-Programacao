package br.edu.fatecpg.tecprog.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PreferenciasUsuario extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblTema, lblNotificacoes, lblVolume;
    private JComboBox<String> comboTema;
    private JCheckBox chkNotificacoes;
    private JSlider sliderVolume;
    private JTextArea txtPreferencias;
    private JButton btnSalvar;
    private Usuario usuario;

    public PreferenciasUsuario(Usuario usuario) {
        this.usuario = usuario;
        configurarJanela();
        inicializarComponentes();
        carregarConfiguracoes();
    }

    
    private void configurarJanela() {
        setTitle("Preferências do Usuário");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 350);
        contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(5, 2, 10, 10));
        setContentPane(contentPane);
        setLocationRelativeTo(null); 
    }

    private void inicializarComponentes() {
        lblTema = new JLabel("Tema:");
        lblNotificacoes = new JLabel("Notificações:");
        lblVolume = new JLabel("Volume:");
        
        comboTema = new JComboBox<>(new String[]{"Claro", "Escuro"});
        chkNotificacoes = new JCheckBox("Ativar Notificações");
        sliderVolume = new JSlider(0, 100, 50); 
        txtPreferencias = new JTextArea();
        txtPreferencias.setEditable(false);
        btnSalvar = new JButton("Salvar Preferências");

        contentPane.add(lblTema);
        contentPane.add(comboTema);
        contentPane.add(lblNotificacoes);
        contentPane.add(chkNotificacoes);
        contentPane.add(lblVolume);
        contentPane.add(sliderVolume);
        contentPane.add(new JLabel("Preferências Salvas:"));
        contentPane.add(new JScrollPane(txtPreferencias)); 
        contentPane.add(btnSalvar);

        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarPreferencias();
            }
        });
        
        comboTema.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                alterarTema();
            }
        });
    }

    private void carregarConfiguracoes() {
        comboTema.setSelectedItem(usuario.getTema());
        chkNotificacoes.setSelected(usuario.isNotificacoes());
        sliderVolume.setValue(usuario.getVolume());
    }

    private void salvarPreferencias() {
        String temaSelecionado = (String) comboTema.getSelectedItem();
        boolean notificacoesAtivadas = chkNotificacoes.isSelected();
        int volume = sliderVolume.getValue();

        usuario.setTema(temaSelecionado);
        usuario.setNotificacoes(notificacoesAtivadas);
        usuario.setVolume(volume);

        txtPreferencias.setText(usuario.getPreferencias());
    }

    private void alterarTema() {
        String temaSelecionado = (String) comboTema.getSelectedItem();
        if ("Escuro".equals(temaSelecionado)) {
            contentPane.setBackground(Color.DARK_GRAY);
            txtPreferencias.setBackground(Color.LIGHT_GRAY);
            txtPreferencias.setForeground(Color.BLACK);
        } else {
            contentPane.setBackground(Color.WHITE);
            txtPreferencias.setBackground(Color.WHITE);
            txtPreferencias.setForeground(Color.BLACK);
        }
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Claro", true, 50);

        PreferenciasUsuario frame = new PreferenciasUsuario(usuario);
        frame.setVisible(true);
    }
}
