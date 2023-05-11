import java.io.*;

public class problema4 {
	public static void main(String[] args) {
		
		try {
		FileReader words = new FileReader ("\\words.in");
		
		FileReader extensions = new FileReader ("\\extensions.in");
		
		
		Filefil a = new Filefil(words, extensions);
		RandomAccessFile b = new RandomAccessFile("\\director");
		
		if(a.accept(b))
			System.out.println(b.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
