/* Intro to Java Programming and Data Structures by Y. Daniel Liang
 * Chapter 2 Elementary Programming
 * 
 * Exercise 2.6 (Sum the digits in an integer) Write a program that reads an 
 * integer between 0 and 1000 and adds all the digits in the integer. For 
 * example, if an integer is 932, the sum of all its digits is 14. 
 * Hint: Use the % operator to extract digits, and use the / operator to remove
 * the extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93. Here is
 * a sample run:
 *
 *  Enter a number between 0 and 1000: 999
 *  The sum of the digits is 27
 * 
 */
package exercise2_6;

//Import Scanner class
import java.util.Scanner;

//Main Class
public class Exercise2_6 {

    public static void main(String[] args) {
        
    //Create Scanner object
    Scanner input = new Scanner(System.in);
    
    //Input
    System.out.println("Enter an integer between 0 and 1000: ");
    int userInteger = input.nextInt();

/*   PROCESS
 *   This comment block contains another option for extracting the digits within
 *   the user's integer.
 *   
 *   int digit1 = userInteger % 10;
 *   int digit2 = (userInteger / 10) % 10;
 *   int digit3 = (userInteger / 10 / 10) % 10;
 *   int digit4 = (userInteger / 10 / 10 / 10) % 10;
 *
 *   sumOfIntegerDigits = digit1 + digit2 + digit3 + digit4;
 */    

    int digitInOnesPlace = userInteger % 10; //extract digit in ones place
    userInteger /= 10; //divide integer by 10 to push tens place digit into ones place
    
    int digitInTensPlace = userInteger % 10; //extract tens place digit, now in ones place
    userInteger /= 10; //divide integer by 10 to push hundreds place digit into ones place
    
    int digitInHundredsPlace = userInteger %10; //extract hundreds place digit, now in ones place
    userInteger /= 10; //divide integer by 10 to push thousands place digit into ones place
    
    int digitInThousandsPlace = userInteger % 10; //extract thousands place digit, now in ones place

    //Calculate the sum of all the extracted digits
    int sumOfDigits = digitInOnesPlace + digitInTensPlace + digitInHundredsPlace 
            + digitInThousandsPlace;
    
    //Output the process calculation results
    System.out.println("The sum of the integer's digits is: " + sumOfDigits);
    } // End Main Method
    
} // End Main Class
