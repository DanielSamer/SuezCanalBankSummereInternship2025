public class Thermostate extends AbstractSmartDevice {

    private int temperature;

    public Thermostate(String name) {
        super(name);
        this.temperature = 20; // Default temperature
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

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println(getName() + " temperature set to " + temperature + "°C.");
    }
    
}
