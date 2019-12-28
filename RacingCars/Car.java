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
public class Car {
   private String name;
    private float speed;
    private int x = 10;
    private int y = 20;

    /**
     * Get the value of y
     *
     * @return the value of y
     */
    public int getY() {
        return y;
    }

    /**
     * Set the value of y
     *
     * @param y new value of y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Get the value of x
     *
     * @return the value of x
     */
    public int getX() {
        return x;
    }

    /**
     * Set the value of x
     *
     * @param x new value of x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Get the value of speed
     *
     * @return the value of speed
     */
    public float getSpeed( ) {
        return speed;
    }

    /**
     * Set the value of speed
     *
     * @param speed new value of speed
     */
    public void setSpeed(float speed) {
        this.speed = speed;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car" + "name:" + name + ", speed:" + speed + ", x=" + x + ", y=" + y + '}';
    }
}
