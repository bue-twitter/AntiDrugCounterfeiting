/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Karan Mankodi
 */
public class MasterOrderCatalog {

    ArrayList<Order> masterOrderList;

    public MasterOrderCatalog() {
        masterOrderList = new ArrayList<>();

    }

    public ArrayList<Order> getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrderList(ArrayList<Order> masterOrderList) {
        this.masterOrderList = masterOrderList;
    }

    public Order newOrder(){
        Order o = new Order();
        masterOrderList.add(o);
        return o;
    }
    
    public Order addOrder(Order o, UserAccount ua){
        masterOrderList.add(o);
        o.setUa(ua);
        return o;
    }
}
