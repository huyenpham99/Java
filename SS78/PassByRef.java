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
class Circle {

    public double getPI() {
        return 3.14;
    }
}

public class PassByRef {

    public void calArea(Circle objPi, double rad) {
        double area = objPi.getPI() * rad * rad;
        System.out.println("Area of the circle is :" + area);
    }

    public static void main(String[] args) {
        PassByRef p1 = new PassByRef();
        p1.calArea(new Circle(), 2);
    }
}
