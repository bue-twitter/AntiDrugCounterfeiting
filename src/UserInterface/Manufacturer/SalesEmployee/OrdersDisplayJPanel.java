/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Manufacturer.SalesEmployee;

import Business.Enterprise;
import Business.Manufacturer.ManufacturerEnterprise;
import Business.Manufacturer.ManufacturerOrder;
import Business.Network;
import Business.OrderItem;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karanmankodi
 */
public class OrdersDisplayJPanel extends javax.swing.JPanel {

    JPanel upcJPanel;
    ManufacturerEnterprise manuEnt;
    UserAccount ua;
    Network network;
    /**
     * Creates new form OrdersDisplayJPanel
     */
    public OrdersDisplayJPanel(JPanel upcJPanel, Network network, Enterprise ent, UserAccount ua) {
        initComponents();
        this.upcJPanel = upcJPanel;
        this.manuEnt = (ManufacturerEnterprise)ent;
        this.ua = ua;
        this.network = network;
        
        int rowCount = ordersJTable.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) ordersJTable.getModel()).removeRow(i);
        }

        for(ManufacturerOrder o: manuEnt.getSalesOrg().getMasterOrderList().getMasterOrderList()){
                    for (OrderItem oItem : o.getOrderItemList()){
                    Object row[] = new Object[5];
                    row[0] = oItem;
                    row[1] = oItem.getPrice();
                    row[2] = oItem.getQuantity();
                    row[3] = (oItem.getPrice())*(oItem.getQuantity());
                    row[4] = o.getUa();
                    
                    ((DefaultTableModel) ordersJTable.getModel()).addRow(row);
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
        ordersJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        ordersJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Drug", "Price", "Quantity", "Total", "Employee"
            }
        ));
        jScrollPane1.setViewportView(ordersJTable);

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("--- ORDERS PLACED ---");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .add(backJButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 284, Short.MAX_VALUE))))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel1)
                .add(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 10, Short.MAX_VALUE)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 247, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(backJButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        upcJPanel.remove(this);
        CardLayout cardLayout = (CardLayout) upcJPanel.getLayout();
        cardLayout.previous(upcJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ordersJTable;
    // End of variables declaration//GEN-END:variables
}
