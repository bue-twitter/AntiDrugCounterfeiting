/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Dispenser;

import Business.Business;
import Business.Manufacturer.Drug;
import Business.Organization;

/**
 *
 * @author karanmankodi
 */
public class DispenserInventoryManagementOrganization extends Organization {

    private String oName;
    private DispenserInventory inventory;
    
    public DispenserInventoryManagementOrganization(String orgName) {
        super(orgName);
        oName = Business.DISPENSERINVENTORYMANAGEMENT;
        inventory = new DispenserInventory();
    }

    public String getoName() {
        return oName;
    }

    public DispenserInventory getInventory() {
        return inventory;
    }

    
    public Drug searchDrug(Drug d){
        for(DispenserInventoryItem ii : inventory.getStoreInventory()){
            if(d.equals(ii.getDrug())){
            
                return d;
            }
        }
        return null;
    }
}
    

    

