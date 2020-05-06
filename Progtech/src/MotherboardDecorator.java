/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author O.Zsolt
 */
public class MotherboardDecorator extends Motherboard{

    private Motherboard _motherboard;
    
    @Override
    public String battery() {
        return _motherboard.battery();
    }

    @Override
    public String camera() {
        return _motherboard.camera();
    }

    @Override
    public String memory() {
        return _motherboard.memory();
    }

    @Override
    public String microphone() {
        return _motherboard.microphone();
    }

    @Override
    public String processor() {
        return _motherboard.processor();
    }

    @Override
    public String screen() {
     return _motherboard.screen();
    }

    @Override
    public String speaker() {
        return _motherboard.speaker();
    }

    @Override
    public String touchpanel() {
        return _motherboard.touchpanel();
    }

    @Override
    public String keyboard() {
     return _motherboard.keyboard();
    }

    @Override
    public String touchpad() {
     return _motherboard.touchpad();
    }

    @Override
    public String wrap() {
    return _motherboard.wrap();
    }
}
