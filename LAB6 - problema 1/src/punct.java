import java.lang.Math;

public class punct extends problema1 {
	private int x,y;
	
	public punct() {
		this.x = 0;
		this.y = 0;
	}
	
	public punct(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX (int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return "(" + this.x + " , " + this.y + ")";
	}
	
	public static double distance(int x1, int y1, int x2, int y2) {
		//return sqrt((double(x1) - double(x2)) ^ 2  + (double(y1) - double(y2)) ^ 2);
		return Math.sqrt(((double)x1 - (double)x2) * ((double)x1 - (double)x2) + ((double)y1 - (double)y2) * ((double)y1 - (double)y2));
	}
	
	public static double distance(punct a, punct b) {
		return Math.sqrt(((double)a.x - (double)b.x) * ((double)a.x - (double)b.x) + ((double)a.y - (double)b.y) * ((double)a.y - (double)b.y));
	}
}
