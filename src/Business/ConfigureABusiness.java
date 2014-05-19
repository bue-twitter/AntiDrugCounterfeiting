/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Dispenser.DispenserEnterprise;
import Business.Dispenser.DispenserInventoryItem;
import Business.FDA.FDAEnterprise;
import Business.Manufacturer.Drug;
import Business.Manufacturer.ManufacturerEnterprise;
import Business.Roles.AdminRole;
import Business.Roles.DispenserAdminRole;
import Business.Roles.DispenserInventoryManagerRole;
import Business.Roles.DispenserSalesEmployeeRole;
import Business.Roles.FDAAdminRole;
import Business.Roles.ManufacturerAdminRole;
import Business.Roles.ManufacturerProductManagerRole;
import Business.Roles.ManufacturerSalesEmployeeRole;
import Business.Roles.ManufacturerShippingManagerRole;
import Business.Roles.WholesalerAdminRole;
import Business.Roles.WholesalerInventoryManagerRole;
import Business.Roles.WholesalerSalesEmployeeRole;
import Business.Roles.WholesalerShippingManagerRole;
import Business.Wholesaler.WholesalerEnterprise;
import Business.Wholesaler.WholesalerInventoryItem;
import java.util.Locale;

/**
 *
 * @author karanmankodi
 */
public class ConfigureABusiness {
    
