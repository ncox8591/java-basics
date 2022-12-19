/* Intro to Java Programming and Data Structures by Y. Daniel Liang <br/>
 * Chapter 3 Selections
 * 
 * Exercise 3.8 (Sort three integers) Write a program that prompts the user to 
 * enter these integers and display the integers in non-decreasing order.
 */

package exercise3_8;

//Import Scanner class
import java.util.Scanner;

// Main Class
public class Exercise3_8 {

    // Main Method
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt user for input
        System.out.println("Enter three integers: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        int firstInt = 0;
        int secondInt = 0;
        int thirdInt = 0;
        
        //Sort in non-decreasing order (this programs sorts in increasing order)
        
        if (x <= y) {
            if (x <= z) { //       if x is less than or equal to y and z
                firstInt = x;
                if (y <= z) { //   if y is less than or equal to z
                    secondInt = y;
                    thirdInt = z;
                } else { //        otherwise flip the assignments
                    secondInt = z;
                    thirdInt = y;
                }
            }
        }
        
        if (y <= x) {
            if (y <= z) { //       if y is less than or equal to x and z
                firstInt = y;
                if (x <= z) { //   if x is less than or equal to z
                    secondInt = x;
                    thirdInt = z;
                } else { //        otherwise flip the assignments
                    secondInt = z;
                    thirdInt = x;
                }
            }
        }
        
        if (z <= x) {
            if (z <= y) { //        if z is less than or equal to x and y
                firstInt = z;
                if (x <= y) { //    if x is less than or equal to y
                    secondInt = x;
                    thirdInt = y;
                } else { //         otherwise flip the assignments
                    secondInt = y;
                    thirdInt = x;
                }
            }
        }
        
        
        //Display Results
        System.out.println("Output: " + firstInt + " " + secondInt + " " + thirdInt);
    } // End Main Method
    
} // End Main Class
