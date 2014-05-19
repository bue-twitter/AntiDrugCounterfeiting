/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.DispenserAdminWorkArea;

/**
 *
 * @author karanmankodi
 */
public class DispenserAdminRole extends Role {

    public DispenserAdminRole() {
        workArea = new DispenserAdminWorkArea();
    }
    
    
}
