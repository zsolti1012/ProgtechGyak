/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commom;

import Exceptions.NotvalidProcessor;
import jdk.net.Sockets;

/**
 *
 * @author O.Zsolt
 */
public class Processor {
    public Processor(int seeds,double frequency,Socket socket){
        setSeeds(seeds);
        setFrequency(frequency);
        setSocket(socket);
    }
    
    
    public String getProcessor(){
       return String.valueOf(seeds)+"seeds,"+String.valueOf(frequency)+"mb processor";
    }
    private int seeds;
    private double frequency;
    private Socket socket;

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
    }
    
    
           

    public void setSeeds(int seeds) {
        if(seeds%2!=0) throw  new NotvalidProcessor();
        if(0>=seeds ||seeds>=50) throw new NotvalidProcessor();
        this.seeds = seeds;
    }

    public int getSeeds() {
        return seeds;
    }

    public void setFrequency(double frequency) {
        if(0>=frequency||frequency>=60000) throw new NotvalidProcessor();
        this.frequency = frequency;
    }

    public double getFrequency() {
        return frequency;
    }
    
     public Processor DeepCopy()
 {
 Processor clone = new Processor(getSeeds(),getFrequency(),getSocket());
 clone.setFrequency(getFrequency());
 clone.setSeeds(getSeeds());
 clone.setSocket(getSocket());
 
 return clone;
 }
}
