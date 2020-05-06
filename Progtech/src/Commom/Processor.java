/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commom;

import jdk.net.Sockets;

/**
 *
 * @author O.Zsolt
 */
public class Processor {
    public Processor(int seeds,double frequency,Socket socket){
        this.seeds=seeds;
        this.frequency=frequency;
        this.socket=socket;
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
        this.seeds = seeds;
    }

    public int getSeeds() {
        return seeds;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public double getFrequency() {
        return frequency;
    }
    
     public Processor DeepCopy()
 {
 Processor clone = new Processor(getSeeds(),getFrequency(),getSocket());
 clone.frequency=frequency;
 clone.seeds=seeds;
 clone.socket=socket;
 
 return clone;
 }
}
