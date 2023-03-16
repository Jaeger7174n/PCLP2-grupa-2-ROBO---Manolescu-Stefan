import java.util.Scanner;

public class problema2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter an integer between 1 and 7: ");
		int i=sc.nextInt();
		
		while (i < 1 || i > 7) {
			System.out.println("number is not between 1 and 7, enter another one : ");
			i=sc.nextInt();
		}
		
		switch (i) {
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); break;
		case 7: System.out.println("Sunday"); break;
		}
		
		sc.close();

	}

}
