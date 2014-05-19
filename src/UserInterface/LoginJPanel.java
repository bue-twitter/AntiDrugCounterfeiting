/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LoginJPanel.java
 *
 * Created on Nov 2, 2012, 4:20:25 PM
 */
package UserInterface;

import Business.Business;
import Business.Enterprise;
import Business.Network;

/**
 *
 * @author prakashj
 */
public class LoginJPanel extends javax.swing.JPanel {

    private MainJFrame mainJFrame;
    private Network selectedNetwork;
    
    /** Creates new form LoginJPanel */
    public LoginJPanel(MainJFrame frame, Network selectedNetwork) {
        initComponents();
        mainJFrame = frame;
        this.selectedNetwork =selectedNetwork;
        networkJTextField.setText(String.valueOf(selectedNetwork));
        enterpriseJComboBox.removeAllItems();
        Business business = Business.getInstance();
        
        enterpriseJComboBox.addItem(business);
        for(Enterprise enterprise : selectedNetwork.getEnterpriseDirectory().getEnterpriseList()) {
            enterpriseJComboBox.addItem(enterprise);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginJButton = new javax.swing.JButton();
        usernameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        enterpriseJComboBox = new javax.swing.JComboBox();
        patientLoginJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        idJTextField = new javax.swing.JTextField();
        logoutNetworkJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        networkJTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        patientLoginJButton.setText("Patient Login");
        patientLoginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientLoginJButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Name");

        jLabel4.setText("ID");

        logoutNetworkJButton.setText("Log out of Network");
        logoutNetworkJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutNetworkJButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Current Network");

        networkJTextField.setEditable(false);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(6, 6, 6)
                .add(jLabel5))
            .add(layout.createSequentialGroup()
                .add(6, 6, 6)
                .add(networkJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 104, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(layout.createSequentialGroup()
                .add(6, 6, 6)
                .add(jLabel1))
            .add(layout.createSequentialGroup()
                .add(6, 6, 6)
                .add(usernameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(layout.createSequentialGroup()
                .add(6, 6, 6)
                .add(jLabel2))
            .add(layout.createSequentialGroup()
                .add(6, 6, 6)
                .add(passwordJPasswordField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(layout.createSequentialGroup()
                .add(6, 6, 6)
                .add(enterpriseJComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(layout.createSequentialGroup()
                .add(6, 6, 6)
                .add(loginJButton))
            .add(layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(jLabel3))
            .add(layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(nameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(jLabel4))
            .add(layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(idJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(patientLoginJButton)
            .add(layout.createSequentialGroup()
                .add(6, 6, 6)
                .add(logoutNetworkJButton))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(6, 6, 6)
                .add(jLabel5)
                .add(6, 6, 6)
                .add(networkJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(6, 6, 6)
                .add(jLabel1)
                .add(4, 4, 4)
                .add(usernameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(12, 12, 12)
                .add(jLabel2)
                .add(6, 6, 6)
                .add(passwordJPasswordField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(12, 12, 12)
                .add(enterpriseJComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(17, 17, 17)
                .add(loginJButton)
                .add(9, 9, 9)
                .add(jLabel3)
                .add(4, 4, 4)
                .add(nameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(2, 2, 2)
                .add(jLabel4)
                .add(4, 4, 4)
                .add(idJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(12, 12, 12)
                .add(patientLoginJButton)
                .add(37, 37, 37)
                .add(logoutNetworkJButton))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // TODO add your handling code here:
        String username = usernameJTextField.getText();
        String password = passwordJPasswordField.getText();
        Enterprise enterprise = (Enterprise)enterpriseJComboBox.getSelectedItem();
        
        mainJFrame.loginUser(username, password, enterprise, selectedNetwork);        
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void patientLoginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientLoginJButtonActionPerformed
        // TODO add your handling code here:
        mainJFrame.patientLogin(nameJTextField.getText(), idJTextField.getText());
    }//GEN-LAST:event_patientLoginJButtonActionPerformed

    private void logoutNetworkJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutNetworkJButtonActionPerformed
        // TODO add your handling code here:
        mainJFrame.logoutNetwork();
    }//GEN-LAST:event_logoutNetworkJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTextField idJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton loginJButton;
    private javax.swing.JButton logoutNetworkJButton;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField networkJTextField;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton patientLoginJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
