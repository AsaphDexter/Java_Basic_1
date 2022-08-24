package jbe_5;
/**
 *
 * @author Asaphdexter
 * 5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
 */
import java.util.Scanner;  // Import the Scanner class
public class JBE_5 {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
     int firstNumber;
     int secondNumber;
    
    // Enter firstNumber and secondNumber and press Enter
    System.out.println("Input first number"); 
    firstNumber = myObj.nextInt();   
    System.out.println("Input second number"); 
    secondNumber = myObj.nextInt(); 
    System.out.println("25 x 5 = " +  firstNumber * secondNumber); 
    }   
}
