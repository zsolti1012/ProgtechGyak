/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commom;

//import java.net.Socket;
import Exceptions.NotvalidMemory;
import jdk.net.Sockets;

/**
 *
 * @author O.Zsolt
 */
public class Memory {
    
    public Memory(double frequency,Socket socket,double sizemb){
        setFrequency(frequency);
        setSocket(socket);
        setSizemb(sizemb);
    }
    private double frequency;
    private Socket socket;
    private double sizemb;
    
    public String getMemory(){
        return String.valueOf(sizemb)+  "mb Memory"; 
    }
    
    public void setFrequency(double frequency) {
        if(0>=frequency ||frequency>=2000) throw new NotvalidMemory();
        else this.frequency = frequency;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setSizemb(double sizemb) {
        if(0>=sizemb ||sizemb>=50000) throw new NotvalidMemory();
        else this.sizemb = sizemb;
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
        Memory clone=new Memory(getFrequency(),getSocket(),getSizemb());
        clone.setSizemb(getSizemb());
        clone.setFrequency(getFrequency());
        clone.setSocket(getSocket());
        
        
        
        return clone;
    }
}
