/* Intro to Java Programming and Data Structures by Y. Daniel Liang <br/>
 * Chapter 3 Selections
 * 
 * Exercise 3.24 (Game: pick a card) Write a program that simulates picking a 
 * card from a deckof 52 cards. Your program should display the rank (Ace, 2, 3,
 * 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, 
 * Spades) of the card. Here is a sample run of the program:
 * 
 * The card you picked is Jack of Hearts
 */
package exercise3_24;

//Import Scanner class
import java.util.Scanner;

// Main Class
public class Exercise3_24 {

    // Main Method
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Calculate a random number between 0 and 12
        int randomRank = (int)(Math.random() * 13);
        if (randomRank >= 13)   // If the random number is >= 13,
            randomRank = 12;    // then set randomRank to 12
        
        // Calculate a random number between 0 and 3
        int randomSuit = (int)(Math.random() * 4);
        if (randomSuit >= 4)    // If the random number is >= 4,
            randomSuit = 3;     // then set randomSuit to 3
        
        // Output
        System.out.print("The card you picked is ");
        
        // Assign a card rank output to switch cases based on randomRank value
        switch (randomRank) {
            case 0: System.out.print("Ace"); break;
            case 1: System.out.print("2"); break;
            case 2: System.out.print("3"); break;
            case 3: System.out.print("4"); break;
            case 4: System.out.print("5"); break;
            case 5: System.out.print("6"); break;
            case 6: System.out.print("7"); break;
            case 7: System.out.print("8"); break;
            case 8: System.out.print("9"); break;
            case 9: System.out.print("10"); break;
            case 10: System.out.print("Jack"); break;
            case 11: System.out.print("Queen"); break;
            case 12: System.out.print("King"); break;            
        }
        
        // Continued output
        System.out.print(" of ");

        // Assign a card suit output to switch cases based on randomSuit value
        switch (randomSuit) {
            case 0: System.out.print("Clubs\n"); break;
            case 1: System.out.print("Diamonds\n"); break;
            case 2: System.out.print("Hearts\n"); break;
            case 3: System.out.print("Spades\n"); break;
        }
        
    } // End Main Method
    
} // End Main Class
