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
public class Circle {

    double radius = 1.0;

    public double getRadius() {
        return radius;
    }

    public Circle(double ras) {
        radius = ras;
    }

    public void setRadius(double ras) {
        radius = ras;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "Circle[radius =" + radius + "Area" + getArea() + "Circumference" + getCircumference() + "]";
    }

    public static void main(String[] args) {
        Circle obj = new Circle(1.5);
        System.out.println("Area:" + obj.getArea());
        System.out.println("Circumference:" + obj.getCircumference());

    }
}
