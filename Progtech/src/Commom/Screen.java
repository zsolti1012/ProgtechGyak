/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commom;

import Exceptions.Notvalidvalue;

/**
 *
 * @author O.Zsolt
 */
public class Screen {
    
    public Screen(double width,Resolution resolution){
        setWidth(width);
        setResolution(resolution);
    }
    
    public String getScreen(){
        return String.valueOf(resolution)+","+String.valueOf(width)+"' screen";
    }
    private double width;
    private Resolution resolution;

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public void setWidth(double width) {
        if(width<=0||width>=50) throw new Notvalidvalue();
        else this.width = width;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public double getWidth() {
        return width;
    }
    
    
    
    public Screen DeepCopy()
 {
 Screen clone = new Screen(getWidth(),getResolution());
 clone.setResolution(getResolution());
 clone.setWidth(getWidth());
 return clone;
 }

   
    
    
    
}
