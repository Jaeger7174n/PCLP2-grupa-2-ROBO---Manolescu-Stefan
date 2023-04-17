import java.util.Scanner;

public class problema4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("square matrix size: ");
		int n =sc.nextInt();
		int array[][] = new int [n][n];
		int i, j, trace = 0;
		for(i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				System.out.println("enter element "+ (i + 1) +" , " + (j + 1) + " of matrix");
				array[i][j] = sc.nextInt();
			}
		}
		for(i = 0; i < n; i++) {
			trace += array[i][i];
		}
		System.out.println("trace of matrix is : " + trace);
		
		sc.close();

	}

}
