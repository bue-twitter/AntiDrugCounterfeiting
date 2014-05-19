/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Wholesaler;

import Business.Manufacturer.Drug;
import java.util.ArrayList;

/**
 *
 * @author Karan Mankodi
 */
public class WholesalerInventory {
    ArrayList<WholesalerInventoryItem> storeInventory;
    
    public WholesalerInventory(){
        storeInventory = new ArrayList<>();
    }

    public ArrayList<WholesalerInventoryItem> getStoreInventory() {
        return storeInventory;
    }

    public void setStoreInventory(ArrayList<WholesalerInventoryItem> storeInventory) {
        this.storeInventory = storeInventory;
    }
    
    public WholesalerInventoryItem newInventoryItem(){
        WholesalerInventoryItem i = new WholesalerInventoryItem();
        storeInventory.add(i);
        return i;
    }
    
    public WholesalerInventoryItem addedInventoryItem(WholesalerInventoryItem wii, Drug d){
        storeInventory.add(wii);
        wii.setDrug(d);
        return wii;
    }
    
    public void deleteInventoryItem(WholesalerInventoryItem i){
        storeInventory.remove(i);
    }
    
    public WholesalerInventoryItem checkInventory(Drug drug){
        for (WholesalerInventoryItem i : storeInventory){
            if(i.getDrug()==drug){
                return i;
            }
        }
        return newInventoryItem();
            
        
    }
}
