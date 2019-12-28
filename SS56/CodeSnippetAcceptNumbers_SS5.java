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
public class CodeSnippetAcceptNumbers_SS5 {
    public static void main(String[] args) {
         int cnt, number; 
         for(cnt =1, number=0; cnt<=10; cnt++){
             Scanner input = new Scanner(System.in);
             System.out.println("Enter a number:");
             number = input.nextInt();
             if(number ==0){
                 break;
             }
         }
    }
}
