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
public class ManufacturerProductManagementOrganization extends Organization {

    private String oName;
    private DrugCatalog drugCatalog;
    
    public ManufacturerProductManagementOrganization(String orgName) {
        super(orgName);
        oName = Business.MANUFACTURERPRODUCTMANAGEMENT;
        drugCatalog = new DrugCatalog();
    }

    public String getoName() {
        return oName;
    }

    public DrugCatalog getDrugCatalog() {
        return drugCatalog;
    }

   
    public Drug searchDrug(String name){
        for(Drug d :drugCatalog.getDrugList()){
            if(d.getName().equals(name)){
                return d;
            }
        }
        return null;
    }
}
    

    

