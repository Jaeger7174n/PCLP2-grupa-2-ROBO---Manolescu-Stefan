import java.util.Scanner;
import java.util.Vector;

public class problema5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter an integer : ");
		long n = sc.nextLong();
		Vector <Long> v = new Vector <>(15);
		int i = 0;
		while (n>0) {
			v.add( n % 10 );
			n /= 10;
			i++;
		}
		i--;
		while (i>=0) {
			System.out.print(v.get(i) + " ");
			i--;
		}
		
		
		sc.close();
	}

}
