/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.FDAAdminWorkArea;

/**
 *
 * @author karanmankodi
 */
public class FDAAdminRole extends Role{

    public FDAAdminRole() {
        workArea = new FDAAdminWorkArea();
    }
   
}