    public static Business Initialize() {
        Business business = Business.Init();
        
        Locale US = new Locale("en", "US");
        Network USA = business.getNetworkDritectory().newNetwork(US);
        USA.setLocale(US);
        
        Locale FR = new Locale("fr", "FR");
        Network FRANCE = business.getNetworkDritectory().newNetwork(FR);
        FRANCE.setLocale(FR);
        
        Employee e = business.getEmployeeDirectory().newEmployee();
        e.setName("Administrator");

        UserAccount ua = business.getUserAccountDirectory().newUserAccount();
        ua.setUsername("admin");
        ua.setPassword("admin");
        ua.setStatus("Active");
        ua.setEmployee(e);
        ua.setRole(new AdminRole());
        
        FDAEnterprise fdaEntUS = (FDAEnterprise)USA.getEnterpriseDirectory().newEnterprise(Enterprise.FDA, "FDA");
        fdaEntUS.getAddress().setLine1("10903 New Hampshire Avenue");
        fdaEntUS.getAddress().setCiy("Silver Spring");
        fdaEntUS.getAddress().setState(Address.MD);
        fdaEntUS.getAddress().setZipCode(20993);
        Employee fdaAdminUS = fdaEntUS.getEmployeeDirectory().newEmployee();
        fdaAdminUS.setName("FDA Admin");
        UserAccount fdaAdminUAUS = fdaEntUS.getUserAccountDirectory().newUserAccount();
        fdaAdminUAUS.setEmployee(fdaAdminUS);
        fdaAdminUAUS.setUsername("fda");
        fdaAdminUAUS.setPassword("fda");
        fdaAdminUAUS.setRole(new FDAAdminRole());

        DispenserEnterprise dispenserEntUS = (DispenserEnterprise)USA.getEnterpriseDirectory().newEnterprise(Enterprise.DISPENSER, "d");
        dispenserEntUS.getAddress().setLine1("240 Westland Avenue");
        dispenserEntUS.getAddress().setCiy("Miami");
        dispenserEntUS.getAddress().setState(Address.FL);
        dispenserEntUS.getAddress().setZipCode(20012);
        dispenserEntUS.setLicense(Boolean.TRUE);
        Employee de1US = dispenserEntUS.getEmployeeDirectory().newEmployee();
        de1US.setName("d");
        UserAccount dua1US = dispenserEntUS.getUserAccountDirectory().newUserAccount();
        dua1US.setEmployee(de1US);
        dua1US.setUsername("d");
        dua1US.setPassword("d");
        dua1US.setRole(new DispenserAdminRole());

        ManufacturerEnterprise manuEntUS = (ManufacturerEnterprise)USA.getEnterpriseDirectory().newEnterprise(Enterprise.MANUFACTURER, "m");
        manuEntUS.getAddress().setLine1("580 Canal Street");
        manuEntUS.getAddress().setCiy("Minneapolis");
        manuEntUS.getAddress().setState(Address.MN);
        manuEntUS.getAddress().setZipCode(29831);
        manuEntUS.setLicense(Boolean.TRUE);
        Employee me1US = manuEntUS.getEmployeeDirectory().newEmployee();
        me1US.setName("m");
        UserAccount mua1US = manuEntUS.getUserAccountDirectory().newUserAccount();
        mua1US.setEmployee(me1US);
        mua1US.setUsername("m");
        mua1US.setPassword("m");
        mua1US.setRole(new ManufacturerAdminRole());
        
        WholesalerEnterprise wholeEntUS = (WholesalerEnterprise)USA.getEnterpriseDirectory().newEnterprise(Enterprise.WHOLESALER, "w");
        wholeEntUS.getAddress().setLine1("97 County Blvd");
        wholeEntUS.getAddress().setCiy("Baltimore");
        wholeEntUS.getAddress().setState(Address.MD);
        wholeEntUS.getAddress().setZipCode(12094);
        wholeEntUS.setLicense(Boolean.TRUE);
        Employee we1US = wholeEntUS.getEmployeeDirectory().newEmployee();
        we1US.setName("w");
        UserAccount wua1US = wholeEntUS.getUserAccountDirectory().newUserAccount();
        wua1US.setEmployee(we1US);
        wua1US.setUsername("w");
        wua1US.setPassword("w");
        wua1US.setRole(new WholesalerAdminRole());
        
        DispenserEnterprise dispenserEnt2US = (DispenserEnterprise)USA.getEnterpriseDirectory().newEnterprise(Enterprise.DISPENSER, "d2");
        dispenserEnt2US.setLicense(Boolean.TRUE);
        Employee de2US = dispenserEnt2US.getEmployeeDirectory().newEmployee();
        de2US.setName("d2");
        UserAccount dua2US = dispenserEnt2US.getUserAccountDirectory().newUserAccount();
        dua2US.setEmployee(de2US);
        dua2US.setUsername("d2");
        dua2US.setPassword("d2");
        dua2US.setRole(new DispenserAdminRole());

        ManufacturerEnterprise manuEnt2US = (ManufacturerEnterprise)USA.getEnterpriseDirectory().newEnterprise(Enterprise.MANUFACTURER, "m2");
        manuEnt2US.setLicense(Boolean.TRUE);
        Employee me2US = manuEnt2US.getEmployeeDirectory().newEmployee();
        me2US.setName("m2");
        UserAccount mua2US = manuEnt2US.getUserAccountDirectory().newUserAccount();
        mua2US.setEmployee(me2US);
        mua2US.setUsername("m2");
        mua2US.setPassword("m2");
        mua2US.setRole(new ManufacturerAdminRole());
        
        Employee mpmUS = manuEntUS.getProdMgmtOrg().getEmployeeDirectory().newEmployee();
        mpmUS.setName("mpm");
        UserAccount mpmuaUS = manuEntUS.getProdMgmtOrg().getUserAccountDirectory().newUserAccount();
        mpmuaUS.setEmployee(mpmUS);
        mpmuaUS.setUsername("mpm");
        mpmuaUS.setPassword("mpm");
        mpmuaUS.setRole(new ManufacturerProductManagerRole());
        
        Employee mseUS = manuEntUS.getSalesOrg().getEmployeeDirectory().newEmployee();
        mseUS.setName("mse");
        UserAccount mseuaUS = manuEntUS.getSalesOrg().getUserAccountDirectory().newUserAccount();
        mseuaUS.setEmployee(mseUS);
        mseuaUS.setUsername("mse");
        mseuaUS.setPassword("mse");
        mseuaUS.setRole(new ManufacturerSalesEmployeeRole());
        
        Employee msmUS = manuEntUS.getShippingOrg().getEmployeeDirectory().newEmployee();
        msmUS.setName("msm");
        UserAccount msmuaUS = manuEntUS.getShippingOrg().getUserAccountDirectory().newUserAccount();
        msmuaUS.setEmployee(msmUS);
        msmuaUS.setUsername("msm");
        msmuaUS.setPassword("msm");
        msmuaUS.setRole(new ManufacturerShippingManagerRole());
        
        Employee mpm2US = manuEnt2US.getProdMgmtOrg().getEmployeeDirectory().newEmployee();
        mpm2US.setName("mpm2");
        UserAccount mpmua2US = manuEnt2US.getProdMgmtOrg().getUserAccountDirectory().newUserAccount();
        mpmua2US.setEmployee(mpm2US);
        mpmua2US.setUsername("mpm2");
        mpmua2US.setPassword("mpm2");
        mpmua2US.setRole(new ManufacturerProductManagerRole());
        
        Employee mse2US = manuEnt2US.getSalesOrg().getEmployeeDirectory().newEmployee();
        mse2US.setName("mse2");
        UserAccount mseua2US = manuEnt2US.getSalesOrg().getUserAccountDirectory().newUserAccount();
        mseua2US.setEmployee(mse2US);
        mseua2US.setUsername("mse2");
        mseua2US.setPassword("mse2");
        mseua2US.setRole(new ManufacturerSalesEmployeeRole());
        
        Employee msm2US = manuEnt2US.getShippingOrg().getEmployeeDirectory().newEmployee();
        msm2US.setName("msm2");
        UserAccount msmua2US = manuEnt2US.getShippingOrg().getUserAccountDirectory().newUserAccount();
        msmua2US.setEmployee(msm2US);
        msmua2US.setUsername("msm2");
        msmua2US.setPassword("msm2");
        msmua2US.setRole(new ManufacturerShippingManagerRole());
        
        Employee wimUS = wholeEntUS.getInvMgmtOrg().getEmployeeDirectory().newEmployee();
        wimUS.setName("wim");
        UserAccount wimuaUS = wholeEntUS.getInvMgmtOrg().getUserAccountDirectory().newUserAccount();
        wimuaUS.setEmployee(wimUS);
        wimuaUS.setUsername("wim");
        wimuaUS.setPassword("wim");
        wimuaUS.setRole(new WholesalerInventoryManagerRole());
        
        Employee wseUS = wholeEntUS.getSalesOrg().getEmployeeDirectory().newEmployee();
        wseUS.setName("wse");
        UserAccount wseuaUS = wholeEntUS.getSalesOrg().getUserAccountDirectory().newUserAccount();
        wseuaUS.setEmployee(wseUS);
        wseuaUS.setUsername("wse");
        wseuaUS.setPassword("wse");
        wseuaUS.setRole(new WholesalerSalesEmployeeRole());
        
        Employee wsmUS = wholeEntUS.getShippingOrg().getEmployeeDirectory().newEmployee();
        wsmUS.setName("wsm");
        UserAccount wsmuaUS = wholeEntUS.getShippingOrg().getUserAccountDirectory().newUserAccount();
        wsmuaUS.setEmployee(wsmUS);
        wsmuaUS.setUsername("wsm");
        wsmuaUS.setPassword("wsm");
        wsmuaUS.setRole(new WholesalerShippingManagerRole());
        
        Employee dimUS = dispenserEntUS.getInvMgmtOrg().getEmployeeDirectory().newEmployee();
        dimUS.setName("dim");
        UserAccount dimuaUS = dispenserEntUS.getInvMgmtOrg().getUserAccountDirectory().newUserAccount();
        dimuaUS.setEmployee(dimUS);
        dimuaUS.setUsername("dim");
        dimuaUS.setPassword("dim");
        dimuaUS.setRole(new DispenserInventoryManagerRole());
        
        Employee dseUS = dispenserEntUS.getSalesOrg().getEmployeeDirectory().newEmployee();
        dseUS.setName("dse");
        dseUS.newDeaNo();
        UserAccount dseuaUS = dispenserEntUS.getInvMgmtOrg().getUserAccountDirectory().newUserAccount();
        dseuaUS.setEmployee(dseUS);
        dseuaUS.setUsername("dse");
        dseuaUS.setPassword("dse");
        dseuaUS.setRole(new DispenserSalesEmployeeRole());
        
        Employee dim2US = dispenserEnt2US.getInvMgmtOrg().getEmployeeDirectory().newEmployee();
        dim2US.setName("dim2");
        UserAccount dimua2US = dispenserEnt2US.getInvMgmtOrg().getUserAccountDirectory().newUserAccount();
        dimua2US.setEmployee(dim2US);
        dimua2US.setUsername("dim2");
        dimua2US.setPassword("dim2");
        dimua2US.setRole(new DispenserInventoryManagerRole());
        
        Employee dse2US = dispenserEnt2US.getSalesOrg().getEmployeeDirectory().newEmployee();
        dse2US.setName("dse2");
        dse2US.newDeaNo();
        UserAccount dseua2US = dispenserEnt2US.getInvMgmtOrg().getUserAccountDirectory().newUserAccount();
        dseua2US.setEmployee(dse2US);
        dseua2US.setUsername("dse2");
        dseua2US.setPassword("dse2");
        dseua2US.setRole(new DispenserSalesEmployeeRole());
        
        
        Drug dUS = manuEntUS.getProdMgmtOrg().getDrugCatalog().newDrug();
        dUS.setManuEnt(manuEntUS);
        dUS.setName("d");
        dUS.setPrice(Integer.parseInt("15"));
        dUS.setAvailable(Integer.parseInt("150"));
        dUS.setThreshold(Integer.parseInt("75"));
        dUS.setLicense(Boolean.TRUE);
        manuEntUS.getProdMgmtOrg().getDrugCatalog().addDrug(dUS);
        WholesalerInventoryItem newInventoryItemUS = wholeEntUS.getInvMgmtOrg().getInventory().newInventoryItem();
        newInventoryItemUS.setDrug(dUS);
        newInventoryItemUS.setQuantity(Integer.parseInt("108"));
        dUS.setWholeEnt(wholeEntUS);
        DispenserInventoryItem diiUS = dispenserEntUS.getInvMgmtOrg().getInventory().newInventoryItem();
        diiUS.setDrug(dUS);
        diiUS.setQuantity(Integer.parseInt("30"));
        dUS.setDispEnt(dispenserEntUS);
        
        FDAEnterprise fdaEntFR = (FDAEnterprise)FRANCE.getEnterpriseDirectory().newEnterprise(Enterprise.FDA, "FDA-FR");
        fdaEntFR.getAddress().setLine1("10903 New Hampshire Avenue");
        fdaEntFR.getAddress().setCiy("Silver Spring");
        fdaEntFR.getAddress().setState(Address.MD);
        fdaEntFR.getAddress().setZipCode(20993);
        Employee fdaAdminFR = fdaEntFR.getEmployeeDirectory().newEmployee();
        fdaAdminFR.setName("FDA Admin");
        UserAccount fdaAdminUAFR = fdaEntFR.getUserAccountDirectory().newUserAccount();
        fdaAdminUAFR.setEmployee(fdaAdminFR);
        fdaAdminUAFR.setUsername("fda");
        fdaAdminUAFR.setPassword("fda");
        fdaAdminUAFR.setRole(new FDAAdminRole());

        DispenserEnterprise dispenserEntFR = (DispenserEnterprise)FRANCE.getEnterpriseDirectory().newEnterprise(Enterprise.DISPENSER, "dFR");
        dispenserEntFR.getAddress().setLine1("240 Westland Avenue");
        dispenserEntFR.getAddress().setCiy("Miami");
        dispenserEntFR.getAddress().setState(Address.FL);
        dispenserEntFR.getAddress().setZipCode(20012);
        dispenserEntFR.setLicense(Boolean.TRUE);
        Employee de1FR = dispenserEntFR.getEmployeeDirectory().newEmployee();
        de1FR.setName("d");
        UserAccount dua1FR = dispenserEntFR.getUserAccountDirectory().newUserAccount();
        dua1FR.setEmployee(de1FR);
        dua1FR.setUsername("d");
        dua1FR.setPassword("d");
        dua1FR.setRole(new DispenserAdminRole());

        ManufacturerEnterprise manuEntFR = (ManufacturerEnterprise)FRANCE.getEnterpriseDirectory().newEnterprise(Enterprise.MANUFACTURER, "mFR");
        manuEntFR.getAddress().setLine1("580 Canal Street");
        manuEntFR.getAddress().setCiy("Minneapolis");
        manuEntFR.getAddress().setState(Address.MN);
        manuEntFR.getAddress().setZipCode(29831);
        manuEntFR.setLicense(Boolean.TRUE);
        Employee me1FR = manuEntFR.getEmployeeDirectory().newEmployee();
        me1FR.setName("m");
        UserAccount mua1FR = manuEntFR.getUserAccountDirectory().newUserAccount();
        mua1FR.setEmployee(me1FR);
        mua1FR.setUsername("m");
        mua1FR.setPassword("m");
        mua1FR.setRole(new ManufacturerAdminRole());
        
        WholesalerEnterprise wholeEntFR = (WholesalerEnterprise)FRANCE.getEnterpriseDirectory().newEnterprise(Enterprise.WHOLESALER, "wFR");
        wholeEntFR.getAddress().setLine1("97 County Blvd");
        wholeEntFR.getAddress().setCiy("Baltimore");
        wholeEntFR.getAddress().setState(Address.MD);
        wholeEntFR.getAddress().setZipCode(12094);
        wholeEntFR.setLicense(Boolean.TRUE);
        Employee we1FR = wholeEntFR.getEmployeeDirectory().newEmployee();
        we1FR.setName("w");
        UserAccount wua1FR = wholeEntFR.getUserAccountDirectory().newUserAccount();
        wua1FR.setEmployee(we1FR);
        wua1FR.setUsername("w");
        wua1FR.setPassword("w");
        wua1FR.setRole(new WholesalerAdminRole());
        
        DispenserEnterprise dispenserEnt2FR = (DispenserEnterprise)FRANCE.getEnterpriseDirectory().newEnterprise(Enterprise.DISPENSER, "d2FR");
        dispenserEnt2FR.setLicense(Boolean.TRUE);
        Employee de2FR = dispenserEnt2FR.getEmployeeDirectory().newEmployee();
        de2FR.setName("d2");
        UserAccount dua2FR = dispenserEnt2FR.getUserAccountDirectory().newUserAccount();
        dua2FR.setEmployee(de2FR);
        dua2FR.setUsername("d2");
        dua2FR.setPassword("d2");
        dua2FR.setRole(new DispenserAdminRole());

        ManufacturerEnterprise manuEnt2FR = (ManufacturerEnterprise)FRANCE.getEnterpriseDirectory().newEnterprise(Enterprise.MANUFACTURER, "m2FR");
        manuEnt2FR.setLicense(Boolean.TRUE);
        Employee me2FR = manuEnt2FR.getEmployeeDirectory().newEmployee();
        me2FR.setName("m2");
        UserAccount mua2FR = manuEnt2FR.getUserAccountDirectory().newUserAccount();
        mua2FR.setEmployee(me2FR);
        mua2FR.setUsername("m2");
        mua2FR.setPassword("m2");
        mua2FR.setRole(new ManufacturerAdminRole());
        
        Employee mpmFR = manuEntFR.getProdMgmtOrg().getEmployeeDirectory().newEmployee();
        mpmFR.setName("mpm");
        UserAccount mpmuaFR = manuEntFR.getProdMgmtOrg().getUserAccountDirectory().newUserAccount();
        mpmuaFR.setEmployee(mpmFR);
        mpmuaFR.setUsername("mpm");
        mpmuaFR.setPassword("mpm");
        mpmuaFR.setRole(new ManufacturerProductManagerRole());
        
        Employee mseFR = manuEntFR.getSalesOrg().getEmployeeDirectory().newEmployee();
        mseFR.setName("mse");
        UserAccount mseuaFR = manuEntFR.getSalesOrg().getUserAccountDirectory().newUserAccount();
        mseuaFR.setEmployee(mseFR);
        mseuaFR.setUsername("mse");
        mseuaFR.setPassword("mse");
        mseuaFR.setRole(new ManufacturerSalesEmployeeRole());
        
        Employee msmFR = manuEntFR.getShippingOrg().getEmployeeDirectory().newEmployee();
        msmFR.setName("msm");
        UserAccount msmuaFR = manuEntFR.getShippingOrg().getUserAccountDirectory().newUserAccount();
        msmuaFR.setEmployee(msmFR);
        msmuaFR.setUsername("msm");
        msmuaFR.setPassword("msm");
        msmuaFR.setRole(new ManufacturerShippingManagerRole());
        
        Employee mpm2FR = manuEnt2FR.getProdMgmtOrg().getEmployeeDirectory().newEmployee();
        mpm2FR.setName("mpm2");
        UserAccount mpmua2FR = manuEnt2FR.getProdMgmtOrg().getUserAccountDirectory().newUserAccount();
        mpmua2FR.setEmployee(mpm2FR);
        mpmua2FR.setUsername("mpm2");
        mpmua2FR.setPassword("mpm2");
        mpmua2FR.setRole(new ManufacturerProductManagerRole());
        
        Employee mse2FR = manuEnt2FR.getSalesOrg().getEmployeeDirectory().newEmployee();
        mse2FR.setName("mse2");
        UserAccount mseua2FR = manuEnt2FR.getSalesOrg().getUserAccountDirectory().newUserAccount();
        mseua2FR.setEmployee(mse2FR);
        mseua2FR.setUsername("mse2");
        mseua2FR.setPassword("mse2");
        mseua2FR.setRole(new ManufacturerSalesEmployeeRole());
        
        Employee msm2FR = manuEnt2FR.getShippingOrg().getEmployeeDirectory().newEmployee();
        msm2FR.setName("msm2");
        UserAccount msmua2FR = manuEnt2FR.getShippingOrg().getUserAccountDirectory().newUserAccount();
        msmua2FR.setEmployee(msm2FR);
        msmua2FR.setUsername("msm2");
        msmua2FR.setPassword("msm2");
        msmua2FR.setRole(new ManufacturerShippingManagerRole());
        
        Employee wimFR = wholeEntFR.getInvMgmtOrg().getEmployeeDirectory().newEmployee();
        wimFR.setName("wim");
        UserAccount wimuaFR = wholeEntFR.getInvMgmtOrg().getUserAccountDirectory().newUserAccount();
        wimuaFR.setEmployee(wimFR);
        wimuaFR.setUsername("wim");
        wimuaFR.setPassword("wim");
        wimuaFR.setRole(new WholesalerInventoryManagerRole());
        
        Employee wseFR = wholeEntFR.getSalesOrg().getEmployeeDirectory().newEmployee();
        wseFR.setName("wse");
        UserAccount wseuaFR = wholeEntFR.getSalesOrg().getUserAccountDirectory().newUserAccount();
        wseuaFR.setEmployee(wseFR);
        wseuaFR.setUsername("wse");
        wseuaFR.setPassword("wse");
        wseuaFR.setRole(new WholesalerSalesEmployeeRole());
        
        Employee wsmFR = wholeEntFR.getShippingOrg().getEmployeeDirectory().newEmployee();
        wsmFR.setName("wsm");
        UserAccount wsmuaFR = wholeEntFR.getShippingOrg().getUserAccountDirectory().newUserAccount();
        wsmuaFR.setEmployee(wsmFR);
        wsmuaFR.setUsername("wsm");
        wsmuaFR.setPassword("wsm");
        wsmuaFR.setRole(new WholesalerShippingManagerRole());
        
        Employee dimFR = dispenserEntFR.getInvMgmtOrg().getEmployeeDirectory().newEmployee();
        dimFR.setName("dim");
        UserAccount dimuaFR = dispenserEntFR.getInvMgmtOrg().getUserAccountDirectory().newUserAccount();
        dimuaFR.setEmployee(dimFR);
        dimuaFR.setUsername("dim");
        dimuaFR.setPassword("dim");
        dimuaFR.setRole(new DispenserInventoryManagerRole());
        
        Employee dseFR = dispenserEntFR.getSalesOrg().getEmployeeDirectory().newEmployee();
        dseFR.setName("dse");
        dseFR.newDeaNo();
        UserAccount dseuaFR = dispenserEntFR.getSalesOrg().getUserAccountDirectory().newUserAccount();
        dseuaFR.setEmployee(dseFR);
        dseuaFR.setUsername("dse");
        dseuaFR.setPassword("dse");
        dseuaFR.setRole(new DispenserSalesEmployeeRole());
        
        Employee dim2FR = dispenserEnt2FR.getInvMgmtOrg().getEmployeeDirectory().newEmployee();
        dim2FR.setName("dim2");
        UserAccount dimua2FR = dispenserEnt2FR.getInvMgmtOrg().getUserAccountDirectory().newUserAccount();
        dimua2FR.setEmployee(dim2FR);
        dimua2FR.setUsername("dim2");
        dimua2FR.setPassword("dim2");
        dimua2FR.setRole(new DispenserInventoryManagerRole());
        
        Employee dse2FR = dispenserEnt2FR.getSalesOrg().getEmployeeDirectory().newEmployee();
        dse2FR.setName("dse2");
        dse2FR.newDeaNo();
        UserAccount dseua2FR = dispenserEnt2FR.getInvMgmtOrg().getUserAccountDirectory().newUserAccount();
        dseua2FR.setEmployee(dse2FR);
        dseua2FR.setUsername("dse2");
        dseua2FR.setPassword("dse2");
        dseua2FR.setRole(new DispenserSalesEmployeeRole());
        
        Drug dFR = manuEntFR.getProdMgmtOrg().getDrugCatalog().newDrug();
        dFR.setManuEnt(manuEntFR);
        dFR.setName("dFR");
        dFR.setPrice(Integer.parseInt("15"));
        dFR.setAvailable(Integer.parseInt("150"));
        dFR.setThreshold(Integer.parseInt("75"));
        dFR.setLicense(Boolean.TRUE);
        manuEntFR.getProdMgmtOrg().getDrugCatalog().addDrug(dFR);
        WholesalerInventoryItem newInventoryItemFR = wholeEntFR.getInvMgmtOrg().getInventory().newInventoryItem();
        newInventoryItemFR.setDrug(dFR);
        newInventoryItemFR.setQuantity(Integer.parseInt("108"));
        dFR.setWholeEnt(wholeEntFR);
        DispenserInventoryItem diiFR = dispenserEntFR.getInvMgmtOrg().getInventory().newInventoryItem();
        diiFR.setDrug(dFR);
        diiFR.setQuantity(Integer.parseInt("30"));
        dFR.setDispEnt(dispenserEntFR);
        
        business.getAllStatic();
        return business;
    }
}
