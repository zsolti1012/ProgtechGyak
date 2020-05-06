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
public class Wrap {
    //378 mm x 260 mm x 22,9 mm
    private static double width=260;
    private static double length=378;
    private static double height=22.9;

    
   public static double getWidth() {
        return width;
    }

   
 public static double getLength() {
        return length;
    }

    

   

    
 public static double getHeight() {
        return height;
    }
    
    
    
     private static Wrap uniqueInstance=null;
    //privát konstruktor
    private Wrap(){}
    
    public static Wrap getInstance()
    {
    if (uniqueInstance==null) // megvizsgálja, hogy létezik-e már egy példány
    {
    uniqueInstance = new Wrap(); // ha nem, akkor létrehozza azt
    }
    // visszaadja a példányt
    return uniqueInstance;
    }
}
