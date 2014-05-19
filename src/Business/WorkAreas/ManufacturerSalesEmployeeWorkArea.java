/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkAreas;

import Business.Enterprise;
import Business.Network;
import Business.UserAccount;
import UserInterface.Manufacturer.SalesEmployee.SalesEmployeeWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public class ManufacturerSalesEmployeeWorkArea extends WorkArea {
    
    @Override
    public JPanel createView(JPanel upcJPanel, Network network, Enterprise enterprise, UserAccount ua){
        return new SalesEmployeeWorkAreaJPanel(upcJPanel, network, enterprise, ua);
    }
}
