/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author karanmankodi
 */
public class Employee {

    private String name;
    private int ssn;
    private int contactNo;
    private int id;
    static int count = 0;
    private String entName;
    private String orgName;
    private UserAccount userAccount;
    private ArrayList<String> deaNo;
    String a;
    String b;
    String c;
    String d;

    public Employee() {
        count++;
        id = count;
        deaNo = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public String setSecond() {
        String sec = null;

        String name = getName();
        sec = String.valueOf(name.charAt(0));

        return sec;
    }

    public String setFirst() {

        String A = "A";
        String B = "B";
        String F = "F";
        String first = null;
        ArrayList<String> list = new ArrayList<>();

        list.add(A);
        
        list.add(B);

        list.add(F);
        Random r = new Random();
        int choice = r.nextInt(list.size());
        first = list.get(choice);
        return first;
    }

    public int setThird() {

        int third = 0;

        Random r = new Random();
        r.setSeed(System.currentTimeMillis());
        third = r.nextInt((900000) + 100000);

        return third;
    }

    public int setFourt() {
        int fourth = 0;

        int third = setThird();
        int u = third % 10;
        third = third / 10;
        int t = third % 10;
        third = third / 10;
        int s = third % 10;
        third = third / 10;
        int r = third % 10;
        third = third / 10;
        int q = third % 10;
        third = third / 10;
        int p = third % 10;

        int x = p + r + t;
        int y = q + s + u;
        int z = x + y + y;
        fourth = z % 10;
        return fourth;
    }

    public ArrayList<String> newDeaNo() {
        a = setFirst();
        b = setSecond();
        c = String.valueOf(setThird());
        d = String.valueOf(setFourt());

        deaNo.add(a);

        deaNo.add(b);

        deaNo.add(c);

        deaNo.add(d);
        return deaNo;
    }
    
    public ArrayList<String> getDeaNo() {
        return deaNo;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }
    
}

