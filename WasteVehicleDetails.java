import java.util.Scanner;

public class WasteVehicleDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter vehicle number: ");
        int vehicleNumber = scanner.nextInt();

        System.out.print("Enter waste collected (kg): ");
        double wasteCollected = scanner.nextDouble();

        System.out.print("Enter number of collection points: ");
        int collectionPoints = scanner.nextInt();

        System.out.print("Enter vehicle status: ");
        char vehicleStatus = scanner.next().charAt(0);

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected (kg): " + wasteCollected);
        System.out.println("Number of Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);

        scanner.close();
    }
}