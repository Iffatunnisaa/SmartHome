import java.util.ArrayList;
import java.util.List;

// Hub untuk mengontrol semua perangkat
public class SmartHomeHub {
    private List<SmartDevice> devices;

    public SmartHomeHub() {
        this.devices = new ArrayList<>();
    }

    // Menambahkan perangkat pintar ke sistem
    public void addDevice(SmartDevice device) {
        devices.add(device);
        System.out.println(device.getName() + " added to SmartHomeHub.");
    }

    // Mengontrol perangkat berdasarkan nama
    public void controlDevice(String deviceName, boolean turnOn) {
        for (SmartDevice device : devices) {
            if (device.getName().equalsIgnoreCase(deviceName)) {
                if (turnOn) {
                    device.turnOn();
                } else {
                    device.turnOff();
                }
                return;
            }
        }
        System.out.println("Device " + deviceName + " not found.");
    }

    // Menampilkan status perangkat
    public void displayDevices() {
        System.out.println("\nSmart Home Devices:");
        for (SmartDevice device : devices) {
            System.out.println("- " + device.getName() + " (Status: " + (device.isOn() ? "ON" : "OFF") + ")");
        }
    }
}
