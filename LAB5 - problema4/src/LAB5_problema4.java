import java.util.Arrays;
import java.util.Scanner;

public class LAB5_problema4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String word = sc.nextLine();
		String control = "foraibar";
		
		char [] word_array = word.toCharArray();
		char [] control_array = control.toCharArray();
		
		if(Arrays.equals(word_array,control_array)) {
			System.out.println("password is correct");
		}
		else {
			System.out.println("password is incorrect");
		}
		
		sc.close();
	}
}
