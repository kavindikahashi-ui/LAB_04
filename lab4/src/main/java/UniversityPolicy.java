/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */

  public final class UniversityPolicy {
    
    public static final String UNIVERSITY_NAME = "State University of Computing";
    public static final double BONUS_RATE = 0.05;

    public static void showPolicyHeader() {
        System.out.println("===== UNIVERSITY PAYMENT POLICY =====");
    }

    public static double calculateBonus(double monthlyPayment) {
        return monthlyPayment * BONUS_RATE;
    }
}  

