/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.WholesalerShippingManagerWorkArea;

/**
 *
 * @author karanmankodi
 */
public class WholesalerShippingManagerRole extends Role {

    public WholesalerShippingManagerRole() {
        workArea = new WholesalerShippingManagerWorkArea();
    }
    
}
