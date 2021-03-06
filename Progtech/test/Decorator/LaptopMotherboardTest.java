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
import Commom.Socket;
import Exceptions.NotvalidBatteryValue;
import Exceptions.NotvalidMemory;
import static com.oracle.nio.BufferSecrets.instance;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author O.Zsolt
 */
public class LaptopMotherboardTest {
    
    public LaptopMotherboardTest() throws Exception {
        
        
        
    }
    
    
    
        Battery laptopBattery=new Battery(20, 20, 500, 50, 60);
        Camera laptopCamera=new Camera(1.3);
        Memory laptopMemory=new Memory(256, Socket.SOCKET3, 8000);
        Processor laptopProcessor=new Processor(8, 3000, Socket.SOCKET3);
        Screen laptopScreen=new Screen(10, Resolution.FULLHD);
    
        
        LaptopMotherboard lm=new LaptopMotherboard(laptopBattery.DeepCopy(), laptopCamera.DeepCopy(), laptopMemory.DeepCopy(),
                laptopProcessor.DeepCopy(), laptopScreen.DeepCopy(),  Socket.SOCKET3, Socket.SOCKET3);
    
   
        int db=0;
        
    
     @Test
     public void TestGetinfo(){
         for (int i = 0; i < lm.getInfo().length(); i++) {
             if(lm.getInfo().charAt(i)==';')db++;
         }
         assertEquals(db, 10, 0);
     }
    
    /**
     * Test of MemoryCompatibility method, of class LaptopMotherboard.
     */
    @Test
    public void testMemoryCompatibility() throws Exception {
        System.out.println("MemoryCompatibility");
        Memory memory=new Memory(256, Socket.SOCKET3, 1024);
        LaptopMotherboard laptop=new LaptopMotherboard(laptopBattery.DeepCopy(), laptopCamera.DeepCopy(),
                memory, laptopProcessor.DeepCopy(), laptopScreen.DeepCopy(), Socket.SOCKET3, Socket.SOCKET3);
        boolean expResult = false;
        boolean result = laptop.MemoryCompatibility(memory);
        assertTrue("Memory socket not combatible with motherboard!", result);
        
        
    }
    
    @Test
    public void testProcessorCompatibility() throws Exception {
        System.out.println("ProcessorCompatibility");
        Processor processor=new Processor(4, 512, Socket.SOCKET3);
        LaptopMotherboard laptop=new LaptopMotherboard(laptopBattery.DeepCopy(), laptopCamera.DeepCopy(),
                laptopMemory.DeepCopy(), processor, laptopScreen.DeepCopy(), Socket.SOCKET3, Socket.SOCKET3);
        boolean expResult = false;
        boolean result = laptop.ProcessorCompatibility(processor);
        assertTrue("Processor socket not combatible with motherboard!", result);
        
        
    }
    
    
    @Test
    public void BatteryTest(){
        System.out.println("BatteryTest");
        
        Battery battery=new Battery(20, 20, 20, 20, 20);
        
    }
    
    @Test
    public void TestPrototype() throws Exception{
       LaptopMotherboard l2=lm.DeepCopy();
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
        
        Screen screen=new Screen(15, Resolution.FULLHD);
        
       
    }
    
   

    
    
    
    
    
}
