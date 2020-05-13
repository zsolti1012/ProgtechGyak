/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import Commom.Microphone;
import Commom.Speaker;

/**
 *
 * @author O.Zsolt
 */
public class Motherboard extends IMotherboard{

    private IMotherboard motherboard;
    
    
    @Override
    public String getInfo() {
        return "Specifications: "+this.speaker.getSpeaker()+";"+this.microphone.getMicrophone()+";";
    }
    
    
    
    
    //Prototype
    
    
    
    
    
    
    public Motherboard(){
        
        //Prototype
        
        //if(microphone==null) microphone=new Microphone();
        //if(speaker==null) speaker=new Speaker();
         //DeepCopy, prototype
        this.speaker=speaker.DeepCopy();
       this.microphone=microphone.DeepCopy();
    }
}
