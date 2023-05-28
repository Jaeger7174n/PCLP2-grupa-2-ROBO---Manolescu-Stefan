
public class numar extends Problema3{

	private int a;
	public numar(int a) {
		this.a = a;
	}
	public int getNumar() {
		return this.a;
	}
	public void setNumar(int a) {
		this.a = a;
	}
	
	public int suma(int a) {
		return this.a + a;
	}
	public static int suma(int a, int b) {
		return a + b;
	}
	public static int suma(int a, int b, int c) {
		return a + b + c;
	}
	public static int suma(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	
}
