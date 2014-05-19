/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FDA;

import Business.Organization;

/**
 *
 * @author karanmankodi
 */
public class ForensicsOrganization extends Organization{
    
    private String oName;

    public ForensicsOrganization(String orgName) {
        super(orgName);
    }

    public String getoName() {
        return oName;
    }
    
}
