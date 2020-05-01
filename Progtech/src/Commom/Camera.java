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
    private double megapixels;
    private double videowidth;
    private double videolength;

    public void setMegapixels(double megapixels) {
        this.megapixels = megapixels;
    }

    public double getMegapixels() {
        return megapixels;
    }

    public void setVideolength(double videolength) {
        this.videolength = videolength;
    }

    public double getVideolength() {
        return videolength;
    }

    public void setVideowidth(double videowidth) {
        this.videowidth = videowidth;
    }

    public double getVideowidth() {
        return videowidth;
    }
    
    public Camera DeepCopy(){
        Camera clone=new Camera();
        clone.megapixels=megapixels;
        clone.videolength=videolength;
        clone.videowidth=videowidth;
        
        return clone;
        
    }
}
