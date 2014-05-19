/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author karanmankodi
 */
public class EmployeeDirectory {
    ArrayList<Employee> employeeList;
    
    public EmployeeDirectory(){
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
   public Employee newEmployee(){
       Employee e = new Employee();
       employeeList.add(e);
       return e;
   }
   
   public void deleteEmployee(Employee e){
       employeeList.remove(e);
   }
   
}
