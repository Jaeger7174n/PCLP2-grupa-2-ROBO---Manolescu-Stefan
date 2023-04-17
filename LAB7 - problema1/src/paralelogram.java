import java.lang.Math;

public class paralelogram extends patrulater{
	public paralelogram(int latura1, int latura2, double unghi1) {
		super(latura1, latura2, latura1, latura2, unghi1, Math.PI - unghi1, unghi1, Math.PI - unghi1);
	}
	
	public double Aria() {
		return (double)this.latura1 * (double)this.latura2 * Math.sin(unghi1);
	}
	
}
