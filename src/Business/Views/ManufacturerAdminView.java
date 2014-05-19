/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Enterprise;
import Business.Network;
import Business.UserAccount;
import UserInterface.Manufacturer.Admin.ManufacturerAdminJPanel;
import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public class ManufacturerAdminView extends View {
    JPanel upcJPanel;
    Enterprise manuEnt;
    UserAccount ua;
    Network network;

    public ManufacturerAdminView(JPanel upcJPanel, Network network, Enterprise manuEnt, UserAccount ua) {
        this.upcJPanel = upcJPanel;
        this.manuEnt = manuEnt;
        this.ua = ua;
        this.network = network;
        viewPanel = new ManufacturerAdminJPanel(upcJPanel, network, manuEnt, ua);
    }
    
    
    
}
