/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progtech;

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
import sun.awt.windows.WPrinterJob;
import Decorator.PhoneMotherboard;
import Decorator.TabletMotherboard;
import Laptop.Keyboard;
import Laptop.National;
import Laptop.Touchpad;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author O.Zsolt
 */
public class Progtech {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Battery b=new Battery(12, 5, 12, 5, 5);
        Camera c=new Camera(15);
        Memory m=new Memory(15, Socket.SOCKET3, 1000);
        Processor p=new Processor(2, 1300, Socket.SOCKET3);
        Screen s=new Screen(500, Resolution.FULLHD);
        Touchpanel t=new Touchpanel();
        Sim sim=new Sim(Simtypes.SINGLESIM);
        
        Touchpad tc=new Touchpad();
        Keyboard kb=new Keyboard(National.HUN, 101);
                
          
        PhoneMotherboard pm=new PhoneMotherboard(b, c, m, p, s, t, sim,Socket.SOCKET3,Socket.SOCKET3);
        System.out.println(pm.getInfo());
        
        TabletMotherboard tm=new TabletMotherboard(b, c, m, p, s, t,Socket.SOCKET3,Socket.SOCKET3);
        System.out.println(tm.getInfo());
        
        LaptopMotherboard lm=new LaptopMotherboard(b, c, m, p, s, kb, tc,Socket.SOCKET3,Socket.SOCKET3);
        System.out.println(lm.getInfo());
        
        
    }
    
}
