/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Buisness.Airliner;
import Buisness.AirlinerDirectory;
import Buisness.FlightSchedule;
import Buisness.FlightScheduleDirectory;
import UserInterface.ManageAirliners.TravelJPanel;
import UserInterface.ManageCustomers.CreateTravelJPanel;
import UserIterface.AirlinesManageFlightSchedule.ComboBoxJPanel;
import UserIterface.AirlinesManageFlightSchedule.PopupJPanel;
import java.awt.CardLayout;

/**
 *
 * @author gadep
 */
public class MainJFrame extends javax.swing.JFrame {

  private Airliner travelagency;
     private AirlinerDirectory airDir;
     private FlightScheduleDirectory fliDir;
     private FlightSchedule flightschedule;
     
     
    /**
     * Creates new form NewJFrame
     */
    public MainJFrame() {
        initComponents();
        this.airDir = new AirlinerDirectory() ;
        this.travelagency = new Airliner();
        this.fliDir = new FlightScheduleDirectory();
        this.flightschedule = new FlightSchedule();
        this.fliDir = new FlightScheduleDirectory();
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
        userProcesContainer = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        manageTravelAgency = new javax.swing.JButton();
        airlinesFlightSchedule = new javax.swing.JButton();
        manageCustomerBookings = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SplitPane.setDividerLocation(238);

        userProcesContainer.setLayout(new java.awt.CardLayout());
        SplitPane.setRightComponent(userProcesContainer);

        manageTravelAgency.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        manageTravelAgency.setText("Manage Airliners");
        manageTravelAgency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageTravelAgencyActionPerformed(evt);
            }
        });

        airlinesFlightSchedule.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        airlinesFlightSchedule.setText("Airlines Flight Schedule");
        airlinesFlightSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinesFlightScheduleActionPerformed(evt);
            }
        });

        manageCustomerBookings.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        manageCustomerBookings.setText("Customer Bookings");
        manageCustomerBookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustomerBookingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manageTravelAgency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageCustomerBookings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(airlinesFlightSchedule, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(manageTravelAgency)
                .addGap(81, 81, 81)
                .addComponent(airlinesFlightSchedule)
                .addGap(108, 108, 108)
                .addComponent(manageCustomerBookings)
                .addContainerGap(249, Short.MAX_VALUE))
        );

        SplitPane.setLeftComponent(leftPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageTravelAgencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageTravelAgencyActionPerformed
        // TODO add your handling code here:
         TravelJPanel amPanel = new TravelJPanel(userProcesContainer , airDir);
        userProcesContainer.add("TravelJPanel" ,amPanel );
        CardLayout layout = (CardLayout)userProcesContainer.getLayout();
        layout.next(userProcesContainer);
    }//GEN-LAST:event_manageTravelAgencyActionPerformed

    private void manageCustomerBookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustomerBookingsActionPerformed
        // TODO add your handling code here:
        
        
        CreateTravelJPanel createjpanel = new CreateTravelJPanel(userProcesContainer ,travelagency ,airDir ,fliDir,flightschedule );
        userProcesContainer.add("CreateTravelJPanel" ,createjpanel );
        CardLayout layout = (CardLayout)userProcesContainer.getLayout();
        layout.next(userProcesContainer);
    }//GEN-LAST:event_manageCustomerBookingsActionPerformed

    private void airlinesFlightScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinesFlightScheduleActionPerformed
        // TODO add your handling code here:
        
        ComboBoxJPanel ls = new ComboBoxJPanel(userProcesContainer, airDir,fliDir );
        userProcesContainer.add("PopupJPanel",ls);
        CardLayout layout = (CardLayout)userProcesContainer.getLayout();
        layout.next(userProcesContainer);
    }//GEN-LAST:event_airlinesFlightScheduleActionPerformed

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
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JButton airlinesFlightSchedule;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton manageCustomerBookings;
    private javax.swing.JButton manageTravelAgency;
    private javax.swing.JPanel userProcesContainer;
    // End of variables declaration//GEN-END:variables
}