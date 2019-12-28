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
public class CodeSnippet13TestLabeledBreak_SS5 {
    public static void main(String[] args) {
        int i;
    outer:
    for( i=0; i<5; i++){
    if(i==2){
        System.out.println("Hello");
        break outer;
    }
            System.out.println("This is the outer loop");
        
} System.out.println("Good Bye");
    }
}
