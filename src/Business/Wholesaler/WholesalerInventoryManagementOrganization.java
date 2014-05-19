/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Wholesaler;

import Business.Business;
import Business.Manufacturer.Drug;
import Business.Organization;

/**
 *
 * @author karanmankodi
 */
public class WholesalerInventoryManagementOrganization extends Organization {

    private String oName;
    private WholesalerInventory inventory;
    
    public WholesalerInventoryManagementOrganization(String orgName) {
        super(orgName);
        oName = Business.WHOLESALERINVENTORYMANAGEMENT;
        inventory = new WholesalerInventory();
    }

    public String getoName() {
        return oName;
    }

    public WholesalerInventory getInventory() {
        return inventory;
    }

    
    public Drug searchDrug(Drug d){
        for(WholesalerInventoryItem ii : inventory.getStoreInventory()){
            if(d.equals(ii.getDrug())){
            
                return d;
            }
        }
        return null;
    }
}
    

    

