import java.io.*;

public class problema1 {

	public static void main(String[] args) {
		try {
			LineNumberReader aaa = new LineNumberReader  (new FileReader ("test01.in"));
			
			String line = new String();
	
			while ((line = aaa.readLine()) != null) {
				if(aaa.getLineNumber() % 2 == 1)
					System.out.println(line);

			}
			
			
		}
		catch (IOException e) {
			System.out.println(e);
			
		}
		catch(IndexOutOfBoundsException e2) {
			System.out.println(e2);
		}
		finally {
				//aaa.close();   ????????????
			
		}

	}

}
