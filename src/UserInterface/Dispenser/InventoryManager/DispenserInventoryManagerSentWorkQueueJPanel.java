/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Dispenser.InventoryManager;

import Business.Dispenser.DispenserEnterprise;
import Business.Enterprise;
import Business.Network;
import Business.Organization;
import Business.UserAccount;
import Business.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karanmankodi
 */
public class DispenserInventoryManagerSentWorkQueueJPanel extends javax.swing.JPanel {

    private JPanel upcJPanel;
    private DispenserEnterprise dispEnt;
    private UserAccount ua;
    Network network;
    /**
     * Creates new form DispenserInventoryManagerSentWorkQueueJPanel
     */
    public DispenserInventoryManagerSentWorkQueueJPanel(JPanel upcJPanel, Network network, Enterprise ent, UserAccount ua) {
        initComponents();
        
        this.ua = ua;
        this.upcJPanel = upcJPanel;
        this.dispEnt = (DispenserEnterprise)ent;
        this.network = network;
        
        int rowCount = tblWorkQueue.getRowCount();
        
        for(int i=rowCount-1;i>=0;i--)
        {
            ((DefaultTableModel)tblWorkQueue.getModel()).removeRow(i);
        }
        
        
        Organization org = dispEnt.getMyOrganization(ua);
        
        for(WorkRequest request : org.getSentWorkQueue().getWorkRequestList())
        {
            Object row[] = new Object[4];
            
            row[0] = request.getId();
            row[1] = request.getSender();
            row[2] = request.getReceiver();
            row[3] = request.getStatus();
            
            ((DefaultTableModel)tblWorkQueue.getModel()).addRow(row);
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
        tblWorkQueue = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblWorkQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Sender", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblWorkQueue.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblWorkQueue);

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("--- PLACED ORDERS ---");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1)
                    .add(layout.createSequentialGroup()
                        .add(backJButton)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(145, 145, 145)
                .add(jLabel1)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .add(34, 34, 34)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 149, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 60, Short.MAX_VALUE)
                .add(backJButton)
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
    private javax.swing.JTable tblWorkQueue;
    // End of variables declaration//GEN-END:variables
}
