 
public class Cylinder {
    //instance variable
    double radius;
    double height;
    Circle base;
    
    public Cylinder() { 
        //default constructor 
        base = new Circle(5); 
        height = 5;
    
    }
    
    public Cylinder(double r, double h) {
        //parameterrized constructor
        height = h;
        base = new Circle(r);
    
    }
    
    //Behaviour Method
    public String toString(){
    return "Hello! I am a Cylinder with the raidus of " + base.getRadius() + "and a height of " + height;
}
    
    public double getRadius(){
        return base.getRadius();
        
    }
    
    public double getHeight(){
        return height;
        
    }
    
    
    public double surfaceArea(){
        return 2 * Math.PI * base.getRadius() * height + 2 * base.area();
        
    }
    
    public double volume(){
        return base.area() * height;
        
    }
    
    
}
