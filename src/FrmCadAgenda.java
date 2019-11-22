
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 277700
 */
public class FrmCadAgenda extends javax.swing.JFrame {

    /**
     * Creates new form FrmCadAgenda
     */
    public FrmCadAgenda()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void Limpar()
        {
            TextCod_Agenda.setText(null);
            TextData_Agenda.setText(null);
            TextHora_Agenda.setText(null);
            TextLocal_Servico.setText(null);
            TextDescricao_Servico.setText(null);
        }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAgendar = new javax.swing.JTable();
        ButtonAgendar = new javax.swing.JButton();
        LblDescricao_Servico = new javax.swing.JLabel();
        LblLocal_Servico = new javax.swing.JLabel();
        TextLocal_Servico = new javax.swing.JTextField();
        TextHora_Agenda = new javax.swing.JTextField();
        LblHora_Agenda = new javax.swing.JLabel();
        LblData_Agenda = new javax.swing.JLabel();
        TextData_Agenda = new javax.swing.JTextField();
        TextCod_Agenda = new javax.swing.JTextField();
        LblCod_Agenda = new javax.swing.JLabel();
        LblTitulo = new javax.swing.JLabel();
        ButtonVoltar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextDescricao_Servico = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SOFTGIA / Agendar Serviço");

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTableAgendar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableAgendar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Data", "Hora", "Local", "Descrição"
            }
        ));
        jScrollPane1.setViewportView(jTableAgendar);

        ButtonAgendar.setBackground(new java.awt.Color(204, 255, 255));
        ButtonAgendar.setText("Agendar");
        ButtonAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgendarActionPerformed(evt);
            }
        });

        LblDescricao_Servico.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LblDescricao_Servico.setForeground(new java.awt.Color(255, 255, 255));
        LblDescricao_Servico.setText("Descrição do Serviço :");

        LblLocal_Servico.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LblLocal_Servico.setForeground(new java.awt.Color(255, 255, 255));
        LblLocal_Servico.setText("Local do Serviço :");

        TextLocal_Servico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TextHora_Agenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LblHora_Agenda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LblHora_Agenda.setForeground(new java.awt.Color(255, 255, 255));
        LblHora_Agenda.setText("Hora : ");

        LblData_Agenda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LblData_Agenda.setForeground(new java.awt.Color(255, 255, 255));
        LblData_Agenda.setText("Data :");

        TextData_Agenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TextCod_Agenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LblCod_Agenda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LblCod_Agenda.setForeground(new java.awt.Color(255, 255, 255));
        LblCod_Agenda.setText("Código :");

        LblTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LblTitulo.setText("Agendar Serviços");

        ButtonVoltar.setBackground(new java.awt.Color(204, 255, 255));
        ButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reply.png"))); // NOI18N
        ButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVoltarActionPerformed(evt);
            }
        });

        TextDescricao_Servico.setColumns(20);
        TextDescricao_Servico.setRows(5);
        TextDescricao_Servico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(TextDescricao_Servico);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo SG.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(LblTitulo)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(LblDescricao_Servico)
                                .addGap(6, 6, 6))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonVoltar)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ButtonAgendar)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LblCod_Agenda)
                                            .addComponent(TextCod_Agenda, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TextHora_Agenda, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LblHora_Agenda))
                                        .addGap(134, 134, 134)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LblLocal_Servico)
                                            .addComponent(TextLocal_Servico, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TextData_Agenda, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LblData_Agenda))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ButtonVoltar)
                                .addGap(18, 18, 18)
                                .addComponent(LblTitulo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(LblCod_Agenda)
                                .addGap(63, 63, 63))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(LblData_Agenda)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TextData_Agenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TextCod_Agenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)))
                        .addGap(3, 3, 3)
                        .addComponent(LblHora_Agenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextHora_Agenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LblLocal_Servico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextLocal_Servico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addComponent(LblDescricao_Servico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(ButtonAgendar)
                        .addGap(78, 78, 78)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgendarActionPerformed
        // TODO add your handling code here:
        String codigo = null, data = null, hora = null, local = null, descricao = null;
        
        codigo = TextCod_Agenda.getText();
        data = TextData_Agenda.getText();
        hora = TextHora_Agenda.getText();
        local = TextLocal_Servico.getText();
        descricao = TextDescricao_Servico.getText();
        
        DefaultTableModel ModelCadastrar = (DefaultTableModel) jTableAgendar.getModel();
        Object[]informacoes = {codigo, data, hora, local, descricao};
        ModelCadastrar.addRow(informacoes);
        
        /*if(codigo.equals("")||data.equals("")||hora.equals("")||local.equals("")||descricao.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Confira se todos os dados foram preenchidos corretamente.");
            jTableAgendar = null;
        }*/
        
        Limpar();
        
        JOptionPane.showMessageDialog(null, "Serviço agendado com sucesso");
    }//GEN-LAST:event_ButtonAgendarActionPerformed

    private void ButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ButtonVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCadAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgendar;
    private javax.swing.JButton ButtonVoltar;
    private javax.swing.JLabel LblCod_Agenda;
    private javax.swing.JLabel LblData_Agenda;
    private javax.swing.JLabel LblDescricao_Servico;
    private javax.swing.JLabel LblHora_Agenda;
    private javax.swing.JLabel LblLocal_Servico;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JTextField TextCod_Agenda;
    private javax.swing.JTextField TextData_Agenda;
    private javax.swing.JTextArea TextDescricao_Servico;
    private javax.swing.JTextField TextHora_Agenda;
    private javax.swing.JTextField TextLocal_Servico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAgendar;
    // End of variables declaration//GEN-END:variables
}