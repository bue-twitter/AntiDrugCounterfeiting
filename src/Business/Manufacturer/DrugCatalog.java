/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manufacturer;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author karanmankodi
 */
public class DrugCatalog {

    private ArrayList<Drug> drugList;
    private ArrayList<Drug> discontiuedDrugList;

    public DrugCatalog() {
        drugList = new ArrayList<>();
        discontiuedDrugList = new ArrayList<>();
    }

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }

    public void setDrugList(ArrayList<Drug> drugList) {
        this.drugList = drugList;
    }

    public Drug newDrug() {
        Drug d = new Drug();
        return d;
    }

    public void addDrug(Drug d) {
        drugList.add(d);
    }

    public Drug addQuantity(Drug drug, int quantity) {
        for (Drug d : drugList) {
            if (d.getId().equals(drug.getId())) {
                drug.setAvailable(drug.getAvailable() + quantity);
                return drug;
            }
        }
        return null;
    }

    public void deleteDrug(Drug d) {
        drugList.remove(d);
    }

    public Drug searchDrug(String name) {
        for (Drug d : drugList) {
            if (d.getName().equals(name)) {
                return d;
            }
        }
        JOptionPane.showMessageDialog(null, "Drug not found");
        return null;
    }
    
    public void discontiueDrug(Drug d){
        drugList.remove(d);
        d.setLicense(Boolean.FALSE);
        discontiuedDrugList.add(d);
    }

    public ArrayList<Drug> getDiscontiuedDrugList() {
        return discontiuedDrugList;
    }
    
    
}
