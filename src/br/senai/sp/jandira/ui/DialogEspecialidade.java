
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.TipoOperacao;
import br.senai.sp.jandira.dao.EspecialidadeDAO;
import javax.swing.JOptionPane;

public class DialogEspecialidade extends javax.swing.JDialog {
    
    private TipoOperacao tipoOperacao;
    private Especialidade especialidade;
    
    public DialogEspecialidade(java.awt.Frame parent, boolean modal,
            TipoOperacao tipoOperacao,
            Especialidade especialidade) {
        
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.especialidade = especialidade;
        
      // Preencher os campos, caso o tipo de peracao for ALTERAR
      if (tipoOperacao == tipoOperacao.ALTERAR){
         preencherFormulario();
      }     
    }

    private void preencherFormulario(){
        labelTitulo.setText("Especialidade -" + tipoOperacao);
        labelicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit.png")));
        TextFieldCodigo.setText(especialidade.getCodigo().toString());
        TextFieldNomeDaEspecialidade.setText(especialidade.getNome());
        TextFieldDescricao.setText(especialidade.getDescricao());
    }
         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelicon = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelDetalhesDaEspecialidade = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        TextFieldCodigo = new javax.swing.JTextField();
        labelNomeDaEspecialidade = new javax.swing.JLabel();
        TextFieldNomeDaEspecialidade = new javax.swing.JTextField();
        labelDescricao = new javax.swing.JLabel();
        TextFieldDescricao = new javax.swing.JTextField();
        ButtonSalvar = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(null);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(526, 28, 0, 0);

        labelicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add32.png"))); // NOI18N
        jPanel1.add(labelicon);
        labelicon.setBounds(21, 27, 32, 32);

        labelTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Especialidades - ADICIONAR");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(71, 28, 449, 26);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 80);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        labelDetalhesDaEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDetalhesDaEspecialidade.setText("Detalhes da Especialidade");
        jPanel2.add(labelDetalhesDaEspecialidade);
        labelDetalhesDaEspecialidade.setBounds(23, 17, 141, 16);

        labelCodigo.setText("Código:");
        jPanel2.add(labelCodigo);
        labelCodigo.setBounds(8, 73, 42, 16);

        TextFieldCodigo.setEditable(false);
        TextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(TextFieldCodigo);
        TextFieldCodigo.setBounds(8, 95, 57, 30);

        labelNomeDaEspecialidade.setText("Nome da Especialidade:");
        jPanel2.add(labelNomeDaEspecialidade);
        labelNomeDaEspecialidade.setBounds(8, 135, 210, 16);
        jPanel2.add(TextFieldNomeDaEspecialidade);
        TextFieldNomeDaEspecialidade.setBounds(8, 157, 210, 22);

        labelDescricao.setText("Descrição:");
        jPanel2.add(labelDescricao);
        labelDescricao.setBounds(8, 191, 210, 16);
        jPanel2.add(TextFieldDescricao);
        TextFieldDescricao.setBounds(8, 213, 210, 22);

        ButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salvar.png"))); // NOI18N
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonSalvar);
        ButtonSalvar.setBounds(441, 263, 83, 53);

        ButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar.png"))); // NOI18N
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonCancelar);
        ButtonCancelar.setBounds(542, 263, 79, 53);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 90, 650, 340);

        setBounds(0, 0, 702, 498);
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCodigoActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        
        if(tipoOperacao == tipoOperacao.ADCIONAR){
            gravar();
        }else{
            atualizar();
        }
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void atualizar(){
        especialidade.setNome(TextFieldNomeDaEspecialidade.getText());
        especialidade.setDescricao(TextFieldDescricao.getText());
        
        if(validarCadastro()){
            EspecialidadeDAO.atualizar(especialidade);
            JOptionPane.showMessageDialog(this, "Especialidade Gravada com Sucesso!!", "Especialidade", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }
    
    private void gravar(){
        //criar um objeto especialidade
        Especialidade especialidade = new Especialidade();
        especialidade.setNome(TextFieldNomeDaEspecialidade.getText());
        especialidade.setDescricao(TextFieldDescricao.getText());
        
         if (validarCadastro()){
            EspecialidadeDAO.gravar(especialidade);
            dispose();
        }
    }
    private boolean validarCadastro(){
        if(TextFieldNomeDaEspecialidade.getText().isEmpty()){    
            JOptionPane.showMessageDialog(this, "Por favor preencha o nome da Especialidade!", "Especilidade", JOptionPane.ERROR_MESSAGE);
        
            TextFieldNomeDaEspecialidade.requestFocus();
            return false;
        }
          
       if (TextFieldDescricao.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor preencha a Descrição! ", "Especialidade", JOptionPane.ERROR_MESSAGE);
          
            TextFieldDescricao.requestFocus();
            return false;
           
       }
        return true;
     
    }
 
    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed

        dispose();

    }//GEN-LAST:event_ButtonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JTextField TextFieldCodigo;
    private javax.swing.JTextField TextFieldDescricao;
    private javax.swing.JTextField TextFieldNomeDaEspecialidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelDetalhesDaEspecialidade;
    private javax.swing.JLabel labelNomeDaEspecialidade;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelicon;
    // End of variables declaration//GEN-END:variables

}
