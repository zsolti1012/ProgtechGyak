/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablet;

/**
 *
 * @author O.Zsolt
 */
public class Wrap {
    private static double width;
    private static double length;
    private static double height;

    public static void setWidth(double width) {
        Wrap.width = width;
    }
   public static double getWidth() {
        return width;
    }

    public static void setLength(double length) {
        Wrap.length = length;
    }
 public static double getLength() {
        return length;
    }

    public static void setHeight(double height) {
        Wrap.height = height;
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
