/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SS56;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
/*Write a program to display the sum of all the digits for the accepted number.
For example, if number entered as 1345, then sum of all digits will be 1 + 3 + 4 + 5. 
 */
public class TryYourSelf4_SS5 {

    public static void main(String[] args) {
       int m,n,sum =0;
        System.out.println("nhap n = ");
        Scanner x = new Scanner(System.in);
         n=x.nextInt();
         while(n > 0){
             m=n%10;
             sum = sum + m;
             n = n/10;
         }
         System.out.println("tong sum =" +sum);
}
}