import java.util.Scanner;
public class SumDigit
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("*** Sum of digits ***");
        System.out.println(" Enter any digit Number");
        int n = input.nextInt();
        int first = n % 10;
        int x = n / 10;
        int second = x % 10;
        int third = x / 10;
        
        int total = first + second + third;
        
        System.out.println("The sum of the digit " + n + " is " + total);
        
    }
}
