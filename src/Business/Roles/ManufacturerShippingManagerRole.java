/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.Roles.Role;
import Business.WorkAreas.ManufacturerShippingManagerWorkArea;

/**
 *
 * @author karanmankodi
 */
public class ManufacturerShippingManagerRole extends Role {

    public ManufacturerShippingManagerRole() {
        workArea = new ManufacturerShippingManagerWorkArea();
    }
    
}
