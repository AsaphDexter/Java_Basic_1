package jbe_12;

/**
 *
 * @author AsaphDexter
 * 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */
import java.util.Scanner;
public class JBE_12 {
    public static void main(String[] args) {
int firstNumber;
int secondNumber;
int thirdNumber;

//Create Scanner Object to take user input
Scanner myObj = new Scanner(System.in);

//Collect User Inpur
System.out.println("Enter the First Number");
firstNumber = myObj.nextInt();

System.out.println("Enter the Second Number");
secondNumber = myObj.nextInt();

System.out.println("Enter the Third Number");
thirdNumber = myObj.nextInt();

System.out.println("The Average of your 3 inputs is " + ((firstNumber + secondNumber + thirdNumber)/3));  
    }
}
