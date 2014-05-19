/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manufacturer;

import Business.Wholesaler.WholesalerShipWorkRequest;
import Business.WorkRequest;

/**
 *
 * @author karanmankodi
 */
public class ManufacturerSalesWorkRequest extends WorkRequest {

    private int quantity;
    private WholesalerShipWorkRequest wholeShipWorkRequest;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public WholesalerShipWorkRequest getWholeShipWorkRequest() {
        return wholeShipWorkRequest;
    }

    public void setWholeShipWorkRequest(WholesalerShipWorkRequest wholeShipWorkRequest) {
        this.wholeShipWorkRequest = wholeShipWorkRequest;
    }

    
}
