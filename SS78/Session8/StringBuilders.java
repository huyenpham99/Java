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
public class StringBuilders {

    StringBuilders str = new StringBuilders("JAVA");

    private StringBuilders(String java) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void displayString(){
        System.out.println("Appended String : "+str.append("7"));
        System.out.println("Inserted String : "+str.insert(5,"SE"));
        System.out.println("Deleted String : " + str.delete(4,7));
        System.out.println("Reverse String : "+str.reverse());
    }
    public static void main(String[] args) {
        StringBuilder objStrBuid = new StringBuilder();
        objStrBuid.displayString();
    }
    
}
