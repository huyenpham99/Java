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
public class CodeSnippet2_SS7_Calculator {

    public void add(int num1, int num2) {
        int num3;
        num3 = num1 + num2;
        System.out.println("Result after addition is: " + num3);
    }

    public void sub(int num1, int num2) {
        int num3;
        num3 = num1 + num2;
        System.out.println("Result after sub is: " + num3);

    }

    public void multi(int num1, int num2) {
        int num3;
        num3 = num1 * num2;
        System.out.println("Result after multi is: " + num3);

    }

    public void div(int num1, int num2) {
        int num3;
        num3 = num1 + num2;
        System.out.println("Result after div is: " + num3);

    }

    public static void main(String[] args) {
        CodeSnippet2_SS7_Calculator obj = new CodeSnippet2_SS7_Calculator();
        obj.add(3, 4);
        obj.multi(3, 4);
    }
}
