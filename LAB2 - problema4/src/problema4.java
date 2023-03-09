import java.util.Scanner;

public class problema4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number a : ");
		int a=sc.nextInt();
		System.out.println("enter a number b : ");
		int b=sc.nextInt();
		
		System.out.println("sum = " + (a + b));
		System.out.println("difference = " + (a - b));
		System.out.println("product = " + (a * b));
		float sum = (a + b);
		System.out.println("average = " + (sum / 2));
		System.out.println("distance = " + (a > b ? (a - b) : (b - a)));
		System.out.println("maximum = " + (a > b ? a : b));
		System.out.println("minimum = " + (a < b ? a : b));
		
		sc.close();
	}

}
