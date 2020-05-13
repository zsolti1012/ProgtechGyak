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
import static com.oracle.nio.BufferSecrets.instance;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
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
    
   
    
    

    
    /**
     * Test of MemoryCompatibility method, of class LaptopMotherboard.
     */
    @Test
    public void testMemoryCompatibility() throws Exception {
        System.out.println("MemoryCompatibility");
        Memory memory=new Memory(256, Socket.SOCKET1, 1024);
        LaptopMotherboard laptop=new LaptopMotherboard(laptopBattery.DeepCopy(), laptopCamera.DeepCopy(),
                memory, laptopProcessor.DeepCopy(), laptopScreen.DeepCopy(), Socket.SOCKET1, Socket.SOCKET1);
        boolean expResult = false;
        boolean result = laptop.MemoryCompatibility(memory);
        assertTrue("Memory socket not combatible with motherboard!", result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void BatteryTest(){
        System.out.println("BatteryTest");
        
        Battery battery=new Battery(20, 20, 20, 20, 20);
        
    }

    
    
    
    
    
}
