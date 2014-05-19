/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Dispenser.AdverseEffectsWorkRequest;
import Business.FDA.DrugApprovalConfirmation;
import Business.FDA.ClinicalTestingRequest;
import Business.FDA.EnterpriseLicenseRequest;
import Business.FDA.DrugProductionRequest;
import Business.Dispenser.DispenserSalesWorkRequest;
import Business.FDA.ForensicsInvestigationWorkRequest;
import Business.FDA.ReportSuspicionWorkRequest;
import Business.Manufacturer.ManufacturerShipWorkRequest;
import Business.Manufacturer.ManufacturerSalesWorkRequest;
import Business.Wholesaler.WholesalerSalesWorkRequest;
import Business.Wholesaler.WholesalerShipWorkRequest;
import java.util.ArrayList;

/**
 *
 * @author karanmankodi
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    
    public WorkQueue()
    {
        workRequestList = new ArrayList<WorkRequest>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public WorkRequest newWorkRequest(WorkRequest.Type type)
    {
        WorkRequest request = null;
        
        if(type == WorkRequest.Type.ManufacturerSalesWorkRequest)
        {
            request = new ManufacturerSalesWorkRequest();
        }
        
        if(type == WorkRequest.Type.ManufacturerShipWorkRequest)
        {
            request = new ManufacturerShipWorkRequest();
        }
        
        if(type == WorkRequest.Type.WholesalerSalesWorkRequest)
        {
            request = new WholesalerSalesWorkRequest();
        }
        
        if(type == WorkRequest.Type.WholesalerShipWorkRequest)
        {
            request = new WholesalerShipWorkRequest();
        }
        
        if(type == WorkRequest.Type.DispenserSalesWorkRequest)
        {
            request = new DispenserSalesWorkRequest();
        }
        
        if(type == WorkRequest.Type.EnterpriseLicenseRequest)
        {
            request = new EnterpriseLicenseRequest();
        }
        
        if(type == WorkRequest.Type.DrugProductionRequest)
        {
            request = new DrugProductionRequest();
        }
        
        if(type == WorkRequest.Type.ClinicalTestingRequest)
        {
            request = new ClinicalTestingRequest();
        }
        
        if(type == WorkRequest.Type.DrugApprovalConfirmation)
        {
            request = new DrugApprovalConfirmation();
        }
        
        if(type == WorkRequest.Type.AdverseEffectsWorkRequest)
        {
            request = new AdverseEffectsWorkRequest();
        }
        
        if(type == WorkRequest.Type.ReportSuspicionWorkRequest)
        {
            request = new ReportSuspicionWorkRequest();
        }
        
        if(type == WorkRequest.Type.ForensicsInvestigationWorkRequest)
        {
            request = new ForensicsInvestigationWorkRequest();
        }
        
        if(request!=null)
        {
            workRequestList.add(request);
        }
        return request;       
    }
    
    public void addRequest(WorkRequest request)
    {
        workRequestList.add(request);
    }
    
    public void removeRequest(WorkRequest req){
        workRequestList.remove(req);
    }
}
