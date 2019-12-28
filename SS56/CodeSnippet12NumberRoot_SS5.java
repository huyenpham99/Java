/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SS56;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CodeSnippet12NumberRoot_SS5 {

    public static void main(String[] args) {
        int cnt, square, cube;
        for (cnt = 1; cnt < 300; cnt++) {
            if (cnt % 3 == 0) {
                continue;
            }
            square = cnt * cnt;
            cube = cnt * cnt * cnt;
            System.out.printf("\nsquare of %d is %d and Cube is %d", cnt, square, cube); 
    }

    }
}