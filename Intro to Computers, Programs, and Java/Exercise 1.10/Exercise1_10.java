/* Intro to Java Programming and Data Structures by Y. Daniel Liang
 * Chapter 1 Introduction to Computers, Programs, and Java
 * 
 * Exercise 1.10 (Average speed in miles) Assume that a runner runs 14
 * kilometers in 45 minutes and 30 seconds. Write a program that displays
 * the average speed in miles per hour.
 * (Note 1 mile is equal to 1.6 kilometers.)
 */
package exercise1_10;

// Class Definition and Block
public class Exercise1_10 {

    // Main Method Block
    public static void main(String[] args) {
        // Statements to display formula steps and calculation results
        System.out.println("14 kilometers / 1.6 = " + (14/1.6) + " miles.");
        System.out.println("45.5 minutes is " + (45.5/60) + " hours.");
        System.out.println((14 / 1.6) + " miles over " 
                          + (45.5/60) + " hours is "
                          + ((14 / 1.6) / (45.5/60)) + " MPH.");
    } // End Main Method Block
    
} // End Class Block
