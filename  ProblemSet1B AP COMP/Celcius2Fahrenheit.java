
/**
 * ProblemSet1B
 * @author (Matt Trinh)
 * @version (September 11th, 2024)
 */

import java.util.Scanner;
public class Celcius2Fahrenheit
{
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    System.out.println("*** Celsius --> Fahrenheit ***");
    System.out.println("Enter a temperature in Celsius");
    double c = input.nextDouble();
    double f = c * 9/5 + 32;
    System.out.println(c + " Celsius is "+ f + " Fahrenheit");  // Output user input
    

  }

    
}