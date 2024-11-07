public class PatternDrawer {

    public static void main(String[] args) {
        StdDraw.setScale(0, 500);
        
        drawGrid();
        drawCurve();
        drawConcentricCircles();
    }

    
    public static void drawGrid() {
        for (int i = 0; i <= 500; i += 20) {
            StdDraw.line(i, 0, i, 500); 
            StdDraw.line(0, i, 500, i); 
        }
    }

    
    public static void drawCurve() {
        for (int i = 0; i <= 500; i += 20) {
            StdDraw.line(i, 0, 500, i);
            StdDraw.line(0, i, i, 500);
        }
    }

   
    public static void drawConcentricCircles() {
        boolean isWhite = true;
        for (int radius = 200; radius >= 0; radius -= 20) {
            if (isWhite) {
                StdDraw.setPenColor(StdDraw.WHITE);
            } else {
                StdDraw.setPenColor(StdDraw.BLACK);
            }
            StdDraw.filledCircle(250, 250, radius);
            isWhite = !isWhite;
        }
    }
}
