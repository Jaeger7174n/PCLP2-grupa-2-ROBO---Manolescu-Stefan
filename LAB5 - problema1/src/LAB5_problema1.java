import java.util.Scanner;

public class LAB5_problema1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a password: ");
		String s = sc.nextLine();
		int verif = 1;
		
		while(verif == 1) {
			
			verif = 0;
			
			if (s.length() < 8) {
				System.out.println("password too short, enter another one: ");
				s = sc.nextLine();
				verif = 1;
			}
			if (s.contains(" ")) {
				System.out.println("password cannot contain a space, enter another one: ");
				s = sc.nextLine();
				verif = 1;
			}
			
			if(Character.isLowerCase(s.charAt(0))) {
				System.out.println("password must begin with an upper case letter, enter another one: ");
				s = sc.nextLine();
				verif = 1;
			}
			
			if(s.matches("[a-zA-Z0-9]+")) {
				System.out.println("password must have a special character in it, enter another one: ");
				s = sc.nextLine();
				verif = 1;
			}
		}
		
		System.out.println("password is aight");

		
		
		sc.close();

	}

}
