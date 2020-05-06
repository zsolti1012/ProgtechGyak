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
public class Camera {
    
    public Camera(double mp){
    this.megapixels=mp;
    };
    
    private double megapixels;
    
    
    public void setMegapixels(double megapixels) {
        this.megapixels = megapixels;
    }

    public double getMegapixels() {
        return megapixels;
    }

   
    
    public Camera DeepCopy(){
        Camera clone=new Camera(getMegapixels());
        clone.megapixels=megapixels;
        
        
        return clone;
        
    }
}
