/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

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
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author O.Zsolt
 */
public class TabletMotherboardTest {
    
    public TabletMotherboardTest() {
    }
    
   Battery tabletbattery=new Battery(5000, 3.75, 80, 5, 40);
        Camera tabletcamera=new Camera(3);
        Memory tabletmemory=new Memory(256, Socket.SOCKET3, 4000);
        Processor tabletprocessor=new Processor(4, 1300, Socket.SOCKET3);
        Screen tabletscreen=new Screen(10, Resolution.HD);
        Touchpanel tablettouchpanel=new Touchpanel();
        
        TabletMotherboard lm=new TabletMotherboard(tabletbattery.DeepCopy(), tabletcamera.DeepCopy(), tabletmemory.DeepCopy(),
                tabletprocessor.DeepCopy(), tabletscreen.DeepCopy(), tablettouchpanel.DeepCopy(), Socket.SOCKET3, Socket.SOCKET3);
        
    
        
    int db=0;
        
    
     @Test
     public void TestGetinfo(){
         for (int i = 0; i < lm.getInfo().length(); i++) {
             if(lm.getInfo().charAt(i)==';')db++;
         }
         assertEquals(db, 9, 0);
     }
        
    @Test
    public void testMemoryCompatibility() throws Exception {
        System.out.println("MemoryCompatibility");
        Memory memory=new Memory(256, Socket.SOCKET3, 1024);
         TabletMotherboard tablet=new TabletMotherboard(tabletbattery.DeepCopy(), tabletcamera.DeepCopy(), memory,
                tabletprocessor.DeepCopy(), tabletscreen.DeepCopy(), tablettouchpanel.DeepCopy(), Socket.SOCKET3, Socket.SOCKET3);
        boolean expResult = false;
        boolean result = tablet.MemoryCompatibility(memory);
        assertTrue("Memory socket not combatible with motherboard!", result);
        
        
    }
    
    @Test
    public void testProcessorCompatibility() throws Exception {
        System.out.println("ProcessorCompatibility");
        Processor processor=new Processor(4, 512, Socket.SOCKET3);
         TabletMotherboard tablet=new TabletMotherboard(tabletbattery.DeepCopy(), tabletcamera.DeepCopy(), tabletmemory.DeepCopy(),
                processor, tabletscreen.DeepCopy(), tablettouchpanel.DeepCopy(), Socket.SOCKET3, Socket.SOCKET3);
        boolean expResult = false;
        boolean result = tablet.ProcessorCompatibility(processor);
        assertTrue("Processor socket not combatible with motherboard!", result);
        
        
    }
    
    
    @Test
    public void BatteryTest(){
        System.out.println("BatteryTest");
        
        Battery battery=new Battery(20, 20, 20, 20, 20);
        
    }
    
    @Test
    public void TestPrototype() throws Exception{
       TabletMotherboard l2=lm.DeepCopy();
        assertEquals("Not equals!",lm.battery.getMah(), l2.battery.getMah(),0);
        assertEquals("Not equals!",lm.camera.getMegapixels(), l2.camera.getMegapixels(),0);
        assertEquals("Not equals!",lm.memory.getFrequency(), l2.memory.getFrequency(),0);
        assertEquals("Not equals!",lm.processor.getFrequency(), l2.processor.getFrequency(),0);
        assertEquals("Not equals!",lm.screen.getResolution(), l2.screen.getResolution());
        
        
        
        
    }
    
    @Test
    public void GetInfoTest(){
        assertNotNull(lm.getInfo());
    }
    
    
    @Test
    public void ScreenTest() throws Exception{
        
        Screen screen=new Screen(5, Resolution.FULLHD);
        
       
    }
    

    
}
