/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commom;

import java.net.Socket;

/**
 *
 * @author O.Zsolt
 */
public class Memory {
    private double frequency;
    private Socket socket;
    private double sizemb;

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setSizemb(double sizemb) {
        this.sizemb = sizemb;
    }

    public double getSizemb() {
        return sizemb;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
    }

    
    
    public Memory DeepCopy(){
        Memory clone=new Memory();
        clone.sizemb=sizemb;
        clone.frequency=frequency;
        clone.socket=socket;
        
        
        
        return clone;
    }
}
