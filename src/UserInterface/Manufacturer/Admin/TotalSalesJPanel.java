/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Manufacturer.Admin;

import Business.Enterprise;
import Business.Manufacturer.ManufacturerEnterprise;
import Business.Manufacturer.ManufacturerOrder;
import Business.Manufacturer.ManufacturerOrderItem;
import Business.Network;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karanmankodi
 */
public class TotalSalesJPanel extends javax.swing.JPanel {

    JPanel upcJPanel;
    ManufacturerEnterprise manuEnt;
    UserAccount ua;
    Network network;

    /**
     * Creates new form TotalSalesJPanel
     */
    public TotalSalesJPanel(JPanel upcJPanel, Network network, Enterprise ent, UserAccount ua) {
        initComponents();
        this.upcJPanel = upcJPanel;
        this.manuEnt = (ManufacturerEnterprise) ent;
        this.ua = ua;
        this.network = network;
        refresh();
    }

    public void refresh() {
        int rowCount = salesJTable.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) salesJTable.getModel()).removeRow(i);
        }

        for (ManufacturerOrder mo : manuEnt.getSalesOrg().getMasterOrderList().getMasterOrderList()) {
            for (ManufacturerOrderItem moi : mo.getOrderItemList()) {

                Object row[] = new Object[3];
                row[0] = moi.getDrug();
                row[1] = moi.getQuantity();
                row[2] = ((moi.getQuantity()) * (moi.getPrice()));
                ((DefaultTableModel) salesJTable.getModel()).addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        salesJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        salesJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Drug ", "Quantity Sold", "Revenue Generated"
            }
        ));
        jScrollPane1.setViewportView(salesJTable);

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("--- SALES & REVENUE PER DRUG ---");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(backJButton)
                .add(0, 0, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .add(jLabel1)
                .add(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .add(7, 7, 7)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 235, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 7, Short.MAX_VALUE)
                .add(backJButton))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        upcJPanel.remove(this);
        CardLayout card = (CardLayout)upcJPanel.getLayout();
        card.previous(upcJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable salesJTable;
    // End of variables declaration//GEN-END:variables
}
