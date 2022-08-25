package jbe_13;

import java.util.Scanner;

/**
 *
 * @author AsaphDexter
 * 13. Write a Java program to print the area and perimeter of a rectangle. Go to the editor
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class JBE_13 {
    public static void main(String[] args) {
        double Width;
        double Height;
//Create a scanner object 
   Scanner myObj = new Scanner(System.in);
   
 // Enter Width and Height and press Enter
    System.out.println("Input Width"); 
    Width = myObj.nextDouble();   
    
    System.out.println("Input Height"); 
    Height = myObj.nextDouble(); 
    
    double Area = Width * Height;
    double Perimeter = (2 * (Width + Height)) ;

    System.out.println("Area is " + Width + " * " + Height + " = " +  Area);
    System.out.println("Perimeter is 2 * " + ("("+ Width + " + " + Height +")") + " = " +  Perimeter);  
    }
}
