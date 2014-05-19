/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.ManufacturerSalesEmployeeWorkArea;

/**
 *
 * @author karanmankodi
 */
public class ManufacturerSalesEmployeeRole extends Role {

    public ManufacturerSalesEmployeeRole() {
        workArea = new ManufacturerSalesEmployeeWorkArea();
    }
    
}
