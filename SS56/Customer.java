/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the templates in the editor.
 */
package SS56;

/**
 *
 * @author Admin
 */
public class Customer {

    public static void main(String[] args) {
        Customer objCustomer = new Customer();
        objCustomer.customerID = 100;
        objCustomer.customerName ="Jack";
        objCustomer.customerAddress  ="123 Street";
        objCustomer.customerAge  ="20";
            objCustomer.displayCustomerInformation();
                objCustomer.changeCustomerAddress("23 Fort, Main Street"); 
                 objCustomer.displayCustomerInformation(); 
    }
}
