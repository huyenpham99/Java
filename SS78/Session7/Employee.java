/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session7;

/**
 *
 * @author 84122
 */
public class Employee {

    int empID;
    String empName;
    private String SSN;
    protected String empDesig;

    public Employee(int ID, String name) {
        empID = ID;
        empName = name;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String ssn) {
        SSN = ssn;
    }

    public void setDesignation(String desig) {
        empDesig = desig;
    }

    public void display() {
        System.out.println("Employee ID is : " + empID);
        System.out.println("Employee name is : " + empName);
        System.out.println("Designation is : " + empDesig);
    }

    public static void main(String[] args) {
        Employee objEmp1 = new Employee(1200, "Roger");
        objEmp1.empDesig = "Manager";
        objEmp1.SSN = "222-22-2234";
        objEmp1.display();
    }
}
