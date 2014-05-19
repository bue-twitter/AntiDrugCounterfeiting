/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Dispenser.DispenserInventoryManagementOrganization;
import Business.Dispenser.DispenserSalesOrganization;
import Business.FDA.CDEROrganization;
import Business.FDA.FederalLicensingOrganization;
import Business.FDA.ForensicsOrganization;
import Business.FDA.StateLicensingOrganization;
import Business.Manufacturer.ManufacturerSalesOrganization;
import Business.Manufacturer.ManufacturerProductManagementOrganization;
import Business.Manufacturer.ManufacturerShippingOrganization;
import Business.Wholesaler.WholesalerInventoryManagementOrganization;
import Business.Wholesaler.WholesalerSalesOrganization;
import Business.Wholesaler.WholesalerShippingOrganization;
import java.util.ArrayList;

/**
 *
 * @author karanmankodi
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
    organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    public Organization newOrganization(String orgName){
        Organization org = null;
        
        if(orgName.equals(Organization.DISPENSERINVENTORYMANAGEMENT)){
            org = new DispenserInventoryManagementOrganization(orgName);
           organizationList.add(org);
            return org;
        }
        
        if(orgName.equals(Organization.DISPENSERSALES)){
            org = new DispenserSalesOrganization(orgName);
           organizationList.add(org);
            return org;
        }
        
        if(orgName.equals(Organization.WHOLESALERINVENTORYMANAGEMENT)){
            org = new WholesalerInventoryManagementOrganization(orgName);
           organizationList.add(org);
            return org;
        }
        
        if(orgName.equals(Organization.WHOLESALERSALES)){
            org = new WholesalerSalesOrganization(orgName);
           organizationList.add(org);
            return org;
        }
        
        if(orgName.equals(Organization.WHOLESALERSHIPPING)){
            org = new WholesalerShippingOrganization(orgName);
           organizationList.add(org);
            return org;
        }
        
        if(orgName.equals(Organization.MANUFACTURERPRODUCTMANAGEMENT)){
            org = new ManufacturerProductManagementOrganization(orgName);
            organizationList.add(org);
            return org;
        }
        
        if(orgName.equals(Organization.MANUFACTURERSALES)){
            org = new ManufacturerSalesOrganization(orgName);
            organizationList.add(org);
            return org;
        }
        
        if(orgName.equals(Organization.MANUFACTURERSHIPPING)){
            org = new ManufacturerShippingOrganization(orgName);
            organizationList.add(org);
            return org;
        }
        
        if(orgName.equals(Organization.STATELICESING)){
            org = new StateLicensingOrganization(orgName);
           organizationList.add(org);
            return org;
        }
        
        if(orgName.equals(Organization.FEDERALLICENSING)){
            org = new FederalLicensingOrganization(orgName);
           organizationList.add(org);
            return org;
        }
        
        if(orgName.equals(Organization.CDER)){
            org = new CDEROrganization(orgName);
           organizationList.add(org);
            return org;
        }
        
        if(orgName.equals(Organization.FORENSICS)){
            org = new ForensicsOrganization(orgName);
           organizationList.add(org);
            return org;
        }
        
        return org;
        
    }
}
