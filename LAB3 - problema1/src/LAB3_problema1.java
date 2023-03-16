import java.util.Scanner;

public class LAB3_problema1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter an integer : ");
		int n=sc.nextInt();
		
		if (n < 0) {
			System.out.println("numarul este negativ");
		}
		else {
			System.out.println("numarul este pozitiv");

		}
		
		sc.close();

	}

}
