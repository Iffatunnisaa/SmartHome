public class Lamp implements SmartDevice {
    private String name;
    private boolean on;

    public Lamp(String name) {
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
