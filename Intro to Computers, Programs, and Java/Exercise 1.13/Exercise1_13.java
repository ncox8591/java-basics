/* Intro to Java Programming and Data Structures by Y. Daniel Liang
 * Chapter 1 Selections
 * 
 * Exercise 1.13 (Algebra: solve 2 x 2 linear equations) You can use Cramer's 
 * rule to solve the following 2 x 2 system of linear equation provided that 
 * ad - bc is not 0.
 * 
 *     ax + by = e             ed - bf            af - ec
 *                     x  = ------------   y =  ------------
 *     cx + dy = f             ad - bc            ad - bc
 *     
 * Write a program that solves the following equation and displays the value for 
 * x and y. (*Hint*: replace the symbols in the formula with numbers to compute 
 * x and y This exercise can be done in Chapter 1 without using materials in 
 * later chapters.)
 * 
 *      3.4x + 50.2y = 44.5
 *      2.1x + .55y = 5.9
 */

package exercise1_13;

// Main Class
public class Exercise1_13 {

    // Main Method
    public static void main(String[] args) {

/* Plug the numbers in the equation prompt into Cramer's rule formula
 *     ax + by = e             ed - bf            af - ec
 *                     x  = ------------   y =  ------------
 *     cx + dy = f             ad - bc            ad - bc
 */
        System.out.println("x is " + (((44.5 * 0.55) - (50.2 * 5.9)) 
                / ((3.4 * 0.55) - (50.2 * 2.1))));
        System.out.println("y is " + (((3.4 * 5.9) - (44.5 * 2.1)) 
                / ((3.4 * 0.55) - (50.2 * 2.1))));
    } // End Main Method
    
} // End Main Class
