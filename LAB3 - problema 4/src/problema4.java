import java.util.Scanner;
import java.util.Vector;

public class problema4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an integer : ");
		long number = sc.nextLong();
		Vector <Long> digits = new Vector <>(15);
		int i = 0;
		int sum_even = 0, sum_odd = 0;
		while (number > 0) {
			digits.add( number % 10 );
			number /= 10;
			i++;
		}
		i--;
		while (i >= 0) {
			if (digits.get(i) % 2 == 0) {
				sum_even += digits.get(i);
			}
			else {
				sum_odd += digits.get(i);
			}
			i--;
		}
		System.out.println("The sum of the even digits is : " + sum_even);
		System.out.println("The sum of the odd digits is : " + sum_odd);
		
		sc.close();

	}

}
