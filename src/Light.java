public class Light extends AbstractSmartDevice {
    private int brightness;

    public Light(String name, int initialBrightness) {
        super(name);
        this.brightness = initialBrightness;
    } 

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if (brightness < 0 || brightness > 100) {
            System.out.println("Brightness must be between 0 and 100.");
        } else {
            this.brightness = brightness;
            System.out.println(getName() + " brightness set to " + brightness + "%.");
        }
    }

    public String getStatus() {
        return getName() + " is " + (isOn() ? "ON" : "OFF") + " with brightness at " + brightness + "%.";
    }


    
}
