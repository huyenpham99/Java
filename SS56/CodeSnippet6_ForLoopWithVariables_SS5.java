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
public class CodeSnippet6_ForLoopWithVariables_SS5 {
    public static void main(String[] args) {
        int product;
        for(int num=1; num<=5; num++){
            product =num*10;    
            System.out.printf("\n%d *10 =%d", num, product);
        }
    }
}
