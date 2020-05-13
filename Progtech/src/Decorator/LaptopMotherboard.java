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
import Laptop.Keyboard;
import Laptop.Touchpad;
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
public class LaptopMotherboard extends Motherboard{

    
    public Motherboard laptopmotherboard=new Motherboard();
    
    
    //Decorator
    @Override
    public  String getInfo(){
        
      return laptopmotherboard.getInfo()+this.battery.getBattery()+";"+this.camera.getCamera()+";"+
              this.memory.getMemory()+";"+this.processor.getProcessor()+";"+this.screen.getScreen()+
              ";"+this.keyboard.getKeyboard()+";"+this.touchpad.getTouchpad()+";"+this.wrap.getWrap()+";";
    }
    public Socket memorysocket;
    public Socket processorsocket;
    public Battery battery;
    public Camera camera;
    public Memory memory;
    public Processor processor;
    public Screen screen;
    
    public Keyboard keyboard;
    public Touchpad touchpad;
    
    
    public Laptop.Wrap wrap;
    

   public LaptopMotherboard(Battery battery,Camera camera,Memory memory,
           Processor processor,Screen screen,Socket memorysocket,Socket processorsocket) throws Exception{
   
       this.battery=battery;
       this.camera=camera;
       this.memory=memory;
       this.processor=processor;
       this.screen=screen;
       this.keyboard=keyboard;
       this.touchpad=touchpad;
      
       this.memorysocket=memorysocket;
       this.processorsocket=processorsocket;
       
       ///
       //Singleton
       this.wrap=Laptop.Wrap.getInstance();
       this.touchpad=Touchpad.getInstance();
       this.keyboard=Keyboard.getInstance();
       
        if(!MemoryCompatibility(this.memory)){
            throw new Notvalidmemorysocket();
        }
       
      if(!ProcessorCompatibility(this.processor)){
          throw new  Notvalidprocessorsocket();
      }
      
       
       
   }
   
   public boolean MemoryCompatibility(Memory memory){
       if (this.memorysocket!=this.memory.getSocket()) return false;
       else return true;
      
   }
   
   public boolean ProcessorCompatibility(Processor processzor){
        if(this.processorsocket!=this.processor.getSocket()){return false;}
        else return true;
   }
   
    public LaptopMotherboard DeepCopy() throws Exception{
        LaptopMotherboard clone=new LaptopMotherboard(battery, camera, memory, processor, screen, memorysocket, processorsocket);
       clone.battery=battery;
       clone.camera=camera;
       clone.memory=memory;
       clone.processor=processor;
       clone.screen=screen;
       
       
       clone.memorysocket=memorysocket;
       clone.processorsocket=processorsocket;
        
        return clone;
    
}
   
}
