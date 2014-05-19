/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manufacturer;

import Business.Enterprise;

/**
 *
 * @author karanmankodi
 */
public class ManufacturerEnterprise extends Enterprise {
    
    public ManufacturerProductManagementOrganization prodMgmtOrg;
    public ManufacturerSalesOrganization salesOrg;
    public ManufacturerShippingOrganization shippingOrg;

    public ManufacturerEnterprise(String enterpriseName) {
        super(enterpriseName);
        super.setType(MANUFACTURER);
        prodMgmtOrg = (ManufacturerProductManagementOrganization)getOrganizationDirectory().newOrganization(MANUFACTURERPRODUCTMANAGEMENT);
        salesOrg = (ManufacturerSalesOrganization)getOrganizationDirectory().newOrganization(MANUFACTURERSALES);
        shippingOrg = (ManufacturerShippingOrganization)getOrganizationDirectory().newOrganization(MANUFACTURERSHIPPING);
    }

    public ManufacturerProductManagementOrganization getProdMgmtOrg() {
        return prodMgmtOrg;
    }

    public ManufacturerSalesOrganization getSalesOrg() {
        return salesOrg;
    }

    public ManufacturerShippingOrganization getShippingOrg() {
        return shippingOrg;
    }

    
}

