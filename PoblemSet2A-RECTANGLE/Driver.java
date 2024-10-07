
public class Driver {
    public static void main  (String [] args ){
      Rectangle rect1 = new Rectangle();
      Rectangle rect2 = new Rectangle(3, 5);
      
      Box box1 = new Box();
      Box box2 = new Box(5 ,6, 7);
      
      
      
      System.out.println("Creating a Rectangle with the default constructor!");
      System.out.println(rect1.toString());
      System.out.println("getLength() --> " + rect1.getLength() + " units");
      System.out.println("getWidth() --> " + rect1.getWidth() + " units");
      System.out.println("perimeter() --> " + rect1.perimeter() + " units");
      System.out.println("area() --> " + rect1.area() + " units");
      
      System.out.println(" ");
      
      System.out.println("Creating a Rectangle with the parameterized constructor!");
      System.out.println(rect2.toString());
      System.out.println("getLength() --> " + rect2.getLength() + " units");
      System.out.println("getWidth() --> " + rect2.getWidth() + " units");
      System.out.println("perimeter() --> " + rect2.perimeter() + " units");
      System.out.println("area() --> " + rect2.area() + " units");
      
      System.out.println(" ");
    
      System.out.println("Creating a Box with the default constructor!");
      System.out.println(box1.toString());
      System.out.println("getLength() --> " + box1.getLength() + " units");
      System.out.println("getWidth() --> " + box1.getWidth() + " units");
      System.out.println("getHeight() --> " + box1.getHeight() + "units");
      System.out.println("surfaceArea() --> " + box1.surfaceArea() + " units");
      System.out.println("volume() --> " + box1.volume() + " units");
      
      System.out.println(" ");
      
      System.out.println("Creating a Box with the parameterized constructor!");
      System.out.println(box2.toString());
      System.out.println("getLength() --> " + box2.getLength() + " units");
      System.out.println("getWidth() --> " + box2.getWidth() + " units");
      System.out.println("getHeight() --> " + box2.getHeight() + " units");
      System.out.println("surfaceArea() --> " + box2.surfaceArea() + " units");
      System.out.println("volume() --> " + box2.volume() + " units");
      
    }
}

