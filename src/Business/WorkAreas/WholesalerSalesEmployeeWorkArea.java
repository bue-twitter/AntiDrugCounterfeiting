/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkAreas;

import Business.Enterprise;
import Business.Network;
import Business.UserAccount;
import UserInterface.Wholesaler.SalesEmployee.WholesalerSalesEmployeeWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public class WholesalerSalesEmployeeWorkArea extends WorkArea {
    
    @Override
    public JPanel createView(JPanel upcJPanel, Network network, Enterprise enterprise, UserAccount ua){
        return new WholesalerSalesEmployeeWorkAreaJPanel(upcJPanel, network, enterprise, ua);
    }
}
