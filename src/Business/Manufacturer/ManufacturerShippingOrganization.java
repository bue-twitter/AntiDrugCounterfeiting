/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manufacturer;

import Business.Business;
import Business.Organization;

/**
 *
 * @author karanmankodi
 */
public class ManufacturerShippingOrganization extends Organization {
    
    private String oName;
    
    public ManufacturerShippingOrganization(String orgName) {
        super(orgName);
        oName = Business.MANUFACTURERSHIPPING;
       }

    public String getoName() {
        return oName;
    }

    
    
}
