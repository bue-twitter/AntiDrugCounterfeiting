/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Manufacturer.Admin;

import Business.Employee;
import Business.Enterprise;
import Business.Manufacturer.ManufacturerEnterprise;
import Business.Network;
import Business.Roles.ManufacturerShippingManagerRole;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public class CreateShippingManagerJPanel extends javax.swing.JPanel {

    JPanel upcJPanel;
    ManufacturerEnterprise manuEnt;
    UserAccount ua;
    Network network;
    /**
     * Creates new form CreateShippingManagerJPanel
     */
    public CreateShippingManagerJPanel(JPanel upcJPanel, Network network, Enterprise ent, UserAccount ua) {
        initComponents();
        this.upcJPanel = upcJPanel;
        this.manuEnt = (ManufacturerEnterprise)ent;
        this.ua = ua;
        this.network = network;
        entNameJTextField.setText(manuEnt.getEnterpriseName());
        orgNameJTextField.setText(manuEnt.getShippingOrg().getoName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        createAdminJButton = new javax.swing.JButton();
        entNameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        orgNameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        passwordJTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Enterprise Name");

        jLabel2.setText("Name");

        jLabel4.setText("Organization Name");

        createAdminJButton.setText("CREATE ADMIN");
        createAdminJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAdminJButtonActionPerformed(evt);
            }
        });

        entNameJTextField.setEditable(false);

        jLabel1.setText("--- CREATE SHIPPING EMPLOYEE ---");

        orgNameJTextField.setEditable(false);

        jLabel5.setText("Username");

        backJButton.setText("<< BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Password");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                            .add(101, 101, 101)
                            .add(jLabel1))
                        .add(layout.createSequentialGroup()
                            .add(10, 10, 10)
                            .add(jLabel2)
                            .add(104, 104, 104)
                            .add(nameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 220, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(layout.createSequentialGroup()
                            .add(10, 10, 10)
                            .add(jLabel3)
                            .add(37, 37, 37)
                            .add(entNameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 220, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(layout.createSequentialGroup()
                            .add(10, 10, 10)
                            .add(jLabel4)
                            .add(19, 19, 19)
                            .add(orgNameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 220, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 400, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(layout.createSequentialGroup()
                            .add(10, 10, 10)
                            .add(jLabel5)
                            .add(18, 18, 18)
                            .add(usernameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(20, 20, 20)
                            .add(jLabel6)
                            .add(11, 11, 11)
                            .add(passwordJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(layout.createSequentialGroup()
                            .add(backJButton)
                            .add(49, 49, 49)
                            .add(createAdminJButton)))
                    .add(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(0, 13, Short.MAX_VALUE)
                    .add(jLabel1)
                    .add(28, 28, 28)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                            .add(10, 10, 10)
                            .add(jLabel2))
                        .add(nameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(2, 2, 2)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                            .add(10, 10, 10)
                            .add(jLabel3))
                        .add(entNameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(12, 12, 12)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                            .add(10, 10, 10)
                            .add(jLabel4))
                        .add(orgNameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(12, 12, 12)
                    .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(usernameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(passwordJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(layout.createSequentialGroup()
                            .add(10, 10, 10)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jLabel5)
                                .add(jLabel6))))
                    .add(42, 42, 42)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(backJButton)
                        .add(createAdminJButton))
                    .add(0, 14, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createAdminJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAdminJButtonActionPerformed
        // TODO add your handling code here:

        Employee emp = manuEnt.getShippingOrg().getEmployeeDirectory().newEmployee();
        emp.setName(nameJTextField.getText());
        UserAccount ua = manuEnt.getShippingOrg().getUserAccountDirectory().newUserAccount();
        ua.setEmployee(emp);
        ua.setUsername(usernameJTextField.getText());
        ua.setPassword(passwordJTextField.getText());
        ua.setRole(new ManufacturerShippingManagerRole());

        JOptionPane.showMessageDialog(null, "Done");
    }//GEN-LAST:event_createAdminJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        upcJPanel.remove(this);
        CardLayout card = (CardLayout)upcJPanel.getLayout();
        card.previous(upcJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createAdminJButton;
    private javax.swing.JTextField entNameJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField orgNameJTextField;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
