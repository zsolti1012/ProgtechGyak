/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phone;

/**
 *
 * @author O.Zsolt
 */
public class Wrap {
    //Galaxy j3 2017
    private static double width=70.3;
    private static double length=140.2;
    private static double height=8.2;

    
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
