
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;

public class DialogPlanosDeSaude extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private PlanoDeSaude planoDeSaude;

    public DialogPlanosDeSaude(java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            PlanoDeSaude planoDeSaude) {
        
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.planoDeSaude = planoDeSaude;
        
        // Preencher os campos, caso o tipo de peracao for ALTERAR
        if (tipoOperacao == tipoOperacao.ALTERAR){
            preencherFormulario();
        }
    }
    private void preencherFormulario(){
        labelTitulo.setText("Planos de saúde -" + tipoOperacao);
         jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit.png")));
        TextFieldCodigo.setText(planoDeSaude.getCodigo().toString());
        TextFieldNomeDaOperadora.setText(planoDeSaude.getOperadora());
        TextFieldTipoDoPlano.setText(planoDeSaude.getTipoDoPlano());
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelDetalhesDoPlanoDeSaude = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        TextFieldCodigo = new javax.swing.JTextField();
        labelNomeDaOperadora = new javax.swing.JLabel();
        TextFieldNomeDaOperadora = new javax.swing.JTextField();
        labelTipoDePlano = new javax.swing.JLabel();
        TextFieldTipoDoPlano = new javax.swing.JTextField();
        ButtonSalvar = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(null);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(526, 28, 0, 0);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add32.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(21, 27, 32, 32);

        labelTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Planos de Saúde - ADICIONAR");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(71, 28, 449, 26);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 80);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        labelDetalhesDoPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDetalhesDoPlanoDeSaude.setText("Detalhes do plano de Saúde");
        jPanel2.add(labelDetalhesDoPlanoDeSaude);
        labelDetalhesDoPlanoDeSaude.setBounds(23, 17, 153, 16);

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

        labelNomeDaOperadora.setText("Nome da Operadora:");
        jPanel2.add(labelNomeDaOperadora);
        labelNomeDaOperadora.setBounds(8, 135, 210, 16);
        jPanel2.add(TextFieldNomeDaOperadora);
        TextFieldNomeDaOperadora.setBounds(8, 157, 210, 22);

        labelTipoDePlano.setText("Tipo de plano:");
        jPanel2.add(labelTipoDePlano);
        labelTipoDePlano.setBounds(8, 191, 210, 16);
        jPanel2.add(TextFieldTipoDoPlano);
        TextFieldTipoDoPlano.setBounds(8, 213, 210, 22);

        ButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salvar.png"))); // NOI18N
        ButtonSalvar.setDoubleBuffered(true);
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
        jPanel2.setBounds(20, 110, 650, 340);

        getAccessibleContext().setAccessibleParent(this);

        setBounds(0, 0, 702, 498);
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCodigoActionPerformed

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
            
        dispose();
        
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
      
        if(tipoOperacao == tipoOperacao.ADCIONAR){
            gravar();
        } else { 
            atualizar();
        } 
    }//GEN-LAST:event_ButtonSalvarActionPerformed
     private void atualizar(){
      planoDeSaude.setOperadora(TextFieldNomeDaOperadora.getText());
      planoDeSaude.setTipoDoPlano(TextFieldTipoDoPlano.getText());
      
      if(validarCadastro()){
             PlanoDeSaudeDAO.atualizar(planoDeSaude);
      JOptionPane.showConfirmDialog(null, "Plado de saúde atualizado com sucesso!",
              "Plano de saúde",
              JOptionPane.ERROR_MESSAGE);
              dispose();         
     }
      }
   
    private void gravar(){
          // criar um objeto plano de saude
        PlanoDeSaude planoDeSaude = new PlanoDeSaude();
        planoDeSaude.setOperadora(TextFieldNomeDaOperadora.getText());
        planoDeSaude.setTipoDoPlano(TextFieldTipoDoPlano.getText());
        
        if (validarCadastro()){
            PlanoDeSaudeDAO.gravar(planoDeSaude);
            
            dispose();
        }
      }
    private boolean validarCadastro(){
       if (TextFieldNomeDaOperadora.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Por favor preencha o nome da operadora!", "Plano De Saúde", JOptionPane.ERROR_MESSAGE);
           
           TextFieldNomeDaOperadora.requestFocus();
           return false;
       } 
       
       if (TextFieldTipoDoPlano.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor preencha o Tipo do Plano! ", "Plano De Saúde", JOptionPane.ERROR_MESSAGE);
          
            TextFieldTipoDoPlano.requestFocus();
            return false;
           
       }
        return true;
        
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JTextField TextFieldCodigo;
    private javax.swing.JTextField TextFieldNomeDaOperadora;
    private javax.swing.JTextField TextFieldTipoDoPlano;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDetalhesDoPlanoDeSaude;
    private javax.swing.JLabel labelNomeDaOperadora;
    private javax.swing.JLabel labelTipoDePlano;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
