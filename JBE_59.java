package jbe_59;
/**
 *
 * @author AsaphDexter
 * 59. Write a Java program to convert a given string into lowercase.
Sample Output:

Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.           
the quick brown fox jumps over the lazy dog.
 */
import java.util.Scanner;
public class JBE_59 {
    public static void main(String[] args) {
       String input;
       String finalOutput;
       
       Scanner myObj = new Scanner(System.in);
       
       System.out.println("Input a String: ");
       input = myObj.nextLine();
       finalOutput = input.toLowerCase();

       System.out.println(finalOutput);

    }    
}
