/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manufacturer;

import Business.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Karan Mankodi
 */
public class ManufacturerMasterOrderCatalog {

    ArrayList<ManufacturerOrder> masterOrderList;

    public ManufacturerMasterOrderCatalog() {
        masterOrderList = new ArrayList<>();

    }

    public ArrayList<ManufacturerOrder> getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrderList(ArrayList<ManufacturerOrder> masterOrderList) {
        this.masterOrderList = masterOrderList;
    }

    public ManufacturerOrder newOrder(){
        ManufacturerOrder o = new ManufacturerOrder();
        masterOrderList.add(o);
        return o;
    }
    
    public ManufacturerOrder addOrder(ManufacturerOrder o, UserAccount ua){
        masterOrderList.add(o);
        o.setUa(ua);
        return o;
    }
}
