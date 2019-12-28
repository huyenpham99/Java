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
public class Temp {

    public static void main(String[] args) {
        int n;
       Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so ngay :\n");
        n = sc.nextInt();
       int [] temp = new int[n];
       for(int i = 0;i<n;i++){
           System.out.printf("Nhap vao nhiet do ngay %d : \n",i+1);
           temp[i] = sc.nextInt();
       }
        int sumavg = 0;
        int i;
        int tempavg = 0;
        for( i=0;i<temp.length;i++){
           sumavg += temp[i];
           tempavg = sumavg/temp.length;
       }
        System.out.println(tempavg);

        int count = 0;
        for (i = 0; i < temp.length; i++) {
            if (temp[i] > tempavg) {
                count++;
            }
        }

        System.out.println(count);
    }

}
