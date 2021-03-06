/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Buisness.VitalSignHistory;
import Buisness.VitalSigns;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author gadep
 */
public class CreateVitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateVitalJPanel
     */
   
    private VitalSignHistory vsh;
    CreateVitalJPanel(VitalSignHistory vsh) {
        initComponents();
        this.vsh = vsh;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Temperature");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 92, -1, -1));

        txtTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperatureActionPerformed(evt);
            }
        });
        add(txtTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 89, 127, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Blood Pressure");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 134, -1, -1));

        txtBloodPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodPressureActionPerformed(evt);
            }
        });
        add(txtBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 131, 127, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Pulse");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 178, -1, -1));

        txtPulse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPulseActionPerformed(evt);
            }
        });
        add(txtPulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 175, 127, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Date");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 213, 105, -1));

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 210, 127, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Create Vital Signs");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 16, 228, -1));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperatureActionPerformed

    private void txtBloodPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodPressureActionPerformed

    private void txtPulseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPulseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPulseActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
       try{
           
       
        double temperature = Double.parseDouble(txtTemperature.getText());
        double bp = Double.parseDouble(txtBloodPressure.getText());
        int pulse = Integer.parseInt(txtPulse.getText());
        String date = txtDate.getText();
        VitalSigns v = vsh.addVitals();
        v.setBloodPressure(bp);
        v.setTemperature(temperature);
        v.setDate(date);
        v.setPulse(pulse);
        JOptionPane.showMessageDialog(null , "Vital signs added succesfully");
        
        txtBloodPressure.setText("");
        txtDate.setText("");
        txtPulse.setText("");
        txtTemperature.setText("");
       }
       
       catch (NumberFormatException exception) {
        
            JOptionPane.showMessageDialog(null , "Vital signs are not added succesfully,Please enter valid details");
            txtBloodPressure.setText("");
            txtDate.setText("");
            txtPulse.setText("");
            txtTemperature.setText("");
        }
        
        
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}
