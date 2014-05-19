/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Patient;

import Business.Network;
import Business.Patient;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public class PatientMainScreenJPanel extends javax.swing.JPanel {

    JPanel upcJPanel;
    Patient p;
    Network network;
    /**
     * Creates new form PatientMainScreenJPanel
     */
    public PatientMainScreenJPanel(JPanel upcJPanel, Network network, Patient p) {
        initComponents();
        this.upcJPanel = upcJPanel;
        this.p = p;
        this.network = network;
        nameJTextField.setText(p.getName());
        idJTextField.setText(String.valueOf(p.getId()));
        
        
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
        checkDrugJButton = new javax.swing.JButton();
        reportAdverseEffectJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        idJTextField = new javax.swing.JTextField();
        purchaseDrugJButton = new javax.swing.JButton();
        checkPharmacistJButton = new javax.swing.JButton();
        reportSuspiciousDrugJButton = new javax.swing.JButton();
        viewSuspectedDrugsJButton = new javax.swing.JButton();
        viewFakeDrugsJButton = new javax.swing.JButton();
        viewSideEffectsJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("--- PATIENT MAIN SCREEN ---");

        checkDrugJButton.setText("Check Drug");
        checkDrugJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDrugJButtonActionPerformed(evt);
            }
        });

        reportAdverseEffectJButton.setText("Report Adverse Effect");
        reportAdverseEffectJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportAdverseEffectJButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        nameJTextField.setEditable(false);

        jLabel3.setText("ID");

        idJTextField.setEditable(false);

        purchaseDrugJButton.setText("Purchase Drug");
        purchaseDrugJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseDrugJButtonActionPerformed(evt);
            }
        });

        checkPharmacistJButton.setText("Check Pharmacist");
        checkPharmacistJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPharmacistJButtonActionPerformed(evt);
            }
        });

        reportSuspiciousDrugJButton.setText("Report Suspicious Drug");
        reportSuspiciousDrugJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportSuspiciousDrugJButtonActionPerformed(evt);
            }
        });

        viewSuspectedDrugsJButton.setText("View Suspected Drugs");
        viewSuspectedDrugsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSuspectedDrugsJButtonActionPerformed(evt);
            }
        });

        viewFakeDrugsJButton.setText("View Fake Drugs");
        viewFakeDrugsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFakeDrugsJButtonActionPerformed(evt);
            }
        });

        viewSideEffectsJButton.setText("View Side Effects");
        viewSideEffectsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSideEffectsJButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(jLabel2)
                        .add(4, 4, 4)
                        .add(nameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(100, 100, 100)
                        .add(jLabel3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(idJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 88, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(17, 17, 17)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(layout.createSequentialGroup()
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                        .add(viewFakeDrugsJButton)
                                        .add(viewSideEffectsJButton))
                                    .add(35, 35, 35))
                                .add(layout.createSequentialGroup()
                                    .add(2, 2, 2)
                                    .add(viewSuspectedDrugsJButton)))
                            .add(checkDrugJButton))
                        .add(96, 96, 96)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, reportSuspiciousDrugJButton)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(checkPharmacistJButton)
                                .add(reportAdverseEffectJButton))))
                    .add(layout.createSequentialGroup()
                        .add(109, 109, 109)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(purchaseDrugJButton)
                            .add(jLabel1))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(6, 6, 6)
                .add(jLabel1)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(nameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(idJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2)
                            .add(jLabel3))))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(119, 119, 119)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(viewSideEffectsJButton)
                            .add(reportSuspiciousDrugJButton))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(viewFakeDrugsJButton)
                            .add(reportAdverseEffectJButton))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(viewSuspectedDrugsJButton))
                    .add(layout.createSequentialGroup()
                        .add(52, 52, 52)
                        .add(purchaseDrugJButton))
                    .add(layout.createSequentialGroup()
                        .add(267, 267, 267)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(checkPharmacistJButton)
                            .add(checkDrugJButton))))
                .add(57, 57, 57))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkDrugJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDrugJButtonActionPerformed
        // TODO add your handling code here:
        CheckDrugJPanel cdjp = new CheckDrugJPanel(upcJPanel, p);
        upcJPanel.add("Check Drug", cdjp);
        CardLayout card = (CardLayout) upcJPanel.getLayout();
        card.next(upcJPanel);
    }//GEN-LAST:event_checkDrugJButtonActionPerformed

    private void reportAdverseEffectJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportAdverseEffectJButtonActionPerformed
        // TODO add your handling code here:
        ReportAdverseEffectJPanel raejp = new ReportAdverseEffectJPanel(upcJPanel, network, p);
        upcJPanel.add("Report Adverse Effect", raejp);
        CardLayout card = (CardLayout) upcJPanel.getLayout();
        card.next(upcJPanel);
    }//GEN-LAST:event_reportAdverseEffectJButtonActionPerformed

    private void purchaseDrugJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseDrugJButtonActionPerformed
        // TODO add your handling code here:
        PurchaseDrugJPanel pdjp = new PurchaseDrugJPanel(upcJPanel, network, p);
        upcJPanel.add("Purchase Drugs", pdjp);
        CardLayout card = (CardLayout)upcJPanel.getLayout();
        card.next(upcJPanel);
    }//GEN-LAST:event_purchaseDrugJButtonActionPerformed

    private void checkPharmacistJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPharmacistJButtonActionPerformed
        // TODO add your handling code here:
        CheckPharmacistJPanel cdjp = new CheckPharmacistJPanel(upcJPanel, p);
        upcJPanel.add("Check Pharmacist", cdjp);
        CardLayout card = (CardLayout) upcJPanel.getLayout();
        card.next(upcJPanel);
    }//GEN-LAST:event_checkPharmacistJButtonActionPerformed

    private void reportSuspiciousDrugJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportSuspiciousDrugJButtonActionPerformed
        // TODO add your handling code here:
        ReportSuspicionDrugJPanel rsdjp = new ReportSuspicionDrugJPanel(upcJPanel, network, p);
        upcJPanel.add("Report Suspicious Drug", rsdjp);
        CardLayout card = (CardLayout) upcJPanel.getLayout();
        card.next(upcJPanel);
    }//GEN-LAST:event_reportSuspiciousDrugJButtonActionPerformed

    private void viewSuspectedDrugsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSuspectedDrugsJButtonActionPerformed
        // TODO add your handling code here:
        ViewSuspectedDrugsJPanel vsdjp = new ViewSuspectedDrugsJPanel(upcJPanel);
        upcJPanel.add("View Suspected Drugs", vsdjp);
        CardLayout card = (CardLayout)upcJPanel.getLayout();
        card.next(upcJPanel);
    }//GEN-LAST:event_viewSuspectedDrugsJButtonActionPerformed

    private void viewFakeDrugsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFakeDrugsJButtonActionPerformed
        // TODO add your handling code here:
        ViewFakeDrugsJPanel vfdjp = new ViewFakeDrugsJPanel(upcJPanel);
        upcJPanel.add("View Fake Drugs", vfdjp);
        CardLayout card = (CardLayout)upcJPanel.getLayout();
        card.next(upcJPanel);
    }//GEN-LAST:event_viewFakeDrugsJButtonActionPerformed

    private void viewSideEffectsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSideEffectsJButtonActionPerformed
        // TODO add your handling code here:
        ViewSideEffectsJPanel vsfjp = new ViewSideEffectsJPanel(upcJPanel, p, network);
        upcJPanel.add("View Side Effects", vsfjp);
        CardLayout card = (CardLayout)upcJPanel.getLayout();
        card.next(upcJPanel);
    }//GEN-LAST:event_viewSideEffectsJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkDrugJButton;
    private javax.swing.JButton checkPharmacistJButton;
    private javax.swing.JTextField idJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JButton purchaseDrugJButton;
    private javax.swing.JButton reportAdverseEffectJButton;
    private javax.swing.JButton reportSuspiciousDrugJButton;
    private javax.swing.JButton viewFakeDrugsJButton;
    private javax.swing.JButton viewSideEffectsJButton;
    private javax.swing.JButton viewSuspectedDrugsJButton;
    // End of variables declaration//GEN-END:variables
}
