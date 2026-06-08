/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question01;

/**
 *
 * @author Administrator
 */
public class StudentAverageTest {
    public static void main(String[] args) {
        StudentAverageCalculator calculator = new StudentAverageCalculator(450, 0);

        try {
            // ArithmeticException occurs here because dividing an integer by zero is mathematically undefined in Java.
            int average = calculator.calculateAverage();
            System.out.println("Average Mark: " + average);
        } catch (ArithmeticException e) {
            System.out.println("Error: Number of students cannot be zero.");
        } finally {
            System.out.println("Average calculation completed.");
        }

        System.out.println("Program continues...");
    }
}