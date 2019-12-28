/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4_OOP;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class View {

    public static void main(String[] args) {
//        Employee employee = new Employee(0, "HuyỀn", "Phạm", 0);
//        System.out.println("Id: " + employee.getId());
//        System.out.println("Tên: " + employee.getFirstName());
//        System.out.println("Họ: " + employee.getLastName());
//        System.out.println("Lương: " + employee.getSalary());

//        InvoiceItem obj = new InvoiceItem();
//        obj.setId("HH");
//        obj.setDesc("PP");
//        obj.setQty(3);
//        obj.setUnitPrice(3.0);
//        obj.toString();
//        System.out.println("Show:" + obj.toString());
        InvoiceItem obj = new InvoiceItem();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID:");
        String id = input.nextLine();
        
        System.out.println("Enter Desc:");
        String desc = input.nextLine();
        
        System.out.println("Enter Qty:");
        int qty = input.nextInt();
        System.out.println("Enter UnitPrice:");
        double unitprice = input.nextDouble();
        System.out.println("ID:" + id);
        System.out.println("Desc: "+desc);
        System.out.println("Qty:" +qty);
        System.out.println("Unitprice:" +unitprice);
    }
}
