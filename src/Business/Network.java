/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Locale;

/**
 *
 * @author karanmankodi
 */
public class Network extends Enterprise{

    private EnterpriseDirectory enterpriseDirectory;
    private PatientDirectory patientDirectory;
    private Locale locale;
    public static final String US = "United States of America";
    public static final String FRANCE = "France";
    
    
    public Network(String networkName) {
        super(networkName);
        enterpriseDirectory = new EnterpriseDirectory();
        patientDirectory = new PatientDirectory();
    }

    public Locale getLocale() {
        return locale;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }
    
    
}
