/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Dispenser;

import Business.Wholesaler.*;
import Business.Manufacturer.Drug;
import java.util.ArrayList;

/**
 *
 * @author Karan Mankodi
 */
public class DispenserInventory {
    ArrayList<DispenserInventoryItem> storeInventory;
    
    public DispenserInventory(){
        storeInventory = new ArrayList<>();
    }

    public ArrayList<DispenserInventoryItem> getStoreInventory() {
        return storeInventory;
    }

    public void setStoreInventory(ArrayList<DispenserInventoryItem> storeInventory) {
        this.storeInventory = storeInventory;
    }
    
    public DispenserInventoryItem newInventoryItem(){
        DispenserInventoryItem i = new DispenserInventoryItem();
        storeInventory.add(i);
        return i;
    }
    
    public DispenserInventoryItem addedInventoryItem(DispenserInventoryItem wii, Drug d){
        storeInventory.add(wii);
        wii.setDrug(d);
        return wii;
    }
    
    public void deleteInventoryItem(DispenserInventoryItem i){
        storeInventory.remove(i);
    }
    
    public DispenserInventoryItem checkInventory(Drug drug){
        for (DispenserInventoryItem i : storeInventory){
            if(i.getDrug()==drug){
                return i;
            }
        }
        return newInventoryItem();
            
        
    }
}
