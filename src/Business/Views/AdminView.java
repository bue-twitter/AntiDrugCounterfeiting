/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Enterprise;
import Business.Network;
import Business.UserAccount;
import UserInterface.Admin.AdminJPanel;
import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public class AdminView extends View {
    JPanel upcJPanel;
    Enterprise enterprise;
    UserAccount ua;
    Network network;

    public AdminView(JPanel upcJPanel, Network network, Enterprise enterprise, UserAccount ua) {
        this.enterprise = enterprise;
        this.ua = ua;
        this.upcJPanel = upcJPanel;
        this.network = network;
        viewPanel = new AdminJPanel(upcJPanel, network, enterprise, ua);
    }
    
}
