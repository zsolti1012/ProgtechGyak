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
import sun.awt.windows.WPrinterJob;
import Decorator.PhoneMotherboard;

/**
 *
 * @author O.Zsolt
 */
public class Progtech {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Battery b=new Battery(12, 5, 12, 5, 5);
        Camera c=new Camera(15);
        Memory m=new Memory(15, Socket.SOCKET2, 1000);
        Processor p=new Processor(2, 1300, Socket.SOCKET1);
        Screen s=new Screen(500, Resolution.FULLHD);
        Touchpanel t=new Touchpanel();
        Sim sim=new Sim(Simtypes.SINGLESIM);
          
        PhoneMotherboard pm=new PhoneMotherboard(b, c, m, p, s, t, sim);
        System.out.println(pm.getInfo());
        
        
    }
    
}
