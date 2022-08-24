package jbe_7;
import java.util.Scanner;
/**
 *
 * @author AsaphDexter
 * 7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */
public class JBE_7 {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
     int number;
   
    // Enter firstNumber and secondNumber and press Enter
    System.out.println("Input a number"); 
    number = myObj.nextInt();   

    System.out.println("8 x 1 = " + (1 * number));
    System.out.println("8 x 2 = " + (2 * number));
    System.out.println("8 x 3 = " + (3 * number));
    System.out.println("8 x 4 = " + (4 * number));
    System.out.println("8 x 5 = " + (5 * number));
    System.out.println("8 x 6 = " + (6 * number));
    System.out.println("8 x 7 = " + (7 * number));
    System.out.println("8 x 8 = " + (8 * number));
    System.out.println("8 x 9 = " + (9 * number));
    System.out.println("8 x 10 = " + (10 * number));
    }
}
