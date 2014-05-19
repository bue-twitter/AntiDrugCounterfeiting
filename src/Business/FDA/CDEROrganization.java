/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FDA;

import Business.Organization;

/**
 *
 * @author karanmankodi
 */
public class CDEROrganization extends Organization {

    private String oName;
    private ClinicalTestingOrganization clinicalTestingOrg;
    
    public CDEROrganization(String orgName) {
        super(orgName);
        oName = Business.Business.CDER;
        clinicalTestingOrg = new ClinicalTestingOrganization(CLINICALTESTING);
    }

    public String getoName() {
        return oName;
    }

    public ClinicalTestingOrganization getClinicalTestingOrg() {
        return clinicalTestingOrg;
    }
    
    
}
