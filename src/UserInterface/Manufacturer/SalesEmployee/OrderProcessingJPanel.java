/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Manufacturer.SalesEmployee;

import Business.Enterprise;
import Business.Manufacturer.Drug;
import Business.Manufacturer.ManufacturerEnterprise;
import Business.Manufacturer.ManufacturerShippingOrganization;
import Business.Manufacturer.ManufacturerOrder;
import Business.Manufacturer.ManufacturerOrderItem;
import Business.Manufacturer.ManufacturerSalesWorkRequest;
import Business.Organization;
import Business.Manufacturer.ManufacturerShipWorkRequest;
import Business.Network;
import Business.UserAccount;
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
public class OrderProcessingJPanel extends javax.swing.JPanel {

    JPanel upcJPanel;
    ManufacturerEnterprise manuEnt;
    UserAccount ua;
    Network network;
    ManufacturerOrder tempOrder;
    ManufacturerOrderItem oi;

    /**
     * Creates new form OrderProcessingJPanel
     */
    public OrderProcessingJPanel(JPanel upcJPanel, Network network, Enterprise ent, UserAccount ua) {
        initComponents();
        this.upcJPanel = upcJPanel;
        this.manuEnt = (ManufacturerEnterprise) ent;
        this.ua = ua;
        this.network = network;
        tempOrder = new ManufacturerOrder();

        cartRefresh();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refreshCartJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        refreshCartJButton.setText("Refresh Cart");
        refreshCartJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshCartJButtonActionPerformed(evt);
            }
        });

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        cartJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Drug Name", "Price", "Quantity", "Total Amount"
            }
        ));
        jScrollPane2.setViewportView(cartJTable);

        jLabel1.setText("--- ORDER DRUGS ---");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(207, 207, 207)
                        .add(jLabel1)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, backJButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, refreshCartJButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(processJButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(7, 7, 7)
                .add(jLabel1)
                .add(18, 18, 18)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .add(21, 21, 21)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(processJButton)
                    .add(refreshCartJButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(backJButton)
                .add(7, 7, 7))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void cartRefresh() {
        int rowCount = cartJTable.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) cartJTable.getModel()).removeRow(i);
        }

        ArrayList<WorkRequest> swList = manuEnt.getMyOrganization(ua).getWorkQueue().getWorkRequestList();
        for (WorkRequest wr : swList) {
            if (wr instanceof ManufacturerSalesWorkRequest) {
                if (wr.getStatus().equals(WorkRequest.Status.Processsing)) {
                    break;
                } else {
                    Object row[] = new Object[5];
                    row[1] = wr.getDrug();
                    row[2] = wr.getDrug().getPrice();
                    row[3] = wr.getQuantity();
                    row[4] = (wr.getQuantity()) * (wr.getDrug().getPrice());
                    row[0] = wr;
                    ((DefaultTableModel) cartJTable.getModel()).addRow(row);
                }
            }
        }
    }

    private void refreshCartJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshCartJButtonActionPerformed
        // TODO add your handling code here:
        cartRefresh();
    }//GEN-LAST:event_refreshCartJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = cartJTable.getSelectedRow();
        WorkRequest request = (WorkRequest) cartJTable.getValueAt(selectedRow, 0);
        Drug d = (Drug) cartJTable.getValueAt(selectedRow, 1);

        if (d.getLicense().equals(Boolean.TRUE)) {
            request.setReceiver(ua);
            request.setStatus(WorkRequest.Status.Processsing);

            Drug requiredDrug = (Drug) cartJTable.getValueAt(selectedRow, 1);

            if (requiredDrug.getAvailable() < requiredDrug.getThreshold()) {
                manuEnt.getProdMgmtOrg().getDrugCatalog().addQuantity(requiredDrug, (requiredDrug.getThreshold() - requiredDrug.getAvailable()));
            }

            ManufacturerOrder addedOrder = manuEnt.getSalesOrg().getMasterOrderList().addOrder(tempOrder, ua);

            JOptionPane.showMessageDialog(null, "Order Placed!");

            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (e instanceof ManufacturerEnterprise) {
                    if (e.equals(manuEnt)) {
                        //System.out.println(e);
                        ArrayList<Organization> organizationList = e.getOrganizationDirectory().getOrganizationList();

                        for (Organization o : organizationList) {
                            if (o instanceof ManufacturerShippingOrganization) {

                                if ((requiredDrug.getAvailable()) < (Integer.parseInt(cartJTable.getValueAt(selectedRow, 3).toString()))) {
                                    manuEnt.getProdMgmtOrg().getDrugCatalog().addQuantity(requiredDrug, (Integer.parseInt(cartJTable.getValueAt(selectedRow, 3).toString())) - requiredDrug.getAvailable());
                                    if (requiredDrug.getAvailable() < requiredDrug.getThreshold()) {
                                        manuEnt.getProdMgmtOrg().getDrugCatalog().addQuantity(requiredDrug, (requiredDrug.getThreshold() - requiredDrug.getAvailable()));
                                    }
                                }

                                ManufacturerShipWorkRequest req;
                                req = (ManufacturerShipWorkRequest) o.getWorkQueue().newWorkRequest(Business.WorkRequest.Type.ManufacturerShipWorkRequest);
                                req.setSender(ua);
                                req.setDrug(requiredDrug);
                                req.setQuantity(Integer.parseInt(cartJTable.getValueAt(selectedRow, 3).toString()));
                                req.setStatus(WorkRequest.Status.Processsing);
                                req.setSalesWorkRequest((ManufacturerSalesWorkRequest) cartJTable.getValueAt(selectedRow, 0));
                                oi = tempOrder.newOrderItem();
                                oi.setDrug(requiredDrug);
                                oi.setQuantity(Integer.parseInt(String.valueOf(cartJTable.getValueAt(selectedRow, 3))));
                                oi.setPrice(requiredDrug.getPrice());
                                oi.setId(req.getId());
                                tempOrder.setUa(ua);
                                req.setOrderItem(oi);
                                requiredDrug.setAvailable(requiredDrug.getAvailable() - oi.getQuantity());
                                requiredDrug.addToPedigree(ua);
                                requiredDrug.addToRequestIDs(req.getId());

                                if (requiredDrug.getAvailable() < requiredDrug.getThreshold()) {
                                    manuEnt.getProdMgmtOrg().getDrugCatalog().addQuantity(requiredDrug, (requiredDrug.getThreshold() - requiredDrug.getAvailable()));
                                }

                                //Adding request to sender's list
                                Organization org = manuEnt.getMyOrganization(ua);
                                org.getSentWorkQueue().addRequest(req);

                                manuEnt.getMyOrganization(ua).getWorkQueue().removeRequest(request);
                                JOptionPane.showMessageDialog(null, "New Request Generated!!!");
                            }
                        }
                    }
                }
            }
            upcJPanel.remove(this);
            CardLayout card = (CardLayout) upcJPanel.getLayout();
            card.previous(upcJPanel);
        } else {
            JOptionPane.showMessageDialog(null, "Drug not licensed for trade");
        }
    }//GEN-LAST:event_processJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:

        upcJPanel.remove(this);
        CardLayout cardLayout = (CardLayout) upcJPanel.getLayout();
        cardLayout.previous(upcJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable cartJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshCartJButton;
    // End of variables declaration//GEN-END:variables
}
