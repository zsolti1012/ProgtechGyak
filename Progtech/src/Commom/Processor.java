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
    private int seeds;
    private int frequency;
    private Sockets socket;

    public void setSocket(Sockets socket) {
        this.socket = socket;
    }

    public Sockets getSocket() {
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

    public int getFrequency() {
        return frequency;
    }
    
     public Processor DeepCopy()
 {
 Processor clone = new Processor();
 clone.frequency=frequency;
 clone.seeds=seeds;
 clone.socket=socket;
 
 return clone;
 }
}
