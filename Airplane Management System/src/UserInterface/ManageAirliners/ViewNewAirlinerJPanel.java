/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Buisness.Airliner;
import Buisness.AirlinerDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;



/**
 *
 * @author gadep
 */
public class ViewNewAirlinerJPanel extends javax.swing.JPanel {

    private JPanel userProcesContainer ;
    private Airliner travelagency;
     private AirlinerDirectory airDir;
    
    /**
     * Creates new form ViewManageTravelJPanel
     */
    public ViewNewAirlinerJPanel(JPanel userProcesContainer,Airliner travelagency, AirlinerDirectory airDir) {
        initComponents();
        this.userProcesContainer = userProcesContainer;
        this.airDir = airDir;
        
        
       
        populate();
    }

    
 public void populate(){
    {
       
        DefaultTableModel dtm = (DefaultTableModel)tblDirectory.getModel();
        dtm.setRowCount(0);
        
        for(Airliner a : airDir.getProductDirectory()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=a;
            row[1]=a.getAirlineType();
            row[2]=a.getSeatCapacity();
            
            dtm.addRow(row);
        }
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

        jLabel1 = new javax.swing.JLabel();
        DeleteAirline = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDirectory = new javax.swing.JTable();
        Viewbtn = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("View Airline");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 35, -1, -1));

        DeleteAirline.setText("Delete Airline");
        DeleteAirline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAirlineActionPerformed(evt);
            }
        });
        add(DeleteAirline, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 292, -1, -1));

        tblDirectory.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        tblDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Airline Name", "Airline Type", "Flight Number"
            }
        ));
        jScrollPane1.setViewportView(tblDirectory);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 650, 130));

        Viewbtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Viewbtn.setText("View");
        Viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewbtnActionPerformed(evt);
            }
        });
        add(Viewbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, -1));

        Back.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ViewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewbtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDirectory.getSelectedRow();
          if(selectedRow<0)
        {
            JOptionPane.showConfirmDialog(null,"Please select a row to view details" , "Information" , JOptionPane.CANCEL_OPTION);
        }
        
        else{
            Airliner travelagency = (Airliner) tblDirectory.getValueAt(selectedRow, 0);
            ViewPanel view = new ViewPanel(userProcesContainer , travelagency , airDir);
            userProcesContainer.add("viewPanel" , view);
            CardLayout layout = (CardLayout)userProcesContainer.getLayout();
            layout.next(userProcesContainer);
        }
        
    }//GEN-LAST:event_ViewbtnActionPerformed

    private void DeleteAirlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAirlineActionPerformed
        // TODO add your handling code here:
        
         int selectedRow = tblDirectory.getSelectedRow();
        
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                Airliner airliner = (Airliner)tblDirectory.getValueAt(selectedRow, 0);
                airDir.deleteProduct(airliner);
                populate();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_DeleteAirlineActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        userProcesContainer.remove(this);
        CardLayout layout = (CardLayout)userProcesContainer.getLayout();
        layout.previous(userProcesContainer);
    }//GEN-LAST:event_BackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton DeleteAirline;
    private javax.swing.JButton Viewbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDirectory;
    // End of variables declaration//GEN-END:variables

   
}
