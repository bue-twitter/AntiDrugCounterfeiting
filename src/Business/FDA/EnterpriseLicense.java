/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FDA;

import Business.Enterprise;
import Business.Organization;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author karanmankodi
 */
public class EnterpriseLicense {
    
    private Enterprise ent;
    private Long licenseNo;
    
    private String appName;
    private String appType;
    private int appFEIN;
    private String appOrgStr;
    private String appLine1;
    private String appCity;
    private String appState;
    private int appZipCode;
    private ArrayList<Organization> appOrgList;

    public EnterpriseLicense(Enterprise ent) {
        this.ent = ent;
        licenseNo = UUID.randomUUID().getLeastSignificantBits();
    }

    public Enterprise getEnt() {
        return ent;
    }

    public Long getLicenseNo() {
        return licenseNo;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getAppFEIN() {
        return appFEIN;
    }

    public void setAppFEIN(int appFEIN) {
        this.appFEIN = appFEIN;
    }

    public String getAppOrgStr() {
        return appOrgStr;
    }

    public void setAppOrgStr(String appOrgStr) {
        this.appOrgStr = appOrgStr;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getAppLine1() {
        return appLine1;
    }

    public void setAppLine1(String appLine1) {
        this.appLine1 = appLine1;
    }

    public String getAppCity() {
        return appCity;
    }

    public void setAppCity(String appCity) {
        this.appCity = appCity;
    }

    public String getAppState() {
        return appState;
    }

    public void setAppState(String appState) {
        this.appState = appState;
    }

    public int getAppZipCode() {
        return appZipCode;
    }

    public void setAppZipCode(int appZipCode) {
        this.appZipCode = appZipCode;
    }

    public ArrayList<Organization> getAppOrgList() {
        return appOrgList;
    }

    public void setAppOrgList(ArrayList<Organization> appOrgList) {
        this.appOrgList = appOrgList;
    }

    
}
