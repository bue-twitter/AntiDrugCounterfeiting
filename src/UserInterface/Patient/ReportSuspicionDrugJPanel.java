/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Patient;

import Business.Enterprise;
import Business.FDA.CDEROrganization;
import Business.FDA.FDAEnterprise;
import Business.FDA.ReportSuspicionWorkRequest;
import Business.Manufacturer.Drug;
import Business.Network;
import Business.Organization;
import Business.Patient;
import Business.PatientOrderItem;
import Business.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public class ReportSuspicionDrugJPanel extends javax.swing.JPanel {

    JPanel upcJPanel;
    Patient p;
    Network network;
    /**
     * Creates new form ReportSuspicionDrugJPanel
     */
    public ReportSuspicionDrugJPanel(JPanel upcJPanel, Network network, Patient p) {
        initComponents();
        this.upcJPanel = upcJPanel;
        this.p = p;
        this.network = network;
        for(PatientOrderItem poi : p.getPatientOrders()){
            drugJComboBox.addItem(poi.getDrug());
        }
        tamperingJComboBox.addItem("Color");
        tamperingJComboBox.addItem("Shape");
        tamperingJComboBox.addItem("Packaging");
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
        jLabel2 = new javax.swing.JLabel();
        tamperingJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        drugJComboBox = new javax.swing.JComboBox();
        reportSuspicionJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("-- REPORT SUSPICION ---");

        jLabel2.setText("Change in");

        jLabel3.setText("Comments");

        jLabel4.setText("Drug");

        reportSuspicionJButton.setText("Report Suspicion");
        reportSuspicionJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportSuspicionJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel1)
                .add(109, 109, 109))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(layout.createSequentialGroup()
                        .add(37, 37, 37)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jLabel3)
                                .add(18, 18, 18)
                                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 222, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jLabel4)
                                    .add(jLabel2))
                                .add(18, 18, 18)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(tamperingJComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 139, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(drugJComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 139, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                    .add(layout.createSequentialGroup()
                        .add(22, 22, 22)
                        .add(backJButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(reportSuspicionJButton)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .add(50, 50, 50)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(drugJComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(tamperingJComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 69, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(reportSuspicionJButton)
                    .add(backJButton))
                .add(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reportSuspicionJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportSuspicionJButtonActionPerformed
        // TODO add your handling code here:
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (e instanceof FDAEnterprise) {
                for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                    if (org instanceof CDEROrganization) {
                        ReportSuspicionWorkRequest request = (ReportSuspicionWorkRequest) org.getWorkQueue().newWorkRequest(WorkRequest.Type.ReportSuspicionWorkRequest);
                        request.setDrug((Drug)drugJComboBox.getSelectedItem());
                        request.setP(p);
                        request.setReason(String.valueOf(tamperingJComboBox.getSelectedItem()));
                        request.getDrug().setLicense(Boolean.FALSE);
                        Business.Business.getInstance().addSuspectedDrug(request.getDrug());
                       
                        JOptionPane.showMessageDialog(null, "Drug '" +request.getDrug()+ "' reported to Center for Drug Evaluation & Research.");
                    }
                }
            }
        }
    }//GEN-LAST:event_reportSuspicionJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        upcJPanel.remove(this);
        CardLayout card = (CardLayout)upcJPanel.getLayout();
        card.previous(upcJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox drugJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton reportSuspicionJButton;
    private javax.swing.JComboBox tamperingJComboBox;
    // End of variables declaration//GEN-END:variables
}
