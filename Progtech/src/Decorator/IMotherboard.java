package Decorator;

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
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author O.Zsolt
 */
public abstract class  IMotherboard {
    /*
    public abstract String battery();
    public abstract String camera();
    public abstract String memory();
    public abstract String microphone();
    public abstract String processor();
    public abstract String screen();
    public abstract String speaker();
    
    
    public abstract String touchpanel();
    public abstract String keyboard();
    public abstract String touchpad();
    public abstract String wrap();
    */
    
    public  abstract String  getInfo();
    
    
    
    
    
    
    
    
    
}
