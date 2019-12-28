/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2_helloWorld;

/**
 *
 * @author Admin
 */
public class CodeSnippet12_SS3 {

    public static void main(String[] args) {
        int i = 55 / 22;
// Decimal integer                      
        System.out.printf("55/22 = %d%n", i);
// Pad with zeros                    
        double q = 1.0 / 2.0;
        System.out.printf("1.0/2.0 = %09.3f", q);
// Scientific notation                       
        q = 5000.0 / 3.0;
        System.out.printf("5000/3.0 = %7.2e %n", q);
// Negative infinity                      
        q = -10.0 / 0.0;
        System.out.printf("-10.0/0.0 = %7.2e %n", q);
        System.out.printf("pi =  % 5.3f, e =  % 5.4f%n", Math.PI, Math.E); 

    }
}
