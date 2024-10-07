
/**
 * Write a description of class OrderedPair here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderedPair
{
    // instance variables - replace the example below with your own
    private double x;
    private double y;
    
    public OrderedPair() {
        x = 0;
        y = 0;
    
        
    }
    
    public OrderedPair(double X, double Y) {
        x = X;
        y = Y;
    
        
    }
    
    public String toString(){
        return "(" + x + "," + y + ")";
        
    }
    
    public double getX(){
        return x;
        
    }
    
    public double getY(){
        return y;
        
    }

}
