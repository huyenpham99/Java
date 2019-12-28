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
public class CodeSnippet4_SumOfNumber_SS5 {
    public static void main(String[] args) {
        int num =1, sum=0;
        do{
            sum =sum+num;
            num++;
            
            
        }while(num<=100);
        System.out.printf("“Sum of 10 Numbers: %d\n", sum);
    }
}
