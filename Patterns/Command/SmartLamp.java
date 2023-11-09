package Command;

public class SmartLamp {
    private boolean isOn;

    public SmartLamp() {
        this.isOn = false;
    }

    public String getPowerStatus() {
        return isOn ? "On" : "Off";
    }

    public boolean on() {
        this.isOn = true;
        System.out.println(this.getPowerStatus());
        return true;
    }

    public boolean off() {
        this.isOn = false;
        System.out.println(this.getPowerStatus());
        return false;
    }

}
