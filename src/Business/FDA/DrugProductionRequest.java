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
public class DrugProductionRequest extends WorkRequest {

    INDApplication indApp;

    public DrugProductionRequest() {
        indApp = new INDApplication(super.getDrug(), super.getManuEnt());
    }

    public INDApplication getIndApp() {
        return indApp;
    }
    
}
