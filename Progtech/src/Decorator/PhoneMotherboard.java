package Decorator;

import Commom.Battery;
import Commom.Camera;
import Commom.Memory;
import Commom.Microphone;
import Commom.Processor;
import Commom.Screen;
import Commom.Sim;
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
public class PhoneMotherboard extends Motherboard{

    
    public Motherboard phonemotherboard=new Motherboard();
    
    //Decorator
    @Override
    public  String getInfo(){
      return phonemotherboard.getInfo()+this.battery.getBattery()+";"+this.camera.getCamera()+";"+
              this.memory.getMemory()+";"+this.processor.getProcessor()+";"+this.screen.getScreen()+";"+
              this.touchpanel.getTouchpanel()+";"+this.simtype.GetSim()+";"+this.wrap.getWrap()+";";
    }
    
    protected Battery battery;
    protected Camera camera;
    protected Memory memory;
    protected Processor processor;
    protected Screen screen;
    protected Touchpanel touchpanel;
    protected Sim simtype;
    protected Phone.Wrap wrap;
    

   public PhoneMotherboard(Battery battery,Camera camera,Memory memory,
           Processor processor,Screen screen,Touchpanel touchpanel,Sim simtype){
       
       this.battery=battery;
       this.camera=camera;
       this.memory=memory;
       this.processor=processor;
       this.screen=screen;
       this.touchpanel=touchpanel;
       this.simtype=simtype;
       
       ///
       //Singleton
       this.wrap=Phone.Wrap.getInstance();
       
      
       
       
   }
}
