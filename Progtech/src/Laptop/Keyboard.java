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
    
   
    private National nat=National.HUN;
    private int buttons=101;
    
    

    
    
    
    
    
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
