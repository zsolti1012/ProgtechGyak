import Commom.Camera;
import Commom.Battery;
import Commom.Memory;
import Commom.Microphone;
import Commom.Processor;
import Commom.Screen;
import Commom.Speaker;
import Laptop.Keyboard;
import Laptop.Touchpad;
import com.sun.org.apache.xalan.internal.xsltc.cmdline.getopt.GetOpt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author O.Zsolt
 */
public interface  Motherboard {
    
    
    
    public abstract Sockets supportedMemory();
    public abstract  Sockets supportedCPU();
    public abstract double sataissupported();
    public abstract double usb3issupported();
    
    public Battery battery();
    public Camera camera();
    public Memory memory();
    public Microphone microphone();
    public Processor processor();
    public Screen screen();
    public Speaker speaker();
    public Touchpad touchpad();
    public Keyboard keyboard();
    
}
