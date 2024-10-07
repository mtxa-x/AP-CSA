import java.util.Scanner;
public class Driver{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        Formulas formula = new Formulas();
        
        
      
        
        //QUADRATIC FORMULA
        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b and c: ");
        System.out.print("a: ");
        double a = input.nextDouble();
        
        System.out.print("b: ");
        double b = input.nextDouble();
        
        System.out.print("c: ");
        double c = input.nextDouble();
        OrderedPair roots = formula.findQuadracticsRoots(a, b, c);
        System.out.println("The solutions for" + a + "x^2 + " + b + "x +"+ c + " are " + roots);
        
        System.out.println(" ");
        //Slope Formula
        System.out.println("SLOPE FORMULA: Find the slope between points (x1,y1) and (x2,y2)");
        System.out.print("x1: ");
        double x1 = input.nextDouble();
        System.out.print("y1: ");
        double y1 = input.nextDouble();
        System.out.print("x2: ");
        double x2 = input.nextDouble();
        System.out.print("y2: ");
        double y2 = input.nextDouble();
        
        OrderedPair First = new OrderedPair(x1, y1);
        OrderedPair Second = new OrderedPair(x2, y2);

        double slope = formula.findSlope(First, Second );
        System.out.println("A line between " + First + " and " + Second + " has a slope of " + slope);
        
        System.out.println(" ");
        
        
        //Midpoint Formula
        OrderedPair midpoint = formula.findMidpoint(First, Second);
        System.out.println("The midpoint between " + First + " and " + Second + " is " + midpoint);
        
        System.out.println(" ");

        //Arithmetic Series Sum
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.print("Number of terms: ");
        int k = input.nextInt();
        System.out.print("Starts with: ");
        double firstTerm = input.nextDouble();
        System.out.print("Increases by: ");
        double difference = input.nextDouble();
        double arithmeticSum = formula.findArithmeticSeriSum(firstTerm, difference, k);
        System.out.println(" ");
        System.out.println("The sum of the first " + k + " terms of an arithmetic series is " + arithmeticSum);
        
        System.out.println(" ");

        // Geometric Series Sum
        System.out.println("SUM OF A GEOMETRIC SERIES");
        System.out.print("Number of terms: ");
        k = input.nextInt();
        System.out.print("Starts with: ");
        double geometricFirstTerm = input.nextDouble();
        System.out.print("Rate of growth: ");
        double ratio = input.nextDouble();
        double geometricSum = formula.findGeometricSeriesSum(geometricFirstTerm, ratio, k);
        System.out.println(" ");
        System.out.println("The sum of the first " + k + " terms of a geometric series is " + geometricSum);
        
        System.out.println(" ");

        
        
        //Die Roller
        System.out.println("DIE ROLLER");
        System.out.print("How many sides does your die have? ");
        int sides = input.nextInt();
        int roll = formula.rollDie(sides);
        System.out.println(" ");
        System.out.println("Rolling a " + sides + "-sided die... you got a " + roll);
    
        
        
        
        
    }
    
    
}
