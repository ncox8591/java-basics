/* Intro to Java Programming and Data Structures by Y. Daniel Liang
 * Chapter 1 Introduction to Computers, Programs, and Java
 * 
 * Exercise 1.5 (Compute expressions) Write a program that displays the results
 * of:
 * 
 *     9.5 x 4.5 - 2.5 x 3
 *     -------------------
 *          45.5 - 3.5
 *
 */
package exercise1_5;

//Class Definition and Block
public class Exercise1_5 {

    //Main Method Block
    public static void main(String[] args) {
        // Statement to display expression in text block
        System.out.println("""
                                9.5 x 4.5 - 2.5 x 3 
                                -------------------- 
                                    45.5 - 3.5""");
        
        //Statement to display result with calculation
        System.out.println("Result: " + ((9.5 * 4.5 - 2.5 * 3)
                                             /(45.5 - 3.5)));
    }
    
}
