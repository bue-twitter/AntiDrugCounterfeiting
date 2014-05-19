/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Karan Mankodi
 */
public class Order {
    
    ArrayList<OrderItem> orderItemList;
    
    private int id;
    static int count = 0;
    private Date dateOfPurchase;
    private int quantity;
    private UserAccount ua;
    
    public Order(){
        orderItemList = new ArrayList<>();
        count++;
        id = count;
        
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
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
    
    
    public OrderItem newOrderItem(){
        OrderItem oItem = new OrderItem();
        orderItemList.add(oItem);
        return oItem;
    }
    
    public void removeOrderItem(OrderItem oItem){
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
        Order.count = count;
    }

    
    
    
    
    
    
}
