import java.util.Scanner;

public class problema1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("number of elements in array:");
		int n = sc.nextInt();
		int array[] = new int [n];
		int i, aux1 = Integer.MIN_VALUE+1, aux2 = Integer.MIN_VALUE+2;
		for(i = 0; i < n; i++) {
			System.out.println("enter element " + (i+1) + " out of " + n);
			array[i] = sc.nextInt();
			if (array[i] > aux2) {
				aux2 = array[i];
			}
			
		}
		for(i = 0; i < n; i++) {

			if (array[i] > aux1 && array[i] < aux2) {
				aux1 = array[i];
			}

		}
		
		System.out.println("second largest number in array is " + aux1);
		
		sc.close();
	}
}
