package jbe_44;

/**
 *
 * @author AsaphDexter
 * 44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. 
Sample Output:

Input number: 5                                                        
5 + 55  + 555
 */
import java.util.Scanner;
public class JBE_44 {
    public static void main(String[] args) {
        long nInteger;
        //long compute;
       Scanner myObj = new Scanner(System.in);
       
    
    System.out.println("Input number: " );
    nInteger = myObj.nextLong();
    
    //System.out.println("Input number: " + nInteger );
    System.out.println(nInteger + " + " + nInteger+""+ nInteger + " + "+ nInteger+""+ nInteger + nInteger);
    
    }  
}
