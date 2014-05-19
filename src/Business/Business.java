/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Dispenser.DispenserInventoryItem;
import Business.Dispenser.DispenserOrder;
import Business.Manufacturer.Drug;
import Business.Manufacturer.ManufacturerEnterprise;
import Business.Manufacturer.ManufacturerOrder;
import Business.Wholesaler.WholesalerInventoryItem;
import Business.Wholesaler.WholesalerOrder;
import java.util.ArrayList;

/**
 *
 * @author karanmankodi
 */
public class Business extends Network {

    private NetworkDirectory networkDritectory;
    private ArrayList<Drug> suspectedDrugs;
    private ArrayList<Drug> fakeDrugs;
    private static Business business;
    
    int empID;
    int orderID;
    int patientID;
    int diiID;
    int doID;
    int moID;
    int wiiID;
    int woID;

    private Business(String name) {
        super(name);
        networkDritectory= new NetworkDirectory();
        suspectedDrugs = new ArrayList<>();
        fakeDrugs = new ArrayList<>();
    }

     public static Business Init() {
        if (business == null) {
            business = new Business("Business");
        }
        return business;
    }

     public static Business getInstance() {
        db4o.Db4outil.storeObject(business);
        business = db4o.Db4outil.getBusiness();
        return business;
    }

    public NetworkDirectory getNetworkDritectory() {
        return networkDritectory;
    }

    public void setNetworkDritectory(NetworkDirectory networkDritectory) {
        this.networkDritectory = networkDritectory;
    }

    public void addSuspectedDrug(Drug d){
        suspectedDrugs.add(d);
    }
    
    public void addFakeDrug(Drug drug){
        fakeDrugs.add(drug);
    }

    public ArrayList<Drug> getSuspectedDrugs() {
        return suspectedDrugs;
    }

    
    
    public ArrayList<Drug> getFakeDrugs() {
        return fakeDrugs;
    }
    
    public void getAllStatic(){
        empID = Employee.getCount();
        orderID = Order.getCount();
        patientID = Patient.getCount();
        diiID = DispenserInventoryItem.getCount();
        doID = DispenserOrder.getCount();
        moID = ManufacturerOrder.getCount();
        wiiID = WholesalerInventoryItem.getCount();
        woID = WholesalerOrder.getCount();
    }
    
    public void setAllStatic(){
        Employee.setCount(empID);
        Order.setCount(orderID);
        Patient.setCount(patientID);
        DispenserInventoryItem.setCount(diiID);
        DispenserOrder.setCount(doID);
        ManufacturerOrder.setCount(moID);
        WholesalerInventoryItem.setCount(wiiID);
        WholesalerOrder.setCount(woID);
    }
}
