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
public class Calculator {

    public static int[] Array1(int size) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Nhap phan tu a[%d]", i);
            a[i] = input.nextInt();
        }

        return a;
    }
    
    public static double getAverage(int[] array) {
        double avg = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            avg = (double) sum / array.length;
        }
        return avg;
    }
    public static int getMax(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
    public static int getMin(int[] array) {

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;

    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu :\n");
        n = sc.nextInt();
        int[] arr;
        arr = Array1(n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\nGia tri trung binh" + getAverage(arr));
        System.out.println("\nMax:" + getMax(arr));
        System.out.println("\nMin:" + getMin(arr));
    }

}
