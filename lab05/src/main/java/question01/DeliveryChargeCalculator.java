/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question01;

/**
 *
 * @author Administrator
 */
public class DeliveryChargeCalculator {
   

    private static final double DISTANCE_RATE = 100.0;
    private static final double WEIGHT_RATE = 50.0;
    private static final double EXPRESS_CHARGE = 500.0;

    public double calculateCharge(double baseCharge) {
        return baseCharge;
    }

    public double calculateCharge(double baseCharge, double distanceKm) {
        return baseCharge + (distanceKm * DISTANCE_RATE);
    }

    public double calculateCharge(double baseCharge, double distanceKm, double weightKg) {
        return baseCharge + (distanceKm * DISTANCE_RATE) + (weightKg * WEIGHT_RATE);
    }

    public double calculateCharge(double baseCharge, boolean expressDelivery) {
        if (expressDelivery) {
            return baseCharge + EXPRESS_CHARGE;
        } else {
            return baseCharge;
        }
    }
}

