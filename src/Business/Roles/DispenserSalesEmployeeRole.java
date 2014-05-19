/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.DispenserSalesEmployeeWorkArea;

/**
 *
 * @author karanmankodi
 */
public class DispenserSalesEmployeeRole extends Role{

    public DispenserSalesEmployeeRole() {
        workArea = new DispenserSalesEmployeeWorkArea();
    }
    
}
