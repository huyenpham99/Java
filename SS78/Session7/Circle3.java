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
public class Circle3 {

    float area;

    public float getPI() {
        return (float) 3.14;
    }

    public void calcArea(int rad) {
        this.area = getPI() * rad * rad;
    }
}
