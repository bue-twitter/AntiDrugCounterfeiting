/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manufacturer;

import Business.Dispenser.DispenserEnterprise;
import Business.FDA.ClinicalTestApplication;
import Business.FDA.INDApplication;
import Business.UserAccount;
import Business.Wholesaler.WholesalerEnterprise;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author karanmankodi
 */
public class Drug {
    
    private Boolean license;
    private String name;
    private UUID id;
    private String color;
    private String shape;
    private String taste;
    private String activeIngredient;
    private int activeIngredientProportion;
    private ArrayList<String> sideEffects;
    
    private int available;
    private int threshold;
    private int price;
    
    private ArrayList<UserAccount> drugPedigree;
    private ArrayList<Long> requestIDs;
    
    private ManufacturerEnterprise manuEnt;
    private WholesalerEnterprise wholeEnt;
    private DispenserEnterprise dispEnt;
    
    private ClinicalTestApplication clinicalTestApplication;
    
    public Drug() {
        id = UUID.randomUUID();   
        license = Boolean.FALSE;
        drugPedigree = new ArrayList<>();
        requestIDs = new ArrayList<>();
        sideEffects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public Boolean getLicense() {
        return license;
    }

    public void setLicense(Boolean license) {
        this.license = license;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public ArrayList<String> getSideEffects() {
        return sideEffects;
    }

    public void addSideEffect(String sideEffect){
        sideEffects.add(sideEffect);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ManufacturerEnterprise getManuEnt() {
        return manuEnt;
    }

    public void setManuEnt(ManufacturerEnterprise manuEnt) {
        this.manuEnt = manuEnt;
    }

    public WholesalerEnterprise getWholeEnt() {
        return wholeEnt;
    }

    public void setWholeEnt(WholesalerEnterprise wholeEnt) {
        this.wholeEnt = wholeEnt;
    }

    public DispenserEnterprise getDispEnt() {
        return dispEnt;
    }

    public void setDispEnt(DispenserEnterprise dispEnt) {
        this.dispEnt = dispEnt;
    }

    public ArrayList<UserAccount> getDrugPedigree() {
        return drugPedigree;
    }
    
    public void addToPedigree(UserAccount ua){
        drugPedigree.add(ua);
    }

    public ArrayList<Long> getRequestIDs() {
        return requestIDs;
    }

    public void addToRequestIDs(Long identifier){
        requestIDs.add(identifier);
    }
    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    public String getActiveIngredient() {
        return activeIngredient;
    }

    public void setActiveIngredient(String activeIngredient) {
        this.activeIngredient = activeIngredient;
    }

    public int getActiveIngredientProportion() {
        return activeIngredientProportion;
    }

    public void setActiveIngredientProportion(int activeIngredientProportion) {
        this.activeIngredientProportion = activeIngredientProportion;
    }

    public ClinicalTestApplication getClinicalTestApplication() {
        return clinicalTestApplication;
    }

    public void setClinicalTestApplication(ClinicalTestApplication clinicalTestApplication) {
        this.clinicalTestApplication = clinicalTestApplication;
    }

    @Override
    public String toString() {
        return name;
    }

    
}
