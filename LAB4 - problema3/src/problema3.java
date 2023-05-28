import java.util.Scanner;

public class problema3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("number of elements in array:");
		int n = sc.nextInt();
		int array[] = new int [n];
		int i,j;
		for(i = 0; i < n; i++) {
			System.out.println("enter element " + (i+1) + " out of " + n);
			array[i] = sc.nextInt();
		}
		
		for(i = 0; i < n-1; i++) {
			for(j = i+1; j < n; j++) {
				if (array [j] == array [i]) {
					System.arraycopy(array, j+1, array, j, n-j-1);
					n--;
				}
			}
		}
		
		for(i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
			
		}
		
		sc.close();
	}

}
