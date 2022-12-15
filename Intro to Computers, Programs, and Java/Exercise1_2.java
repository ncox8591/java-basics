/* Intro to Java Programming and Data Structures by Y. Daniel Liang
 * Chapter 1 Introduction to Computers, Programs, and Java
 * 
 * Exercise 1.2 (Display five messages) Write a program that displays Welcome
 * to Java five times.
 */

package exercise1_2;

//Class Definition and Block
public class Exercise1_2 {

    //Main Method Block
    public static void main(String[] args) {

        //Solution Option 1
        // Statements to display the strings
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        
        //Solution Option 2 
        //(Remove all the previous system.out.println stmts)
        //for Loop: for variable i (which is 0), while variable i is less than 5,
        //increment i by 1 and execute the statements in the loop body
        for (int i = 0; i < 5; i++) {
            System.out.println("Welcome to Java");
        } //End for Loop 
    } //End Main Method Block
    
} //End Class Block