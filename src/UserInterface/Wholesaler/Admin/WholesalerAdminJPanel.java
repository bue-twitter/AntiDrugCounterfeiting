/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Wholesaler.Admin;

import Business.Enterprise;
import Business.Manufacturer.Drug;
import Business.Network;
import Business.UserAccount;
import Business.Wholesaler.WholesalerEnterprise;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public class WholesalerAdminJPanel extends javax.swing.JPanel {

    JPanel upcJPanel;
    WholesalerEnterprise wholeEnt;
    UserAccount ua;
    Network network;

    /**
     * Creates new form WholesalerAdminJPanel
     */
    public WholesalerAdminJPanel(JPanel upcJPanel, Network network, Enterprise e, UserAccount ua) {
        this.upcJPanel = upcJPanel;
        this.wholeEnt = (WholesalerEnterprise) e;
        this.ua = ua;
        this.network = network;
        if (wholeEnt.getActive().equals(Boolean.FALSE)) {
            JOptionPane.showMessageDialog(null, "Wholesaler banned by FDA");
            upcJPanel.removeAll();
            CardLayout card = (CardLayout) upcJPanel.getLayout();
            card.previous(upcJPanel);
        } else {
            initComponents();
            
        if (wholeEnt.getLicense().equals(Boolean.FALSE)) {
            addInvMngrJButton.setEnabled(false);
            addSalesEmpJButton1.setEnabled(false);
            addShipMngrJButton1.setEnabled(false);
        }
            for (Drug d : Business.Business.getInstance().getFakeDrugs()) {
                if (d.getWholeEnt().equals(wholeEnt)) {
                    JOptionPane.showMessageDialog(null, "Drug '" + d + "' has been discontinued as it found as fake. Please check the list of Fake Drugs for further details.");
                    JOptionPane.showMessageDialog(null, "You may submit a report of drug '" + d + "' which will be evaluated. If we find the report varies from our findings, you may be cleared off charges.");
                }
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

        wholesalerEnterpriseJLabel = new javax.swing.JLabel();
        addInvMngrJButton = new javax.swing.JButton();
        viewSuspectedDrugsJButton = new javax.swing.JButton();
        viewFakeDrugsJButton = new javax.swing.JButton();
        sendReportJButton = new javax.swing.JButton();
        applyLicenseJButton = new javax.swing.JButton();
        addSalesEmpJButton1 = new javax.swing.JButton();
        addShipMngrJButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wholesalerEnterpriseJLabel.setText("--- WHOLESALER ENTERPRISE ---");
        add(wholesalerEnterpriseJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 8, -1, -1));

        addInvMngrJButton.setText("Add Inventory Manager");
        addInvMngrJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInvMngrJButtonActionPerformed(evt);
            }
        });
        add(addInvMngrJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 173, -1, -1));

        viewSuspectedDrugsJButton.setText("View Suspected Drugs");
        viewSuspectedDrugsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSuspectedDrugsJButtonActionPerformed(evt);
            }
        });
        add(viewSuspectedDrugsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 136, -1, -1));

        viewFakeDrugsJButton.setText("View Fake Drugs");
        viewFakeDrugsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFakeDrugsJButtonActionPerformed(evt);
            }
        });
        add(viewFakeDrugsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 101, -1, -1));

        sendReportJButton.setText("Send Evaluation Report");
        sendReportJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendReportJButtonActionPerformed(evt);
            }
        });
        add(sendReportJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 171, -1, -1));

        applyLicenseJButton.setText("Apply for License");
        applyLicenseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyLicenseJButtonActionPerformed(evt);
            }
        });
        add(applyLicenseJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 221, -1, -1));

        addSalesEmpJButton1.setText("Add Sales Employee");
        addSalesEmpJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSalesEmpJButton1ActionPerformed(evt);
            }
        });
        add(addSalesEmpJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 138, -1, -1));

        addShipMngrJButton1.setText("Add Shipping Manager");
        addShipMngrJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addShipMngrJButton1ActionPerformed(evt);
            }
        });
        add(addShipMngrJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 103, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addInvMngrJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInvMngrJButtonActionPerformed
        // TODO add your handling code here:

        CreateWholesalerInventoryManagerJPanel cpmjp = new CreateWholesalerInventoryManagerJPanel(upcJPanel, network, wholeEnt, ua);
        upcJPanel.add("Create Wholesaler Inventory Manager", cpmjp);
        CardLayout card = (CardLayout) upcJPanel.getLayout();
        card.next(upcJPanel);

    }//GEN-LAST:event_addInvMngrJButtonActionPerformed

    private void viewSuspectedDrugsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSuspectedDrugsJButtonActionPerformed
        // TODO add your handling code here:
        ViewSuspectedDrugsJPanel vsdjp = new ViewSuspectedDrugsJPanel(upcJPanel);
        upcJPanel.add("View Suspected Drugs", vsdjp);
        CardLayout card = (CardLayout) upcJPanel.getLayout();
        card.next(upcJPanel);
    }//GEN-LAST:event_viewSuspectedDrugsJButtonActionPerformed

    private void viewFakeDrugsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFakeDrugsJButtonActionPerformed
        // TODO add your handling code here:
        ViewFakeDrugsJPanel vfdjp = new ViewFakeDrugsJPanel(upcJPanel);
        upcJPanel.add("View Fake Drugs", vfdjp);
        CardLayout card = (CardLayout) upcJPanel.getLayout();
        card.next(upcJPanel);
    }//GEN-LAST:event_viewFakeDrugsJButtonActionPerformed

    private void sendReportJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendReportJButtonActionPerformed
        // TODO add your handling code here:
        WholesalerForensicReportJPanel mfrjp = new WholesalerForensicReportJPanel(upcJPanel, network, wholeEnt, ua);
        upcJPanel.add("Wholesaler Report", mfrjp);
        CardLayout card = (CardLayout) upcJPanel.getLayout();
        card.next(upcJPanel);
    }//GEN-LAST:event_sendReportJButtonActionPerformed

    private void applyLicenseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyLicenseJButtonActionPerformed
        // TODO add your handling code here:

        ApplyForLicenseJPanel afljp = new ApplyForLicenseJPanel(upcJPanel, network, wholeEnt, ua);
        upcJPanel.add("Apply for License", afljp);
        CardLayout card = (CardLayout) upcJPanel.getLayout();
        card.next(upcJPanel);

    }//GEN-LAST:event_applyLicenseJButtonActionPerformed

    private void addSalesEmpJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSalesEmpJButton1ActionPerformed
        // TODO add your handling code here:
        CreateWholesalerSalesEmployeeJPanel csejp = new CreateWholesalerSalesEmployeeJPanel(upcJPanel, network, wholeEnt, ua);
        upcJPanel.add("Create Sales Employee", csejp);
        CardLayout card = (CardLayout) upcJPanel.getLayout();
        card.next(upcJPanel);

    }//GEN-LAST:event_addSalesEmpJButton1ActionPerformed

    private void addShipMngrJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addShipMngrJButton1ActionPerformed
        // TODO add your handling code here:
        CreateWholesalerShippingManagerJPanel csmjp = new CreateWholesalerShippingManagerJPanel(upcJPanel, network, wholeEnt, ua);
        upcJPanel.add("Create Shipping Manager", csmjp);
        CardLayout card = (CardLayout) upcJPanel.getLayout();
        card.next(upcJPanel);

    }//GEN-LAST:event_addShipMngrJButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addInvMngrJButton;
    private javax.swing.JButton addSalesEmpJButton1;
    private javax.swing.JButton addShipMngrJButton1;
    private javax.swing.JButton applyLicenseJButton;
    private javax.swing.JButton sendReportJButton;
    private javax.swing.JButton viewFakeDrugsJButton;
    private javax.swing.JButton viewSuspectedDrugsJButton;
    private javax.swing.JLabel wholesalerEnterpriseJLabel;
    // End of variables declaration//GEN-END:variables
}
