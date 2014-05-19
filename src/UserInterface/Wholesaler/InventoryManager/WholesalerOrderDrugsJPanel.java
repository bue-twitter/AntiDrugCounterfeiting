/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Wholesaler.InventoryManager;

import Business.Dispenser.DispenserEnterprise;
import Business.Enterprise;
import Business.Manufacturer.Drug;
import Business.Manufacturer.ManufacturerEnterprise;
import Business.Manufacturer.ManufacturerSalesOrganization;
import Business.Organization;
import Business.Manufacturer.ManufacturerSalesWorkRequest;
import Business.Network;
import Business.UserAccount;
import Business.Wholesaler.WholesalerEnterprise;
import Business.Wholesaler.WholesalerShipWorkRequest;
import Business.Wholesaler.WholesalerShippingOrganization;
import Business.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karanmankodi
 */
public class WholesalerOrderDrugsJPanel extends javax.swing.JPanel {

    private WholesalerEnterprise wholeEnt;
    private JPanel upcJPanel;
    private UserAccount ua;
    Network network;
    private Drug searchDrug;
    ArrayList<ManufacturerEnterprise> manuEntList;
    private DispenserEnterprise tempDispEnt;

    /**
     * Creates new form WholesalerOrderDrugsJPanel
     */
    public WholesalerOrderDrugsJPanel(JPanel upcJPanel, Network network, Enterprise ent, UserAccount ua) {
        initComponents();

        this.wholeEnt = (WholesalerEnterprise) ent;
        this.upcJPanel = upcJPanel;
        this.ua = ua;
        this.network = network;
        for (Network n : Business.Business.getInstance().getNetworkDritectory().getNetworkList()) {
            manuEntList = n.getEnterpriseDirectory().searchManuEnterprise();
            for (ManufacturerEnterprise e : manuEntList) {
                for (Drug d : e.getProdMgmtOrg().getDrugCatalog().getDrugList()) {
                    drugsJComboBox.addItem(d);
                }
            }
        }
        refreshWorkRequestTable();
    }

