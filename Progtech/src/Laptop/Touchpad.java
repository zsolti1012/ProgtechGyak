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
public class Touchpad {
    
    private double lenth;
    private double width;

    public void setLenth(double lenth) {
        this.lenth = lenth;
    }

    public double getLenth() {
        return lenth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    
    
    
    
    
    
    
    private static Touchpad uniqueInstance=null;
    //privát konstruktor
    private Touchpad(){}
    
    public static Touchpad getInstance()
    {
    if (uniqueInstance==null) // megvizsgálja, hogy létezik-e már egy példány
    {
    uniqueInstance = new Touchpad(); // ha nem, akkor létrehozza azt
    }
    // visszaadja a példányt
    return uniqueInstance;
    }
}
