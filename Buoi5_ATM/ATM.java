/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_ATM;

/**
 *
 * @author Admin
 */
public class ATM {

    private String number_card;
    private String password;
    private double balance;
    private double amount;
    private double balance2;

    public ATM(String number_card, String password, double balance, double amount) {
        this.number_card = number_card;
        this.password = password;
        this.balance = balance;
        this.amount = amount;
    }

 public ATM(){
     
 }
    public String getNumber_card() {
        return number_card;
    }

    public void setNumber_card(String number_card) {
        this.number_card = number_card;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void showBalance(double balance) {

    }
   
    public double withdrawal( double amount) { //rut tien
        if (amount <= balance) {
            balance = balance - amount;

        } else {
            System.out.println("ERROR! balance > amount!");
        }
        return balance;
    }
    public  double deposit(double amount ){
        balance = balance + amount;
        return balance;
    }
   public double tranferTo( int amount) {
        if (amount <= balance) {
            balance2 = balance + amount;
             System.out.println("So tien can chuyen :" +balance2);
            return balance2;
           
        } else {
            System.out.println("amount excceeded balance");
        }
        System.out.println("Balance2"+balance2);
        return balance2;
    }

    @Override
    public String toString() {
        return "ATM{" + "number_card=" + number_card + ", password=" + password + ", balance=" + balance + ", amount=" + amount + ", balance2=" + balance2 + '}';
    }
   
}
