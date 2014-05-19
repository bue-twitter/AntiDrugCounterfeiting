/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FDA;

import Business.Patient;
import Business.WorkRequest;

/**
 *
 * @author karanmankodi
 */
public class ReportSuspicionWorkRequest extends WorkRequest {

    Patient p;
    String reason;
    public ReportSuspicionWorkRequest() {
    }

    public Patient getP() {
        return p;
    }

    public void setP(Patient p) {
        this.p = p;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    
}
