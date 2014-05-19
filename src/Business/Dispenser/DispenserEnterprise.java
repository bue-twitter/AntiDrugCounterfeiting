/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Dispenser;

import Business.Enterprise;

/**
 *
 * @author karanmankodi
 */
public class DispenserEnterprise extends Enterprise {

    public DispenserInventoryManagementOrganization invMgmtOrg;
    public DispenserSalesOrganization salesOrg;

    public DispenserEnterprise(String enterpriseName) {
        super(enterpriseName);
        super.setType(DISPENSER);
        invMgmtOrg = (DispenserInventoryManagementOrganization) getOrganizationDirectory().newOrganization(DISPENSERINVENTORYMANAGEMENT);
        salesOrg = (DispenserSalesOrganization) getOrganizationDirectory().newOrganization(DISPENSERSALES);
    }

    public DispenserInventoryManagementOrganization getInvMgmtOrg() {
        return invMgmtOrg;
    }

    public DispenserSalesOrganization getSalesOrg() {
        return salesOrg;
    }
}
