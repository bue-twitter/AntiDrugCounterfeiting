/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FDA;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author karanmankodi
 */
public class ClinicalTestApplication {
    INDApplication indApp;
    Date shelfLife;
    ArrayList<String> sideEffects;
    int year;
    int month;
    int date;

    public ClinicalTestApplication(INDApplication indApp) {
        sideEffects = new ArrayList<>();
        this.indApp = indApp;
    }

    public INDApplication getIndApp() {
        return indApp;
    }

    public Date getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(Date shelfLife) {
        shelfLife = new Date(year, month, date);
    }

    public ArrayList<String> getSideEffects() {
        return sideEffects;
    }

    public void addSideEffects(String s){
        sideEffects.add(s);
    }
    
}
