

public class Rectangle
{
    // instance variables - replace the example below with your own
    private double length;
    private double width;
    
   
    public Rectangle() {
        length = 1;
        width = 1;
        
    }
    
    public Rectangle(double l, double w) {
        length = l;
        width = w;
        
    }
    
    public String toString(){
        return "Hello, I am a rectangle with the lenth of " + length + " units and" 
        +" a width of " + width + " units";
    }
 
    public double getLength (){
        return length;
    }
    
    public double getWidth (){
        return width; 
    }
    
    public double perimeter(){
        return (2 * length) + (2 * width);
    
    }
    
    public double area(){
        return length * width;
    
    }
    
    }

