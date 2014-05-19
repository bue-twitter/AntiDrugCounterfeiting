/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.Roles.Role;
import Business.WorkAreas.ManufacturerProductManagerWorkArea;
import Business.WorkAreas.WholesalerInventoryManagerWorkArea;

/**
 *
 * @author karanmankodi
 */
public class WholesalerInventoryManagerRole extends Role {

    public WholesalerInventoryManagerRole() {
        workArea = new WholesalerInventoryManagerWorkArea();
    }
    
}
