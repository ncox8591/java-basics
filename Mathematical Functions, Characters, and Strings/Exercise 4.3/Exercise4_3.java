/* Intro to Java Programming and Data Structures by Y. Daniel Liang <br/>
 * Chapter 4 Mathematical Functions, Characters, and Strings
 * 
 * Exercise 4.3 (Geography: estimate areas) Use the GPS locations for Atlanta, 
 * Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina 
 * to compute the estimated area enclosed by these four cities.
 * Charlotte (35.2270869, -80.8431267); Savannah (32.0835407, -81.0998342)
 *                    * Charlotte
 *                  /  \
 *         Atlanta *    \
 *                  \    * Savannah
 *                   \  /
 *                    \/
 *                     * Orlando
 * Orlando (28.5383355, -81.3792365); Atlanta (33.7489954, -84.3879824)
 * (*Hint*: Use the formula in 4.2 to compute the distance between two cities. 
 * Divide the polygon into two triangles and use the formula in Programming 
 * Exercise 2.19 to compute the area of a triangle.)
 */

package exercise4_3;

//Main Class
public class Exercise4_3 {

    // Main Method
    public static void main(String[] args) {
        
        // Assign latitude/longitude coordinates to x/y variables per city
        // Convert degrees to radians for trig functions
        final double ATLANTA_X1 = Math.toRadians(33.7489954);
        final double ATLANTA_Y1 = Math.toRadians(-84.3879824);
        final double CHARLOTTE_X2 = Math.toRadians(35.2270869);
        final double CHARLOTTE_Y2 = Math.toRadians(-80.8431267);
        final double SAVANNAH_X3 = Math.toRadians(32.0835407);
        final double SAVANNAH_Y3 = Math.toRadians(-81.0998342);
        final double ORLANDO_X4 = Math.toRadians(28.5383355);
        final double ORLANDO_Y4 = Math.toRadians(-81.3792365);
        
        // Average earth radius
        final double RADIUS = 6371.01;
        
        // Calculate sides for triangle 1 with formula:
        //radius x arccos(sin(x1) x sin(x2) + cos(x1) x cos(x2) x cos(y1 - y2))
        double distanceAtlantaToCharlotteSide = RADIUS 
                * Math.acos((Math.sin(ATLANTA_X1))
                        * Math.sin(CHARLOTTE_X2)
                        + Math.cos(ATLANTA_X1)
                        * Math.cos(CHARLOTTE_X2)
                        * Math.cos(ATLANTA_Y1 - CHARLOTTE_Y2));
        double distanceCharlotteToSavannahSide = RADIUS
                * Math.acos((Math.sin(CHARLOTTE_X2))
                        * Math.sin(SAVANNAH_X3)
                        + Math.cos(CHARLOTTE_X2)
                        * Math.cos(SAVANNAH_X3)
                        * Math.cos(CHARLOTTE_Y2 - SAVANNAH_Y3));
        
        // Calculate sides for triangle 2 with formula:
        //radius x arccos(sin(x1) x sin(x2) + cos(x1) x cos(x2) x cos(y1 - y2))
        double distanceSavannahToOrlandoSide = RADIUS
                * Math.acos((Math.sin(SAVANNAH_X3))
                        * Math.sin(ORLANDO_X4)
                        + Math.cos(SAVANNAH_X3)
                        * Math.cos(ORLANDO_X4)
                        * Math.cos(SAVANNAH_Y3 - ORLANDO_Y4));
        double distanceOrlandoToAtlantaSide = RADIUS
                * Math.acos((Math.sin(ORLANDO_X4))
                        * Math.sin(ATLANTA_X1)
                        + Math.cos(ORLANDO_X4)
                        * Math.cos(ATLANTA_X1)
                        * Math.cos(ORLANDO_Y4 - ATLANTA_Y1));
        
        // Get shared side for triangle 1 and 2 with formula:
        //radius x arccos(sin(x1) x sin(x2) + cos(x1) x cos(x2) x cos(y1 - y2))
        double distanceAtlantaToSavannahSide = RADIUS
                * Math.acos((Math.sin(ATLANTA_X1))
                        * Math.sin(SAVANNAH_X3)
                        + Math.cos(ATLANTA_X1)
                        * Math.cos(SAVANNAH_X3)
                        * Math.cos(ATLANTA_Y1 - SAVANNAH_Y3));
        
        // Get s values for triangle 1 and 2 with formula:
        // s = (side1 + side2 + side3) / 2;
        double s1 = (distanceAtlantaToCharlotteSide 
                + distanceCharlotteToSavannahSide 
                + distanceAtlantaToSavannahSide) 
                / 2;
        double s2 = (distanceSavannahToOrlandoSide 
                + distanceOrlandoToAtlantaSide 
                + distanceAtlantaToSavannahSide) 
                / 2;

        // Calculate areas or triangle 1 and triangle 2 with formula:
        // area = √(s(s - side1)(s - side2)(s - side3)
        double triangleArea1 = Math.pow(s1 * (s1 - distanceAtlantaToCharlotteSide) 
                * (s1 - distanceCharlotteToSavannahSide) 
                * (s1 - distanceAtlantaToSavannahSide), 0.5);
        double triangleArea2 = Math.pow(s2 * (s2 - distanceSavannahToOrlandoSide) 
                * (s2 - distanceOrlandoToAtlantaSide) 
                * (s2 - distanceAtlantaToSavannahSide), 0.5);

        // Calculate polygon area by adding triangle areas
        double polygonArea = triangleArea1 + triangleArea2;
        
        // Output results
        //%-20s adds 20 spaces after a string
        // \n ends a line
        // %-20.2f for 20 spaces after a floating-pt#/formats 2 decimal spaces
        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", 
                "Triangle", "Side 1", "Side 2", "Side 3", "Area");
        System.out.println("--------------------------------------------------"
                + "--------------------------------------------------");
        System.out.printf("%-20d%-20.2f%-20.2f%-20.2f%-20.2f\n", 1, 
                distanceAtlantaToCharlotteSide, distanceCharlotteToSavannahSide, 
                distanceAtlantaToSavannahSide, triangleArea1);
        System.out.println("--------------------------------------------------"
                + "--------------------------------------------------");        
        System.out.printf("%-20d%-20.2f%-20.2f%-20.2f%-20.2f\n", 2, 
                distanceSavannahToOrlandoSide, distanceOrlandoToAtlantaSide, 
                distanceAtlantaToSavannahSide, triangleArea2);
        System.out.println("--------------------------------------------------"
                + "--------------------------------------------------");
        System.out.printf("The area of the polygon is %.2f\n", polygonArea);

    } // End Main Method
    
} // End Main Class