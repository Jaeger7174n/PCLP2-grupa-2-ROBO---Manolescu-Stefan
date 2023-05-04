
public class problema1 {
	public static void main(String[] args) {
		
		try
		{
		int a = 1, b = 0;
		int c = a / b;
		
		System.out.println(c);
		}
		catch (ArithmeticException e)
		{
		System.out.println("S-a impartit la 0!!!!!");
		System.out.println("Eroare: " + e);
		}	
		
	}
}
