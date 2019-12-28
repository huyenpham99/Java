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
public class TryYourSelf3_SS5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so thu nhat:");
        int a = input.nextInt();
        System.out.println("Nhap so thu hai:");
        int b = input.nextInt();
        for (int i = a; i < b; i++) {
            int dem = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    dem += 1;

                }
            }
            if (dem < 1) {
                System.out.println(i);

            }

        }

    }
}
