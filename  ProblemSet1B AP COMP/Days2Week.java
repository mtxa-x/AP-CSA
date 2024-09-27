import java.util.Scanner;
public class Days2Week
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("***Days to Week***");
        System.out.println("Enter a Number of Days");
        int days = input.nextInt();
        int day = days % 7;
        int weeks = days / 7;
        System.out.println(days + " days is equal to " + weeks + " weeks and " 
        + day + " days");
        

    }
    }

