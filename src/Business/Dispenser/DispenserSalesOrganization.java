/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Dispenser;

import Business.Business;
import Business.Organization;

/**
 *
 * @author karanmankodi
 */
public class DispenserSalesOrganization extends Organization {
    
    private String oName;
    private DispenserMasterOrderCatalog masterOrderList;

    public DispenserSalesOrganization(String orgName) {
        super(orgName);
        oName = Business.DISPENSERSALES;
        masterOrderList = new DispenserMasterOrderCatalog();
    }

    public String getoName() {
        return oName;
    }

    public DispenserMasterOrderCatalog getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrderList(DispenserMasterOrderCatalog masterOrderList) {
        this.masterOrderList = masterOrderList;
    }
    
    
    
}
