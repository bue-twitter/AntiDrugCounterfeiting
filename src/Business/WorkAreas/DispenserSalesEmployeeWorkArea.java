/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkAreas;

import Business.Enterprise;
import Business.Network;
import Business.UserAccount;
import UserInterface.Dispenser.SalesEmployee.DispenserSalesEmployeeWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public class DispenserSalesEmployeeWorkArea extends WorkArea{
    
    @Override
    public JPanel createView(JPanel upcJPanel, Network network, Enterprise enterprise, UserAccount ua){
        return new DispenserSalesEmployeeWorkAreaJPanel(upcJPanel, network, enterprise, ua);
    }
}
