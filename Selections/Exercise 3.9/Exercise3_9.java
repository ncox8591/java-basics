/* Intro to Java Programming and Data Structures by Y. Daniel Liang
 * Chapter 3 Selections
 * 
 * Exercise 3.9 (Business: check ISBN-10) An ISBN-10 consists of 10 digits: 
 * d1d2d3d4d5d6d7d8d9d10. The last digit d10 is a checksum, which is calculated 
 * from the other 9 digits using the ollowing formula: 
 * (d1 x 1 + d2 x 2 + d3 x 3 + d4 x 4 + d5 x 5 + 
 * d6 x 6 + d7 x 7 + d8 x 8 + d9 x 9) % 11
 * If the checksum is 10, the last digit is denoted as X according to the 
 * ISBN-10 convention. Write a program that prompts the user to enter the 
 * first 9 digits and displays the 10-digit ISBN (including leading zeros). 
 * Your program should read the input as an integer. Here are sample runs:
 *     
 * Enter the first 9 digits of an ISBN as integer: 013601267
 * The ISBN-10 number is 0136012671
 *     
 * Enter the first 9 digits of an ISBN as integer: 013031997
 * The ISBN-10 number is 013031997X
 */
package exercise3_9;

//Import Scanner class
import java.util.Scanner;

//Main Class
public class Exercise3_9 {

    //Main Method
    public static void main(String[] args) {

    //Create Scanner object
    Scanner input = new Scanner(System.in);

    // Prompt user for ISBN input 
    System.out.println("Enter the first 9 digits of an ISBN as an integer: ");
    int inputISBN = input.nextInt();

    // Set digit in ones place as digit 9 and divide input ISBN by 10
    int d9 = inputISBN % 10;
    inputISBN /= 10;

    // Set digit in ones place as digit 8 and divide input ISBN by 10
    // Repeat this process through all 9 digits
    int d8 = inputISBN % 10;
    inputISBN /= 10;   

    int d7 = inputISBN % 10;
    inputISBN /= 10;

    int d6 = inputISBN % 10;
    inputISBN /= 10;

    int d5 = inputISBN % 10;
    inputISBN /= 10;   

    int d4 = inputISBN % 10;
    inputISBN /= 10;

    int d3 = inputISBN % 10;
    inputISBN /= 10;

    int d2 = inputISBN % 10;
    inputISBN /= 10; 

    int d1 = inputISBN % 10;

    // Fill checksum formula with digit variables
    int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + 
    d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

    // Output the checksum
    System.out.println("The checksum is: " + checksum);

    // Output the ISBN-10
    System.out.print("ISBN-10: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);

    //If the checksum is 10, print X else print the checksum
    if (checksum == 10)
        System.out.print("X \n");
    else
        System.out.print(checksum + "\n");
    }//End Main Method
    
}//End Main Class