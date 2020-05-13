/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commom;

import Exceptions.NotvalidBatteryValue;
import Exceptions.Notvalidvalue;

/**
 *
 * @author O.Zsolt
 */
public  class Battery {
    
    public Battery(double mah,double volts,double h,double w,double l){
        setMah(mah);
        setVolts(volts); setHeight(h);setWidth(w);setLength(l);
    }
    private double mah;
    private double volts;
    
    private double height;
    private double width;
    private double length;
    
    public String getBattery(){
       return String.valueOf(mah)+"mah battery "; 
    }
    
    public void setMah(double mah) {
        if(mah<=0 ||mah>=30000) {throw new Notvalidvalue();}
        else this.mah = mah;
    }

    public double getMah() {
        return mah;
    }

    public void setVolts(double volts) {
        if(3.75>volts ||volts>=30){ throw new NotvalidBatteryValue();}
        else this.volts = volts;
    }

    public double getVolts() {
        return volts;
    }

    public void setHeight(double height) {
        if(0>= height) {throw new Notvalidvalue();}
        else this.height = height;
    }

    public double getHeight() {
         
        return height;
    }

    public void setLength(double length) {
         if(0>= length) {throw new Notvalidvalue();}
         else this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if(0>= width) {throw new Notvalidvalue();}
        else this.width = width;
    }

    public double getWidth() {
        return width;
    }

    
    
    public Battery DeepCopy(){
        Battery clone=new Battery(this.getMah(),getVolts(),getHeight(),getWidth(),getLength());
        clone.setVolts(getVolts());
        clone.setMah(getMah());
        clone.setHeight(getHeight());
        clone.setWidth(getWidth());
        clone.setLength(getLength());
        
        return clone;
    
}
}
