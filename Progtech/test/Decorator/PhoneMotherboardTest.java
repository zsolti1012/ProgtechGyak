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
import Phone.Wrap;
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
public class PhoneMotherboardTest {
    
    public PhoneMotherboardTest() {
    }
    
    Battery phonebattery=new Battery(2600, 3.75, 60, 5, 35);
        Camera phonecamera=new Camera(15);
        Memory phonememory=new Memory(256, Socket.SOCKET3, 2000);
        Processor phoneprocessor=new Processor(4, 1300, Socket.SOCKET3);
        Screen phonescreen=new Screen(5, Resolution.HD);
        Sim sim=new Sim(Simtypes.DUALSIM);
        Touchpanel phonetouchpanel=new Touchpanel();
        
        PhoneMotherboard lm=new PhoneMotherboard(phonebattery.DeepCopy(), phonecamera.DeepCopy(), 
                phonememory.DeepCopy(), phoneprocessor.DeepCopy(), phonescreen.DeepCopy(),
                phonetouchpanel.DeepCopy(), sim.DeepCopy(), Socket.SOCKET3, Socket.SOCKET3);
    
        
        
        
     int db=0;
        
    
     @Test
     public void TestGetinfo(){
         for (int i = 0; i < lm.getInfo().length(); i++) {
             if(lm.getInfo().charAt(i)==';')db++;
         }
         assertEquals(db, 10, 0);
     }   
        
    @Test
    public void testMemoryCompatibility() throws Exception {
        System.out.println("MemoryCompatibility");
        Memory memory=new Memory(256, Socket.SOCKET3, 1024);
        PhoneMotherboard phone=new PhoneMotherboard(phonebattery.DeepCopy(), phonecamera.DeepCopy(),
                memory, phoneprocessor.DeepCopy(), phonescreen.DeepCopy(),phonetouchpanel.DeepCopy(),sim.DeepCopy(),
                Socket.SOCKET3, Socket.SOCKET3);
        boolean expResult = false;
        boolean result = phone.MemoryCompatibility(memory);
        assertTrue("Memory socket not combatible with motherboard!", result);
        
        
    }
    
    @Test
    public void testProcessorCompatibility() throws Exception {
        System.out.println("ProcessorCompatibility");
        Processor processor=new Processor(4, 512, Socket.SOCKET3);
        PhoneMotherboard phone=new PhoneMotherboard(phonebattery.DeepCopy(), phonecamera.DeepCopy(),
                phonememory.DeepCopy(), processor, phonescreen.DeepCopy(),phonetouchpanel.DeepCopy(),sim.DeepCopy(),
                Socket.SOCKET3, Socket.SOCKET3);
        boolean expResult = false;
        boolean result = phone.ProcessorCompatibility(processor);
        assertTrue("Processor socket not combatible with motherboard!", result);
        
        
    }
    
    
    @Test
    public void BatteryTest(){
        System.out.println("BatteryTest");
        
        Battery battery=new Battery(20, 20, 20, 20, 20);
        
    }
    
    @Test
    public void TestPrototype() throws Exception{
       PhoneMotherboard l2=lm.DeepCopy();
        assertEquals("Not equals!",lm.battery.getMah(), l2.battery.getMah(),0);
        assertEquals("Not equals!",lm.camera.getMegapixels(), l2.camera.getMegapixels(),0);
        assertEquals("Not equals!",lm.memory.getFrequency(), l2.memory.getFrequency(),0);
        assertEquals("Not equals!",lm.processor.getFrequency(), l2.processor.getFrequency(),0);
        assertEquals("Not equals!",lm.screen.getResolution(), l2.screen.getResolution());
        
        
        
        
    }
    
    @Test
    public void ScreenTest() throws Exception{
        
        Screen screen=new Screen(5, Resolution.FULLHD);
        
       
    }
    @Test
    public void GetInfoTest(){
        assertNotNull(lm.getInfo());
    }
    
    

    
    
}
