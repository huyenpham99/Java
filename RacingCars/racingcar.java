/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RacingCars;

/**
 *
 * @author Admin
 */
public class racingcar {

    public static void main(String[] args) {

//        Car objCar1 = new Car();
//        Car objCar2 = new Car();
//        Car objCar3 = new Car();
//        objCar1.setName(("Bugatti"));
//        objCar2.setName("Lamborghini");
//        objCar3.setName("Roll-Royces");
//        objCar1.setSpeed((float) Math.random()*100);
//        objCar2.setSpeed((float) Math.random()*100);
//        objCar3.setSpeed((float) Math.random()*100);
//        System.out.println(objCar1.toString());
//        System.out.println("\n"+objCar2.toString());
//        System.out.println("\n"+objCar3.toString());
//        if(objCar1.getSpeed() > objCar2.getSpeed() && objCar1.getSpeed() > objCar3.getSpeed()){
//            System.out.println(" Bugatti max Speed");
//        }else if(objCar2.getSpeed() > objCar1.getSpeed() && objCar2.getSpeed() > objCar3.getSpeed()){
//            System.out.println("Lamborghini  max Speed ");
//        }else {
//            System.out.println("Roll-Royces max Speed");
//        }
        Car obj1 = new Car();
        Car obj2 = new Car();
        Car obj3 = new Car();

        obj1.setName(("Bugatti"));
        obj2.setName("Lamborghini");
        obj3.setName("Roll-Royces");
        obj1.setSpeed((float) Math.random() * 100);
        obj2.setSpeed((float) Math.random() * 100);
        obj3.setSpeed((float) Math.random() * 100);
        float a = obj1.getSpeed();
        float b = obj2.getSpeed();
        float c = obj3.getSpeed();
        float temp;
        System.out.println("\n " + obj1.toString());
        System.out.println("\n " + obj2.toString());
        System.out.println("\n " + obj3.toString());
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (a < c) {
            temp = a;
            a = c;
            c = temp;
        }

        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
