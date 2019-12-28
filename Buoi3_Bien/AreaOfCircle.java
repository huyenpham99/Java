/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3_Bien;

import java.util.Scanner;
import static javafx.scene.input.KeyCode.R;

/**
 *
 * @author Admin
 */
public class AreaOfCircle {
    public static void main(String[] args) {
        final double PI =3.14;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap vao ban kinh:");
        double radius =nhap.nextDouble();
        double area;
        area = PI * radius * radius;
        System.out.println("Dien tich hinh tron:" + area);
        
        
    }
}
