/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Enterprise;
import Business.Network;
import Business.UserAccount;
import UserInterface.Dispenser.InventoryManager.DispenserInventoryManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public class DispenserInventoryManagerView extends View {

    JPanel upcJPanel;
    Enterprise dispEnt;
    UserAccount ua;
    Network network;
    
    public DispenserInventoryManagerView(JPanel upcJPanel, Network network, Enterprise dispEnt, UserAccount ua) {
        this.upcJPanel = upcJPanel;
        this.dispEnt = dispEnt;
        this.ua = ua;
        this.network = network;
        viewPanel = new DispenserInventoryManagerWorkAreaJPanel(upcJPanel, network, dispEnt, ua);
    }
    
}
