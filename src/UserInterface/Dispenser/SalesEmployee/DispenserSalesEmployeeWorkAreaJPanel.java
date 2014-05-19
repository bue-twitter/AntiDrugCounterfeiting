/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Dispenser.SalesEmployee;

import Business.Dispenser.DispenserEnterprise;
import Business.Dispenser.DispenserInventoryItem;
import Business.Dispenser.DispenserOrder;
import Business.Dispenser.DispenserSalesWorkRequest;
import Business.Enterprise;
import Business.Manufacturer.Drug;
import Business.Network;
import Business.Patient;
import Business.PatientOrderItem;
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
public class DispenserSalesEmployeeWorkAreaJPanel extends javax.swing.JPanel {

    JPanel upcJPanel;
    DispenserEnterprise dispEnt;
    UserAccount ua;
    Network network;
    DispenserOrder tempOrder;
    /**
     * Creates new form DispenserSalesEmployeeWorkAreaJPanel
     */
    public DispenserSalesEmployeeWorkAreaJPanel(JPanel upcJPanel, Network network, Enterprise dispEnt, UserAccount ua) {
        initComponents();
        this.upcJPanel = upcJPanel;
        this.dispEnt = (DispenserEnterprise)dispEnt;
        this.ua = ua;
        this.network = network;
        tempOrder = new DispenserOrder();
        String id;
        id = String.valueOf(ua.getEmployee().getDeaNo());
        idJTextField.setText(id);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartJTable = new javax.swing.JTable();
        refreshCartJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        idJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("--- DISPENSER SALES EMPLOYEE WORK AREA ---");

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

        idJTextField.setEditable(false);

        jLabel2.setText("Drug Enforcement Administration No.");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(refreshCartJButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(processJButton)
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(0, 31, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(jLabel1)
                                .add(143, 143, 143))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(jLabel2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(idJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 259, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(57, 57, 57))))))
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .addContainerGap()
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .add(28, 28, 28)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(idJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 187, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(refreshCartJButton)
                    .add(processJButton))
                .addContainerGap())
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(89, 89, 89)
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 168, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(43, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void cartRefresh() {
        int rowCount = cartJTable.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) cartJTable.getModel()).removeRow(i);
        }

        ArrayList<WorkRequest> swList = dispEnt.getSalesOrg().getWorkQueue().getWorkRequestList();
        for (WorkRequest wr : swList) {
            if (wr instanceof DispenserSalesWorkRequest) {
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
        Drug requiredDrug = (Drug) cartJTable.getValueAt(selectedRow, 1);

        if(requiredDrug.getLicense().equals(Boolean.TRUE)){
        DispenserSalesWorkRequest request = (DispenserSalesWorkRequest) cartJTable.getValueAt(selectedRow, 0);
        request.addIDtoList(request.getId());
        Patient p = request.getPatient();
        
        request.setReceiver(ua);
        request.setStatus(WorkRequest.Status.Sold);

        
        DispenserOrder addedOrder = dispEnt.getSalesOrg().getMasterOrderList().addOrder(tempOrder, ua);

        for (DispenserInventoryItem dii : dispEnt.getInvMgmtOrg().getInventory().getStoreInventory()){
            if (dii.getDrug().getId().equals(requiredDrug.getId())){
                dii.setQuantity(dii.getQuantity() - request.getQuantity());
            }
        }
        PatientOrderItem poi = p.newPatientOrderItem();
        poi.setDrug(requiredDrug);
        poi.setId(request.getId());
        poi.setQuantity(request.getQuantity());
        
        requiredDrug.addToPedigree(ua);
        requiredDrug.addToRequestIDs(request.getId());
        
        JOptionPane.showMessageDialog(null, "Drug given to Patient");

        
        upcJPanel.remove(this);
        CardLayout card = (CardLayout) upcJPanel.getLayout();
        card.previous(upcJPanel);}
        else {
            JOptionPane.showMessageDialog(null, "Drug not licensed for trade");
        }
    }//GEN-LAST:event_processJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable cartJTable;
    private javax.swing.JTextField idJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshCartJButton;
    // End of variables declaration//GEN-END:variables
}