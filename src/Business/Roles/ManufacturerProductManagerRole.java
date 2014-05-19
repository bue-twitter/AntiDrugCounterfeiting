/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.Roles.Role;
import Business.WorkAreas.ManufacturerProductManagerWorkArea;

/**
 *
 * @author karanmankodi
 */
public class ManufacturerProductManagerRole extends Role {

    public ManufacturerProductManagerRole() {
        workArea = new ManufacturerProductManagerWorkArea();
    }
    
}
