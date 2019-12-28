/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2_helloWorld;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CodeSnippet14_SS3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int intValue = s.nextInt();
        System.out.println("Enter a decimal number:");
        float floatValue = s.nextFloat();
        System.out.println("Enter a String value:");
        String strValue = s.next();
        System.out.println("Value entered are:");
        System.out.println(intValue + "" + floatValue + "" + strValue);

    }
    }