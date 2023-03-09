import java.util.Scanner;

public class problema3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number:");
		float i=sc.nextFloat();
		float sq,cub,fp;
		sq = i * i;
		cub = sq * i;
		fp = cub * i;
		
		System.out.format("square of number is : %.2f\n", sq);
		System.out.format("cube of number is : %.2f\n", cub);
		System.out.format("fourth power of number is : %.2f\n", fp);
		sc.close();
	}

}
