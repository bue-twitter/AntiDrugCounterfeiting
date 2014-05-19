/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Karan Mankodi
 */
public class Address {
    private String line1;
    private String city;
    private String state;
    private int zipCode;
    
    public static final String MD = "Maryland";
    public static final String CT = "Connecticut";
    public static final String MN = "Minnesota";
    public static final String FL = "Florida";
    public static final String OR = "Oregon";
    
    public String getLine1(){
        return line1;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public int getZipCode(){
        return zipCode;
    }
    
    public void setLine1(String line1){
        this.line1 = line1;
    }
    public void setCiy(String city){
        this.city = city;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setZipCode(int zipCode){
        this.zipCode = zipCode;
    }
    
    
}
