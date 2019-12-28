/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SS56;

/**
 *
 * @author Admin
 */
public class CoseSnippet2_TestWhileEmptyBody_SS5 {
    public static void main(String[] args) {
        int num1=1;
        int num2 =30;
        while(++num1 <--num2);
        System.out.println("Midpoint is: "+num1);
    }
}
