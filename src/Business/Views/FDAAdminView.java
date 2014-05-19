/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Enterprise;
import Business.Network;
import Business.UserAccount;
import UserInterface.FDA.Admin.FDAAdminJPanel;
import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public class FDAAdminView extends View {

    JPanel upcJPanel;
    Enterprise enterprise;
    UserAccount ua;
    Network network;

    public FDAAdminView(JPanel upcJPanel, Network network, Enterprise enterprise, UserAccount ua) {
        this.enterprise = enterprise;
        this.ua = ua;
        this.upcJPanel = upcJPanel;
        this.network = network;
        viewPanel = new FDAAdminJPanel(upcJPanel, network, enterprise, ua);
    }
}
