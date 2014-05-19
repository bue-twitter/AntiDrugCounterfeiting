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
public class StateLicensingOrganization extends Organization {
    
    private String oName;
    
    public StateLicensingOrganization(String orgName) {
        super(orgName);
        oName = Business.Business.STATELICESING;
    }

    public String getoName() {
        return oName;
    }
    
}
