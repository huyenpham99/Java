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
public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
       return "dd/mm/yy" +  "\n" +day + "/" + month+ "/"+year;
    }
    public static void main(String[] args) {
        Date obj = new Date(05,11,2019);
        System.out.println(" show:" + obj.toString());
         
        
    }
    
    
}

