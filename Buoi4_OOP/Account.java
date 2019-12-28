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


public class Account {

    private String id;
    private String name;
    private int balance;
    private int balance2;
    private int amount;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount) {
        balance = balance + amount;
        return balance;
    }

    public int debit(int amount) {
        System.out.println("Moi nhap so tien can dung ");
        Scanner a = new Scanner(System.in);
        amount = a.nextInt();
        if (amount <= balance) {
            balance = balance - amount;
            return balance;
        } else {
            System.out.println("Amount exceeded balance ");

        }
        return balance;
    }

    public int tranferTo(Account another, int amount) {
        if (amount <= balance) {
            balance2 = balance + amount;
             System.out.println("So tien :" +balance2);
            return balance2;
           
        } else {
            System.out.println("amount excceeded balance");
        }
        return balance2;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name=" + name + ", balance=" + balance + ", balance2=" + balance2 + '}';
    }

}
