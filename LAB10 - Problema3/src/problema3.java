import java.io.*;

public class problema3 {

	public static void main(String[] args) {
		FileReader in;
		try {
			in = new FileReader(new File("test02.in"));
			StreamTokenizer str = new StreamTokenizer(in);
			int i = 0;
			
			
			while(str.nextToken() != StreamTokenizer.TT_EOF) {
				if(str.ttype == StreamTokenizer.TT_WORD)
					i++;
				
			}
			System.out.println("In fisier sunt "+ i + " de cuvinte");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
			
		}
	}

}
