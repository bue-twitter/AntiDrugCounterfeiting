/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Enterprise;
import Business.Network;
import Business.UserAccount;
import UserInterface.Dispenser.SalesEmployee.DispenserSalesEmployeeWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public class DispenserSalesEmployeeView extends View{
    
    JPanel upcJPanel;
    Enterprise dispEnt;
    UserAccount ua;
    Network network;
    
    public DispenserSalesEmployeeView(JPanel upcJPanel, Network network, Enterprise dispEnt, UserAccount ua) {
        this.upcJPanel = upcJPanel;
        this.dispEnt = dispEnt;
        this.ua = ua;
        this.network = network;
        viewPanel = new DispenserSalesEmployeeWorkAreaJPanel(upcJPanel, network, dispEnt, ua);
    }
}
