import java.io.*;


public class problema2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\demo\\file.txt");
		cat (file);
	}
	
	public static void cat(File file) {
	    RandomAccessFile input = null;
	    String line = null;

	    try {
	        input = new RandomAccessFile(file, "r");
	        while ((line = input.readLine()) != null) {
	            System.out.println(line);
	        }
	        return;
	    } 
	    catch(IOException e) {
	    	System.out.println("A aparut o eroare");
			System.out.println("Eroare: " + e);
	    }
	    finally {
	        if (input != null) {
	            //input.close();
	        }
	    }
	}

}
