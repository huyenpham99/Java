/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SS56;

/**
 *
 * @author Admin
 */
class CodeSnippet3_SS6_ClassCustomer {
    int customerID ;
    String customerName;
    String customerAddress;
    int customerAge;
    public static void main(String[] args) {
           CodeSnippet3_SS6_ClassCustomer objCustomer1 = new CodeSnippet3_SS6_ClassCustomer();
           objCustomer1.customerID = 100; 
            objCustomer1.customerName = "John"; 
         objCustomer1.customerAddress = "123 Street"; 
           objCustomer1.customerAge = 30;
        System.out.println("Customer IdentitionNumber:" + objCustomer1.customerID);
        System.out.println("Customer Name:" + objCustomer1.customerName);
        System.out.println("Customer Age:" + objCustomer1.customerAge);
        
    }
}
