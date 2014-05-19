/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Dispenser.InventoryManager;

import Business.Dispenser.DispenserEnterprise;
import Business.Dispenser.DispenserInventoryItem;
import Business.Enterprise;
import Business.Network;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karanmankodi
 */
public class DispenserInventoryManagerInventoryJPanel extends javax.swing.JPanel {

    private JPanel upcJPanel;
    private DispenserEnterprise dispEnt;
    private UserAccount ua;
    Network network;
    /**
     * Creates new form DispenserInventoryManagerInventoryJPanel
     */
    public DispenserInventoryManagerInventoryJPanel(JPanel upcJPanel, Network network, Enterprise ent, UserAccount ua) {
        initComponents();
        this.ua = ua;
        this.upcJPanel = upcJPanel;
        this.dispEnt = (DispenserEnterprise)ent;
        this.network = network;
        refreshWorkRequestTable();
    }

    private void refreshWorkRequestTable()
    {
        int rowCount = inventoryJTable.getRowCount();
        
        for(int i=rowCount-1;i>=0;i--)
        {
            ((DefaultTableModel)inventoryJTable.getModel()).removeRow(i);
        }
        
        
        
        for(DispenserInventoryItem dii : dispEnt.getInvMgmtOrg().getInventory().getStoreInventory())
        {
            Object row[] = new Object[4];
            
            row[0] = dii;
            row [1] = dii.getDrug().getId();
            row [2] = dii.getQuantity();
            row [3] = dii.getDrug().getPrice();
            
            ((DefaultTableModel)inventoryJTable.getModel()).addRow(row);
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
        inventoryJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        viewDetailsJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        inventoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "ID", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inventoryJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(inventoryJTable);

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        viewDetailsJButton.setText("View Details");
        viewDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("--- DISPENSER INVENTORY ---");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(backJButton)
                        .add(264, 264, 264)
                        .add(viewDetailsJButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jLabel1)
                        .add(118, 118, 118))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(viewDetailsJButton)
                    .add(backJButton)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        upcJPanel.remove(this);
        CardLayout cardLayout = (CardLayout) upcJPanel.getLayout();
        cardLayout.previous(upcJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void viewDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = inventoryJTable.getSelectedRow();
        DispenserInventoryItem selectedDII = (DispenserInventoryItem)inventoryJTable.getValueAt(selectedRow, 0);
        ViewOrderDetailsJPanel vodjp = new ViewOrderDetailsJPanel(upcJPanel, selectedDII);
        upcJPanel.add("Order Details", vodjp);
        CardLayout card = (CardLayout)upcJPanel.getLayout();
        card.next(upcJPanel);
    }//GEN-LAST:event_viewDetailsJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable inventoryJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewDetailsJButton;
    // End of variables declaration//GEN-END:variables
}