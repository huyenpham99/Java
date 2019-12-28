/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session8;

/**
 *
 * @author 84122
 */
public class AutoUnbox {
    public static void main(String[] args) {
        Character chBox = 'A';
        char chUnbox = chBox;
        System.out.println("Character after autoboxing :" +chBox);
        System.out.println("Character after unboxing :"+chUnbox);
    }
}
