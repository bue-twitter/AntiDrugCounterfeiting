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
public class ManufacturerSalesOrganization extends Organization {
    
    private String oName;
    private ManufacturerMasterOrderCatalog masterOrderList;
    
    public ManufacturerSalesOrganization(String orgName) {
        super(orgName);
        oName = Business.MANUFACTURERSALES;
        masterOrderList = new ManufacturerMasterOrderCatalog();
    }

    public String getoName() {
        return oName;
    }

    public ManufacturerMasterOrderCatalog getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrderList(ManufacturerMasterOrderCatalog masterOrderList) {
        this.masterOrderList = masterOrderList;
    }

    
    
}
