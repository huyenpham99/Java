/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SS78;

/**
 *
 * @author Admin
 */
public class Student {

    int rollNo;
    String name;
    String address;
    float marks;

    public Student() {
        rollNo = 0;
        name = "";
        address = "";
        marks = 0;

    }

    public Student(int rNo, float score) {
        rollNo = rNo;
        marks = score;
    }

    public Student(String sName, String addr) {
        name = sName;
        address = addr;
    }

    public Student(int rNo, String sname, float score) {
        rollNo = rNo;
        name = sname;
        marks = score;
    }

    public void displayDetail() {
        System.out.println("RollNo:" + rollNo);
        System.out.println("Student name:" + name);
        System.out.println("Address: " + address);
        System.out.println("Score:" + marks);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        Student objStud1 = new Student("David" , "302,Washington Street");
        objStud1.displayDetail();
        Student objStud2 = new Student(103,46);
        objStud2.displayDetail();
        Student objStud3 = new Student(104,"Roger", 50);
        objStud3.displayDetail();
    } 
}
