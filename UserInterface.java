import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartHomeHub hub = new SmartHomeHub();

        // Menambahkan perangkat ke dalam hub
        hub.addDevice(new Lamp("Living Room Lamp"));
        hub.addDevice(new Fan("Bedroom Fan"));

        while (true) {
            System.out.println("\nSmartHome Menu:");
            System.out.println("1. Turn ON device");
            System.out.println("2. Turn OFF device");
            System.out.println("3. Display device status");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1 || choice == 2) {
                System.out.print("Enter device name: ");
                String name = scanner.nextLine();
                boolean turnOn = (choice == 1);
                hub.controlDevice(name, turnOn);
            } else if (choice == 3) {
                hub.displayDevices();
            } else if (choice == 4) {
                System.out.println("Exiting SmartHome System.");
                break;
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }
        scanner.close();
    }
}
