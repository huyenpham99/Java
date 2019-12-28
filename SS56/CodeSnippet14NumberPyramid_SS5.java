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
public class CodeSnippet14NumberPyramid_SS5 {

    public static void main(String[] args) {
        outer:
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {

                if (j > i) {
                    System.out.println();
                    continue outer;

                }
                System.out.println(j);
            }
            System.out.println("\nThis is the outer loop");
        }
        System.out.println("Goodbye");
    }
}
