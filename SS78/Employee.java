/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SS78;

/**
 *
 * @author Admin
 */
public class Employee {
    int empID ;
    String empName;
    private String SSN;
    protected String empDesig;
    public Employee( int ID, String name){
        empID = ID;
        empName = name;
    }
    public String getSSN(){
        return SSN;
        
    }
    public void setSSN(String ssn){
        SSN = ssn;
        
    }
    public  void setDesignation(String desig){
        empDesig = desig;
    }
    public  void display(){
        System.out.println("Employee ID is: "+ empID);
        System.out.println("Name: " + empName);
        System.out.println("Designation is: " + empDesig);
        System.out.println("SSN is:" + SSN);
    }
    public static void main(String[] args) {
        Employee obj = new Employee(1200,"Huyen");
        obj.empDesig ="Manager";
        obj.SSN = "28-28-282828";
        obj.display();
    }
}
