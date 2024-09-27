
/**
 * @author Matt Trinh
 * @version Setemper 1A
 */

import java.util.Scanner;
public class ProblemSet1A 
{
   public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    
    System.out.println("What is your Name?");
    String userName = myObj.nextLine();  // Read user input
    System.out.println("Hello " + userName + " I am your personal " +  
    "AI Assitant I will ask you some questions to get to know " + 
    "you better");  // Output user input
    
    System.out.println("What is your favourite course at school?");
    String favCourse = myObj.nextLine();  // Read user input
    System.out.println("Your favourite course is " + favCourse );  // Output user input
    
    System.out.println("What is your favourite show?");
    String favShow = myObj.nextLine();  // Read user input
    System.out.println("Your favourite show is " + favShow );  // Output user input
    
    System.out.println("How many hours do you spend studying each day?");
    String hstudy = myObj.nextLine();  // Read user input
    System.out.println("You spend " + hstudy + " hour(s) studying" );  // Output user input
    
    System.out.println("How many hours do you spend watching shows each day?");
    String hshow = myObj.nextLine();  // Read user input
    System.out.println("You spend " + hshow + " hour(s) wathching your favourite show");  // Output user input
  }

    
}
