/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Commom.Battery;
import Commom.Camera;
import Commom.Memory;
import Commom.Processor;
import Commom.Resolution;
import Commom.Screen;
import Commom.Sim;
import Commom.Simtypes;
import Commom.Socket;
import Commom.Touchpanel;
import Decorator.LaptopMotherboard;
import Decorator.Motherboard;
import Decorator.PhoneMotherboard;
import Decorator.TabletMotherboard;
import Laptop.Keyboard;
import Laptop.National;
import Laptop.Touchpad;
import Phone.Wrap;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author O.Zsolt
 */
public class Manufacturing {
   
       List<PhoneMotherboard> Phones;
       List<TabletMotherboard> Tablets;
       List<LaptopMotherboard> Laptops;
    
       public List<PhoneMotherboard> PhoneManufacturing(int piece,PhoneMotherboard pm){
           Phones=new ArrayList<PhoneMotherboard>();
           for (int i = 0; i < piece; i++) {
               
               //Phones.add(new PhoneMotherboard(pm.battery, pm.camera.DeepCopy(), pm.memory, pm.processor, pm.screen, pm.touchpanel, pm.simtype, pm.memorysocket, pm.processorsocket));
               Phones.add(pm.DeepCopy());
           }
           
           return Phones;
       }
       
       public List<TabletMotherboard> TabletManufacturing(int piece,TabletMotherboard pm){
           Tablets=new ArrayList<TabletMotherboard>();
           for (int i = 0; i < piece; i++) {
               
               //Tablets.add(new TabletMotherboard(pm.battery, pm.camera, pm.memory, pm.processor, pm.screen, pm.touchpanel,  pm.memorysocket, pm.processorsocket));
               Tablets.add(pm.DeepCopy());
           }
           
           return Tablets;
       }
       
       public List<LaptopMotherboard> LaptopManufacturing(int piece,LaptopMotherboard pm) throws Exception{
           Laptops=new ArrayList<LaptopMotherboard>();
           for (int i = 0; i < piece; i++) {
               
               //Laptops.add(new LaptopMotherboard(pm.battery, pm.camera, pm.memory, pm.processor, pm.screen,  pm.memorysocket, pm.processorsocket));
               Laptops.add(pm.DeepCopy());
           }
           
           return Laptops;
       }
       
       
            
       public Battery BatteryManufacturing(double mah,double volts,double height,double width,double length){
           return new Battery(mah, volts, height, width, length);
       }
       
       public Camera CameraManufacturing(double mp){
           return new Camera(mp);
       }
       
       
       public Memory MemoryManufacturing(double frequency,Socket socket,double sizemb){
           return new Memory(frequency, socket, sizemb);
       }
    
       public Processor ProcessorManufacturing(int seeds,double frequency,Socket socket){
           return new Processor(seeds, frequency, socket);
       }
       
       public Screen ScreenManufacturing(double width, Resolution resolution){
           return new Screen(width, resolution);
       }
       
       public Sim SimManufacturing(Simtypes simtype){
           return new Sim(simtype);
       }
       
       public Touchpanel TouchpanelManufacturing(){
           return new Touchpanel();
       }
       
       
       
       
       
       
        
}
