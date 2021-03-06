/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Manufacturer.ProductManager;

import Business.Enterprise;
import Business.FDA.CDEROrganization;
import Business.FDA.DrugProductionRequest;
import Business.FDA.FDAEnterprise;
import Business.Manufacturer.Drug;
import Business.Manufacturer.ManufacturerEnterprise;
import Business.Network;
import Business.Organization;
import Business.UserAccount;
import Business.WorkRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public class ReapplyDrugLicenseJPanel extends javax.swing.JPanel {

    private JPanel upcJPanel;
    private Drug d;
    private ManufacturerEnterprise manuEnt;
    private UserAccount ua;
    Network network;
    /**
     * Creates new form ReapplyDrugLicenseJPanel
     */
    public ReapplyDrugLicenseJPanel(JPanel upcJPanel, Network network, ManufacturerEnterprise manuEnt, UserAccount ua, Drug d) {
        initComponents();
        this.upcJPanel = upcJPanel;
        this.manuEnt = manuEnt;
        this.ua = ua;
        this.network = network;
        this.d = d;
        nameJTextField.setText(d.getName());
        priceJTextField.setText(String.valueOf(d.getPrice()));
        colorJTextField.setText(d.getColor());
        shapeTextField.setText(d.getShape());
        tasteJTextField.setText(d.getTaste());
        activeIngredientTextField.setText(d.getActiveIngredient());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        quantityJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        priceJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        applyForINDJButton = new javax.swing.JButton();
        shapeTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        activeIngredientTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tasteJTextField = new javax.swing.JTextField();
        colorJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Quantity");

        jLabel3.setText("Price");

        priceJTextField.setEditable(false);

        jLabel1.setText("Name");

        nameJTextField.setEditable(false);

        applyForINDJButton.setText("Reapply");
        applyForINDJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyForINDJButtonActionPerformed(evt);
            }
        });

        shapeTextField.setEditable(false);

        jLabel6.setText("Color");

        activeIngredientTextField.setEditable(false);

        jLabel7.setText("Active Ingredient");

        tasteJTextField.setEditable(false);

        colorJTextField.setEditable(false);

        jLabel4.setText("Taste");

        jLabel5.setText("Shape");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel6)
                                    .add(jLabel4))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(tasteJTextField)
                                    .add(colorJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 253, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jLabel7)
                                    .add(jLabel5)
                                    .add(jLabel2))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(shapeTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 255, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(activeIngredientTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 255, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(quantityJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 255, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(layout.createSequentialGroup()
                                    .add(jLabel3)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(priceJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 255, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(layout.createSequentialGroup()
                                    .add(jLabel1)
                                    .add(24, 24, 24)
                                    .add(nameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 253, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                    .add(layout.createSequentialGroup()
                        .add(168, 168, 168)
                        .add(applyForINDJButton)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(34, 34, 34)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(nameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(priceJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(colorJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(tasteJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(shapeTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel7)
                    .add(activeIngredientTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(quantityJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 77, Short.MAX_VALUE)
                .add(applyForINDJButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void applyForINDJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyForINDJButtonActionPerformed
        // TODO add your handling code here:
        d.setAvailable(Integer.parseInt(quantityJTextField.getText()));
        
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (e instanceof FDAEnterprise) {
                //System.out.println(e);
                ArrayList<Organization> organizationList = e.getOrganizationDirectory().getOrganizationList();
                for (Organization o : organizationList) {
                    if (o instanceof CDEROrganization) {

                        DrugProductionRequest request = (DrugProductionRequest) o.getWorkQueue().newWorkRequest(WorkRequest.Type.DrugProductionRequest);
                        request.setDrug(d);
                        request.setSender(ua);
                        request.setEnt(manuEnt);
                        request.setStatus(WorkRequest.Status.Sent);
                        JOptionPane.showMessageDialog(null, "IND Request Generated!!!");
                    }
                }

            }

        }
    }//GEN-LAST:event_applyForINDJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField activeIngredientTextField;
    private javax.swing.JButton applyForINDJButton;
    private javax.swing.JTextField colorJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField priceJTextField;
    private javax.swing.JTextField quantityJTextField;
    private javax.swing.JTextField shapeTextField;
    private javax.swing.JTextField tasteJTextField;
    // End of variables declaration//GEN-END:variables
}
