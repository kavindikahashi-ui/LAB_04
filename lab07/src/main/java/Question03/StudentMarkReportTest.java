/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question03;

/**
 *
 * @author Administrator
 */
public class StudentMarkReportTest {
    public static void main(String[] args) {
        String[] marks = {"78", "82", "absent", "90"};
        StudentMarkReport report = new StudentMarkReport(marks);

        try {
            // ArrayIndexOutOfBoundsException occurs here because index 6 is outside the bounds of the array (array size is 4, valid indexes are 0 to 3).
            report.getMarkAt(6);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Selected mark position does not exist.");
        } finally {
            System.out.println("Array access checking completed.");
        }

        try {
            // NumberFormatException occurs here because the text value "absent" at index 2 cannot be parsed into a valid integer.
            report.getMarkAt(2);
        } catch (NumberFormatException e) {
            System.out.println("Error: Selected mark is not a valid number.");
        } finally {
            System.out.println("Number conversion checking completed.");
        }

        System.out.println("Report checking completed.");
    }
}