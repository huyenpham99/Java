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
public class CodeSnippet8_SS4 {

    public static void main(String[] args) {
        String day = "Monday";
        switch (day) {
            case "Sunday":
                System.out.println("First day of the Week");
                break;
            case "Monday":
                System.out.println("Secondday of the Week");
                break;
            case "Tuesday":
                System.out.println("Thirdday of the Week");
                break;
            case "Wednesday":
                System.out.println("Fourthday of the Week");
                break;
            case "Thursday":
                System.out.println("Fifthday of the Week");
                break;
            case "Friday":
                System.out.println("Sixthday of the Week");
                break;
            case "Saturday":
                System.out.println("Seventhay of the Week");
                break;
            default:
                System.out.println("Invalid Day of the Week");
                break;
        }
    }
}
