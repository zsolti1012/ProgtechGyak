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
public class Screen {
    
    
    
    private int width;
    private Resolution resolution;

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public int getWidth() {
        return width;
    }
    
    
    
    public Screen DeepCopy()
 {
 Screen clone = new Screen();
 clone.resolution=resolution;
 clone.width=width;
 return clone;
 }

   
    
    
    
}
