   
public class Driver {
    
    public static void main (String[] args){
        //instatiation
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);
        
        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(200, 200);
        
        
        System.out.println("Creating a circle with the default constructor!");
        System.out.println(circle1);
        System.out.println("getRadius()" + "-->" + circle1.getRadius() + " units");
        System.out.println("circumference()" + "-->" + circle1.circumference() + " units");
        System.out.println("area()" + "-->" + circle1.area() + " units");

        System.out.println(" ");
        
        System.out.println("Creating a circle with the parameterized constructor!");
        System.out.println(circle2);
        System.out.println("getRadius()" + "-->" + circle2.getRadius() + " units");
        System.out.println("circumference()" + "-->" + circle2.circumference() + " units");
        System.out.println("area()" + "-->" + circle2.area() + " units^2");
        
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("Creating a Cylinder with the default constructor!");
        System.out.println(cylinder1);
        System.out.println("getRadius()" + "-->" + cylinder1.getRadius() + " units");
        System.out.println("getHeight()" + "-->" + cylinder1.getHeight() + " units");
        System.out.println("surfaceArea()" + "-->" + cylinder1.surfaceArea() + " units");
        System.out.println("volume()" + "-->" + cylinder1.volume() + " units^2");
        
        System.out.println(" ");
        
        System.out.println("Creating a Cylinder with the parameterized constructor!");
        System.out.println(cylinder2);
        System.out.println("getRadius()" + "-->" + cylinder2.getRadius() + " units");
        System.out.println("getHeight()" + "-->" + cylinder2.getHeight() + " units");
        System.out.println("surfaceArea()" + "-->" + cylinder2.surfaceArea() + " units^2");
        System.out.println("volume()" + "-->" + cylinder2.volume() + " units^3");

    }
    
}
