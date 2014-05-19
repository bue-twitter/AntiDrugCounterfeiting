/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Enterprise;
import Business.Network;
import Business.UserAccount;
import UserInterface.Manufacturer.ShippingManager.ShippingManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public class ManufacturerShippingManagerView extends View {
    
    JPanel upcJPanel;
    Enterprise manuEnt;
    UserAccount ua;
    Network network;
    
    public ManufacturerShippingManagerView(JPanel upcJPanel, Network network, Enterprise manuEnt, UserAccount ua) {
        this.upcJPanel = upcJPanel;
        this.manuEnt = manuEnt;
        this.ua = ua;
        this.network = network;
        viewPanel = new ShippingManagerWorkAreaJPanel(upcJPanel, network, manuEnt, ua);
    }
}
