/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author O.Zsolt
 */
public class Factory {
    public Factory getFactory(String DeviceType){ 
        if(DeviceType==null)
        {
            return null;
        }
        if (DeviceType=="PHONE"){
            return new Phone();
        }
        
        return null;
    }
}
