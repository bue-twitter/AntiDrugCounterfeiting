/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Wholesaler;

import Business.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Karan Mankodi
 */
public class WholesalerMasterOrderCatalog {

    ArrayList<WholesalerOrder> masterOrderList;

    public WholesalerMasterOrderCatalog() {
        masterOrderList = new ArrayList<>();

    }

    public ArrayList<WholesalerOrder> getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrderList(ArrayList<WholesalerOrder> masterOrderList) {
        this.masterOrderList = masterOrderList;
    }

    public WholesalerOrder newOrder(){
        WholesalerOrder o = new WholesalerOrder();
        masterOrderList.add(o);
        return o;
    }
    
    public WholesalerOrder addOrder(WholesalerOrder o, UserAccount ua){
        masterOrderList.add(o);
        o.setUa(ua);
        return o;
    }
}
