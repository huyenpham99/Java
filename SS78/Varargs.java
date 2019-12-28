/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SS78;

/**
 *
 * @author Admin
 */
public class Varargs {

    public void addNumber(int... num) {
        int sum = 0;
        for (int i : num) {
            sum = sum + i;
        }
        System.out.println(" Sum of number is :" + num);
    }
    public static void main(String[] args) {
        Varargs obj = new Varargs();
        obj.addNumber(10,30,20,40);
    }
}
