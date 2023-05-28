import java.util.*;

public class LAB5_problema3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String word1 = sc.nextLine();
		
		System.out.println("Enter another word: ");
		String word2 = sc.nextLine();
		
		if(word1.length() != word2.length()) {
			System.out.println("words are not anagrams");
		}
		else {
			char [] word1_aux = word1.toCharArray();
			Arrays.sort(word1_aux);
			char [] word2_aux = word2.toCharArray();
			Arrays.sort(word2_aux);
			
			if (Arrays.equals(word1_aux, word2_aux)) {
				System.out.println("words are anagrams");
			}
			else {
				System.out.println("words are not anagrams");
			}
			
			
		}
		
		
		sc.close();
	}

}
