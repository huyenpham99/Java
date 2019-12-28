/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6_Array;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class vd1 {

    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.printf("Nhap phan tu cua mang a[%d]:",i, a[i] );
            a[i] = input.nextInt();
        }
        System.out.println("Mang sau khi dao nguoc");
        for (int i = 4; i >=0; i--) {
            System.out.println(a[i]);
        }

    }
    
}
