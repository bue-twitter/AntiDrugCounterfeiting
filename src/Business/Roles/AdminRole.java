/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.AdminWorkArea;

/**
 *
 * @author karanmankodi
 */
public class AdminRole extends Role {

    public AdminRole() {
        workArea = new AdminWorkArea();
    }
    
}
