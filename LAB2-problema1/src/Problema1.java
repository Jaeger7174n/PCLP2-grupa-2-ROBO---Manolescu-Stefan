import java.util.*; 

public class Problema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		float c;
		
		System.out.println("Enter temp in Fahrenheit: ");
		float f=sc.nextFloat();
		sc.close();
		c=(f-32)*5/9;
		System.out.println(c);
		
	}

}
