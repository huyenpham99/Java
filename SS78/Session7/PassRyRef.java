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
public class Circle {

    public double getPI() {
        return 3.14;
    }
}

public class PassRyRef {

    public void calcArea(Circle objPi, double rad) {
        double area = objPi.getPI() * rad * rad;
        System.out.println("Area of the circle is : " + area);
    }

    public static void main(String[] args) {
        PassRyRef p1 = new PassRyRef();
        p1.calcArea(new Circle(), 2);
    }

}
