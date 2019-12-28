/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session7;

/**
 *
 * @author 84122
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

    public Student(int rNo, String sname) {
        rollNo = rNo;
        name = sname;
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
    public void displayDetails(){
        System.out.println("RollNo : " + rollNo);
        System.out.println("Student name : " + name);
        System.out.println("Address " + address);
        System.out.println("Score " + marks);
        System.out.println("---------------");
    }
    public static void main(String[] args) {
        Student objStud1 = new Student("Ngao","08,Ton That Huyen");
        objStud1.displayDetails();
        Student objStud2 = new Student(100, 50);
        objStud2.displayDetails();
        Student objStud3 = new Student(79,"Roger",39);
        objStud3.displayDetails();
    }
}
