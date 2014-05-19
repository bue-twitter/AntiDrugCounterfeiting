/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Dispenser;

import Business.Patient;
import Business.WorkRequest;

/**
 *
 * @author karanmankodi
 */
public class AdverseEffectsWorkRequest extends WorkRequest {
    
    private Patient patient;
    private String comments;

    public AdverseEffectsWorkRequest() {
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
}
