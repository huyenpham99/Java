/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3_Bien;

/**
 *
 * @author Admin
 */

public class EnumDirection {
    enum Direction{
        East, West, North, Southl
    }
    
    public static void main(String[] args) {
        Direction direction;
        direction = Direction.East;
        System.out.println("Direction:" + direction);
    }
}
