/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manufacturer;

import Business.WorkRequest;

/**
 *
 * @author karanmankodi
 */
public class ManufacturerShipWorkRequest extends WorkRequest {

    private ManufacturerSalesWorkRequest salesWorkRequest;

    public ManufacturerSalesWorkRequest getSalesWorkRequest() {
        return salesWorkRequest;
    }

    public void setSalesWorkRequest(ManufacturerSalesWorkRequest salesWorkRequest) {
        this.salesWorkRequest = salesWorkRequest;
    }
}
