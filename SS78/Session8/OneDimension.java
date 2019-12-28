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
public class OneDimension {
    int marks[];
    public void storeMarks(){
    marks = new int [4];
        System.out.println("StoringMarks.Pless wait ....");
        marks[0] = 65;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 75;
    }
    public void displayMarks(){
        System.out.println("Marks are : ");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
    }
    public static void main(String[] args) {
        OneDimension ODobj = new OneDimension();
        ODobj.storeMarks();
        ODobj.displayMarks();
    }
}
