import java.util.Scanner;

public class problema2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter an integer between 1 and 1000:");
		int i=sc.nextInt();
		while (i<1 || i>1000) {
			System.out.println("integer not within 1 - 1000 range, enter another one");
			i=sc.nextInt();
		}

			sc.close();
			int n=0;
			while (i>0) {
				n=n+i%10;
				i=i/10;
				
			}
			
			System.out.println("sum of digits is: " + n);
		
		
	}

}
