/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Manufacturer.ShippingManager;

import Business.Enterprise;
import Business.Manufacturer.ManufacturerEnterprise;
import Business.Network;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public class ShippingManagerWorkAreaJPanel extends javax.swing.JPanel {

    JPanel upcJPanel;
    ManufacturerEnterprise manuEnt;
    UserAccount ua;
    Network network;

    /**
     * Creates new form SalesEmployeeWorkAreaJPanel
     */
    public ShippingManagerWorkAreaJPanel(JPanel upcJPanel, Network network, Enterprise ent, UserAccount ua) {
        this.upcJPanel = upcJPanel;
        this.manuEnt = (ManufacturerEnterprise) ent;
        this.ua = ua;
        this.network = network;
        if (manuEnt.getLicense().equals(Boolean.FALSE)) {
            JOptionPane.showMessageDialog(null, "You are not licensed");
            upcJPanel.removeAll();
            CardLayout card = (CardLayout) upcJPanel.getLayout();
            card.previous(upcJPanel);
        } else {
            initComponents();

        }
        refreshCounter();
    }
    
    public void refreshCounter(){
        noOfPendingRequestsJTextField.setText(String.valueOf(manuEnt.getMyOrganization(ua).getWorkQueue().getWorkRequestList().size()));
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
        workQueueJButton = new javax.swing.JButton();
        sentWorkQueueJButton = new javax.swing.JButton();
        noOfPendingRequestsJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        refreshJButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("--- SHIPPING EMPLOYEE WORK AREA ---");

        workQueueJButton.setText("Work Queue");
        workQueueJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workQueueJButtonActionPerformed(evt);
            }
        });

        sentWorkQueueJButton.setText("Sent Work Queue");
        sentWorkQueueJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sentWorkQueueJButtonActionPerformed(evt);
            }
        });

        noOfPendingRequestsJTextField.setEditable(false);

        jLabel2.setText("No of Pending Requests");

        refreshJButton2.setText("Refresh Counter");
        refreshJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButton2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(57, 57, 57)
                .add(jLabel1))
            .add(layout.createSequentialGroup()
                .add(122, 122, 122)
                .add(workQueueJButton))
            .add(layout.createSequentialGroup()
                .add(107, 107, 107)
                .add(sentWorkQueueJButton))
            .add(layout.createSequentialGroup()
                .add(refreshJButton2)
                .add(6, 6, 6)
                .add(jLabel2)
                .add(6, 6, 6)
                .add(noOfPendingRequestsJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(jLabel1)
                .add(54, 54, 54)
                .add(workQueueJButton)
                .add(30, 30, 30)
                .add(sentWorkQueueJButton)
                .add(94, 94, 94)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(1, 1, 1)
                        .add(refreshJButton2))
                    .add(layout.createSequentialGroup()
                        .add(6, 6, 6)
                        .add(jLabel2))
                    .add(noOfPendingRequestsJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void workQueueJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workQueueJButtonActionPerformed
        // TODO add your handling code here:
        JPanel panel = new ShippingEmployeeWorkQueueJPanel(upcJPanel, network, manuEnt, ua);
        upcJPanel.add("SalesEmployeeWorkQueue", panel);
        CardLayout cardLayout = (CardLayout) upcJPanel.getLayout();
        cardLayout.next(upcJPanel);
    }//GEN-LAST:event_workQueueJButtonActionPerformed

    private void sentWorkQueueJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sentWorkQueueJButtonActionPerformed
        // TODO add your handling code here:
        JPanel panel = new ShippingManagerSentWorkQueueJPanel(upcJPanel, network, manuEnt, ua);
        upcJPanel.add("SalesEmployeeSentWorkQueue", panel);
        CardLayout cardLayout = (CardLayout) upcJPanel.getLayout();
        cardLayout.next(upcJPanel);
    }//GEN-LAST:event_sentWorkQueueJButtonActionPerformed

    private void refreshJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButton2ActionPerformed
        // TODO add your handling code here:
        refreshCounter();
    }//GEN-LAST:event_refreshJButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField noOfPendingRequestsJTextField;
    private javax.swing.JButton refreshJButton2;
    private javax.swing.JButton sentWorkQueueJButton;
    private javax.swing.JButton workQueueJButton;
    // End of variables declaration//GEN-END:variables
}
