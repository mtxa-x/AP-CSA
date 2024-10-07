
public class Box {
    private double height;
    Rectangle base; 
    
    public Box(){
        height = 1;
        base = new Rectangle(1 ,1);
    }
    
    public Box(double w, double l, double h){
        height = h;
        base = new Rectangle(w ,l);
    }
    
    public String toString(){
        return "Hello, I am a Box with length " + base.getLength() 
        + " units, width" + base.getWidth() + "units and a height of " + height + " units";
    }
    
    
    public double getLength(){
        
        return base.getLength();
    }
    
    public double getWidth(){
    
        return base.getWidth();
    
    }
    
    public double getHeight(){
    
        return height;
    
    }
    
    public double surfaceArea(){
        
        return ( base.getLength() * base.getLength() ) * 6;
    }
    
    public double volume (){
        return base.getLength() * base.getWidth() * height;
    }
    
}
