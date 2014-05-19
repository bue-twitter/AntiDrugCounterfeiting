/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.DispenserInventoryManagerWorkArea;

/**
 *
 * @author karanmankodi
 */
public class DispenserInventoryManagerRole extends Role {

    public DispenserInventoryManagerRole() {
        workArea = new DispenserInventoryManagerWorkArea();
    }
    
}
