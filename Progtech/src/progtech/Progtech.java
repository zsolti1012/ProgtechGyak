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
import Factory.Manufacturing;
import Laptop.Keyboard;
import Laptop.National;
import Laptop.Touchpad;
import com.sun.javafx.scene.control.skin.VirtualFlow;
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
        List<PhoneMotherboard> phones=new ArrayList<PhoneMotherboard>();
        List<TabletMotherboard> tablets=new ArrayList<TabletMotherboard>();
        List<LaptopMotherboard> laptops=new ArrayList<LaptopMotherboard>();
        
        
        Manufacturing mf=new Manufacturing();
        
        Battery phonebattery=mf.BatteryManufacturing(2600, 3.75, 60, 5, 35);
        Camera phonecamera=mf.CameraManufacturing(15);
        Memory phonememory=mf.MemoryManufacturing(256, Socket.SOCKET1, 2000);
        Processor phoneprocessor=mf.ProcessorManufacturing(4, 1300, Socket.SOCKET2);
        Screen phonescreen=mf.ScreenManufacturing(5, Resolution.HD);
        Sim sim=mf.SimManufacturing(Simtypes.DUALSIM);
        Touchpanel phonetouchpanel=mf.TouchpanelManufacturing();
        
        //Prototype use deepcopy
        PhoneMotherboard pm=new PhoneMotherboard(phonebattery.DeepCopy(), phonecamera.DeepCopy(), 
                phonememory.DeepCopy(), phoneprocessor.DeepCopy(), phonescreen.DeepCopy(),
                phonetouchpanel.DeepCopy(), sim.DeepCopy(), Socket.SOCKET1, Socket.SOCKET2);
        
        
        Battery tabletbattery=mf.BatteryManufacturing(5000, 3.75, 80, 5, 40);
        Camera tabletcamera=mf.CameraManufacturing(3);
        Memory tabletmemory=mf.MemoryManufacturing(256, Socket.SOCKET3, 4000);
        Processor tabletprocessor=mf.ProcessorManufacturing(4, 1300, Socket.SOCKET3);
        Screen tabletscreen=mf.ScreenManufacturing(10, Resolution.HD);
        Touchpanel tablettouchpanel=mf.TouchpanelManufacturing();
        
        TabletMotherboard tm=new TabletMotherboard(tabletbattery.DeepCopy(), tabletcamera.DeepCopy(), tabletmemory.DeepCopy(),
                tabletprocessor.DeepCopy(), tabletscreen.DeepCopy(), tablettouchpanel.DeepCopy(), Socket.SOCKET3, Socket.SOCKET3);
        
        
        
        Battery laptopBattery=mf.BatteryManufacturing(20000, 20, 500, 50, 60);
        Camera laptopCamera=mf.CameraManufacturing(1.3);
        Memory laptopMemory=mf.MemoryManufacturing(256, Socket.SOCKET3, 8000);
        Processor laptopProcessor=mf.ProcessorManufacturing(8, 3000, Socket.SOCKET3);
        Screen laptopScreen=mf.ScreenManufacturing(10, Resolution.FULLHD);
        
    
        
        LaptopMotherboard lm=new LaptopMotherboard(laptopBattery.DeepCopy(), laptopCamera.DeepCopy(), laptopMemory.DeepCopy(),
                laptopProcessor.DeepCopy(), laptopScreen.DeepCopy(),  Socket.SOCKET3, Socket.SOCKET3);
        
        
        phones=mf.PhoneManufacturing(20, pm.DeepCopy());
        tablets=mf.TabletManufacturing(25,tm.DeepCopy());
        laptops=mf.LaptopManufacturing(30, lm.DeepCopy());
        
        
        System.out.println("done");
    }
    
}
