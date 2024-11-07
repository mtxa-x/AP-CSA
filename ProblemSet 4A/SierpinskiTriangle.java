import java.util.Random;

public class SierpinskiTriangle {

    public static void main(String[] args) {
        
        StdDraw.setScale(0, 1);
        drawOuterTriangle();
        drawSierpinskiTriangle();

        
    }
    
     public static void drawOuterTriangle() {
        StdDraw.setPenRadius(0.01);
        double x1 = 0.5, y1 = 0;                   
        double x2 = 0, y2 = Math.sqrt(3) / 2;      
        double x3 = 1, y3 = Math.sqrt(3) / 2;      
        
        
        StdDraw.line(x1, y1, x2, y2);  
        StdDraw.line(x2, y2, x3, y3);  
        StdDraw.line(x3, y3, x1, y1);  
    }
    public static void drawSierpinskiTriangle() {
        double[] x = {0.5, 0, 1};
        double[] y = {0, Math.sqrt(3) / 2, Math.sqrt(3) / 2}; 

        
        StdDraw.point(x[0], y[0]);
        StdDraw.point(x[1], y[1]);
        StdDraw.point(x[2], y[2]);

        
        double px = 0.5, py = 0.25;

        
        for (int i = 0; i < 10000; i++) {  
            int vertex = (int) (Math.random() * 3);  

            px = (px + x[vertex]) / 2;
            py = (py + y[vertex]) / 2;

            
            StdDraw.point(px, py);
        }
    }
}
