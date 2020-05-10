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
        return "Specifications: "+";"+this.speaker.getSpeaker()+";"+this.microphone.getMicrophone()+";";
    }
    
    
    protected Microphone microphone;
    protected Speaker speaker;
    
    //Prototype
    Speaker sp1=new Speaker();
    Microphone mc1=new Microphone();
    
    public Motherboard(){
        
         //DeepCopy, prototype
        this.speaker=sp1.DeepCopy();
       this.microphone=mc1.DeepCopy();
    }
}
