/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question02;

/**
 *
 * @author Administrator
 */

    public class VehicleRentalTest {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car("CAS-1122", "Toyota", 5, 8000.0);
        Vehicle vehicle2 = new Bike("BCC-5566", "Yamaha", 10, 300.0);

        System.out.println("=== Vehicle Rental Details ===");
        
        System.out.println("\n--- Testing Car ---");
        vehicle1.displayVehicleInfo();
        System.out.println("Total Cost: Rs. " + vehicle1.calculateRentalCost());

        System.out.println("\n--- Testing Bike ---");
        vehicle2.displayVehicleInfo();
        System.out.println("Total Cost: Rs. " + vehicle2.calculateRentalCost());
    }
}

