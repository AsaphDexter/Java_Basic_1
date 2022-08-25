package jbe_11;
import java.util.Scanner;

/**
 *
 * @author AsaphDexter
 * 11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */
public class JBE_11 {
    public static void main(String[] args) {
     double radius;
     Scanner myObj = new Scanner(System.in);
    // Enter the Radius and press Enter
    System.out.println("Enter the Radius Value"); 
    radius = myObj.nextDouble(); 
     double pi  = Math.PI;   
     double radiusSquare = (Math.pow(radius,2));
System.out.println("Perimeter is = " + (2 * pi * radius) );
System.out.println("Area is = " + (pi * radiusSquare));
    }
    
}
