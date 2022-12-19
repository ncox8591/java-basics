/*  Intro to Java Programming and Data Structures by Y. Daniel Liang
 *  Chapter 3 Selections
 * 
 *  Exercise 3.17 (Game: scissor, rock, paper) Write a program that plays the 
 *  popular scissor-rock-paper game. The program randomly generates a number 
 *  0, 1, or 2 representing scissor, rock, and paper. The program prompts the
 *  user to enter a number 0, 1, or 2 and displays a message indicating whether
 *  the user or computer wins, loses, or draws. Here are sample runs:
 * 
 *  scissor (0), rock (1), paper (2): 1
 *  The computer is scissor. You are rock. You won.
 *  
 *  scissor (0), rock (1), paper (2): 1
 *   The computer is paper. You are paper too. It is a draw.
 * 
 */
package exercise3_17;

// Import Scanner class
import java.util.Scanner;

// Main Class
public class Exercise3_17 {

    // Main Method
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Generate a random number 0 - 2
        int computerChoice = (int)(Math.random() * 3);
        
        // Check if computer choice is greater than 2 and assign it to 2
        if (computerChoice >= 3)
            computerChoice = 2;
        
        // Prompt user for choice
        System.out.println("""
                           Rock beats scissors. Scissors beats paper. Paper beats rock. 
                            Beat the computer. Choose (0) rock, (1) scissors(2) paper: """);
        int userChoice = input.nextInt();
        
        // Display computer choice
        System.out.println("Computer's choice: " + computerChoice);
        
        // If computer and user choices match, output Draw
        if (computerChoice == userChoice)
            System.out.println("DRAW.");
        
        //Switch and Cases for output
        switch (userChoice) {               // userChoice value determines case
            case 2:
                if (computerChoice == 1) {  // If computerChoice is 1
                    System.out.println("Scissors beat paper. Computer wins.");
                }   if (computerChoice == 0) {  //If computerChoice is 0
                    System.out.println("Paper beat rock. You win.");
                }   break;
            case 1:
                if (computerChoice == 2) {  // If computerChoice is 2
                    System.out.println("Scissors beat paper. You win.");
                }   if (computerChoice ==0) {     // If computerChoice is 0
                    System.out.println("Rock beat scissors. Computer wins.");
                }   break;
            case 0:
                if (computerChoice == 1) {  // If computerChoice is 1
                    System.out.println("Rock beat scissors. You win.");
                }   if (computerChoice == 2) {  // If computerChoice is 2
                    System.out.println("Paper beat rock. Computer wins.");
                }   break;
            default:
                break;
        } // End Switch

    } // End Main Method
    
} // End Main Class
