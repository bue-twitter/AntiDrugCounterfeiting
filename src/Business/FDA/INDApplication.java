/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FDA;

import Business.Manufacturer.Drug;
import Business.Manufacturer.ManufacturerEnterprise;
import java.util.UUID;

/**
 *
 * @author karanmankodi
 */
public class INDApplication {

    private Drug drug;
    private ManufacturerEnterprise manuEnt;
    private long licenseId;
    private Boolean safety;
    private Boolean desiredEffect;
    private int timeToAbsorb;
    private int timeForEffect;
    private int timeToEliminate;

    public INDApplication(Drug drug, ManufacturerEnterprise manuEnt) {
        this.drug = drug;
        this.manuEnt = manuEnt;
        licenseId = UUID.randomUUID().getLeastSignificantBits();
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public ManufacturerEnterprise getManuEnt() {
        return manuEnt;
    }

    public void setManuEnt(ManufacturerEnterprise manuEnt) {
        this.manuEnt = manuEnt;
    }

    public long getLicenseId() {
        return licenseId;
    }

    public Boolean getSafety() {
        return safety;
    }

    public void setSafety(Boolean safety) {
        this.safety = safety;
    }

    public Boolean getDesiredEffect() {
        return desiredEffect;
    }

    public void setDesiredEffect(Boolean desiredEffect) {
        this.desiredEffect = desiredEffect;
    }

    public int getTimeToAbsorb() {
        return timeToAbsorb;
    }

    public void setTimeToAbsorb(int timeToAbsorb) {
        this.timeToAbsorb = timeToAbsorb;
    }

    public int getTimeForEffect() {
        return timeForEffect;
    }

    public void setTimeForEffect(int timeForEffect) {
        this.timeForEffect = timeForEffect;
    }

    public int getTimeToEliminate() {
        return timeToEliminate;
    }

    public void setTimeToEliminate(int timeToEliminate) {
        this.timeToEliminate = timeToEliminate;
    }
}
