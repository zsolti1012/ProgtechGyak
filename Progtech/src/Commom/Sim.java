/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commom;

/**
 *
 * @author O.Zsolt
 */
public class Sim {
    private Simtypes simtype;
    
    public Sim(Simtypes simtype){
        this.simtype=simtype;
    }

    public void setSimtype(Simtypes simtype) {
        this.simtype = simtype;
    }

    public Simtypes getSimtype() {
        return simtype;
    }
    
    public String GetSim(){
        return String.valueOf(simtype);
    }
    
    public Sim DeepCopy()
 {
 Sim clone = new Sim(getSimtype());
 clone.setSimtype(getSimtype());
 
 return clone;
 }
    
    
}
