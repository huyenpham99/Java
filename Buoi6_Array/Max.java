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
public class Max {

    public static void main(String[] args) {
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang:");
        n = input.nextInt();
        int[] a = new int[5];

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu a[%d]:", i, a[i]);
            a[i] = input.nextInt();
        }
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }

        }
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            avg = sum / n;
        }
        System.out.println("Max:" + max);
        System.out.println("Min:" + min);
        System.out.println("Sum:" + sum);
        System.out.println("Avg:" + avg);

    }
}
