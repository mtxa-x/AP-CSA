


public class GridDrawing {
    public static void main(String[] args) {
        int gridSize = 10; 
        
        
        StdDraw.setCanvasSize(600, 600);
        StdDraw.setXscale(0, gridSize);
        StdDraw.setYscale(0, gridSize);

        
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.002);

        
        for (int i = 0; i <= gridSize; i++) {
            StdDraw.line(i, 0, i, gridSize); // Line from bottom to top
        }

        
        for (int i = 0; i <= gridSize; i++) {
            StdDraw.line(0, i, gridSize, i); // Line from left to right
        }
    }
}
