/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4_OOP;

/**
 *
 * @author Admin
 */

public class Java_session4 {
     //cac dac tinh ve person
    private int personId;
    private String personName;
    private int personAge;

    //Contructor- khoi tao doi tuong 
     Java_session4() {
        personId = 0;
        personName = "No Name";
        personAge = 19;
    }

    public int getPersonId( ) {
        return personId;
    }

    public void setpersonId(int id) {
        personId = id;

    }
    public String getpersonName(){
       return  personName  ;
    }
    public  void setpersonName(String name){
        personName = name;
    }
    public int getpersonAge(){
        return personAge; 
    }
    public  void setpersonAge (int age){
        personAge =age;
    }
    public static void main(String[] args) {
        Person person;
        person = new Person();
        person.setpersonId(10);
        System.out.println("PersonId:" +person.getPersonId());
        System.out.println("Person name:" +  person.getpersonName());
        System.out.println("Person Age:" + person.getpersonAge());
        //nhap thong tin user => in ra thong tin da nhap
        Person obj1 = new Person();
        obj1.setpersonId(10);
        obj1.setpersonName("Huyen");
        obj1.setpersonAge(12);
        Person person2 = new Person(2, "H", 22);
        System.out.println("Person info:" + person2.getPersonId() +   "\nFullName:" + person2.getpersonName()+ "\nAge"+ person2.getpersonAge());
        
    }
}
