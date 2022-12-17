/* Intro to Java Programming and Data Structures by Y. Daniel Liang
 * Chapter 3 Selections
 * 
 * Exercise 3.4 (Random month) Write a program that randomly generates an 
 * integer between 1 and 12 and displays the English month names January, 
 * February, . . ., December for the numbers 1, 2, . . ., 12 accordingly.
 * 
 */

package exercise3_4;

// Main Class
public class Exercise3_4 {

    // Main Method
    public static void main(String[] args) {
        //Generate a random number between 1 and 12
        int randomNumber = (int)(Math.random() * 12 + 1);
        
        //Display generated random number to user
        System.out.println("Random number generated: " + randomNumber);
        
        // Switch and cases
        // If randomNumber's value matches a case 1-12, display according result
        switch (randomNumber) {
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;            
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December");
        } // End Switch
        
    } // End Main Method
    
} // End Main Class