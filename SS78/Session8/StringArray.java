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
public class StringArray {
    String[]empID = new String[5];
    public void createArray(){
        System.out.println("Creating Array. Please wait...");
        for(int count = 1; count < empID.length;count++){
        empID[count]="E00"+count;        
        }
    }
    public void printArray(){
        System.out.println("The Array : ");
        for(int count = 1; count < empID.length;count++){
            System.out.println("Employee ID "+empID[count]);
        }
    }
    public static void main(String[] args) {
        StringArray objStrArray = new StringArray();
        objStrArray.createArray();
        objStrArray.printArray();
    }
}
