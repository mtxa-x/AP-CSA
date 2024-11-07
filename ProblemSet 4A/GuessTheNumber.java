import java.util.Scanner;
public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1 and 100. "
            + "Can you guess it?");
        int randomNumber = (int)(Math.random() * 101);
        int guess = input.nextInt();
        
        int tries = 0;
        while (guess != randomNumber){
        System.out.println("Your guess: " + guess);
        if (guess < randomNumber){
            System.out.println("Nope, that guess is too low");
        } else if (guess > randomNumber){
            System.out.println("Nope, that guess is too high");
        }
        
        guess = input.nextInt(); 
        tries++;
    }
    
        if (randomNumber == guess){
            System.out.println(" ");
            System.out.println("Yup, you got it.");
            System.out.println("It took you: "+ tries + " tries.");
        }

     
     
        
}
}
