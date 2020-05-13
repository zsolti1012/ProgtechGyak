/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commom;

import Exceptions.NotvalidCameraValue;

/**
 *
 * @author O.Zsolt
 */
public class Camera {
    
    public Camera(double mp){
        setMegapixels(mp);
    };
    
    private double megapixels;
    
    public String getCamera(){
        return String.valueOf(megapixels)+"mpx camera "; 
    }
    
    public void setMegapixels(double megapixels) {
        if(0>=megapixels||megapixels>=100) throw new NotvalidCameraValue();
        else this.megapixels = megapixels;
    }

    public double getMegapixels() {
        return megapixels;
    }

   
    
    public Camera DeepCopy(){
        Camera clone=new Camera(this.getMegapixels());
        clone.setMegapixels(getMegapixels());
        
        
        return clone;
        
    }
}
