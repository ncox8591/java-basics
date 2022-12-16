/* Intro to Java Programming and Data Structures by Y. Daniel Liang 
 * Chapter 2 Elementary Programming

 * Exercise 2.23 (Cost of driving) Write a program that prompts the user to 
 * enter the distance to drive, the fuel efficiency of the car in miles per 
 * gallon, and the price per gallon then displays the cost of the trip.
 */

package com.mycompany.exercise2_23;

//Import Scanner class from the java.util package
import java.util.Scanner;

//Start Main Class
public class Exercise2_23 {

    //Start Main Method
    public static void main(String[] args) {
        
        //Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        //Prompt user for distance to drive in miles
        System.out.println("Enter the Distance to Drive (in Miles): ");
        //Read input from the keyboard and assign to distanceToDrive variable
        double distanceToDrive = input.nextDouble();
        
        //Prompt user for miles per gallon
        System.out.println("Enter Fuel Efficiency (Miles Per Gallon): ");
        //Read input from the keyboard and assign to milesPerGallon variable
        double milesPerGallon = input.nextDouble();

        //Prompt user for price per gallon        
        System.out.println("Enter Price Per Gallon: ");
        //Read input from the keyboard and assign to pricePerGallon variable        
        double pricePerGallon = input.nextDouble();
        
        //Calculate the cost of the trip =
        //The distance to drive, divided by miles per gallon, by the gallon price
        double costOfTrip = distanceToDrive / milesPerGallon * pricePerGallon;
        
        //Display result of calculation
        System.out.println("Trip Cost: $" + costOfTrip);
    } // End Main Method
} // End Main Class
