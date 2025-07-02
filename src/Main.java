import java.util.ArrayList;

import Exceptions.InvalidDeviceOperationException;

public class Main {
    public static void main (String[] args) throws Exceptions.InvalidDeviceOperationException {
        ArrayList<SmartDevice> devices = new ArrayList<>();
        
        // Smart Device howa el interface el 3amalnah 
        SmartDevice light = new Light("Living Room Light", 50); //we used Smart Device interface here 3shan we only need the General behavior (Polymorphism)
        SmartDevice thermostat = new Thermostate("Home Thermostat");
        SmartDevice lock = new SmartLock("Front Door Lock", true);
        
        devices.add(light);
        devices.add(thermostat);
        devices.add(lock);

        /*hena i am treating different device types and classes as if they are one type
        That is why its Polymorphism 
        */
        for (SmartDevice device : devices) {
            device.turnOn(); 
            System.out.println(device.getStatus());
        }


        // Adjust temperature and brightness
        ((Thermostate) thermostat).setTemperature(22);

        try {
            ((Light) light).setBrightness(120); // invalid to throw exceptiom
        } catch (InvalidDeviceOperationException e) {
            System.out.println("Light error: " + e.getMessage());
        }

        ((SmartLock) lock).lockbtn();

        System.out.println("\n\nAfter adjustments:\n");
        for (SmartDevice device : devices) {
            System.out.println(device.getStatus());
        }

    }

    
}
