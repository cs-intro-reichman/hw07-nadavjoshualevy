/** Draws ths Sierpinski Triangle fractal. */
public class Sierpinski {
	
	public static void main(String[] args) {
		sierpinski(Integer.parseInt(args[0]));
	}
	
	// Draws a Sierpinski triangle of depth n on the standard canvass.
	public static void sierpinski (int n) {
		StdDraw.setCanvasSize();
		StdDraw.setXscale(0,1);
		StdDraw.setYscale(0, Math.sqrt(3)/2);
		double x1 = 0.0;
		double y1 = 0.0;
		double x2 = 1.0; 
		double y2 = 0.0;
		double x3 = 0.5; 
		double y3 = Math.sqrt(3)/2;
		sierpinski (n, x1, x2, x3, y1, y2, y3);
	}
	
	// Does the actual drawing, recursively.
	private static void sierpinski(int n, double x1, double x2, double x3,
		                                 double y1, double y2, double y3) {
		if (n == 0){
			return;
		}									
		StdDraw.line(x1, y1, x2, y2);
		StdDraw.line(x2, y2, x3, y3);
		StdDraw.line(x1, y1, x3, y3);
		double mx1 = (x1+x2)/2;
		double my1 = (y1+y2)/2;
		double mx2 = (x2+x3)/2;
		double my2 = (y2+y3)/2;
		double mx3 = (x3+x1)/2;
		double my3 = (y3+y1)/2;
		sierpinski(n-1, mx1, x2, mx2, my1, y2, my2);
		sierpinski(n-1, x1, mx1, mx3, y1, my1, my3);
		sierpinski(n-1, mx3, mx2, x3, my3, my2, y3);
	
	}
}
