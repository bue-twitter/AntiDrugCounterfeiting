/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FDA;

import java.util.ArrayList;

/**
 *
 * @author karanmankodi
 */
public class ForensicReportDirectory {

    private ArrayList<ForensicsReport> forensicReportList;

    public ForensicReportDirectory() {
        forensicReportList = new ArrayList<>();
    }

    public ArrayList<ForensicsReport> getForensicReportList() {
        return forensicReportList;
    }
}
