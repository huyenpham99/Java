/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4_OOP;

/**
 *
 * @author Admin
 */
public class TestAccount {

    public static void main(String[] args) {
        Account b = new Account();
        b.debit(2000);
        b.credit(4000);
        b.setBalance(6000);

    }

}
