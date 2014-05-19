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
public class DrugApprovalConfirmation extends WorkRequest {

    private ClinicalTestingRequest ctr;
    
    public DrugApprovalConfirmation() {
    }

    public ClinicalTestingRequest getCtr() {
        return ctr;
    }

    public void setCtr(ClinicalTestingRequest ctr) {
        this.ctr = ctr;
    }
    
}
