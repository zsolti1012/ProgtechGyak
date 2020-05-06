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
public class Speaker {
    public Speaker(double decibels){
        this.decibels=decibels;
    }
    
    private double decibels;

    public void setDecibels(int decibels) {
        this.decibels = decibels;
    }

    public double getDecibels() {
        return decibels;
    }
    
    public Speaker DeepCopy(){
        Speaker clone=new Speaker(getDecibels());
        clone.decibels=decibels;
        
        return clone;
    }
}
