import java.util.Scanner;

public class LAB5_problema5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String sentence = sc2.nextLine();
		String [] words = sentence.split(" ");
		int len = words.length;	
		
		System.out.println("Which word do you want to replace?");
		int i = sc.nextInt();
		
		System.out.println("What do you want to replace it with?");
		
		String replacement = sc2.nextLine();
		
		words[i-1] = replacement;
		
		for(int j = 0; j < len; j++) {
			System.out.print(words[j] + " ");
		}
		
		
		sc.close();
		sc2.close();
	}

}
