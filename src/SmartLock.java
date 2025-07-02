public class SmartLock extends AbstractSmartDevice {
    
    private boolean locked; 

    public SmartLock(String name, boolean initialLockedState) {
            super(name);
            this.locked = initialLockedState; 
        }
    
    public boolean isLocked() {
        return locked;
    }

    public void lockbtn() {
        if (!locked) {
            locked = true;
            System.out.println(getName() + " is now LOCKED.");
        } else {
            System.out.println(getName() + " is already LOCKED.");
        }
    }

    public String getStatus() {
        return getName() + " is " + (locked ? "LOCKED" : "UNLOCKED") + ".";
    }


    
}
