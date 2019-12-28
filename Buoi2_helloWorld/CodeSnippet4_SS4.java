/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2_helloWorld;

import java.util.*;

/**
 *
 * @author Admin
 */
public class CodeSnippet4_SS4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        if (num % 3 == 0) {
            System.out.println("Inside Outer if Block");
            if (num % 5 == 0) {
                System.out.println("“Number is divisible by 3 and 5");
            }
        } else {
            System.out.println("Number is not divisible by 3");
        }

    }
}
