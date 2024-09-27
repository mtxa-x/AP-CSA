import java.util.Scanner;
public class ReceiptGenerator
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("***Receipt Generator***");
        
        System.out.println("Number of Units");
        double unit = input.nextDouble();
        System.out.println("Price per Unit");
        double price = input.nextDouble();
        System.out.println("Enter the Tax Rate");
        double tax = input.nextDouble();
        double outcome = unit * price *  (1 + tax/100);
        
        System.out.println("Purchasing " + unit + " units at a price of $" 
        + price + " with the tax rate of " + tax + "% then the total is $" 
        + outcome);
        
        
        
        
        
        
    }

}
