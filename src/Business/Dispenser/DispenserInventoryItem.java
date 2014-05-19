/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Dispenser;

import Business.Manufacturer.Drug;
import Business.WorkRequest;

/**
 *
 * @author Karan Mankodi
 */
public class DispenserInventoryItem {
    
    static int count = 0;
    
    int id;
    int quantity;
    Drug drug;
    String date;
    WorkRequest request;
    
    public DispenserInventoryItem(){
        count++;
        id = count;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }
  
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity += quantity;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }
    
    public int getTotalQuantity(){
        quantity += quantity;
        return quantity;
    }

    public WorkRequest getRequest() {
        return request;
    }

    public void setRequest(WorkRequest request) {
        this.request = request;
    }

    @Override
    public String toString() {
        return drug.getName();
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        DispenserInventoryItem.count = count;
    }
    
    
    
}
