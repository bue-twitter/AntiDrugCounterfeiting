/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author karanmankodi
 */
public class Patient {

    private String name;
    private int id;
    public static int count = 1000;
    private Address address;
    private ArrayList<PatientOrderItem> patientOrders;
    
    public Patient() {
        count++;
        id = count;
        address = new Address();
        patientOrders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<PatientOrderItem> getPatientOrders() {
        return patientOrders;
    }

    public void setPatientOrders(ArrayList<PatientOrderItem> patientOrders) {
        this.patientOrders = patientOrders;
    }

    public PatientOrderItem newPatientOrderItem(){
        PatientOrderItem poi = new PatientOrderItem();
        patientOrders.add(poi);
        return poi;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Patient.count = count;
    }
    
}
