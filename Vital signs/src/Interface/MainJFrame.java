/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Buisness.VitalSignHistory;
import javax.swing.JOptionPane;

/**
 *
 * @author gadep
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public VitalSignHistory vsh;
    public MainJFrame() {
        initComponents();
        vsh = new VitalSignHistory();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        leftJPanel = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnAbnormal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaxBP = new javax.swing.JTextField();
        txtMinBP = new javax.swing.JTextField();
        rightJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCreate.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnCreate.setText("Create Vital Sign");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnView.setText("View Vital Sign");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnAbnormal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAbnormal.setText("Abnormal");
        btnAbnormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbnormalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel1.setText("Max_BP");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel2.setText("Min_BP");

        txtMaxBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaxBPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftJPanelLayout = new javax.swing.GroupLayout(leftJPanel);
        leftJPanel.setLayout(leftJPanelLayout);
        leftJPanelLayout.setHorizontalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAbnormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(leftJPanelLayout.createSequentialGroup()
                        .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(leftJPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftJPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaxBP)
                            .addComponent(txtMinBP))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftJPanelLayout.setVerticalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(btnCreate)
                .addGap(84, 84, 84)
                .addComponent(btnView)
                .addGap(18, 18, 18)
                .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaxBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMinBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAbnormal)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        SplitPane.setLeftComponent(leftJPanel);

        javax.swing.GroupLayout rightJPanelLayout = new javax.swing.GroupLayout(rightJPanel);
        rightJPanel.setLayout(rightJPanelLayout);
        rightJPanelLayout.setHorizontalGroup(
            rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );
        rightJPanelLayout.setVerticalGroup(
            rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );

        SplitPane.setRightComponent(rightJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SplitPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreateVitalJPanel createJpanel = new CreateVitalJPanel(vsh);
        SplitPane.setRightComponent(createJpanel);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        ViewVitalsJPanel viewPanel = new  ViewVitalsJPanel(vsh);
        SplitPane.setRightComponent(viewPanel);
    }//GEN-LAST:event_btnViewActionPerformed

    private void txtMaxBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaxBPActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtMaxBPActionPerformed

    private void btnAbnormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbnormalActionPerformed
        // TODO add your handling code here:
        
        double maxbp =0.0;
        double minbp =0.0;
        try
        {
        String maxbpString = txtMaxBP.getText();
        String minbpString = txtMinBP.getText();
        
        if(maxbpString.equals("") || minbpString.equals("")){
        JOptionPane.showMessageDialog(null , "Please enter Blood Pressure values");
        }
 
          maxbp = maxbpString.equals("")? Double.MAX_VALUE :Double.parseDouble(maxbpString);
          minbp = minbpString.equals("")? Double.MIN_VALUE : Double.parseDouble(minbpString);
          AbnormalVitalJPanel abnormalpanel = new AbnormalVitalJPanel(vsh,maxbp,minbp);
          
          
          
          if(maxbp<minbp)
              JOptionPane.showMessageDialog(null , "Enter correct range");
          
         
          else{
              
              SplitPane.setRightComponent(abnormalpanel);
          }
       // AbnormalVitalJPanel abnormalpanel = new AbnormalVitalJPanel(vsh,maxbp,minbp);
        }
        catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(null , "Abnormal Blood Pressure values cannot be displayed,Please enter valid details");
            
        }
      
        // AbnormalVitalJPanel abnormalpanel = new AbnormalVitalJPanel(vsh,maxbp,minbp);
        // SplitPane.setRightComponent(abnormalpanel);
    }//GEN-LAST:event_btnAbnormalActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton btnAbnormal;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel leftJPanel;
    private javax.swing.JPanel rightJPanel;
    private javax.swing.JTextField txtMaxBP;
    private javax.swing.JTextField txtMinBP;
    // End of variables declaration//GEN-END:variables
}
