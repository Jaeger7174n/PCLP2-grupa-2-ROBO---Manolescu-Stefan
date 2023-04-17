import java.lang.Math;

public class romb extends paralelogram{
	
	
	public romb(int latura, double unghi) {
		super(latura, latura, unghi);
	}
	
	public double diag1 = 2 * (double)this.latura1 * Math.sin(this.unghi1 / 2);
	public double diag2 = 2 * (double)this.latura2 * Math.sin(this.unghi2 / 2);
	
	public double Arie() {
		return (this.diag1 * this.diag2) / 2;
	}
}
