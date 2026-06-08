/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question01;

/**
 *
 * @author Administrator
 */
public class DeliveryChargeTest {
    
    public static void main(String[] args) {
        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        System.out.println("=== Delivery Charge Calculator ===");
        System.out.println("1. Only Base Charge: Rs. " + calculator.calculateCharge(300.0));
        System.out.println("2. Base + Distance (5km): Rs. " + calculator.calculateCharge(300.0, 5.0));
        System.out.println("3. Base + Distance (5km) + Weight (2kg): Rs. " + calculator.calculateCharge(300.0, 5.0, 2.0));
        System.out.println("4. Base + Express Delivery: Rs. " + calculator.calculateCharge(300.0, true));
    }

}
