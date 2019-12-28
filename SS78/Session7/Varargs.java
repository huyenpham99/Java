/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session7;

/**
 *
 * @author 84122
 */
public class Varargs {

    public void addNumber(int... num) {
        int sum = 0;
        for (int i : num) {
        sum = sum + i;
        }
        System.out.println("Sum of numbers is : " + sum);
    }
    public static void main(String[] args) {
        Varargs obj = new Varargs();
        obj.addNumber(10,20,30,40);
    }
}
