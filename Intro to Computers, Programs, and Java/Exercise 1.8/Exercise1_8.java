/* Intro to Java Programming and Data Structures by Y. Daniel Liang
 * Chapter 1 Introduction to Computers, Programs, and Java
 * 
 * Exercise 1.8 (Area and perimeter of a circle) Write a program that displays 
 * the area and perimeter of a circle that has a radius of 5.5 using the
 * following formula:
 * 
 *                    perimeter = 2 x radius x pi
 *                    area = radius x radius x pi
 *
 */
package exercise1_8;

//Class Definition Block
public class Exercise1_8 {

    //Main Method Block
    public static void main(String[] args) {
        // Display formula block statement for circle perimeter
        System.out.println("""
                           Circle Perimeter = 2 x radius x pi
                                            = 2 x 5.5 x (22/7)
                           """);
        // Display and calculate perimeter formula result
        System.out.println("Result = " + (2 * 5.5 * (22/7)));
        
        System.out.println("------------------------------------");
        
        // Display formula block statement for circle area
        System.out.println("""
                           Circle Area = radius x radius x pi
                                       = 5.5 x 5.5 x (22/7)
                           """);
        // Display and calculate area formula result
        System.out.println("Result = " + (5.5 * 5.5 * (22/7)));
    } //End Main Method Block
    
} //End Class Block
