import Exceptions.InvalidDeviceOperationException;

public class Thermostate extends AbstractSmartDevice {

    private int temperature;

    public Thermostate(String name) {
        super(name);
        this.temperature = 28; // Default temperature
    }

    @Override
    public void turnOn() {
        System.out.println(getName() + " is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println(getName() + " is now OFF.");
    }

    @Override
    public String getStatus() {
        return getName() + " is set to " + temperature + "°C.";
    }

    public void setTemperature(int temperature) throws InvalidDeviceOperationException{
        if (temperature < 0 || temperature > 60 ) {
            throw new InvalidDeviceOperationException("Temperature must be between 0 and 60 degrees Celsius.");
        }
        this.temperature = temperature;
        System.out.println(getName() + " temperature set to " + temperature + "°C.");
    }
    
}
