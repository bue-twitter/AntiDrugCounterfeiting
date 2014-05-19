/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.FDA.EnterpriseLicense;
import Business.Manufacturer.Drug;
import Business.Manufacturer.ManufacturerEnterprise;

/**
 *
 * @author karanmankodi
 */
public abstract class Enterprise extends Organization {

    private String enterpriseName;
    private long id;
    private String type;
    private Boolean license;
    private EnterpriseLicense entLicense;
    private Address address;
    private OrganizationDirectory organizationDirectory;
    public static final String MANUFACTURER = "Manufacturer";
    public static final String WHOLESALER = "Wholesaler";
    public static final String DISPENSER = "Dispenser";
    public static final String FDA = "FDA";
    public Boolean active;
    
    public Enterprise(String enterpriseName) {
        super(Organization.ADMIN);
        this.enterpriseName = enterpriseName;
        organizationDirectory = new OrganizationDirectory();
        license = Boolean.FALSE;
        active = Boolean.TRUE;
        address = new Address();
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public Boolean getLicense() {
        return license;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setLicense(Boolean license) {
        this.license = license;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public UserAccount authenticateUser(String username, String password) {
        UserAccount ua = getUserAccountDirectory().authenticateUser(username, password);
        if (ua != null) {
            return ua;
        }
        for (Organization o : getOrganizationDirectory().getOrganizationList()) {
            UserAccount ua1 = o.getUserAccountDirectory().authenticateUser(username, password);
            if (ua1 != null) {
                return ua1;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return enterpriseName;
    }

    public Organization getMyOrganization(UserAccount ua1) {
        if (getUserAccountDirectory().isUserExist(ua1)) {
            return this;
        }

        for (Organization org : getOrganizationDirectory().getOrganizationList()) {
            if (org.getUserAccountDirectory().isUserExist(ua1)) {
                return org;
            }
        }
        return null;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public EnterpriseLicense getEntLicense() {
        return entLicense;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public int getTotalSuspectedDrugsByManu(ManufacturerEnterprise m){
        int total = 0;
        
        for(Drug d : Business.getInstance().getSuspectedDrugs()){
            if (d.getManuEnt().equals(m)){
                total = total + 1;
                return total;
            }
        }
        return total;
    }
    
    public int getTotalFakeDrugsByManu(ManufacturerEnterprise m){
        int total = 0;
        
        for(Drug d : Business.getInstance().getFakeDrugs()){
            if (d.getManuEnt().equals(m)){
                total = total + 1;
                return total;
            }
        }
        return total;
    }
    
}
