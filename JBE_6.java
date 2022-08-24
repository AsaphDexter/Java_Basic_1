package jbe_6;

import java.util.Scanner;

/**
 *
 * @author AsaphDexter
 * 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */
public class JBE_6 {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
     int firstNumber;
     int secondNumber;
    
    // Enter firstNumber and secondNumber and press Enter
    System.out.println("Input first number"); 
    firstNumber = myObj.nextInt();   
    
    System.out.println("Input second number"); 
    secondNumber = myObj.nextInt(); 
    
    
    System.out.println("125 + 24 = "  +  (firstNumber + secondNumber)); 
    System.out.println("125 - 24 =  " +  (firstNumber - secondNumber));
    System.out.println("125 x 24 = "  +  firstNumber * secondNumber); 
    System.out.println("125 / 24 = "  +  (firstNumber / secondNumber)); 
    System.out.println("125 mod 24 = "  +  (firstNumber % secondNumber)); 
    }
}
