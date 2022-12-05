package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import br.senai.sp.jandira.dao.EspecialidadeDAO;
import java.util.List;
import javax.swing.ListModel;

public class DialogMedico extends javax.swing.JDialog {

     private TipoOperacao tipoOperacao;
    private Medico medico;
    private EspecialidadeDAO especialidadeDao;

    private DefaultListModel<String> listaEspecialidades = new DefaultListModel<>();
    private ArrayList<String> especialidades = new ArrayList<>();
    private ArrayList<Especialidade> especialidadesParaAdicionar = EspecialidadeDAO.listarTodos();

    private DefaultListModel<String> listaEspecialidadesMedico = new DefaultListModel<>();
    private ArrayList<String> nomesEspecialidadesMedico = new ArrayList<>();
    private ArrayList<Especialidade> especialidadesAdicionadasAoMedico = new ArrayList<>();

    int linha;

    public DialogMedico(
            java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            Medico medico
    ) {
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.medico = medico;
        atualizarListaEspecialidades();

        if (tipoOperacao == tipoOperacao.ALTERAR) {
            preencherFormulario();
        }

    }

    private void preencherFormulario() {
        TextFieldCodigo.setText(medico.getCodigo().toString());
        TextFieldCRM.setText(medico.getCrm());
        TextFieldNomeDoMedico.setText(medico.getNome());
        TextFieldTelefone.setText(medico.getTelefone());
        TextFieldEmail.setText(medico.getEmail());
        TextFieldDataDeNascimento.setText(medico.getDataNascimento());
        atualizarListaEspecialidades();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollbar1 = new java.awt.Scrollbar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelIconM = new javax.swing.JLabel();
        labelTituloM = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        TextFieldCodigo = new javax.swing.JTextField();
        labelNomeDoMedico = new javax.swing.JLabel();
        TextFieldNomeDoMedico = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        TextFieldDataDeNascimento = new javax.swing.JTextField();
        LabelCRM = new javax.swing.JLabel();
        LabelEmail = new javax.swing.JLabel();
        TextFieldEmail = new javax.swing.JTextField();
        jLabelDataDeNascimento = new javax.swing.JLabel();
        TextFieldCRM = new javax.swing.JTextField();
        jLabelListaDeEspecialidades = new javax.swing.JLabel();
        jLabelEspecialidadesDosMedicos = new javax.swing.JLabel();
        TextFieldTelefone = new javax.swing.JTextField();
        labelDetalhesDoMedico = new javax.swing.JLabel();
        buttonRemoverEspecialidadeListaMedico = new java.awt.Button();
        buttonAdicionarEspecialidadeListaMedico = new java.awt.Button();
        ButtonCancelar = new javax.swing.JButton();
        ButtonSalvar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listEspecialidadesMedico = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listEspecialidades = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(686, 500));
        setMinimumSize(new java.awt.Dimension(686, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(null);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(526, 28, 0, 0);

        labelIconM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add32.png"))); // NOI18N
        jPanel1.add(labelIconM);
        labelIconM.setBounds(21, 27, 32, 32);

        labelTituloM.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        labelTituloM.setForeground(new java.awt.Color(255, 255, 255));
        labelTituloM.setText("Médico - ADICIONAR");
        jPanel1.add(labelTituloM);
        labelTituloM.setBounds(71, 28, 449, 26);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 80);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        labelCodigo.setText("Código:");
        jPanel2.add(labelCodigo);
        labelCodigo.setBounds(10, 30, 80, 16);

        TextFieldCodigo.setEditable(false);
        TextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(TextFieldCodigo);
        TextFieldCodigo.setBounds(10, 50, 57, 30);

        labelNomeDoMedico.setText("Nome do(a) Médico(a):");
        jPanel2.add(labelNomeDoMedico);
        labelNomeDoMedico.setBounds(170, 30, 210, 16);

        TextFieldNomeDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNomeDoMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(TextFieldNomeDoMedico);
        TextFieldNomeDoMedico.setBounds(170, 60, 210, 22);

        labelTelefone.setText("Telefone:");
        jPanel2.add(labelTelefone);
        labelTelefone.setBounds(10, 100, 60, 20);

        TextFieldDataDeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldDataDeNascimentoActionPerformed(evt);
            }
        });
        jPanel2.add(TextFieldDataDeNascimento);
        TextFieldDataDeNascimento.setBounds(430, 120, 150, 22);

        LabelCRM.setText("CRM:");
        jPanel2.add(LabelCRM);
        LabelCRM.setBounds(90, 30, 37, 16);

        LabelEmail.setText("E-mail:");
        jPanel2.add(LabelEmail);
        LabelEmail.setBounds(140, 100, 120, 16);

        TextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldEmailActionPerformed(evt);
            }
        });
        jPanel2.add(TextFieldEmail);
        TextFieldEmail.setBounds(140, 120, 270, 22);

        jLabelDataDeNascimento.setText("Data De Nascimento:");
        jPanel2.add(jLabelDataDeNascimento);
        jLabelDataDeNascimento.setBounds(430, 100, 120, 20);

        TextFieldCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCRMActionPerformed(evt);
            }
        });
        jPanel2.add(TextFieldCRM);
        TextFieldCRM.setBounds(80, 60, 80, 22);

        jLabelListaDeEspecialidades.setText("Lista de especialidades:");
        jPanel2.add(jLabelListaDeEspecialidades);
        jLabelListaDeEspecialidades.setBounds(10, 170, 160, 16);

        jLabelEspecialidadesDosMedicos.setText("Especialidades dos médicos:");
        jPanel2.add(jLabelEspecialidadesDosMedicos);
        jLabelEspecialidadesDosMedicos.setBounds(230, 170, 220, 16);

        TextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(TextFieldTelefone);
        TextFieldTelefone.setBounds(10, 120, 120, 22);

        labelDetalhesDoMedico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDetalhesDoMedico.setText("Detalhes do Médico(a):");
        jPanel2.add(labelDetalhesDoMedico);
        labelDetalhesDoMedico.setBounds(0, 0, 170, 16);

        buttonRemoverEspecialidadeListaMedico.setBackground(new java.awt.Color(204, 204, 255));
        buttonRemoverEspecialidadeListaMedico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonRemoverEspecialidadeListaMedico.setName(">>>>>"); // NOI18N
        buttonRemoverEspecialidadeListaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverEspecialidadeListaMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(buttonRemoverEspecialidadeListaMedico);
        buttonRemoverEspecialidadeListaMedico.setBounds(170, 280, 30, 24);
        buttonRemoverEspecialidadeListaMedico.getAccessibleContext().setAccessibleDescription(">>>>");

        buttonAdicionarEspecialidadeListaMedico.setBackground(new java.awt.Color(102, 102, 255));
        buttonAdicionarEspecialidadeListaMedico.setName(""); // NOI18N
        buttonAdicionarEspecialidadeListaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarEspecialidadeListaMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(buttonAdicionarEspecialidadeListaMedico);
        buttonAdicionarEspecialidadeListaMedico.setBounds(170, 230, 30, 24);
        buttonAdicionarEspecialidadeListaMedico.getAccessibleContext().setAccessibleDescription("<<<");

        ButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar.png"))); // NOI18N
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonCancelar);
        ButtonCancelar.setBounds(490, 310, 79, 53);

        ButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salvar.png"))); // NOI18N
        ButtonSalvar.setDoubleBuffered(true);
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonSalvar);
        ButtonSalvar.setBounds(580, 310, 83, 53);

        listEspecialidadesMedico.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listEspecialidadesMedico);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(230, 190, 140, 170);

        listEspecialidades.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(listEspecialidades);

        jPanel2.add(jScrollPane4);
        jScrollPane4.setBounds(10, 190, 140, 170);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 90, 680, 370);

        setBounds(0, 0, 716, 508);
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCodigoActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        if (tipoOperacao == tipoOperacao.ADCIONAR) {
            gravar();
        } else {
            atualizar();
        }
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void atualizar() {
        medico.setNome(TextFieldNomeDoMedico.getText());
        medico.setCrm(TextFieldCRM.getText());
        medico.setTelefone(TextFieldTelefone.getText());
        medico.setEmail(TextFieldEmail.getText());
        medico.setDataNascimento(TextFieldDataDeNascimento.getText());
        medico.setEspecialidades(especialidadesAdicionadasAoMedico);
        MedicoDAO.atualizar(medico);

        if (validarCadastro()) {
            MedicoDAO.atualizar(medico);

            JOptionPane.showMessageDialog(null, "Médico atualizado com sucesso", "Médico", JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
    }

    private void gravar() {
        Medico medico = new Medico();
        medico.setCrm(TextFieldCRM.getText());
        medico.setNome(TextFieldNomeDoMedico.getText());
        medico.setTelefone(TextFieldTelefone.getText());
        medico.setEmail(TextFieldEmail.getText());
        medico.setDataNascimento(TextFieldDataDeNascimento.getText());
        medico.setEspecialidades(especialidadesAdicionadasAoMedico);
        MedicoDAO.atualizar(medico);

        if (validarCadastro()) {
            MedicoDAO.gravar(medico);
            try {
            medico.setDataNascimento(TextFieldDataDeNascimento.getText());
            } catch(Exception exception) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha a data de nascimento do Médico!", "Médico", JOptionPane.ERROR_MESSAGE);
            TextFieldDataDeNascimento.requestFocus();
            }
            JOptionPane.showMessageDialog(this, "Médico gravado com sucesso", "Médico", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

   private boolean validarCadastro() {
        
        System.out.println(TextFieldDataDeNascimento.getText().length());

        if (TextFieldCRM.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o CRM do Médico!", "Médico", JOptionPane.ERROR_MESSAGE);
            TextFieldCRM.requestFocus();
            return false;
        }
        if (TextFieldNomeDoMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o nome do Médico!", "Médico", JOptionPane.ERROR_MESSAGE);
            TextFieldNomeDoMedico.requestFocus();
            return false;
        }
        if (TextFieldTelefone.getText().equals("(  )     -    ") == true) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o telefone do Médico!", "Médico", JOptionPane.ERROR_MESSAGE);
            TextFieldTelefone.requestFocus();
            return false;
        }
        if (TextFieldEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o E-mail do Médico!", "Médico", JOptionPane.ERROR_MESSAGE);
            TextFieldEmail.requestFocus();
            return false;
        }
        if (TextFieldDataDeNascimento.getText().equals("##/##/####") == true) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha a data de nascimento do Médico!", "Médico", JOptionPane.ERROR_MESSAGE);
            TextFieldDataDeNascimento.requestFocus();
            return false;
        }
        return true;
    }
    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed

        dispose();

    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void TextFieldNomeDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNomeDoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNomeDoMedicoActionPerformed

    private void TextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldEmailActionPerformed

    private void TextFieldCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCRMActionPerformed

    private void TextFieldDataDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldDataDeNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldDataDeNascimentoActionPerformed

    private void buttonAdicionarEspecialidadeListaMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspecialidadeListaMedicoActionPerformed
        List<String> especialidadesMedico = listEspecialidades.getSelectedValuesList();

        for (String especialidade : especialidadesMedico) {
            nomesEspecialidadesMedico.add(especialidade);
        }

        for (Especialidade especialidade : especialidadesParaAdicionar) {
            if (especialidadesMedico.contains(especialidade.getNome())) {
                especialidadesAdicionadasAoMedico.add(especialidade);
            }
        }

        listaEspecialidadesMedico.clear();
        listaEspecialidadesMedico.addAll(nomesEspecialidadesMedico);
        listEspecialidadesMedico.setModel(listaEspecialidadesMedico);

        int[] excluir = listEspecialidades.getSelectedIndices();
        for (int index : excluir) {
            listaEspecialidades.remove(index);
            especialidades.remove(index);
        }
    }//GEN-LAST:event_buttonAdicionarEspecialidadeListaMedicoActionPerformed

    private void buttonRemoverEspecialidadeListaMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverEspecialidadeListaMedicoActionPerformed
        List<String> especialidadesParaRemover = listEspecialidadesMedico.getSelectedValuesList();

        for (String especialidade : especialidadesParaRemover) {
            especialidades.add(especialidade);
        }
        for (Especialidade especialidade : especialidadesParaAdicionar) {
            if (especialidadesParaRemover.contains(especialidade.getNome())) {
                especialidadesAdicionadasAoMedico.remove(especialidade);
            }
        }

        listaEspecialidades.clear();
        listaEspecialidades.addAll(especialidades);
        listEspecialidades.setModel(listaEspecialidades);

        int[] excluir = listEspecialidadesMedico.getSelectedIndices();
        for (int index : excluir) {
            listaEspecialidadesMedico.remove(index);
            nomesEspecialidadesMedico.remove(index);
        }
    }//GEN-LAST:event_buttonRemoverEspecialidadeListaMedicoActionPerformed


    private void TextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldTelefoneActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JLabel LabelCRM;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JTextField TextFieldCRM;
    private javax.swing.JTextField TextFieldCodigo;
    private javax.swing.JTextField TextFieldDataDeNascimento;
    private javax.swing.JTextField TextFieldEmail;
    private javax.swing.JTextField TextFieldNomeDoMedico;
    private javax.swing.JTextField TextFieldTelefone;
    private java.awt.Button buttonAdicionarEspecialidadeListaMedico;
    private java.awt.Button buttonRemoverEspecialidadeListaMedico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDataDeNascimento;
    private javax.swing.JLabel jLabelEspecialidadesDosMedicos;
    private javax.swing.JLabel jLabelListaDeEspecialidades;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDetalhesDoMedico;
    private javax.swing.JLabel labelIconM;
    private javax.swing.JLabel labelNomeDoMedico;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTituloM;
    private javax.swing.JList<String> listEspecialidades;
    private javax.swing.JList<String> listEspecialidadesMedico;
    private java.awt.Scrollbar scrollbar1;
    // End of variables declaration//GEN-END:variables

    private void atualizarListaEspecialidades() {
        adicionarNomesListEspecialidades();

        if (tipoOperacao == TipoOperacao.ALTERAR) {
            preencherLists();
        }

    }

    private void adicionarNomesListEspecialidades() {
        especialidades = EspecialidadeDAO.getNomesEspecialidades();
        listaEspecialidades.addAll(especialidades);
        listEspecialidades.setModel(listaEspecialidades);
    }

    public void preencherLists() {
        especialidadesAdicionadasAoMedico = medico.getEspecialidades();
        nomesEspecialidadesMedico = medico.getEspecialidadesMedico();
        listaEspecialidadesMedico.clear();
        listaEspecialidadesMedico.addAll(nomesEspecialidadesMedico);
        listEspecialidadesMedico.setModel(listaEspecialidadesMedico);

        int i = 0;
        for (String especialidade : nomesEspecialidadesMedico) {
            if (especialidades.contains(especialidade)) {
                especialidades.remove(especialidade);
            }
        }
        listaEspecialidades.clear();
        listaEspecialidades.addAll(especialidades);
    }
}
