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
public class Strings {
    String str = "Hello";
    Integer strLength = 5;
    public void displayStrings(){
        System.out.println("String Length : " +str.length());
        System.out.println("character at index2 :" + str.charAt(2));
        System.out.println("Concatenatedstring : "+str.concat("world"));
        System.out.println("String comparison : "+str.compareTo("world"));
        System.out.println("Index of o : "+str.indexOf("O"));
        System.out.println("Last index of o l :"+str.lastIndexOf("1"));
        System.out.println("Replaced string is: "+ str.replace('e','a'));
        System.out.println("Substring is:"+ str.substring(2, 5));
        System.out.println("Integer to String is:"+ strLength.toString()) ;
        String str1="   Hello   ";
        System.out.println("Untrimmed string is:"+ str1);
        System.out.println("Trimmed string is:"+ str1.trim()); 
    }
    public static void main(String[] args) {
        Strings objString = new Strings();
        objString.displayStrings();
    }
    
}
