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
    
    private double lenth=50;
    private double width=70;

    
    
    public String getTouchpad(){
        return "touchpad";
    }
    
    
    
    
    
    private static Touchpad uniqueInstance=null;
    //privát konstruktor
    public Touchpad(){}
    
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
