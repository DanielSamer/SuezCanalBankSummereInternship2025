public abstract class AbstractSmartDevice implements SmartDevice {
    private boolean isOn;
    private String name;

    public AbstractSmartDevice(String name) {
        this.name = name;
        this.isOn = false; // Default state is OFF
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println(name + " is now ON.");
        } else {
            System.out.println(name + " is already ON.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println(name + " is now OFF.");
        } else {
            System.out.println(name + " is already OFF.");
        }
    }

    public boolean isOn() {
        return isOn;
    }
    
    public String getName() {
        return name;
    }

    public abstract String getStatus(); // han implement deh fy kol class lwa7do 


 
}