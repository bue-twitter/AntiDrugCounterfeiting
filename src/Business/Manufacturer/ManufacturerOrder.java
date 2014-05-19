/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manufacturer;

import Business.Order;
import Business.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Karan Mankodi
 */
public class ManufacturerOrder {
    
    ArrayList<ManufacturerOrderItem> orderItemList;
    
    private int id;
    static int count = 0;
    private Date dateOfPurchase;
    private int quantity;
    private UserAccount ua;
    
    public ManufacturerOrder(){
        orderItemList = new ArrayList<ManufacturerOrderItem>();
        count++;
        id = count;
        
    }

    public ArrayList<ManufacturerOrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<ManufacturerOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }
    
    
    public ManufacturerOrderItem newOrderItem(){
        ManufacturerOrderItem oItem = new ManufacturerOrderItem();
        orderItemList.add(oItem);
        return oItem;
    }
    
    public void removeOrderItem(ManufacturerOrderItem oItem){
        orderItemList.remove(oItem);
    }

    @Override
    public String toString() {
        return ""+id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        ManufacturerOrder.count = count;
    }

    
    
    
    
    
    
}
