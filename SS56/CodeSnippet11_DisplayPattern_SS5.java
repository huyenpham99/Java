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
public class CodeSnippet11_DisplayPattern_SS5 {
    public static void main(String[] args) {
        int row, col;
        for(row=1; row<=5; row++){
            for(col =1; col <=row; col++){
                System.out.print("*");
            }
             System.out.println();
        }
    }
}
