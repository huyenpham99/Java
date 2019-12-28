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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayLists {

    ArrayList marks = new ArrayList();

    public void storeMarks() {
        System.out.println("Storing marks. Please wait...");
        marks.add(69);
        marks.add(70);
        marks.add(79);
        marks.add(39);
    }

    public void displayMarks() {
        System.out.println("Marks are : ");
        System.out.println("IteratingArrayList using for loop : ");
        for (int i = 0; i < marks.size(); i++) {
            System.out.println(marks.get(i));
        }
        System.out.println("---------------");
        Iterator imarks = marks.iterator();
        System.out.println("Iterating ArrayList using Iterator : ");
        while (imarks.hasNext()) {
            System.out.println(imarks.next());
        }
        System.out.println("------------------");
        Collections.sort(marks);
        System.out.println("Sorted List is " + marks);
    }

    public static void main(String[] args) {
        ArrayLists obj = new ArrayLists();
        obj.storeMarks();
        obj.displayMarks();
    }
}
