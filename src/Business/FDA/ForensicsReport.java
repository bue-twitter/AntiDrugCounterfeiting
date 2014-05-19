/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FDA;

import Business.Enterprise;
import Business.Manufacturer.Drug;
import java.util.UUID;

/**
 *
 * @author karanmankodi
 */
public class ForensicsReport {
    private ClinicalTestApplication clinicalTestApplication;
    private String activeIngredient;
    private int activeIngProportion;
    private String inactiveIngredient;
    private int inactiveIngProportion;
    private int basicContent;
    private int acidicContent;
    private long orderID;
    private UUID drugId;
    private Drug drug;
    private Enterprise ent;
    private double id;

    public ForensicsReport(Drug d, Enterprise ent) {
        this.drug = d;
        this.ent = ent;
        id = Math.random();
    }

    public ClinicalTestApplication getClinicalTestApplication() {
        return clinicalTestApplication;
    }

    public void setClinicalTestApplication(ClinicalTestApplication clinicalTestApplication) {
        this.clinicalTestApplication = clinicalTestApplication;
    }

    public Enterprise getEnt() {
        return ent;
    }

    public void setEnt(Enterprise ent) {
        this.ent = ent;
    }
    
    public String getActiveIngredient() {
        return activeIngredient;
    }

    public void setActiveIngredient(String activeIngredient) {
        this.activeIngredient = activeIngredient;
    }

    public int getActiveIngProportion() {
        return activeIngProportion;
    }

    public void setActiveIngProportion(int activeIngProportion) {
        this.activeIngProportion = activeIngProportion;
    }

    public String getInactiveIngredient() {
        return inactiveIngredient;
    }

    public void setInactiveIngredient(String inactiveIngredient) {
        this.inactiveIngredient = inactiveIngredient;
    }

    public int getInactiveIngProportion() {
        return inactiveIngProportion;
    }

    public void setInactiveIngProportion(int inactiveIngProportion) {
        this.inactiveIngProportion = inactiveIngProportion;
    }

    public int getBasicContent() {
        return basicContent;
    }

    public void setBasicContent(int basicContent) {
        this.basicContent = basicContent;
    }

    public int getAcidicContent() {
        return acidicContent;
    }

    public void setAcidicContent(int acidicContent) {
        this.acidicContent = acidicContent;
    }

    

    public double getId() {
        return id;
    }

    public UUID getDrugId() {
        return drugId;
    }

    public void setDrugId(UUID drugId) {
        this.drugId = drugId;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
     
}
