/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Wholesaler;

import Business.WorkRequest;

/**
 *
 * @author karanmankodi
 */
public class WholesalerShipWorkRequest extends WorkRequest {
    
    private String drugName;
    private int quantity;
    private WholesalerSalesWorkRequest salesWorkRequest;

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public WholesalerSalesWorkRequest getSalesWorkRequest() {
        return salesWorkRequest;
    }

    public void setSalesWorkRequest(WholesalerSalesWorkRequest salesWorkRequest) {
        this.salesWorkRequest = salesWorkRequest;
    }
  
}
