/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Dispenser.DispenserEnterprise;
import Business.FDA.FDAEnterprise;
import Business.Manufacturer.ManufacturerEnterprise;
import Business.Wholesaler.WholesalerEnterprise;
import java.util.ArrayList;

/**
 *
 * @author karanmankodi
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;
    ArrayList<ManufacturerEnterprise> manuEntList;
    ArrayList<DispenserEnterprise> dispEntList;
    ArrayList<WholesalerEnterprise> wholeEntList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public Enterprise newEnterprise(String type, String name) {
        Enterprise enterprise = null;

        if (type.equals(Enterprise.WHOLESALER)) {
            enterprise = new WholesalerEnterprise(name);
            enterprise.setType(Enterprise.WHOLESALER);
        }
        if (type.equals(Enterprise.MANUFACTURER)) {
            enterprise = new ManufacturerEnterprise(name);
            enterprise.setType(Enterprise.MANUFACTURER);
        }

        if (type.equals(Enterprise.DISPENSER)) {
            enterprise = new DispenserEnterprise(name);
            enterprise.setType(Enterprise.DISPENSER);
        }

        if (type.equals(Enterprise.FDA)) {
            enterprise = new FDAEnterprise(name);
            enterprise.setType(Enterprise.FDA);
        }
        if (enterprise != null) {
            enterpriseList.add(enterprise);
        }

        return enterprise;
    }

    public ArrayList<ManufacturerEnterprise> searchManuEnterprise() {
        manuEntList = new ArrayList<ManufacturerEnterprise>();
        for (Enterprise e : enterpriseList) {
            if (e.getType().equalsIgnoreCase((Enterprise.MANUFACTURER))) {
                manuEntList.add((ManufacturerEnterprise) e);
            }
        }
        return manuEntList;
    }

    public ArrayList<DispenserEnterprise> searchDispEnterprise() {
        dispEntList = new ArrayList<DispenserEnterprise>();
        for (Enterprise e : enterpriseList) {
            if (e.getType().equalsIgnoreCase((Enterprise.DISPENSER))) {
                dispEntList.add((DispenserEnterprise) e);
            }
        }
        return dispEntList;
    }

    public ArrayList<WholesalerEnterprise> searchWholeEnterprise() {
        wholeEntList = new ArrayList<WholesalerEnterprise>();
        for (Enterprise e : enterpriseList) {
            if (e.getType().equalsIgnoreCase((Enterprise.WHOLESALER))) {
                wholeEntList.add((WholesalerEnterprise) e);
            }
        }
        return wholeEntList;
    }
}
