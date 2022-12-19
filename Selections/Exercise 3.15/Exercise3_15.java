/* Intro to Java Programming and Data Structures by Y. Daniel Liang
 * Chapter 3 Selections
 * 
 * Exercise 3.15 (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a 
 * lottery of a three-digit integer. The program promopts the user to enter a 
 * three-digit integer and determines whether the user wins according to the 
 * following rules: 
 * 
 * 1. If the user input matches the lottery number in the exact order, the award 
 * is $10,000
 * 2. If all digits in the user input match all digits in the lottery number, 
 * the award is $3,000
 * 3. If one digit in the user input matches a digit in the lottery number, 
 * the award is $1,000
 */
package exercise3_15;

// Import Scanner class
import java.util.Scanner;

// Main Class
public class Exercise3_15 {

    // Main Method
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Generate a lottery number
        int lottery = (int)(Math.random() * 1000);
        
        // Get lottery digits
        int lotteryDigit3 = lottery % 10;
        int lotteryDigit2 = lottery / 10 % 10;
        int lotteryDigit1 = lottery / 100 % 10;
        
        // Prompt user for lottery input
        System.out.println("Enter your lottery pick (3 digits): ");
        int userGuess = input.nextInt();
        
        // Get Guess digits
        int guessDigit3 = userGuess % 10;
        int guessDigit2 = userGuess / 10 % 10;
        int guessDigit1 = userGuess / 100 % 10;
        
        System.out.println("The lottery number is: " + lotteryDigit1 + lotteryDigit2 + lotteryDigit3);
        
        if (userGuess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if ((lotteryDigit3 == guessDigit3 || lotteryDigit3 == guessDigit2 || lotteryDigit3 == guessDigit1) 
            && (lotteryDigit2 == guessDigit3 || lotteryDigit2 == guessDigit2 || lotteryDigit2 == guessDigit1)
            && (lotteryDigit1 == guessDigit3 || lotteryDigit1 == guessDigit2 || lotteryDigit1 == guessDigit1)) {
            System.out.println("All digits match: you win $3,000");
        } 
        else if ((lotteryDigit3 == guessDigit3 || lotteryDigit3 == guessDigit2 || lotteryDigit3 == guessDigit1) 
            || (lotteryDigit2 == guessDigit3 || lotteryDigit2 == guessDigit2 || lotteryDigit2 == guessDigit1)
            || (lotteryDigit1 == guessDigit3 || lotteryDigit1 == guessDigit2 || lotteryDigit1 == guessDigit1)) {
            System.out.println("A digit matches: you win $1,000");
        } else
            System.out.println("You did not win.");
        
    } // End Main Method
    
} // End Main Class
