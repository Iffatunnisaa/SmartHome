// Implementasi Fan (Kipas) yang juga menggunakan SmartDevice interface
public class Fan implements SmartDevice {
    private boolean on;
    private String name;

    public Fan(String name) {
        this.name = name;
        this.on = false;
    }

    @Override
    public void turnOn() {
        on = true;
        System.out.println(name + " is turned ON.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println(name + " is turned OFF.");
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public String getName() {
        return name;
    }
}
