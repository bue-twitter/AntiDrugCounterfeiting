/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Roles.Role;

/**
 *
 * @author Karan Mankodi
 */
public class UserAccount {
    
    private String username;
    private String password;
    private String status;
    private Employee employee;
    private Role role;
    
    
    public UserAccount(){
        status = "Active";
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    
    
   @Override
    public String toString() {
        return username;
    }
    
    
    
}
