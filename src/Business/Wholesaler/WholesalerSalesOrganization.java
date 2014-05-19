/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Wholesaler;

import Business.Business;
import Business.Manufacturer.ManufacturerEnterprise;
import Business.Organization;

/**
 *
 * @author karanmankodi
 */
public class WholesalerSalesOrganization extends Organization {
    
    private String oName;
    private WholesalerMasterOrderCatalog masterOrderList;
    private ManufacturerEnterprise manuEnt;
    private WholesalerEnterprise wholeEnt;

    public WholesalerSalesOrganization(String orgName) {
        super(orgName);
        oName = Business.WHOLESALERSALES;
        masterOrderList = new WholesalerMasterOrderCatalog();
    }

    public String getoName() {
        return oName;
    }

    public WholesalerMasterOrderCatalog getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrderList(WholesalerMasterOrderCatalog masterOrderList) {
        this.masterOrderList = masterOrderList;
    }

    public ManufacturerEnterprise getManuEnt() {
        return manuEnt;
    }

    public void setManuEnt(ManufacturerEnterprise manuEnt) {
        this.manuEnt = manuEnt;
    }

    public WholesalerEnterprise getWholeEnt() {
        return wholeEnt;
    }

    public void setWholeEnt(WholesalerEnterprise wholeEnt) {
        this.wholeEnt = wholeEnt;
    }
    
    
    
}
