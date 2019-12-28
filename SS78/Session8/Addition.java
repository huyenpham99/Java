/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session8;

/**
 *
 * @author 84122
 */
public class Addition {
    public static void main(String[] args) {
        if(args.length==2){
        int sum = args[1] + args[0];
            System.out.println("sum is : "+sum);
        } else {
            System.out.println("Specify two integers.");
        }
    }
}
