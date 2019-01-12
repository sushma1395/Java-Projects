/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Buisness.VitalSignHistory;
import Buisness.VitalSigns;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gadep
 */
public class AbnormalVitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AbnormalVitalJPanel
     */
     double maxbp;
     double minbp;
    private VitalSignHistory vsh;
    
   
    AbnormalVitalJPanel(VitalSignHistory vsh,double maxbp, double minbp ) {
        initComponents();
        this.vsh = vsh;
        this.maxbp = maxbp;
        this.minbp = minbp;
            populateTable();
    
    }

   
    
     public void populateTable()
    {
        DefaultTableModel dtm =  (DefaultTableModel)TblVitalSigns.getModel();
        dtm.setRowCount(0);
       
        
        for(VitalSigns vs: vsh.getAbnormalList(maxbp, minbp))
        {
           Object row[] = new Object[2]; 
           row[0] = vs;
           row[1] = vs.getBloodPressure();
           dtm.addRow(row);
           
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblVitalSigns = new javax.swing.JTable();
        btnDetails = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Abnormal Vital Signs");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 26, 228, -1));

        TblVitalSigns.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        TblVitalSigns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Blood Pressure"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblVitalSigns);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 76, 680, 195));

        btnDetails.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDetails.setText("Details");
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });
        add(btnDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 289, -1, -1));

        Delete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 289, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Temperature");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 376, -1, -1));

        txtTemperature.setEnabled(false);
        txtTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperatureActionPerformed(evt);
            }
        });
        add(txtTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 374, 127, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Blood Pressure");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 418, -1, -1));

        txtBloodPressure.setEnabled(false);
        txtBloodPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodPressureActionPerformed(evt);
            }
        });
        add(txtBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 416, 127, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Pulse");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 462, -1, -1));

        txtPulse.setEnabled(false);
        txtPulse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPulseActionPerformed(evt);
            }
        });
        add(txtPulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 460, 127, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Date");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 497, 105, -1));

        txtDate.setEnabled(false);
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 495, 127, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        // TODO add your handling code here:
        int selectedrow = TblVitalSigns.getSelectedRow();
        
        if(selectedrow >=0 )
        {
              VitalSigns vs = (VitalSigns)TblVitalSigns.getValueAt(selectedrow, 0);
              txtBloodPressure.setText(String.valueOf(vs.getBloodPressure()));
              txtTemperature.setText(String.valueOf(vs.getBloodPressure()));
              txtPulse.setText(String.valueOf(vs.getPulse()));
              txtDate.setText(vs.getDate());
              
        }
        else
            JOptionPane.showMessageDialog(null, "Please select any row");
    }//GEN-LAST:event_btnDetailsActionPerformed

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

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        
         int selectedrow = TblVitalSigns.getSelectedRow();
        
        if(selectedrow >=0 )
        {
            VitalSigns vs = (VitalSigns)TblVitalSigns.getValueAt(selectedrow, 0);
             //vsh.deleteVitals(vs);
             int r = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the record ?? ");
             if(r==JOptionPane.YES_OPTION){
                 vsh.deleteVitals(vs);}
             
             populateTable();
              
        }
        else
            JOptionPane.showMessageDialog(null, "Please select any row");
        
    }//GEN-LAST:event_DeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JTable TblVitalSigns;
    private javax.swing.JButton btnDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}