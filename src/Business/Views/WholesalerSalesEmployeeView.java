/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Enterprise;
import Business.Network;
import Business.UserAccount;
import UserInterface.Wholesaler.SalesEmployee.WholesalerSalesEmployeeWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public class WholesalerSalesEmployeeView extends View {
    
    JPanel upcJPanel;
    Enterprise wholeEnt;
    UserAccount ua;
    Network network;
    
    public WholesalerSalesEmployeeView(JPanel upcJPanel, Network network, Enterprise wholeEnt, UserAccount ua) {
        this.upcJPanel = upcJPanel;
        this.wholeEnt = wholeEnt;
        this.ua = ua;
        this.network = network;
        viewPanel = new WholesalerSalesEmployeeWorkAreaJPanel(upcJPanel, network, wholeEnt, ua);
    }
}
