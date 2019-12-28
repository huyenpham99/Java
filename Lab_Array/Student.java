/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi7_BTcoban;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student {

    public static void main(String[] args) {

        int[] a = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter the mark of student:");
            
            a[i] = sc.nextInt();

        }
        int fail = 0;
        int good = 0;
        int verrygood = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 40) {
                fail++;
            } else if (a[i] >= 40 && a[i] < 65) {
                good++;
            } else if (a[i] >= 75) {
                verrygood++;
            }

        }
        System.out.println("The student fail:" + fail);
        System.out.println("The student good:" + good);
        System.out.println("The student verrygood:" + verrygood);

    }
}
