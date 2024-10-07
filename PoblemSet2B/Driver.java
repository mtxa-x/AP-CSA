import java.util.Scanner;

public class Driver {
    
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        StringTools sTools = new StringTools();
        
        
        System.out.println("lastletter test cases: ");
        System.out.println("Enter a word with at least one character: ");
        String answer1 = input.nextLine();
        System.out.println("The last letter is " + sTools.lastLetter(answer1));
        System.out.println(" ");
        
        System.out.println("formatPhone Number test: ");
        System.out.println("Enter a 10 digit phone number: ");
        String answer2 = input.nextLine();
        System.out.println(sTools.formatPhoneNumber(answer2));
        System.out.println(" ");
        
        System.out.println("middleThree test: ");
        System.out.println("Enter a String: ");
        String answer3 = input.nextLine();
        System.out.println(sTools.middleThree(answer3));
        System.out.println(" ");
        
        System.out.println("swapLastTwo ");
        System.out.println("Enter a String: ");
        String answer4 = input.nextLine();
        System.out.println(sTools.swapLastTwo(answer4));
        System.out.println(" ");
        
        System.out.println("Front Again ");
        System.out.println("Enter a String: ");
        String answer5 = input.nextLine();
        System.out.println("Enter a number to see if it match front and back of the String: ");
        int answer6 = input.nextInt();
        System.out.println(sTools.frontAgain(answer5, answer6));
        System.out.println(" ");
        
        
        
        
        
        
    }
    
}
