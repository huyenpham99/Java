/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session8;

/**
 *
 * @author 84122
 */
public class TwoDimension1 {

    int marks[][];

    public void storeMarks() {
        marks = new int[4][2];
        System.out.println("StoringMarks.Please wait...");
        marks[0][0] = 20;
        marks[0][1] = 25;
        marks[1][0] = 30;
        marks[1][1] = 35;
        marks[2][0] = 60;
        marks[2][1] = 40;
    }

    public void displayMarks() {
        System.out.println("Marks are : ");
        
    for(int count = 0; count < marks.length; count ++){
        System.out.println(marks[count]);    
        }
    }
    public static void main(String[] args) {
        TwoDimension1 TdObj = new TwoDimension1();
        TdObj.storeMarks();
        TdObj.displayMarks();
    }
}
