/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Manufacturer.ProductManager;

import Business.Enterprise;
import Business.Manufacturer.Drug;
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
public class ProductManagerWorkAreaJPanel extends javax.swing.JPanel {

    JPanel upcJPanel;
    ManufacturerEnterprise manuEnt;
    UserAccount ua;
    Network network;
    /**
     * Creates new form ProductManagerWorkAreaJPanel
     */
    public ProductManagerWorkAreaJPanel(JPanel upcJPanel, Network network, Enterprise ent, UserAccount ua) {
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

            nameJTextField.setText(ua.getEmployee().getName());
            idJTextField.setText(String.valueOf(ua.getEmployee().getId()));
            
            for (Drug d : manuEnt.getProdMgmtOrg().getDrugCatalog().getDrugList()){
                existingDrugsJComboBox.addItem(d);
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
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        idJTextField = new javax.swing.JTextField();
        manageDrugCatalogJButton = new javax.swing.JButton();
        applyForNewDrugJButton = new javax.swing.JButton();
        reapplyForExistingDrugJButton = new javax.swing.JButton();
        existingDrugsJComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("--- PRODUCT MANAGER ---");

        jLabel2.setText("Name");

        nameJTextField.setEditable(false);
        nameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("ID");

        idJTextField.setEditable(false);

        manageDrugCatalogJButton.setText("Manage Drug Catalog");
        manageDrugCatalogJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDrugCatalogJButtonActionPerformed(evt);
            }
        });

        applyForNewDrugJButton.setText("Apply for New Drug");
        applyForNewDrugJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyForNewDrugJButtonActionPerformed(evt);
            }
        });

        reapplyForExistingDrugJButton.setText("Reapply for Existing Drug");
        reapplyForExistingDrugJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reapplyForExistingDrugJButtonActionPerformed(evt);
            }
        });

        existingDrugsJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existingDrugsJComboBoxActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(100, 100, 100)
                        .add(jLabel1))
                    .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(jLabel2)
                        .add(4, 4, 4)
                        .add(nameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 220, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(20, 20, 20)
                        .add(jLabel3)
                        .add(6, 6, 6)
                        .add(idJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(120, 120, 120)
                        .add(applyForNewDrugJButton))
                    .add(layout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(existingDrugsJComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 144, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(reapplyForExistingDrugJButton))
                    .add(layout.createSequentialGroup()
                        .add(98, 98, 98)
                        .add(manageDrugCatalogJButton)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(jLabel1)
                .add(14, 14, 14)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(nameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(idJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2)
                            .add(jLabel3))))
                .add(32, 32, 32)
                .add(applyForNewDrugJButton)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(reapplyForExistingDrugJButton)
                    .add(existingDrugsJComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 22, Short.MAX_VALUE)
                .add(manageDrugCatalogJButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTextFieldActionPerformed

    private void manageDrugCatalogJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDrugCatalogJButtonActionPerformed
        // TODO add your handling code here:
        ManageDrugsJPanel mdjp = new ManageDrugsJPanel(upcJPanel, network, manuEnt, ua);
        upcJPanel.add("Manage Drugs", mdjp);
        CardLayout card = (CardLayout) upcJPanel.getLayout();
        card.next(upcJPanel);
    }//GEN-LAST:event_manageDrugCatalogJButtonActionPerformed

    private void applyForNewDrugJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyForNewDrugJButtonActionPerformed
        // TODO add your handling code here:
        INDJPanel ijp = new INDJPanel(upcJPanel, network, manuEnt, ua);
        upcJPanel.add("IND Application", ijp);
        CardLayout card = (CardLayout)upcJPanel.getLayout();
        card.next(upcJPanel);
    }//GEN-LAST:event_applyForNewDrugJButtonActionPerformed

    private void reapplyForExistingDrugJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reapplyForExistingDrugJButtonActionPerformed
        // TODO add your handling code here:
        Drug selectedDrug = (Drug)existingDrugsJComboBox.getSelectedItem();
        ReapplyDrugLicenseJPanel rdljp = new ReapplyDrugLicenseJPanel(upcJPanel, network, manuEnt, ua, selectedDrug);
        upcJPanel.add("Reapply for Existing Drug", rdljp);
        CardLayout card = (CardLayout)upcJPanel.getLayout();
        card.next(upcJPanel);
    }//GEN-LAST:event_reapplyForExistingDrugJButtonActionPerformed

    private void existingDrugsJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existingDrugsJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_existingDrugsJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyForNewDrugJButton;
    private javax.swing.JComboBox existingDrugsJComboBox;
    private javax.swing.JTextField idJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton manageDrugCatalogJButton;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JButton reapplyForExistingDrugJButton;
    // End of variables declaration//GEN-END:variables
}
