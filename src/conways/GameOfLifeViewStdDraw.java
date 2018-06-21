package conways;
import edu.princeton.cs.introcs.StdDraw;

public class GameOfLifeViewStdDraw implements GameOfLifeView {
	
	private final int height;
	private final int width ;

    public GameOfLifeViewStdDraw(int height, int width) {
    	if (width < 1) {
            throw new IllegalArgumentException("width must be a positive value");
        }
        if (height < 1) {
            throw new IllegalArgumentException("height must be a positive value");
        }
        this.width = width;
        this.height = height;
        
    	StdDraw.setCanvasSize(width, height);
        StdDraw.setYscale(0, height);
        StdDraw.setXscale(0, width);
        StdDraw.setPenRadius(0);
        StdDraw.setPenColor(StdDraw.BLACK);
    }
    
    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @SuppressWarnings("deprecation")
	@Override
    public void drawGeneration(final boolean[][] generation) {
        StdDraw.show(0);
        StdDraw.clear();
        for (int row = 0; row < generation.length; row++) {
            for (int col = 0; col < generation[row].length; col++) {
                if (generation[row][col] == true) {
                    StdDraw.point(col, row);
                }
            }
        }
        StdDraw.show(0);
    }

}
