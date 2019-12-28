/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3_Bien;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Hinhchunhat {
    public static void main(String[] args) {
        Scanner nhap =new Scanner(System.in);
        System.out.println("nhap chieu dai HCN:");
        int a =nhap.nextInt();
        System.out.println("nhap chieu rong HCN:");
        int b= nhap.nextInt();
        int S = a *b;
        System.out.println("Dien tich HCN la:"+ S);
    }
}
