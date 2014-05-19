/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Wholesaler;

import Business.Business;
import Business.Organization;

/**
 *
 * @author karanmankodi
 */
public class WholesalerShippingOrganization extends Organization {
    
    private String oName;
    
    public WholesalerShippingOrganization(String orgName) {
        super(orgName);
        oName = Business.WHOLESALERSHIPPING;
       }

    public String getoName() {
        return oName;
    }

    
    
}
