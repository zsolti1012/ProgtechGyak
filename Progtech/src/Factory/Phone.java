/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Commom.Battery;
import Commom.Camera;
import Commom.Memory;
import Commom.Microphone;
import Commom.Processor;
import Commom.Resolution;
import Commom.Screen;
import Commom.Speaker;
import Commom.Touchpanel;
import java.net.Socket;
import jdk.net.Sockets;


/**
 *
 * @author O.Zsolt
 */
public class Phone {

  public Phone(){
      
      Battery battery=new Battery(2500, 3.7, 50, 20, 5);
      Camera camera=new Camera(13.5);
      Memory memory = new Memory(512,Commom.Socket.SOCKET1, 2500);
      Microphone microphone=new Microphone();
      Processor processor=new Processor(4, 1300, Commom.Socket.SOCKET2);
      Screen screen=new Screen(5, Resolution.HD);
      Speaker speaker=new Speaker(30);
      Touchpanel touchpanel=new Touchpanel();
              
  }
    


  
  
    
    

    
    
    
    

    
     
}
