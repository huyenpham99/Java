/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_ATM;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TestATM {

    public static void main(String[] args) {
        System.out.println("Welcome to ATM!");
        ATM acc1 = new ATM();
        ATM acc2 = new ATM();
        acc1.setNumber_card("0000");
        acc1.setPassword("0000");
        acc1.setAmount(2000);
        acc1.setBalance(8000);
        String x = acc2.getNumber_card();
        String y = acc2.getPassword();
        String a = acc1.getNumber_card();
        String b = acc1.getPassword();
        Scanner input = new Scanner(System.in);
        System.out.println("enter number car:");
        x = input.nextLine();
        System.out.println("enter password:");
        y = input.nextLine();

        if (a.equals(x) && b.equals(y)) {
            System.out.printf("Login success");
        } else {
            System.out.printf("Login fail");

        }
//nop tien:
        int withdrawal, deposit;
        System.out.println("Enter money you want deposit :");
        withdrawal = input.nextInt();
        System.out.println("Enter money you want withdrawal:");
        deposit = input.nextInt();
        acc2.deposit(deposit);
        acc2.withdrawal(withdrawal);
        System.out.println("deposit:" + acc2.deposit(deposit));
        System.out.println("withdrawal:" + acc2.withdrawal(withdrawal));
        acc2.tranferTo(deposit);
        System.out.println("tranfer:" + acc2.tranferTo(deposit));
    }
}
