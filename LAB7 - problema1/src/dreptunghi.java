
public class dreptunghi extends paralelogram{
	public dreptunghi(int latura1, int latura2) {
		super(latura1, latura2, Math.PI / 2);
	}
	
	public int Arie() {
		return this.latura1 * this.latura2;
	}
}
