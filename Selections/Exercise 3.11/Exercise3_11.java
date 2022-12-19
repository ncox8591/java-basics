/* Intro to Java Programming and Data Structures by Y. Daniel Liang
 * Chapter 3 Selections
 * 
 * Exercise 3.11 (Find the number of days in a month) Write a program that 
 * prompts the user to enter the month and year and displays the number of days 
 * in the month. For example, if the user entered month 2 and year 2012, the 
 * program should display that February 2012 has 29 days. If the user entered
 * month 3 and year 2015, the program should display that March 2015 has 31 
 * days. 
 */
package exercise3_11;

// Import Scanner class
import java.util.Scanner;

// Main Class
public class Exercise3_11 {

    // Main Method
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Constant variables for # of days in a year
        final int JAN_DAYS = 31;
        final int MAR_DAYS = 31;
        final int APR_DAYS = 30;
        final int MAY_DAYS = 31;
        final int JUN_DAYS = 30;
        final int JUL_DAYS = 31;
        final int AUG_DAYS = 31;
        final int SEP_DAYS = 30;
        final int OCT_DAYS = 31;
        final int NOV_DAYS = 30;
        final int DEC_DAYS = 31;
        // February has 29 days in a leap year and 28 days regularly (2 variables)
        final int FEB_NOTLEAP_DAYS = 28;
        final int FEB_LEAPYEAR_DAYS = 29;
        
        //Prompt user for month and year
        System.out.println("Enter month and year by integer: ");
        int userMonth = input.nextInt();
        int userYear = input.nextInt();
        
        // Calculate if userYear is a leap year
        boolean isLeapYear = (userYear % 4 == 0 && userYear % 100 != 0) || 
                (userYear % 400 == 0);
        
        // If the userYear is a leap year, update userMonth to 13 for switch case
        if (isLeapYear)
            userMonth = 13;
        
        //Switch and cases for each month + case 13 for February in event of a leap year
        switch (userMonth) {
            case 1: System.out.println("January " + userYear + " has " + JAN_DAYS + " days."); break;
            case 2: System.out.println("February " + userYear + " has " + FEB_NOTLEAP_DAYS + " days."); break;
            case 3: System.out.println("March " + userYear + " has " + MAR_DAYS + " days."); break;
            case 4: System.out.println("April " + userYear + " has " + APR_DAYS + " days."); break;
            case 5: System.out.println("May " + userYear + " has " + MAY_DAYS + " days."); break;
            case 6: System.out.println("June " + userYear + " has " + JUN_DAYS + " days."); break;
            case 7: System.out.println("July " + userYear + " has " + JUL_DAYS + " days."); break;
            case 8: System.out.println("August " + userYear + " has " + AUG_DAYS + " days."); break;
            case 9: System.out.println("September " + userYear + " has " + SEP_DAYS + " days."); break;
            case 10: System.out.println("October " + userYear + " has " + OCT_DAYS + " days."); break;
            case 11: System.out.println("November " + userYear + " has " + NOV_DAYS + " days."); break;
            case 12: System.out.println("December " + userYear + " has " + DEC_DAYS + " days."); break;
            case 13: System.out.println("February " + userYear + " is a leap year and has " + FEB_LEAPYEAR_DAYS + " days."); break;
        } // End Switch
        
    } // End Main Method
    
} // End Main Class
