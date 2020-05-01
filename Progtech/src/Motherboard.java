import Commom.Camera;
import Commom.Battery;
import Commom.Memory;
import Commom.Microphone;
import Commom.Processor;
import Commom.Screen;
import Commom.Speaker;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author O.Zsolt
 */
public interface Motherboard {
    
    
    
    public   Sockets supportedMemory();
    public  Sockets supportedCPU();
    public double sataissupported();
    public double usb3issupported();
    
    public Battery battery();
    public Camera camera();
    public Memory memory();
    public Microphone microphone();
    public Processor processor();
    public Screen screen();
    public Speaker speaker();
}
