/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FDA;

import Business.Enterprise;
import Business.Manufacturer.Drug;
import Business.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author karanmankodi
 */
public class ForensicsInvestigationWorkRequest extends WorkRequest {

    private ForensicReportDirectory forensicReportDir;
    private Drug d;
    private ForensicsReport report;

    public ForensicsInvestigationWorkRequest() {
        
    }

    public Drug getD() {
        return d;
    }

    public void setD(Drug d) {
        this.d = d;
    }

    public ForensicsReport newForensicReport(Drug d, Enterprise ent) {
        report = new ForensicsReport(d, ent);
        forensicReportDir.getForensicReportList().add(report);
        return report;
    }

    public ForensicsReport getReport() {
        return report;
    }

    public ForensicReportDirectory getForensicReportDir() {
        return forensicReportDir;
    }

    public void setForensicReportDir(ForensicReportDirectory forensicReportDir) {
        this.forensicReportDir = forensicReportDir;
    }
    
    
}
