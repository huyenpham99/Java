/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4_OOP;

/**
 *
 * @author 84122
 */
public class Time {

    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int Ho) {
        hour = Ho;
    }

    public void setMinute(int Mi) {
        minute = Mi;
    }

    public void setSecond(int Se) {
        second = Se;
    }

    public void Time(int Ho, int Mi, int Se) {
        hour = Ho;
        minute = Mi;
        second = Se;
    }

    public String toString() {
        return "Time :" + hour + ":" + minute + ":" + second;
    }
    
    

    public int nextSecond(int second1) {
        second = second + 1 ;
        return second1;
    }

    public int previousSecond(int second0) {
        second = second - 1;
        return second;
    }

    public static void main(String[] args) {
        Time t = new Time(8, 30, 25);
        System.out.println("Time " + t.toString());
        t.nextSecond(0);
        System.out.println("Time " + t.toString());
        t.previousSecond(0);
        System.out.println("Time " + t.toString());
    }
}
