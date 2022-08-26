package jbe_18;
import java.util.Scanner;
/**
 *
 * @author AsaphDexter
 *18. Write a Java program to multiply two binary numbers. 
Input Data:
Input the first binary number: 10
Input the second binary number: 11
Expected Output
Product of two binary numbers: 110 
 */
public class JBE_18 {

 public void multiply(String firstBinary, String secondBinary){
        int num1 = Integer.parseInt(firstBinary,2);
        int num2 = Integer.parseInt(secondBinary,2);
        int product = num1 * num2;
        System.out.println(Integer.toBinaryString(product));
        };   
    public static void main(String[] args) {
        
        JBE_18 multipleBinary = new JBE_18();
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Input firstBinary number"); 
        String firstBinary = myObj.nextLine();
        
        System.out.println("Input secondBinary number"); 
        String secondBinary = myObj.nextLine();
        
        System.out.println("Product of two binary numbers: "); 
        multipleBinary.multiply(firstBinary, secondBinary); 
    }
}
