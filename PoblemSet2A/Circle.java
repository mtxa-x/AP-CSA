
public class Circle {
    //instance variable
    double radius;
    
    public Circle() { 
        //default constructor 
        radius = 1;  //assign varible to instance variable
    
    }
    
    public Circle(double r) {
        //parameterrized constructor
        radius = r;
    
    }
    
    //Behaviour Method
    public String toString(){
    return "Hello! I am a circle with the raidus of " + radius;
    }
    
    public double getRadius(){
        return radius;
        
    }
    
    public double circumference(){
        return 2 * Math.PI * radius;
        
    }
    
    public double area(){
        return radius * Math.PI * radius;
        
    }
    
    
}
