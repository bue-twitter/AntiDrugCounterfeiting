/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FDA;

import Business.Enterprise;

/**
 *
 * @author karanmankodi
 */
public class FDAEnterprise extends Enterprise {

    private FederalLicensingOrganization fedLicOrg;
    private StateLicensingOrganization stateLicOrg;
    private CDEROrganization cderOrg;
    private ForensicsOrganization forOrg;
    private ForensicReportDirectory dir;

    public FDAEnterprise(String enterpriseName) {
        super(enterpriseName);
        super.setType(FDA);
        fedLicOrg = (FederalLicensingOrganization) getOrganizationDirectory().newOrganization(FEDERALLICENSING);
        stateLicOrg = (StateLicensingOrganization) getOrganizationDirectory().newOrganization(STATELICESING);
        cderOrg = (CDEROrganization) getOrganizationDirectory().newOrganization(CDER);
        forOrg = (ForensicsOrganization) getOrganizationDirectory().newOrganization(FORENSICS);
        dir = new ForensicReportDirectory();
    }

    public CDEROrganization getCderOrg() {
        return cderOrg;
    }

    public FederalLicensingOrganization getFedLicOrg() {
        return fedLicOrg;
    }

    public StateLicensingOrganization getStateLicOrg() {
        return stateLicOrg;
    }

    public ForensicsOrganization getForOrg() {
        return forOrg;
    }

    public ForensicReportDirectory getDir() {
        return dir;
    }
    
}
