import java.util.Scanner;

public class LAB5_problema2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		String [] words = sentence.split(" ");
		int len = words.length;
		int min = Integer.MAX_VALUE, max = 0;
		String min_word = null, max_word = null;
		
		for (int i = 0; i < len; i++) {
			if(words[i].length() < min) {
				min = words[i].length();
				min_word = words[i];
			}
			
			if(words[i].length() > max) {
				max = words[i].length();
				max_word = words[i];
			}
		}
	
		System.out.println("Biggest word in string is: " + max_word);
		System.out.println("Smallest word in string is: " + min_word);
		
		
		sc.close();
	}
}
