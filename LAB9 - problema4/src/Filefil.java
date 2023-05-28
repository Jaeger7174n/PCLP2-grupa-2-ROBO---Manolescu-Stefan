import java.io.*;


public class Filefil implements FileFilter {

	private FileReader words,extensions;
	public Filefil(FileReader words, FileReader extensions) {
		this.words = words;
		this.extensions = extensions;
	}
	@Override
	public boolean accept(File pathname) {
		
		String Cuvant;
		String Extensie;
		BufferedReader words_in = new BufferedReader(this.words);
		BufferedReader extensions_in = new BufferedReader(this.extensions);
		try {
		while((Cuvant = words_in.readLine()) != null) {
			while ((Extensie = extensions_in.readLine()) != null) {
				if(pathname.getPath().contains(Cuvant) && pathname.getPath().contains(Extensie))
					return true;
			}
		}
		}
		catch(IOException e) {
			
		}

		return false;
	}

	
}
