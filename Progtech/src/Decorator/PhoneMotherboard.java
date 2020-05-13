package Decorator;

import Commom.Battery;
import Commom.Camera;
import Commom.Memory;
import Commom.Microphone;
import Commom.Processor;
import Commom.Screen;
import Commom.Sim;
import Commom.Simtypes;
import Commom.Socket;
import Commom.Speaker;
import Commom.Touchpanel;
import Exceptions.Notvalidmemorysocket;
import Exceptions.Notvalidprocessorsocket;
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
public final class PhoneMotherboard extends Motherboard{

    
    public Motherboard phonemotherboard=new Motherboard();
    
    //Decorator
    @Override
    public  String getInfo(){
      return phonemotherboard.getInfo()+this.battery.getBattery()+";"+this.camera.getCamera()+";"+
              this.memory.getMemory()+";"+this.processor.getProcessor()+";"+this.screen.getScreen()+";"+
              this.touchpanel.getTouchpanel()+";"+this.simtype.GetSim()+";"+this.wrap.getWrap()+";";
    }
    
    public Battery battery;
    public Camera camera;
    public Memory memory;
    public Processor processor;
    public Screen screen;
    public Touchpanel touchpanel;
    public Sim simtype;
    public Phone.Wrap wrap;
    public Socket memorysocket;
    public Socket processorsocket;
    
    public Battery getBattery() {
        return battery;
    }
    

    public Camera getCamera() {
        return camera;
    }

    public Memory getMemory() {
        return memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Screen getScreen() {
        return screen;
    }

    public Touchpanel getTouchpanel() {
        return touchpanel;
    }

    public Sim getSimtype() {
        return simtype;
    }

    public Wrap getWrap() {
        return wrap;
    }

    public Socket getMemorysocket() {
        return memorysocket;
    }

    public Socket getProcessorsocket() {
        return processorsocket;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
    
    
    
    
    

   public PhoneMotherboard(Battery battery,Camera camera,Memory memory,
           Processor processor,Screen screen,Touchpanel touchpanel,Sim simtype,Socket memorysocket,Socket processorsocket){
       
       this.battery=battery;
       this.camera=camera;
       this.memory=memory;
       this.processor=processor;
       this.screen=screen;
       this.touchpanel=touchpanel;
       this.simtype=simtype;
       this.memorysocket=memorysocket;
       this.processorsocket=processorsocket;
       ///
       //Singleton
       this.wrap=Phone.Wrap.getInstance();
       
      if (this.memorysocket!=this.memory.getSocket()) {
           throw new Notvalidmemorysocket();
       }
       if(this.processorsocket!=this.processor.getSocket()){
           throw new Notvalidprocessorsocket();
       }
       
       
   }
   
   
   //Decorator
   public PhoneMotherboard DeepCopy(){
        PhoneMotherboard clone=new PhoneMotherboard(this.getBattery(), this.getCamera(), this.getMemory(), this.getProcessor(), 
                this.getScreen(), this.getTouchpanel(), this.getSimtype(), this.getMemorysocket(), this.getProcessorsocket());
       clone.battery=getBattery();
       clone.camera=getCamera();
       clone.memory=getMemory();
       clone.processor=getProcessor();
       clone.screen=getScreen();
       clone.touchpanel=getTouchpanel();
       clone.simtype=getSimtype();
       clone.memorysocket=getMemorysocket();
       clone.processorsocket=getProcessorsocket();
        
        return clone;
    
}
}
