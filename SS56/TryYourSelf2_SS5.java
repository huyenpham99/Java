/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Write a program to develop a menu for the calculator program. 
// the choice from the user and display an appropriate message. 
//Further, to continue with the menu, ask for confirmation in 
// Yes/No. 
//if(yes thif cho nhap tiep, no thi break khoi ct
package SS56;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TryYourSelf2_SS5 {

    public static void main(String[] args) {
        //ask for Yes or No?
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Choise: if you choise 1 to continue caculator\n  your choise 2 to break\nYou Choise:");
        int choise = input.nextInt();
        switch (choise) {
            case 1:
                System.out.println("Tinh tong 2 so a, b");
                System.out.println("Nhap so thu nhat");
                int a = input.nextInt();
                System.out.println("Nhap so thu 2");
                int b = input.nextInt();
                int c = a + b;
                System.out.println("Result:" + c);
                break;      
            case 2:
                System.out.println("Stop");
                break;
            default:
                System.out.println("Invalid choise");
                break;
        }

    }
}
