/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FDA;

import Business.WorkRequest;

/**
 *
 * @author karanmankodi
 */
public class EnterpriseLicenseRequest extends WorkRequest {

    private EnterpriseLicense entLic;
    

    public EnterpriseLicenseRequest() {
        entLic = new EnterpriseLicense(super.getEnt());
        
    }
    
    public EnterpriseLicense getEntLic() {
        return entLic;
    }
    
}
