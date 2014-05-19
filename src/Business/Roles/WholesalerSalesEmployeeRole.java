/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.WholesalerSalesEmployeeWorkArea;

/**
 *
 * @author karanmankodi
 */
public class WholesalerSalesEmployeeRole extends Role {

    public WholesalerSalesEmployeeRole() {
        workArea = new WholesalerSalesEmployeeWorkArea();
    }
    
}
