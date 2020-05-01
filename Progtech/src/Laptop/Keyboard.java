/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laptop;

/**
 *
 * @author O.Zsolt
 */
public class Keyboard {
    
    private double length;
    private double width;
    private National nat;
    private int buttons=101;
    
    

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setNat(National nat) {
        this.nat = nat;
    }

    public National getNat() {
        return nat;
    }

    public int getButtons() {
        return buttons;
    }
    
    
    
    
    
    private static Keyboard uniqueInstance=null;
    //privát konstruktor
    private Keyboard(){}
    
    public static Keyboard getInstance()
    {
    if (uniqueInstance==null) // megvizsgálja, hogy létezik-e már egy példány
    {
    uniqueInstance = new Keyboard(); // ha nem, akkor létrehozza azt
    }
    // visszaadja a példányt
    return uniqueInstance;
    }
}
