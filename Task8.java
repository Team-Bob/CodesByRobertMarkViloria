/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task8salarybasedonworkedhours;

/**
 *
 * @author kram
 */
public class Task8SalaryBasedOnWorkedHours {

    // Constants
    static final double HOURLY_RATE = 150.00;
    static final int REGULAR_HOURS = 40;
    static final double OVERTIME_MULTIPLIER = 1.5;

    public static void main(String[] args) {

        // First 10 employees
        String[] employees = {
            "Manuel III Garcia", "Antonio Lim", "Bianca Sofia Aquino", "Isabella Reyes", "Eduard Hernandez",
            "Andrea Mae Villanueva", "Brad San Jose", "Alice Romualdez", "Rosie Atienza", "Roderick Alvaro"
        };

        // Estimated weekly hours for each employee
        int[] hoursWorked = {
            42, 41, 40, 39, 38, 42, 40, 43, 41, 39
        };

        System.out.println("===== Weekly Salary Calculation =====\n");

        for (int i = 0; i < employees.length; i++) {
            String name = employees[i];
            int hours = hoursWorked[i];

            System.out.println("Employee: " + name);
            System.out.println("Hours Worked This Week: " + hours);

            double regularPay, overtimePay = 0, totalPay;

            if (hours <= REGULAR_HOURS) {
                regularPay = hours * HOURLY_RATE;
                totalPay = regularPay;
                System.out.println("  Regular Hours: " + hours);
                System.out.println("  Overtime Hours: 0");
            } else {
                int overtimeHours = hours - REGULAR_HOURS;
                regularPay = REGULAR_HOURS * HOURLY_RATE;
                overtimePay = overtimeHours * HOURLY_RATE * OVERTIME_MULTIPLIER;
                totalPay = regularPay + overtimePay;

                System.out.println("  Regular Hours: " + REGULAR_HOURS);
                System.out.println("  Overtime Hours: " + overtimeHours);
            }

            System.out.printf("  Regular Pay: Php %.2f\n", regularPay);
            if (overtimePay > 0) {
                System.out.printf("  Overtime Pay: Php %.2f\n", overtimePay);
            }
            System.out.printf("  Total Weekly Pay: Php %.2f\n", totalPay);
            System.out.println("-------------------------------------\n");
        }
    }
}

