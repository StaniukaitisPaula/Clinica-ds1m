package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class JPanelEspecialidades extends javax.swing.JPanel {

     int linha;
    
    public JPanelEspecialidades() {
        initComponents();
        criartabelaEspecialidade();
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelEspecialidade = new javax.swing.JLabel();
        jScrollPaneEspecialidade = new javax.swing.JScrollPane();
        TableEspecialidade = new javax.swing.JTable();
        buttonExcluirEspecialidade = new javax.swing.JButton();
        buttonAlterarEspecialidade = new javax.swing.JButton();
        buttonAdicionarEspecialidade = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(945, 370));
        setLayout(null);

        jLabelEspecialidade.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelEspecialidade.setForeground(new java.awt.Color(102, 102, 255));
        jLabelEspecialidade.setText("Especialidades");
        jLabelEspecialidade.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                jLabelEspecialidadeAncestorRemoved(evt);
            }
        });
        add(jLabelEspecialidade);
        jLabelEspecialidade.setBounds(10, 10, 210, 26);

        TableEspecialidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPaneEspecialidade.setViewportView(TableEspecialidade);

        add(jScrollPaneEspecialidade);
        jScrollPaneEspecialidade.setBounds(10, 40, 920, 220);

        buttonExcluirEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete32.png"))); // NOI18N
        buttonExcluirEspecialidade.setToolTipText("Excluir Especialidade selecionado");
        buttonExcluirEspecialidade.setFocusable(false);
        buttonExcluirEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonExcluirEspecialidade);
        buttonExcluirEspecialidade.setBounds(700, 290, 70, 60);

        buttonAlterarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit.png"))); // NOI18N
        buttonAlterarEspecialidade.setToolTipText("Editar Especialidade selecionado");
        buttonAlterarEspecialidade.setFocusable(false);
        buttonAlterarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonAlterarEspecialidade);
        buttonAlterarEspecialidade.setBounds(780, 290, 70, 60);

        buttonAdicionarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add32.png"))); // NOI18N
        buttonAdicionarEspecialidade.setToolTipText("Adicionar Especialidade");
        buttonAdicionarEspecialidade.setFocusable(false);
        buttonAdicionarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonAdicionarEspecialidade);
        buttonAdicionarEspecialidade.setBounds(860, 290, 70, 60);

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelEspecialidadeAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabelEspecialidadeAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelEspecialidadeAncestorRemoved

    private void buttonExcluirEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirEspecialidadeActionPerformed
       // obtemos om indice da linha selecionada tabela
        linha = TableEspecialidade.getSelectedRow();
      
          //verificamos se a linha é diferente de -1
        // -1 significa que o usuário nao selecionou nda
        if (linha != -1){
            excluir();
        }else{
            JOptionPane.showConfirmDialog(this,
                    "Por favor, selecione a Especialidade que deseja excluir",
                    "Especialidades",
                    JOptionPane.ERROR_MESSAGE );   
            criartabelaEspecialidade();
                
        }
    }//GEN-LAST:event_buttonExcluirEspecialidadeActionPerformed

    private void buttonAlterarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarEspecialidadeActionPerformed
        linha = TableEspecialidade.getSelectedRow();
        
        if(linha != -1){
            editar();
        }else{
            JOptionPane.showConfirmDialog(this, "Por favor, selecione uma Especialidade para alterar",
                    "Especialidades",
                    JOptionPane.WARNING_MESSAGE);
            criartabelaEspecialidade();
                                            
        }    
     
    }//GEN-LAST:event_buttonAlterarEspecialidadeActionPerformed

    private void buttonAdicionarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspecialidadeActionPerformed
            DialogEspecialidade dialogEspecialidade = new DialogEspecialidade(null, true, TipoOperacao.ADCIONAR,null);
            dialogEspecialidade.setVisible(true);
            
            criartabelaEspecialidade();

    }//GEN-LAST:event_buttonAdicionarEspecialidadeActionPerformed
   private void editar(){
        
        Especialidade especialidade = EspecialidadeDAO.getEspecialidade(getCodigoSelecionado());
        
        DialogEspecialidade dialogEspecialidade = new DialogEspecialidade(null, true,
                TipoOperacao.ALTERAR,
                especialidade);
        dialogEspecialidade.setVisible(true);
        criartabelaEspecialidade();
    }
    
    private void excluir(){
        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusaõ da Especialidade selecionada?",
                "Especialidades",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if(resposta == 0){
             String codiStr = TableEspecialidade.getValueAt(linha, 0).toString();
        Integer codigo = Integer.valueOf(codiStr);
        EspecialidadeDAO.excluir(codigo);
        criartabelaEspecialidade();
        
        }
        
    }
    private Integer getCodigoSelecionado(){
        String codiStr = TableEspecialidade.getValueAt(linha, 0).toString();
        return Integer.valueOf(codiStr);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableEspecialidade;
    private javax.swing.JButton buttonAdicionarEspecialidade;
    private javax.swing.JButton buttonAlterarEspecialidade;
    private javax.swing.JButton buttonExcluirEspecialidade;
    private javax.swing.JLabel jLabelEspecialidade;
    private javax.swing.JScrollPane jScrollPaneEspecialidade;
    // End of variables declaration//GEN-END:variables

    private void criartabelaEspecialidade() {
        TableEspecialidade.setModel(EspecialidadeDAO.getTableModel());

        // desativar o redimensionamento da JTable
        TableEspecialidade.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        //definir a largura de cada coluna
        TableEspecialidade.getColumnModel().getColumn(0).setPreferredWidth(117);
        TableEspecialidade.getColumnModel().getColumn(1).setPreferredWidth(400);
        TableEspecialidade.getColumnModel().getColumn(2).setPreferredWidth(400);

         //impedir a movimentaçao das colunas 
        TableEspecialidade.getTableHeader().setReorderingAllowed(false);

        //bloquear ediçao das células 
        TableEspecialidade.setDefaultEditor(Object.class, null);
        
    }

    }
