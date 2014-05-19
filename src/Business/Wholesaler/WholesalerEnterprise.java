/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Wholesaler;

import Business.Enterprise;

/**
 *
 * @author karanmankodi
 */
public class WholesalerEnterprise extends Enterprise{
    
    public WholesalerInventoryManagementOrganization invMgmtOrg;
    public WholesalerSalesOrganization salesOrg;
    public WholesalerShippingOrganization shippingOrg;

    public WholesalerEnterprise(String enterpriseName) {
        super(enterpriseName);
        super.setType(WHOLESALER);
        invMgmtOrg = (WholesalerInventoryManagementOrganization)getOrganizationDirectory().newOrganization(WHOLESALERINVENTORYMANAGEMENT);
        salesOrg = (WholesalerSalesOrganization)getOrganizationDirectory().newOrganization(WHOLESALERSALES);
        shippingOrg = (WholesalerShippingOrganization)getOrganizationDirectory().newOrganization(WHOLESALERSHIPPING);
    }

    public WholesalerInventoryManagementOrganization getInvMgmtOrg() {
        return invMgmtOrg;
    }

    public WholesalerSalesOrganization getSalesOrg() {
        return salesOrg;
    }

    public WholesalerShippingOrganization getShippingOrg() {
        return shippingOrg;
    }
     
}
    

