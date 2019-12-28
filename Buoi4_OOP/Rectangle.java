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
public class Rectangle {
    float length=1.0f;
    float width =1.0f;
    public Rectangle(float len, float wid){
        length =len;
        width =wid;
    }
    public double getLength(){
        return length;
    }
    public void  setLength(float x){
        length =x;
    }
     public double getwidth(){
        return width;
    }
    public void  setwidth(float y){
        width =y;
    }
    public double getArea (){
        return length * width ;
    }
    public double getPerimater(){
        return (length+width)*2;
    }
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(4,2);
        System.out.println("Area:" + obj.getArea());
        System.out.println("Perimater:" + obj.getPerimater());
        
    }
}
