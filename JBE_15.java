package jbe_15;
/**
 *
 * @author AsaphDexter
 * 15. Write a Java program to swap two variables.
 */
public class JBE_15 {
    public static void main(String[] args) {
     String name = "Strawberry";
     String surname = "Muffin";
     String tempHolder;
     
     tempHolder = name;
     name = surname;
     surname = tempHolder;
     
     System.out.println("Variable name was Strawberry" + " " + "now" + " " + name);
     System.out.println("Variable surname was Muffin" + " " + "now" + " " + surname);

    }
    
}
