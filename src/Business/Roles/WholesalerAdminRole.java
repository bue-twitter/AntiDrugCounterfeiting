/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.WholesalerAdminWorkArea;

/**
 *
 * @author karanmankodi
 */
public class WholesalerAdminRole extends Role {

    public WholesalerAdminRole() {
        workArea = new WholesalerAdminWorkArea();
    }
    
    
}
