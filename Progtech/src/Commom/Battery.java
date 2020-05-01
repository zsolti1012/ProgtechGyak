/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commom;

/**
 *
 * @author O.Zsolt
 */
public class Battery {
    private double mah;
    private double volts;
    
    private double height;
    private double width;
    private double length;

    public void setMah(double mah) {
        this.mah = mah;
    }

    public double getMah() {
        return mah;
    }

    public void setVolts(double volts) {
        this.volts = volts;
    }

    public double getVolts() {
        return volts;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

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

    
    
    public Battery DeepCopy(){
        Battery clone=new Battery();
        clone.volts=volts;
        clone.mah=mah;
        clone.height=height;
        clone.width=width;
        clone.length=length;
        
        return clone;
    
}
}
