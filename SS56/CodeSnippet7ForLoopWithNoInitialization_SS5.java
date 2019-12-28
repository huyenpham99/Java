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
public class CodeSnippet7ForLoopWithNoInitialization_SS5 {
    public static void main(String[] args) {
        int num =1;
        boolean flag = false;
        for(; !flag; num++){
            System.out.println("Value of num:" +num);
            if(num ==5){
                flag = true;
            }
        }
    }
}
