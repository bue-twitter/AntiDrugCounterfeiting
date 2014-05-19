/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.Roles.Role;
import Business.WorkAreas.ManufacturerAdminWorkArea;

/**
 *
 * @author karanmankodi
 */
public class ManufacturerAdminRole extends Role {

    public ManufacturerAdminRole() {
        workArea = new ManufacturerAdminWorkArea();
    }
    
    
}
