/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.WorkArea;

/**
 *
 * @author karanmankodi
 */
public abstract class Role {
    WorkArea workArea;

    public Role() {
    }

    public WorkArea getWorkArea() {
        return workArea;
    }

    public void setWorkArea(WorkArea workArea) {
        this.workArea = workArea;
    }
    
    
}
