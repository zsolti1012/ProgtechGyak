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
public class TabletMotherboard extends Motherboard{

    
    public Motherboard tabletmotherboard=new Motherboard();
    
    //Decorator
    @Override
    public  String getInfo(){
      return tabletmotherboard.getInfo()+this.battery.getBattery()+";"+this.camera.getCamera()+";"+
              this.memory.getMemory()+";"+this.processor.getProcessor()+";"+this.screen.getScreen()+";"+
              this.touchpanel.getTouchpanel()+";"+this.wrap.getWrap()+";";
    }
    
    protected Battery battery;
    protected Camera camera;
    protected Memory memory;
    protected Processor processor;
    protected Screen screen;
    protected Touchpanel touchpanel;
    protected Socket memorysocket;
    protected Socket processorsocket;
    
    protected Tablet.Wrap wrap;
    

   public TabletMotherboard(Battery battery,Camera camera,Memory memory,
           Processor processor,Screen screen,Touchpanel touchpanel,Socket memorysocket,Socket processorsocket){
   
       this.battery=battery;
       this.camera=camera;
       this.memory=memory;
       this.processor=processor;
       this.screen=screen;
       this.touchpanel=touchpanel;
       this.memorysocket=memorysocket;
       this.processorsocket=processorsocket;
       
       
       ///
       //Singleton
       this.wrap=Tablet.Wrap.getInstance();
       
      
       if (this.memorysocket!=this.memory.getSocket()) {
           throw new Notvalidmemorysocket();
       }
       if(this.processorsocket!=this.processor.getSocket()){
           throw new Notvalidprocessorsocket();
       }
       
   }
}
