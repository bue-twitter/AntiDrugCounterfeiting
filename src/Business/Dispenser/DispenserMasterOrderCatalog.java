/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Dispenser;

import Business.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Karan Mankodi
 */
public class DispenserMasterOrderCatalog {

    ArrayList<DispenserOrder> masterOrderList;

    public DispenserMasterOrderCatalog() {
        masterOrderList = new ArrayList<>();

    }

    public ArrayList<DispenserOrder> getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrderList(ArrayList<DispenserOrder> masterOrderList) {
        this.masterOrderList = masterOrderList;
    }

    public DispenserOrder newOrder(){
        DispenserOrder o = new DispenserOrder();
        masterOrderList.add(o);
        return o;
    }
    
    public DispenserOrder addOrder(DispenserOrder o, UserAccount ua){
        masterOrderList.add(o);
        o.setUa(ua);
        return o;
    }
}
