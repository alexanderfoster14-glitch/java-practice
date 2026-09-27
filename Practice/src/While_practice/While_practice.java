//Practice with While Loops
package While_practice;

import java.util.Scanner;

public class While_practice {
   public static void main (String [] args) { 
      Scanner scnr = new Scanner(System.in);
      final String SALARY_PROMPT = "\nEnter annual salary (0 to exit): ";
      int annualSalary;
      int deduction;
      int totalDeductions;
      double taxRate;
      int taxToPay;

      System.out.println(SALARY_PROMPT);
      annualSalary = scnr.nextInt();

      while (annualSalary > 0) {
         // FIXME: Add a while loop to gather deductions. Use the variables
         // deduction and totalDeductions for deduction handling.
         // End the inner while loop when a deduction <= 0 is entered.
         
         totalDeductions = 0;
         
         System.out.print("Enter a deduction. Enter 0 for no deduction or to end deductions.");
         
         deduction = scnr.nextInt();
         while (deduction > 0) {
            totalDeductions = totalDeductions + deduction;
            System.out.print("Enter next deduction. Enter 0 to end deductions.");
            deduction = scnr.nextInt();
         }
         // Determine the tax rate from the annual salary
         if (annualSalary <= 20000) {
            taxRate = 0.10;        // 0.10 is 10% written as a decimal
         }
         else if (annualSalary <= 50000) {
            taxRate = 0.20;
         }
         else if (annualSalary <= 100000) {
            taxRate = 0.30;
         }
         else {
            taxRate = 0.40;
         }

         taxToPay = (int)(annualSalary * taxRate);   // Truncate tax to an integer amount
         System.out.println("Annual salary: " + annualSalary); 
         System.out.println("Tax rate: " + taxRate);
         System.out.println("Tax to pay: " + taxToPay);

         // Get the next annual salary
         System.out.println(SALARY_PROMPT);
         annualSalary = scnr.nextInt();
      }
   } 
} 