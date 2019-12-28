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
public class EmployeeDetails {
    public static void main(String[] args) {
        Employee obj = new Employee(1300, "Clara Smith");
        obj.empDesig = "Receptionist";
        obj.setSSN("282-72-3897");
        obj.display();
    }
}
