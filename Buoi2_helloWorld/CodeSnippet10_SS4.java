/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2_helloWorld;

/**
 *
 * @author Admin
 */
public class CodeSnippet10_SS4 {

    public static void main(String[] args) {
        String day = "Monday";
        String hour = "am";
        switch (day) {
            case "Sunday":
                System.out.println("Sunday is a Holiday...");
                switch (hour) {
                    case "am":
                        System.out.println("Good Morning");
                        break;
                    case "pm":
                        System.out.println("“Good Evening");
                        break;
                }
            case "Monday":
                System.out.println("Monday is a Working Day...");
                switch (hour) {
                    case "am":
                        System.out.println("Good Morning");
                        break;
                    case "pm":
                        System.out.println("“Good Evening");
                        break;

                }
                break;
            default:
                System.out.println("Invalid Day");

        }
    }
}
