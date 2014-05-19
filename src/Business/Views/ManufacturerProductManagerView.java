/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Enterprise;
import Business.Network;
import Business.UserAccount;
import UserInterface.Manufacturer.ProductManager.ProductManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public class ManufacturerProductManagerView extends View {

    JPanel upcJPanel;
    Enterprise manuEnt;
    UserAccount ua;
    Network network;
    
    public ManufacturerProductManagerView(JPanel upcJPanel, Network network, Enterprise manuEnt, UserAccount ua) {
        this.upcJPanel = upcJPanel;
        this.manuEnt = manuEnt;
        this.ua = ua;
        this.network = network;
        viewPanel = new ProductManagerWorkAreaJPanel(upcJPanel, network, manuEnt, ua);
    }
    
}
