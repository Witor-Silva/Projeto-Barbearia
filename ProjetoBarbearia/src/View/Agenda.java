/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AgendaController;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author vitor
 */
public class Agenda extends javax.swing.JFrame {

    private final AgendaController controller;

    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
        controller = new AgendaController(this);
        iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelHora = new javax.swing.JLabel();
        TextFormatedHora = new javax.swing.JTextField();
        jLabelData = new javax.swing.JLabel();
        TextFormatedData = new javax.swing.JTextField();
        jLabelValor = new javax.swing.JLabel();
        TextValor = new javax.swing.JTextField();
        jLabelServico = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        JComboBoxServico = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableAgendamentos = new javax.swing.JTable();
        ButtonAgendar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextObservacao = new javax.swing.JTextArea();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jLabelId = new javax.swing.JLabel();
        TextId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelHora.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHora.setText("Hora");
        getContentPane().add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, 20));

        TextFormatedHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFormatedHoraActionPerformed(evt);
            }
        });
        getContentPane().add(TextFormatedHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 220, 30));

        jLabelData.setForeground(new java.awt.Color(255, 255, 255));
        jLabelData.setText("Data");
        getContentPane().add(jLabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, 20));

        TextFormatedData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFormatedDataActionPerformed(evt);
            }
        });
        getContentPane().add(TextFormatedData, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 220, 30));

        jLabelValor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValor.setText("Valor R$");
        getContentPane().add(jLabelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, 20));

        TextValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextValorActionPerformed(evt);
            }
        });
        getContentPane().add(TextValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 220, 30));

        jLabelServico.setForeground(new java.awt.Color(255, 255, 255));
        jLabelServico.setText("Servico");
        getContentPane().add(jLabelServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, 20));

        jLabelCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCliente.setText("Cliente");
        getContentPane().add(jLabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, 20));

        JComboBoxServico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JComboBoxServicoItemStateChanged(evt);
            }
        });
        getContentPane().add(JComboBoxServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 220, 30));

        TableAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "iId", "Cliente", "serviço", "Valor", "Data", "Hora", "Observação"
            }
        ));
        jScrollPane2.setViewportView(TableAgendamentos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 490, 740, 240));

        ButtonAgendar.setBackground(new java.awt.Color(0, 255, 0));
        ButtonAgendar.setText("Agendar");
        ButtonAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 450, 30));

        TextObservacao.setColumns(20);
        TextObservacao.setRows(5);
        jScrollPane1.setViewportView(TextObservacao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 450, 260));

        getContentPane().add(jComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 220, 30));

        jLabelId.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId.setText("Id");
        getContentPane().add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, 20));

        TextId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIdActionPerformed(evt);
            }
        });
        getContentPane().add(TextId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 220, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/AgendaFundo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIdActionPerformed

    private void TextValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextValorActionPerformed

    private void TextFormatedDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFormatedDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFormatedDataActionPerformed

    private void TextFormatedHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFormatedHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFormatedHoraActionPerformed

    private void JComboBoxServicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JComboBoxServicoItemStateChanged
        this.controller.atualizaValor();
    }//GEN-LAST:event_JComboBoxServicoItemStateChanged

    private void ButtonAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgendarActionPerformed
        this.controller.agendar();
    }//GEN-LAST:event_ButtonAgendarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgendar;
    private javax.swing.JComboBox<String> JComboBoxServico;
    private javax.swing.JTable TableAgendamentos;
    private javax.swing.JTextField TextFormatedData;
    private javax.swing.JTextField TextFormatedHora;
    private javax.swing.JTextField TextId;
    private javax.swing.JTextArea TextObservacao;
    private javax.swing.JTextField TextValor;
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelServico;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {
        this.controller.atualizaTabela();
        this.controller.atualizaCliente();
        this.controller.atualizaServico();
        this.controller.atualizaValor();
    }

    public JTable getTableAgendamentos() {
        return TableAgendamentos;
    }

    public void setTableAgendamentos(JTable TableAgendamento) {
        this.TableAgendamentos = TableAgendamento;
    }

        public JComboBox<String> getJComboBoxCliente() {
        return jComboBoxCliente;
    }

    public void setjComboBoxCliente(JComboBox<String> jComboBoxCliente) {
        this.jComboBoxCliente = jComboBoxCliente;
    }
    
    public JComboBox<String> getJComboBoxServico() {
        return JComboBoxServico;
    }

    public void setComboBoxServico(JComboBox<String> JComboBoxServico) {
        this.JComboBoxServico = JComboBoxServico;
    }

    public JTextField getTextValor() {
        return TextValor;
    }

    public void setTextValor(JTextField TextValor) {
        this.TextValor = TextValor;
    }

    public JTextField getTextFormatedData() {
        return TextFormatedData;
    }

    public void setTextFormatedData(JTextField TextFormatedData) {
        this.TextFormatedData = TextFormatedData;
    }

    public JTextField getTextFormatedHora() {
        return TextFormatedHora;
    }

    public void setTextFormatedHora(JTextField TextFormatedHora) {
        this.TextFormatedHora = TextFormatedHora;
    }

    public JTextArea getTextObservacao() {
        return TextObservacao;
    }

    public void setTextObservacao(JTextArea TextObservacao) {
        this.TextObservacao = TextObservacao;
    }

    public Object getTextId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getTextid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getTextId(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    


    
    
    
}
