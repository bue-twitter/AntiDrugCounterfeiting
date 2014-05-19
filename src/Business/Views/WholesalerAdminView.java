/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Enterprise;
import Business.Network;
import Business.UserAccount;
import UserInterface.Wholesaler.Admin.WholesalerAdminJPanel;
import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public class WholesalerAdminView extends View {
    JPanel upcJPanel;
    Enterprise wholeEnt;
    UserAccount ua;
    Network network;

    public WholesalerAdminView(JPanel upcJPanel, Network network, Enterprise wholeEnt, UserAccount ua) {
        this.upcJPanel = upcJPanel;
        this.wholeEnt = wholeEnt;
        this.ua = ua;
        this.network = network;
        viewPanel = new WholesalerAdminJPanel(upcJPanel, network, wholeEnt, ua);
    }
    
    
    
}
