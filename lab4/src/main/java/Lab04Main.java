/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */

    public class Lab04Main {
    public static void main(String[] args) {
        
        StaffMember.showSystemName();
        UniversityPolicy.showPolicyHeader();
        System.out.println("University: " + UniversityPolicy.UNIVERSITY_NAME);
        System.out.println("------------------------------------------");

        Lecturer lec1 = new Lecturer("Dr. Kamalsiri", "L-001", "Computing", 4, 15000.0);
        Lecturer lec2 = new Lecturer("Prof. Nimal", "L-002", "Engineering", 3, 20000.0);
        LabAssistant labAsst = new LabAssistant("Sunil Perera", "LA-505", "Science", 40, 1200.0);

        System.out.println("\n>>> Updating Dr. Kamalsiri's Department...");
        lec1.changeDepartment("Data Science");
        System.out.println("------------------------------------------");

        System.out.println("\n--- Displaying All Staff Members ---");
        
        lec1.displayLecturerDetails();
        double pay1 = lec1.calculateMonthlyPayment();
        System.out.println("Monthly Payment: Rs. " + pay1);
        System.out.println("Bonus Estimate: Rs. " + UniversityPolicy.calculateBonus(pay1));
        lec1.showCommonNotice();
        System.out.println();

        lec2.displayLecturerDetails();
        double pay2 = lec2.calculateMonthlyPayment();
        System.out.println("Monthly Payment: Rs. " + pay2);
        System.out.println("Bonus Estimate: Rs. " + UniversityPolicy.calculateBonus(pay2));
        lec2.showCommonNotice();
        System.out.println();

        labAsst.displayLabAssistantDetails();
        double pay3 = labAsst.calculateMonthlyPayment();
        System.out.println("Monthly Payment: Rs. " + pay3);
        System.out.println("Bonus Estimate: Rs. " + UniversityPolicy.calculateBonus(pay3));
        labAsst.showCommonNotice();
        System.out.println("------------------------------------------");

        double totalPayment = pay1 + pay2 + pay3;
        System.out.println("\nTotal Monthly Payment for All Staff: Rs. " + totalPayment);
        System.out.println("Total Created Staff Objects: " + StaffMember.getStaffCount());
    }

}
