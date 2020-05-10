package Decorator;

import Commom.Battery;
import Commom.Camera;
import Commom.Memory;
import Commom.Microphone;
import Commom.Processor;
import Commom.Screen;
import Commom.Simtypes;
import Commom.Speaker;
import Commom.Touchpanel;
import Phone.Wrap;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author O.Zsolt
 */
abstract class PhoneMotherboard extends IMotherboard{

    
    public IMotherboard phonemotherboard;
    
    //Decorator
    @Override
    public  String getInfo(){
      return phonemotherboard.getInfo()+"Specifications: "+";"+this.speaker+";"+this.microphone.getMicrophone()+";";
    }
    
    protected Battery battery;
    protected Camera camera;
    protected Memory memory;
    protected Microphone microphone;
    protected Processor processor;
    protected Screen screen;
    protected Speaker speaker;
    protected Touchpanel touchpanel;
    protected Simtypes simtype;
    protected Phone.Wrap wrap;
    

      
    //Prototype
    Speaker sp1;
    Microphone mc1=new Microphone();
    
 
    
    
   public PhoneMotherboard(Battery battery,Camera camera,Memory memory,
           Processor processor,Screen screen,Touchpanel touchpanel,Simtypes simtype){
        this.sp1 = new Speaker();
       this.battery=battery;
       this.camera=camera;
       this.memory=memory;
       this.processor=processor;
       this.screen=screen;
       this.touchpanel=touchpanel;
       this.simtype=simtype;
       
       //Singleton
       this.wrap=Phone.Wrap.getInstance();
       
       //DeepCopy, prototype
       
       this.speaker=sp1.DeepCopy();
       this.microphone=mc1.DeepCopy();
   }
}
