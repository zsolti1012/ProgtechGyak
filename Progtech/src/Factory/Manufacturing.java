/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Commom.Socket;
import Decorator.LaptopMotherboard;
import Decorator.Motherboard;
import Decorator.PhoneMotherboard;
import Decorator.TabletMotherboard;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author O.Zsolt
 */
abstract class Manufacturing {
   
       List<PhoneMotherboard> Phones;
       List<TabletMotherboard> Tablets=new ArrayList<TabletMotherboard>();
       List<LaptopMotherboard> Laptops=new ArrayList<LaptopMotherboard>();
    
       public List<PhoneMotherboard> PhoneManufacturing(int piece,PhoneMotherboard pm){
           Phones=new ArrayList<PhoneMotherboard>();
           for (int i = 0; i < piece; i++) {
               Phones.add(new PhoneMotherboard())
           }
       }
            
    

}
