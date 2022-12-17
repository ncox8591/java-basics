Intro to Java Programming and Data Structures by Y. Daniel Liang <br/>
Chapter 3 Selections

### Exercise 3.1 (Algebra: solve quadratic equations) The two roots of a quadratic equation can be obtained using the following formula:
          -b + √b^2 - 4ac           -b - √b^2 - 4ac
    r1 = ------------------   r2 = ------------------ 
               2a                         2a
### *b^2 - 4ac* is called the discriminant of the quadratic equation. If it is positive, the equation has two real roots. if it is zero, the equation has one root. If it is negative, the equation has no real roots.
### Write a program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant. If the discriminant is positive, display two roots. If the discriminant is 0, display one root. Otherwise display "The equation has no real roots."
Note you can use Math.pow(x, 0.5) to compute √x. Samples:

    Enter a, b, c: 1.0 3 1
    The equation has two roots -0.381966 and -2.61803
    
    Enter a, b, c: 1 2.0 1
    The equation has one root -1.0
    
    Enter a, b, c: 1 2 3
    The equation has no real roots
