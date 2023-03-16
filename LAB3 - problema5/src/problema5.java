import java.util.Scanner;

public class problema5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an age : ");
		int age=sc.nextInt();
		int val = (age < 18) ? 1 : 0;
		switch (val) {
		case 1: System.out.println("person can't vote"); break;
		case 0: System.out.println("person can vote"); break;
		}
		
		
		sc.close();
	}

}
