
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
public class ClinicalTestingRequest extends WorkRequest {

    private DrugProductionRequest drugProdReq;
    private ClinicalTestApplication clinicalTestApplication;

    public ClinicalTestingRequest() {
       
    }

    public DrugProductionRequest getDrugProdReq() {
        return drugProdReq;
    }

    public void setDrugProdReq(DrugProductionRequest drugProdReq) {
        this.drugProdReq = drugProdReq;
    }

    public ClinicalTestApplication newClinicalTestApplication(INDApplication indApp){
        clinicalTestApplication = new ClinicalTestApplication(indApp);
        return clinicalTestApplication;
    }
    
    public ClinicalTestApplication getClinicalTestApplication() {
        return clinicalTestApplication;
    }

    public void setClinicalTestApplication(ClinicalTestApplication clinicalTestApplication) {
        this.clinicalTestApplication = clinicalTestApplication;
    }
    
}

