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
public class WholesalerSalesWorkRequest extends WorkRequest {
    
    private int quantity;
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
