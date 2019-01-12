/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Report.AddressInformation;
import Report.CheckingAccountInformation;
import Report.DempgraphicInformation;
import Report.DriversLicenseInformation;
import Report.Information;
import Report.MedicalRecord;
import Report.SavingAccountInformation;

/**
 *
 * @author gadep
 */
public class MainInterfaceFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainInterfaceFrame
     */
    private Information information;
    private SavingAccountInformation savingaccountinformation;
    private MedicalRecord medicalrecordr;
    private CheckingAccountInformation checkingaccountinformation;
    private AddressInformation addressinformation;
    private DempgraphicInformation demographicinformation;
    private DriversLicenseInformation driverslicenseinformation;
    
    public MainInterfaceFrame() {
        initComponents();
        information = new Information();
        savingaccountinformation = new SavingAccountInformation();
        medicalrecordr = new MedicalRecord();
        checkingaccountinformation = new CheckingAccountInformation();
        addressinformation = new AddressInformation();
        demographicinformation = new DempgraphicInformation();
        driverslicenseinformation = new DriversLicenseInformation();
        
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
        ControlJPanel = new javax.swing.JPanel();
        createBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        DisplayJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createBtn.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        viewBtn.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlJPanelLayout = new javax.swing.GroupLayout(ControlJPanel);
        ControlJPanel.setLayout(ControlJPanelLayout);
        ControlJPanelLayout.setHorizontalGroup(
            ControlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ControlJPanelLayout.setVerticalGroup(
            ControlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlJPanelLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(createBtn)
                .addGap(47, 47, 47)
                .addComponent(viewBtn)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        SplitPane.setLeftComponent(ControlJPanel);

        javax.swing.GroupLayout DisplayJPanelLayout = new javax.swing.GroupLayout(DisplayJPanel);
        DisplayJPanel.setLayout(DisplayJPanelLayout);
        DisplayJPanelLayout.setHorizontalGroup(
            DisplayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );
        DisplayJPanelLayout.setVerticalGroup(
            DisplayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 331, Short.MAX_VALUE)
        );

        SplitPane.setRightComponent(DisplayJPanel);

        getContentPane().add(SplitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        
        CreatePanel createpanel = new CreatePanel(information);//savingaccountinformation,medicalrecordr,checkingaccountinformation,addressinformation,demographicinformation,driverslicenseinformation);
        SplitPane.setRightComponent(createpanel);
    }//GEN-LAST:event_createBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        
        NewViewPanelForm viewpanel = new NewViewPanelForm(information);//savingaccountinformation,medicalrecordr,checkingaccountinformation,addressinformation,demographicinformation,driverslicenseinformation);
        SplitPane.setRightComponent(viewpanel);
    }//GEN-LAST:event_viewBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainInterfaceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterfaceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterfaceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterfaceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterfaceFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlJPanel;
    private javax.swing.JPanel DisplayJPanel;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}