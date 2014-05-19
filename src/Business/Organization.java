/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author karanmankodi
 */
public abstract class Organization {

    private String name;
    private UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory employeeDirectory;
    private WorkQueue workQueue;
    private WorkQueue sentWorkQueue;
    public static final String ADMIN = "Admin";
    public static final String MANUFACTURERPRODUCTMANAGEMENT = "Manufacturer Product Management";
    public static final String MANUFACTURERSALES = "Manufacturer Sales";
    public static final String MANUFACTURERSHIPPING = "Manufacturer Shipping";
    public static final String WHOLESALERINVENTORYMANAGEMENT = "Wholesaler Inventory Management";
    public static final String WHOLESALERSALES = "Wholesaler Sales";
    public static final String WHOLESALERSHIPPING = "Wholesaler Shipping";
    public static final String DISPENSERINVENTORYMANAGEMENT = "Dispenser Inventory Management";
    public static final String DISPENSERSALES = "Dispenser Sales";
    public static final String DISPENSERSHIPPING = "Dispenser Shipping";
    public static final String FEDERALLICENSING = "Federal Licensing";
    public static final String STATELICESING = "State Licensing";
    public static final String CDER = "Center for Drug Evaluation and Research";
    public static final String CLINICALTESTING = "Clinical Testing";
    public static final String FORENSICS = "Forensics";
    
    public Organization(String orgName) {
        name = orgName;
        userAccountDirectory = new UserAccountDirectory();
        employeeDirectory = new EmployeeDirectory();
        workQueue = new WorkQueue();
        sentWorkQueue = new WorkQueue();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public WorkQueue getSentWorkQueue() {
        return sentWorkQueue;
    }

    public void setSentWorkQueue(WorkQueue sentWorkQueue) {
        this.sentWorkQueue = sentWorkQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
