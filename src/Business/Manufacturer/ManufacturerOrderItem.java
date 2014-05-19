/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manufacturer;

import Business.OrderItem;

/**
 *
 * @author Karan Mankodi
 */
public class ManufacturerOrderItem extends OrderItem {
    
    Drug drug;
    int quantity;
    float price;
    
    public ManufacturerOrderItem(){
        
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
}
