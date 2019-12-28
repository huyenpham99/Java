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
public class CodeSnippet4_SS6 {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;
    void changeCustomerAddress(String address){
        customerAddress =address;
        
    }
    void displayCustomerInformation(){
        System.out.println("CustomerID: " +customerID);
        System.out.println("CustomerName:" + customerName);
        System.out.println("CustomerAddress:" + customerAddress);
        System.out.println("CustomerAge:" + customerAge);
    }
}
