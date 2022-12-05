
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class JPanelMedico extends javax.swing.JPanel {
    
    int linha;
   
    public JPanelMedico() {
        initComponents();
        criartabelaMedico();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelMedico = new javax.swing.JLabel();
        scrolPanelMedico = new javax.swing.JScrollPane();
        tableMedico = new javax.swing.JTable();
        buttonExcluirMedico = new javax.swing.JButton();
        buttonAlterarMedico = new javax.swing.JButton();
        buttonAdicionarMedico = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setLayout(null);

        LabelMedico.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        LabelMedico.setForeground(new java.awt.Color(102, 102, 255));
        LabelMedico.setText("Médico");
        add(LabelMedico);
        LabelMedico.setBounds(10, 10, 180, 20);

        tableMedico.setModel(new javax.swing.table.DefaultTableModel(
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
        scrolPanelMedico.setViewportView(tableMedico);

        add(scrolPanelMedico);
        scrolPanelMedico.setBounds(10, 30, 920, 250);

        buttonExcluirMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete32.png"))); // NOI18N
        buttonExcluirMedico.setToolTipText("Excluir Médico selecionado");
        buttonExcluirMedico.setFocusable(false);
        buttonExcluirMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirMedicoActionPerformed(evt);
            }
        });
        add(buttonExcluirMedico);
        buttonExcluirMedico.setBounds(700, 294, 70, 60);

        buttonAlterarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit.png"))); // NOI18N
        buttonAlterarMedico.setToolTipText("Editar Médico selecionado");
        buttonAlterarMedico.setFocusable(false);
        buttonAlterarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarMedicoActionPerformed(evt);
            }
        });
        add(buttonAlterarMedico);
        buttonAlterarMedico.setBounds(780, 294, 70, 60);

        buttonAdicionarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add32.png"))); // NOI18N
        buttonAdicionarMedico.setToolTipText("Adicionar Médico");
        buttonAdicionarMedico.setFocusable(false);
        buttonAdicionarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarMedicoActionPerformed(evt);
            }
        });
        add(buttonAdicionarMedico);
        buttonAdicionarMedico.setBounds(860, 294, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirMedicoActionPerformed
        // obtemos om indice da linha selecionada tabela
        linha = tableMedico.getSelectedRow();
      
          //verificamos se a linha é diferente de -1
        // -1 significa que o usuário nao selecionou nda
        if (linha != -1){
            excluir();
        }else{
            JOptionPane.showConfirmDialog(this,
                    "Por favor, selecione o Médico(a) que deseja excluir",
                    "Médico(a)",
                    JOptionPane.ERROR_MESSAGE );   
            criartabelaMedico();
                
        }
   
    }//GEN-LAST:event_buttonExcluirMedicoActionPerformed

    private void buttonAlterarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarMedicoActionPerformed
        linha = tableMedico.getSelectedRow();
        
        if(linha != -1){
            editar();
        }else{
            JOptionPane.showConfirmDialog(this, "Por favor, selecione um Médico(a) para alterar",
                    "Médico(a)",
                    JOptionPane.WARNING_MESSAGE);
            criartabelaMedico();
                                            
        }  
    }//GEN-LAST:event_buttonAlterarMedicoActionPerformed

    private void buttonAdicionarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarMedicoActionPerformed
             DialogMedico dialogmedico = new DialogMedico(null, true, TipoOperacao.ADCIONAR,null);
            dialogmedico.setVisible(true);
            
            criartabelaMedico();

    }//GEN-LAST:event_buttonAdicionarMedicoActionPerformed
    private void editar(){
        
        Medico medico = MedicoDAO.getMedico(getCodigoSelecionado());
        
        DialogMedico dialogMedico = new DialogMedico(null, true,
                TipoOperacao.ALTERAR,
                medico);
        dialogMedico.setVisible(true);
        criartabelaMedico();
    }
    
    private void excluir(){
        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusaõ do Médico(a) selecionado?",
                "Médico(a)",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if(resposta == 0){
             String codiStr = tableMedico.getValueAt(linha, 0).toString();
        Integer codigo = Integer.valueOf(codiStr);
        MedicoDAO.excluir(codigo);
        criartabelaMedico();
        
        }
        
    }
    private Integer getCodigoSelecionado(){
        String codiStr = tableMedico.getValueAt(linha, 0).toString();
        return Integer.valueOf(codiStr);
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelMedico;
    private javax.swing.JButton buttonAdicionarMedico;
    private javax.swing.JButton buttonAlterarMedico;
    private javax.swing.JButton buttonExcluirMedico;
    private javax.swing.JScrollPane scrolPanelMedico;
    private javax.swing.JTable tableMedico;
    // End of variables declaration//GEN-END:variables

    private void criartabelaMedico() {
        tableMedico.setModel(MedicoDAO.getTableModel());

        // desativar o redimensionamento da JTable
        tableMedico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        //definir a largura de cada coluna
        tableMedico.getColumnModel().getColumn(0).setPreferredWidth(117);
        tableMedico.getColumnModel().getColumn(1).setPreferredWidth(400);
        tableMedico.getColumnModel().getColumn(2).setPreferredWidth(400);

         //impedir a movimentaçao das colunas 
        tableMedico.getTableHeader().setReorderingAllowed(false);

        //bloquear ediçao das células 
        tableMedico.setDefaultEditor(Object.class, null);
        
    }

}
