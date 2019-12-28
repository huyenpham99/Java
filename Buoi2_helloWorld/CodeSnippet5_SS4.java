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
public class CodeSnippet5_SS4 {
    public static void main(String[] args) {
        int totalMarks =59;
        if(totalMarks >= 90){
            System.out.println("Grade = A+");
        } else if(totalMarks >=60){
            System.out.println("Grade = A");
        } else if(totalMarks >=40){
            System.out.println("Grade = B");
        } else if(totalMarks >=30){
            System.out.println("Grade = C");
        } else 
        {
            System.out.println("Fail");
        }
    }
}