    private void refreshWorkRequestTable() {
        int rowCount = catalogJTable.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) catalogJTable.getModel()).removeRow(i);
        }

        for (Network n : Business.Business.getInstance().getNetworkDritectory().getNetworkList()) {
            manuEntList = n.getEnterpriseDirectory().searchManuEnterprise();
            for (ManufacturerEnterprise e : manuEntList) {
                for (Drug d : e.getProdMgmtOrg().getDrugCatalog().getDrugList()) {

                    Object row[] = new Object[4];
                    row[0] = d;
                    row[1] = d.getId();
                    row[2] = d.getAvailable();
                    row[3] = d.getManuEnt();
                    ((DefaultTableModel) catalogJTable.getModel()).addRow(row);

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

        orderJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        searchDrugJLabel = new javax.swing.JLabel();
        searchDrugJTextField = new javax.swing.JTextField();
        searchDrugJButton = new javax.swing.JButton();
        drugsJComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        catalogJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        idJLabel = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        quantityJLabel = new javax.swing.JLabel();
        nameJLabel = new javax.swing.JLabel();
        quantityJTextField = new javax.swing.JTextField();
        manufacturerJLabel = new javax.swing.JLabel();
        priceJLabel = new javax.swing.JLabel();
        manufacturerJTextField = new javax.swing.JTextField();
        idJTextField = new javax.swing.JTextField();
        priceJTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        orderJButton.setText("Order");
        orderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        searchDrugJLabel.setText("Search for Drug");

        searchDrugJButton.setText("Search");
        searchDrugJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDrugJButtonActionPerformed(evt);
            }
        });

        drugsJComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drugsJComboBoxMouseClicked(evt);
            }
        });
        drugsJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugsJComboBoxActionPerformed(evt);
            }
        });

        catalogJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Drug", "Drug ID", "Available Quantity", "Manufacturer"
            }
        ));
        catalogJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catalogJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(catalogJTable);

        jLabel1.setText("--- PLACE ORDER FOR A NEW DRUG ---");

        idJLabel.setText("ID");

        nameJTextField.setEditable(false);

        quantityJLabel.setText("Quantity");

        nameJLabel.setText("Name");

        quantityJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityJTextFieldActionPerformed(evt);
            }
        });

        manufacturerJLabel.setText("Manufacturer");

        priceJLabel.setText("Price");

        manufacturerJTextField.setEditable(false);

        idJTextField.setEditable(false);

        priceJTextField.setEditable(false);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(searchDrugJLabel)
                .add(12, 12, 12)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(drugsJComboBox, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(searchDrugJTextField))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(searchDrugJButton)
                .add(25, 25, 25))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(54, 54, 54)
                        .add(priceJLabel)
                        .add(10, 10, 10)
                        .add(priceJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(84, 84, 84)
                        .add(quantityJLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(quantityJTextField))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(nameJLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(nameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 192, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 35, Short.MAX_VALUE)
                        .add(idJLabel)
                        .add(18, 18, 18)
                        .add(idJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 271, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(manufacturerJLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(manufacturerJTextField)))
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(145, 145, 145)
                .add(jLabel1)
                .add(0, 0, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(backJButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(orderJButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel1)
                .add(14, 14, 14)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(searchDrugJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(searchDrugJButton)
                    .add(searchDrugJLabel))
                .add(10, 10, 10)
                .add(drugsJComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(10, 10, 10)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(idJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(idJLabel)
                    .add(nameJLabel)
                    .add(nameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(manufacturerJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(manufacturerJLabel))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(priceJLabel))
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(priceJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(quantityJLabel)
                        .add(quantityJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(82, 82, 82)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(backJButton)
                    .add(orderJButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderJButtonActionPerformed
        // TODO add your handling code here:
        if (searchDrug.getLicense().equals(Boolean.TRUE)) {
            for (Network n : Business.Business.getInstance().getNetworkDritectory().getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    if (e instanceof ManufacturerEnterprise) {
                        if (e.equals(searchDrug.getManuEnt())) {
                            //System.out.println(e);
                            ArrayList<Organization> organizationList = e.getOrganizationDirectory().getOrganizationList();

                            for (Organization o : organizationList) {
                                if (o instanceof ManufacturerSalesOrganization) {

                                    ManufacturerSalesWorkRequest request = (ManufacturerSalesWorkRequest) o.getWorkQueue().newWorkRequest(WorkRequest.Type.ManufacturerSalesWorkRequest);
                                    request.setSender(ua);
                                    request.setDrug(searchDrug);
                                    request.setQuantity(Integer.parseInt(quantityJTextField.getText()));
                                    request.setManuEnt(searchDrug.getManuEnt());
                                    request.setWholeEnt(wholeEnt);
                                    searchDrug.addToPedigree(ua);
                                    searchDrug.addToRequestIDs(request.getId());
                                    request.addIDtoList(request.getId());
                                    for (Enterprise ent : n.getEnterpriseDirectory().getEnterpriseList()) {
                                        if (ent instanceof WholesalerEnterprise) {
                                            if (ent.equals(wholeEnt)) {
                                                //System.out.println(e);
                                                ArrayList<Organization> orgList = ent.getOrganizationDirectory().getOrganizationList();

                                                for (Organization organ : orgList) {
                                                    if (organ instanceof WholesalerShippingOrganization) {
                                                        for (WorkRequest workReq : organ.getWorkQueue().getWorkRequestList()) {
                                                            request.setWholeShipWorkRequest((WholesalerShipWorkRequest) workReq);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }


                                    //Adding request to sender's list
                                    Organization org = wholeEnt.getMyOrganization(ua);
                                    org.getSentWorkQueue().addRequest(request);

                                    JOptionPane.showMessageDialog(null, "New Request Generated!!!");
                                }
                            }

                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Drug not licensed for trade");
        }

    }//GEN-LAST:event_orderJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        upcJPanel.remove(this);
        CardLayout cardLayout = (CardLayout) upcJPanel.getLayout();
        cardLayout.previous(upcJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void searchDrugJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDrugJButtonActionPerformed
        // TODO add your handling code here:
        for (ManufacturerEnterprise manuEnt : manuEntList) {
            searchDrug = manuEnt.getProdMgmtOrg().getDrugCatalog().searchDrug(searchDrugJTextField.getText());
            idJTextField.setText(String.valueOf(searchDrug.getId()));
            nameJTextField.setText(String.valueOf(searchDrug.getName()));
            priceJTextField.setText(String.valueOf(searchDrug.getPrice()));
            manufacturerJTextField.setText(String.valueOf(searchDrug.getManuEnt()));
        }
    }//GEN-LAST:event_searchDrugJButtonActionPerformed

    private void drugsJComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drugsJComboBoxMouseClicked
        // TODO add your handling code here:
        searchDrug = (Drug) drugsJComboBox.getSelectedItem();
        idJTextField.setText(String.valueOf(searchDrug.getId()));
        nameJTextField.setText(String.valueOf(searchDrug.getName()));
        priceJTextField.setText(String.valueOf(searchDrug.getPrice()));
        manufacturerJTextField.setText(String.valueOf(searchDrug.getManuEnt()));
        
    }//GEN-LAST:event_drugsJComboBoxMouseClicked

    private void catalogJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catalogJTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = catalogJTable.getSelectedRow();
        searchDrug = (Drug) catalogJTable.getValueAt(selectedRow, 0);
        idJTextField.setText(String.valueOf(searchDrug.getId()));
        nameJTextField.setText(String.valueOf(searchDrug.getName()));
        priceJTextField.setText(String.valueOf(searchDrug.getPrice()));
        manufacturerJTextField.setText(String.valueOf(searchDrug.getManuEnt()));
        
    }//GEN-LAST:event_catalogJTableMouseClicked

    private void quantityJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityJTextFieldActionPerformed

    private void drugsJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugsJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugsJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable catalogJTable;
    private javax.swing.JComboBox drugsJComboBox;
    private javax.swing.JLabel idJLabel;
    private javax.swing.JTextField idJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manufacturerJLabel;
    private javax.swing.JTextField manufacturerJTextField;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JButton orderJButton;
    private javax.swing.JLabel priceJLabel;
    private javax.swing.JTextField priceJTextField;
    private javax.swing.JLabel quantityJLabel;
    private javax.swing.JTextField quantityJTextField;
    private javax.swing.JButton searchDrugJButton;
    private javax.swing.JLabel searchDrugJLabel;
    private javax.swing.JTextField searchDrugJTextField;
    // End of variables declaration//GEN-END:variables
}
