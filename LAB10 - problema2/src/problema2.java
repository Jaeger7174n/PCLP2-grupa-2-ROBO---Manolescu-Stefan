import java.io.*;
import java.util.*;

public class problema2 {

	public static void main(String[] args) {
		try {
			BufferedWriter out = new BufferedWriter (new FileWriter("test02.txt"));
			String line = new String();
			Scanner sc = new Scanner(System.in);
			while (!(line = sc.nextLine()).equals("exit")) {
				
				out.write(line + '\n');
			}
			out.close();
			BufferedReader in = new BufferedReader (new FileReader ("test02.txt"));
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
			in.close();
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		

	}

}
