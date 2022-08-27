package jbe_61;
/**
 *
 * @author Asaphdexter
 * 61. Write a Java program to reverse a word.
Sample Output:

Input a word: dsaf
Reverse word: fasd
Click me to see the solution
 * 
 */
import java.io.*;
import java.lang.*;
import java.util.*;

class JBE_61 {
    public static void main(String[] args) {
        String inputString;
        Scanner myObj = new Scanner(System.in);
        StringBuilder obj = new StringBuilder();
        
        System.out.println("Input a word: ");
        inputString = myObj.nextLine();
        
        //append a string into StringBuilder obj
        obj.append(inputString);
        
        //reverse StringBuilder obj
        obj.reverse();
        
        System.out.println("Reverse word: " + obj);
    }
}
