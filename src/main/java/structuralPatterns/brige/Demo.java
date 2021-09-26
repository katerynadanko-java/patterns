package structuralPatterns.brige;

import structuralPatterns.brige.remotes.AdvancedRemote;
import structuralPatterns.brige.remotes.BasicRemote;
import structuralPatterns.brige.devices.Device;
import structuralPatterns.brige.devices.Radio;
import structuralPatterns.brige.devices.Tv;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
