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
public class DispenserSalesWorkRequest extends WorkRequest {

    private Patient patient;
    private String  dosage;

    public DispenserSalesWorkRequest() {
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
    
}

