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
public class FederalLicensingOrganization extends Organization {
    
    private String oName;
    
    public FederalLicensingOrganization(String orgName) {
        super(orgName);
        oName = Business.Business.FEDERALLICENSING;
    }

    public String getoName() {
        return oName;
    }
}
