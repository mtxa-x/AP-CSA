import java.util.Scanner;
public class BMI
{
    public static void main (String[] args){
    Scanner input = new Scanner(System.in); 
    System.out.println("*** BMI Calculator ***");
    System.out.println("Enter a Weight in Kg");
    double k = input.nextDouble();
    System.out.println("Enter a Height in m");
    double m = input.nextDouble();
    double bmi = k/(m*m);
    
    System.out.println("Your weight is " + k + " and your height is " + m 
    + ". Then your calculated BMI is " + bmi);
}
}
