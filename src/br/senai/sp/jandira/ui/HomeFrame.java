package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import br.senai.sp.jandira.dao.EspecialidadeDAO;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JButton;
import br.senai.sp.jandira.dao.MedicoDAO;

public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        initComponents();
        
        //icon java
        URL caminhoIcone = getClass() .getResource("/br/senai/sp/jandira/imagens/exame-medico.png");
        Image IconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(IconeTitulo);
        //
        PlanoDeSaudeDAO.getListaPlanoDeSaude();
        EspecialidadeDAO.getEspecialidades();
        MedicoDAO.getMedicos();
        initPanels();

    }
    // atributos da classe 
    JPanelPlanosDeSaude panelPlanosdeSaude;
    JPanelEspecialidades panelEspecialidades;
    JPanelMedico panelMedico;
    

    // constantes da classe
    private final int POSICAO_X = 0;
    private final int POSICAO_Y = 180;
    private final int LARGURA = 945;
    private final int ALTURA = 370;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        buttonAgenda = new javax.swing.JButton();
        buttonPlanosDeSaude = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buttonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 102, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema para Agendamento de Consultas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 20, 740, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 70, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 970, 80);

        buttonSair.setBackground(new java.awt.Color(204, 204, 255));
        buttonSair.setForeground(new java.awt.Color(51, 0, 255));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/exit32.png"))); // NOI18N
        buttonSair.setToolTipText("Sair do sistema");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(875, 100, 80, 60);

        buttonAgenda.setBackground(new java.awt.Color(204, 204, 255));
        buttonAgenda.setForeground(new java.awt.Color(51, 0, 255));
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/a.png"))); // NOI18N
        buttonAgenda.setToolTipText("Agenda");
        buttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(100, 100, 80, 60);

        buttonPlanosDeSaude.setBackground(new java.awt.Color(204, 204, 255));
        buttonPlanosDeSaude.setForeground(new java.awt.Color(51, 0, 255));
        buttonPlanosDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/plano-de-saude.png"))); // NOI18N
        buttonPlanosDeSaude.setToolTipText("Planos de saúde");
        buttonPlanosDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanosDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanosDeSaude);
        buttonPlanosDeSaude.setBounds(460, 100, 80, 60);

        buttonEspecialidades.setBackground(new java.awt.Color(204, 204, 255));
        buttonEspecialidades.setForeground(new java.awt.Color(51, 0, 255));
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/registo-medico.png"))); // NOI18N
        buttonEspecialidades.setToolTipText("Especialidades");
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(370, 100, 80, 60);

        buttonPacientes.setBackground(new java.awt.Color(204, 204, 255));
        buttonPacientes.setForeground(new java.awt.Color(51, 0, 255));
        buttonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/sick32.png"))); // NOI18N
        buttonPacientes.setToolTipText("Pacientes");
        getContentPane().add(buttonPacientes);
        buttonPacientes.setBounds(190, 100, 80, 60);

        buttonMedicos.setBackground(new java.awt.Color(204, 204, 255));
        buttonMedicos.setForeground(new java.awt.Color(51, 0, 255));
        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/equipe-medica.png"))); // NOI18N
        buttonMedicos.setToolTipText("Médicos");
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(280, 100, 80, 60);

        panelHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome.setMinimumSize(new java.awt.Dimension(945, 370));
        panelHome.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("SISACON");
        panelHome.add(jLabel3);
        jLabel3.setBounds(30, 40, 290, 50);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Sistema para Agendamento de Consultas");
        panelHome.add(jLabel4);
        jLabel4.setBounds(30, 90, 450, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Dados para Contato:");
        panelHome.add(jLabel5);
        jLabel5.setBounds(30, 160, 230, 25);

        jLabel6.setText("E-mail: clara.souza@gmail.com");
        panelHome.add(jLabel6);
        jLabel6.setBounds(30, 190, 200, 16);

        jLabel7.setText("Telefone: (11)955555-55555");
        panelHome.add(jLabel7);
        jLabel7.setBounds(30, 210, 190, 16);

        jLabel8.setText("Site: www.sisacon.com.br");
        panelHome.add(jLabel8);
        jLabel8.setBounds(30, 230, 160, 16);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(null);
        panelHome.add(jPanel2);
        jPanel2.setBounds(0, 130, 930, 10);

        getContentPane().add(panelHome);
        panelHome.setBounds(20, 180, 920, 350);

        buttonHome.setBackground(new java.awt.Color(204, 204, 255));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/home32.png"))); // NOI18N
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(10, 100, 80, 60);

        setBounds(0, 0, 976, 601);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgendaActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed

        panelHome.setVisible(true);
        panelPlanosdeSaude.setVisible(false);
        panelEspecialidades.setVisible(false);
        panelMedico.setVisible(false);

        mudarCorDoButton();
        buttonHome.setBackground(new java.awt.Color(102, 102, 255));

    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonPlanosDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanosDeSaudeActionPerformed

        panelHome.setVisible(false);
        panelPlanosdeSaude.setVisible(true);
        panelEspecialidades.setVisible(false);
        panelMedico.setVisible(false);
        

        mudarCorDoButton();
        buttonPlanosDeSaude.setBackground(new java.awt.Color(102, 102, 255));

    }//GEN-LAST:event_buttonPlanosDeSaudeActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        panelHome.setVisible(false);

        mudarCorDoButton();
        buttonEspecialidades.setBackground(new java.awt.Color(102, 102, 255));

        panelPlanosdeSaude.setVisible(false);
        panelEspecialidades.setVisible(true);
        panelMedico.setVisible(false);
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed
         panelHome.setVisible(false);
         
         mudarCorDoButton();
         buttonMedicos.setBackground(new java.awt.Color(102, 102, 255));
         
        panelMedico.setVisible(true);
        panelEspecialidades.setVisible(false);
        panelPlanosdeSaude.setVisible(false);
        
         
    }//GEN-LAST:event_buttonMedicosActionPerformed
    public void ultimoButton() {

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanosDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        panelPlanosdeSaude = new JPanelPlanosDeSaude();
        panelPlanosdeSaude.setBounds(POSICAO_X, POSICAO_Y, LARGURA, ALTURA);
        getContentPane().add(panelPlanosdeSaude);
        panelPlanosdeSaude.setVisible(false);

        panelEspecialidades = new JPanelEspecialidades();
        panelEspecialidades.setVisible(false);
        panelEspecialidades.setBounds(POSICAO_X, POSICAO_Y, LARGURA, ALTURA);
        getContentPane().add(panelEspecialidades);
        
        panelMedico = new JPanelMedico();
        panelMedico.setBounds(POSICAO_X, POSICAO_Y, LARGURA, ALTURA);
        getContentPane().add(panelMedico);
        panelMedico.setVisible(false);
    }

    private void mudarCorDoButton() {
        buttonHome.setBackground(new java.awt.Color(204, 204, 255));
        buttonPlanosDeSaude.setBackground(new java.awt.Color(204, 204, 255));
        buttonEspecialidades.setBackground(new java.awt.Color(204, 204, 255));
        buttonMedicos.setBackground(new java.awt.Color(204, 204, 255));
        buttonAgenda.setBackground(new java.awt.Color(204, 204, 255));
        buttonPacientes.setBackground(new java.awt.Color(204, 204, 255));

    }
}
