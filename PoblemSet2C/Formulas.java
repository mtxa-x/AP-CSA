

public class Formulas
{
    public OrderedPair findQuadracticsRoots (double a, double b, double c){
        double discriminant = b * b - 4 * a * c;
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        return new OrderedPair(root1, root2);
        
    }
    
    public double findSlope (OrderedPair First, OrderedPair Second){
        return ((Second.getY() - First.getY()) / (Second.getX() - First.getX()));
        
    }
    
    public OrderedPair findMidpoint ( OrderedPair First, OrderedPair Second){
        double point1 = ((First.getX() + Second.getX()) / 2);
        double point2 = ((First.getY() + Second.getY()) / 2);
        
        return new OrderedPair(point1, point2);
        
    }
    
    public double findArithmeticSeriSum( double a, double d, int k){
        return (k/2) * (2*a + (d*(k-1)));
        
    }
    
    public double findGeometricSeriesSum (double a, double r, int k){
        return a*((1-Math.pow(r, k)) / (1-r));
        
    }
    
    public int rollDie(int sides){
        return (int) ((Math.random()* sides) + 1);
    }
    
    
}
