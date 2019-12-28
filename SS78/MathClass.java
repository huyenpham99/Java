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
public class MathClass {

    public void add(int num1, int num2) {
        System.out.println("Result:" + (num1 + num2));

    }

    public void add(int num1, int num2, int num3) {
        System.out.println("Result:" + (num1 + num2 + num3));
    }

    public void add(float num1, int num2) {
        System.out.println("Result:" + (num1 + num2));
    }

    public void add(float num1, float num2) {
        System.out.println("Result:" +(num1+num2));
    }
    public static void main(String[] args) {
        MathClass obj = new MathClass ();
        obj.add(3.4f, 2);
        obj.add(4, 5);
        obj.add(6, 7, 8);
    }
}
