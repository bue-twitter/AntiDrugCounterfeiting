/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author karanmankodi
 */
public class PatientDirectory {
    ArrayList<Patient> patientList;

    public PatientDirectory() {
        patientList = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public Patient newPatient(){
        Patient p = new Patient();
        patientList.add(p);
        return p;
    }
}
