/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Dispenser.DispenserEnterprise;
import Business.FDA.FDAEnterprise;
import Business.Manufacturer.Drug;
import Business.Manufacturer.ManufacturerEnterprise;
import Business.Wholesaler.WholesalerEnterprise;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author karanmankodi
 */
public abstract class WorkRequest {

    public static enum Type {

        WholesalerSalesWorkRequest {
            public String toString() {
                return "Wholesaler Sales Work Request";
            }
        },
        WholesalerShipWorkRequest {
            public String toString() {
                return "Wholesaler Ship Work Request";
            }
        },
        WholesalerReceiveShipmentWorkRequest {
            public String toString() {
                return "Wholesaler Receive Shipment Work Request";
            }
        },
        ManufacturerSalesWorkRequest {
            public String toString() {
                return "Manufacturer Sales Work Request";
            }
        },
        ManufacturerShipWorkRequest {
            public String toString() {
                return "Manufacturer Ship Work Request";
            }
        },
        ManufacturerReceiveShipmentWorkRequest {
            public String toString() {
                return "Manufacturer Receive Shipment Work Request";
            }
        },
        DispenserSalesWorkRequest {
            public String toString() {
                return "Dispenser Sales Work Request";
            }
        },
        EnterpriseLicenseRequest {
            public String toString() {
                return "Enterprise License Request";
            }
        },
        AdverseEffectsWorkRequest {
            public String toString() {
                return "Adverse Effects Work Request";
            }
        },
        ReportSuspicionWorkRequest {
            public String toString() {
                return "Report Suspicion Work Request";
            }
        },
        DrugProductionRequest {
            public String toString() {
                return "Drug Production Request";
            }
        },
        
        ClinicalTestingRequest {
            public String toString() {
                return "Clinical Testing Request";
            }
        },
        
        DrugApprovalConfirmation {
            public String toString() {
                return "Drug Approval Confirmation";
            }
        },
        
        ForensicsInvestigationWorkRequest {
            public String toString() {
                return "Forensics Investigation Work Request";
            }
        },
    }

    public static enum Status {

        Open {
            public String toString() {
                return "Open";
            }
        },
        Processsing {
            public String toString() {
                return "Processing";
            }
        },
        Shipped {
            public String toString() {
                return "Shipped";
            }
        },
        Closed {
            public String toString() {
                return "Closed";
            }
        },
        Sold {
            public String toString() {
                return "Sold";
            }
        },
        Sent {
            public String toString() {
                return "Sent";
            }
        },
        Approved {
            public String toString() {
                return "Approved";
            }
        },
        SentForClinicalTesting {
            public String toString() {
                return "Sent for Clinical Testing";
            }
        },
        PrescriptionChanged {
            public String toString() {
                return "Prescription Changed";
            }
        },
        ReportSuspicion {
            public String toString() {
                return "Reported as Suspicious";
            }
        },
        DrugBarred {
            public String toString() {
                return "Drug Barred";
            }
        },
        DrugCleared {
            public String toString() {
                return "Drug Cleared";
            }
        },
        Investigation {
            public String toString() {
                return "Investigation Started";
            }
        },
    }
    private WorkRequest.Status status;
    private Drug drug;
    private int quantity;
    private UserAccount sender;
    private UserAccount receiver;
    private Date requestDate;
    private OrderItem orderItem;
    private ManufacturerEnterprise manuEnt;
    private WholesalerEnterprise wholeEnt;
    private DispenserEnterprise dispEnt;
    private FDAEnterprise fdaEnt;
    private Enterprise ent;
    private long id;
    private Date idDate;
    ArrayList<Long> idList;
    
    public WorkRequest() {
        requestDate = new Date();
        status = WorkRequest.Status.Open;
        idDate = new Date();
        id = Date.UTC(idDate.getYear(), idDate.getMonth(), idDate.getDate(), idDate.getHours(), idDate.getMinutes(), idDate.getSeconds());
        idList = new ArrayList<>();
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public long getId() {
        return id;
    }
    
    public void addIDtoList(Long id){
        idList.add(id);
    }

    public ArrayList<Long> getIdList() {
        return idList;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public WorkRequest.Status getStatus() {
        return status;
    }

    public void setStatus(WorkRequest.Status status) {
        this.status = status;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
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

    public FDAEnterprise getFdaEnt() {
        return fdaEnt;
    }

    public void setFdaEnt(FDAEnterprise fdaEnt) {
        this.fdaEnt = fdaEnt;
    }

    public Enterprise getEnt() {
        return ent;
    }

    public void setEnt(Enterprise ent) {
        this.ent = ent;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
    
    
}
 