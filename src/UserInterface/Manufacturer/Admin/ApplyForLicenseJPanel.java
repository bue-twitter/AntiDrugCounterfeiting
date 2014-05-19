/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Manufacturer.Admin;

import Business.Enterprise;
import Business.FDA.FDAEnterprise;
import Business.Manufacturer.ManufacturerEnterprise;
import Business.FDA.EnterpriseLicenseRequest;
import Business.FDA.FederalLicensingOrganization;
import Business.Network;
import Business.Organization;
import Business.UserAccount;
import Business.WorkRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karanmankodi
 */
public class ApplyForLicenseJPanel extends javax.swing.JPanel {

    JPanel upcJPanel;
    ManufacturerEnterprise manuEnt;
    UserAccount ua;
    Network network;

    /**
     * Creates new form ApplyForLicenseJPanel
     */
    public ApplyForLicenseJPanel(JPanel upcJPanel, Network network, ManufacturerEnterprise manuEnt, UserAccount ua) {
        initComponents();
        this.upcJPanel = upcJPanel;
        this.manuEnt = manuEnt;
        this.ua = ua;
        this.network = network;
        
        nameJTextField.setText(manuEnt.getEnterpriseName());
        typeJTextField.setText(manuEnt.getType());
        line1JTextField.setText(manuEnt.getAddress().getLine1());
        cityJTextField.setText(manuEnt.getAddress().getCity());
        stateJTextField.setText(manuEnt.getAddress().getState());
        zipCodeJTextField.setText(String.valueOf(manuEnt.getAddress().getZipCode()));
        
        int rowCount = orgJTable.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) orgJTable.getModel()).removeRow(i);
        }
        
        for(Organization o : manuEnt.getOrganizationDirectory().getOrganizationList()){
            Object row[] = new Object[1];
            row[0] = o.getName();
            ((DefaultTableModel) orgJTable.getModel()).addRow(row);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        applyJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        typeJTextField = new javax.swing.JTextField();
        line1JTextField = new javax.swing.JTextField();
        cityJTextField = new javax.swing.JTextField();
        stateJTextField = new javax.swing.JTextField();
        zipCodeJTextField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        orgJTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setBackground(new java.awt.Color(255, 255, 255));

        applyJButton.setText("Apply");
        applyJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Enterprise Name");

        jLabel2.setText("Enterprise Type");

        jLabel3.setText("Address :");

        jLabel4.setText("Line 1");

        jLabel5.setText("City");

        jLabel6.setText("State");

        jLabel7.setText("Zip Code");

        orgJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Organizations"
            }
        ));
        jScrollPane3.setViewportView(orgJTable);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(jLabel1)
                .add(12, 12, 12)
                .add(nameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 396, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(jLabel2)
                .add(18, 18, 18)
                .add(typeJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 396, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(jLabel3))
            .add(layout.createSequentialGroup()
                .add(40, 40, 40)
                .add(jLabel4)
                .add(52, 52, 52)
                .add(line1JTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 396, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(layout.createSequentialGroup()
                .add(50, 50, 50)
                .add(jLabel5)
                .add(55, 55, 55)
                .add(cityJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 396, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(layout.createSequentialGroup()
                .add(50, 50, 50)
                .add(jLabel6)
                .add(49, 49, 49)
                .add(stateJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 396, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(jLabel7)
                .add(54, 54, 54)
                .add(zipCodeJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 396, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(layout.createSequentialGroup()
                .add(135, 135, 135)
                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 386, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(layout.createSequentialGroup()
                .add(280, 280, 280)
                .add(applyJButton))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(6, 6, 6)
                        .add(jLabel1))
                    .add(nameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(12, 12, 12)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(6, 6, 6)
                        .add(jLabel2))
                    .add(typeJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(46, 46, 46)
                .add(jLabel3)
                .add(4, 4, 4)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(jLabel4))
                    .add(line1JTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(12, 12, 12)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel5)
                    .add(cityJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(12, 12, 12)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel6)
                    .add(stateJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(2, 2, 2)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(jLabel7))
                    .add(zipCodeJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 149, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(26, 26, 26)
                .add(applyJButton))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void applyJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyJButtonActionPerformed
        // TODO add your handling code here:
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (e instanceof FDAEnterprise) {
                //System.out.println(e);
                ArrayList<Organization> organizationList = e.getOrganizationDirectory().getOrganizationList();
                for (Organization o : organizationList) {
                    if (o instanceof FederalLicensingOrganization) {

                        EnterpriseLicenseRequest request = (EnterpriseLicenseRequest) o.getWorkQueue().newWorkRequest(WorkRequest.Type.EnterpriseLicenseRequest);
                        request.setSender(ua);
                        request.setEnt(manuEnt);
                        request.setStatus(WorkRequest.Status.Sent);
                        request.getEntLic().setAppName(nameJTextField.getText());
                        request.getEntLic().setAppType(typeJTextField.getText());
                        request.getEntLic().setAppLine1(line1JTextField.getText());
                        request.getEntLic().setAppCity(cityJTextField.getText());
                        request.getEntLic().setAppState(stateJTextField.getText());
                        request.getEntLic().setAppZipCode(Integer.parseInt(zipCodeJTextField.getText()));
                        request.getEntLic().setAppOrgList(manuEnt.getOrganizationDirectory().getOrganizationList());
                        manuEnt.setId(request.getEntLic().getLicenseNo());
                        JOptionPane.showMessageDialog(null, "Approval Request Generated!!!");
                    }
                }

            }

        }

    }//GEN-LAST:event_applyJButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyJButton;
    private javax.swing.JTextField cityJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField line1JTextField;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable orgJTable;
    private javax.swing.JTextField stateJTextField;
    private javax.swing.JTextField typeJTextField;
    private javax.swing.JTextField zipCodeJTextField;
    // End of variables declaration//GEN-END:variables
}
