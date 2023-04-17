import java.util.Scanner;

public class problema2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 3,m = 4;
		int array1[][] = new int [n][m];
		int array2[][] = new int [n][m];
		int sum_array[][] = new int [n][m];
		int i,j;
		for(i = 0; i < n; i++) {
			for(j = 0; j < m; j++) {
				System.out.println("enter element "+ (i + 1) +" , " + (j + 1) + " of matrix 1");
				array1[i][j] = sc.nextInt();
			}
		}
		for(i = 0; i < n; i++) {
			for(j = 0; j < m; j++) {
				System.out.println("enter element "+ (i + 1) +" , " + (j + 1) + " of matrix 2");
				array2[i][j] = sc.nextInt();
			}
		}
		for(i = 0; i < n; i++) {
			for(j = 0; j < m; j++) {
				sum_array[i][j] = array1[i][j] + array2[i][j];
				System.out.print(sum_array[i][j] + " ");
			}
			System.out.print("\n");
		}
		sc.close();
		
		
	}
}
