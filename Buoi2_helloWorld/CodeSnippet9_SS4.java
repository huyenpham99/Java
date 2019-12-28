/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2_helloWorld;

/**
 *
 * @author Admin
 */
enum Cards {
    Spade, Heart, Diamond, Club
}

public class CodeSnippet9_SS4 {

    public static void main(String[] args) {
        Cards card = Cards.Diamond;
        switch (card) {
            case Spade:
                System.out.println("SPADE");
                break;
            case Heart:
                System.out.println("Heart");
                break;
            case Diamond:
                System.out.println("Diamond");
                break;
            case Club:
                System.out.println("Club");
                break;
        }
    }
}
