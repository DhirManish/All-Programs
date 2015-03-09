import java.io.*;
import java.util.*;

class ArrayListFile {
	
		private ArrayList<String> words = new ArrayList<String>();

		public void ArrayListConstructor(String filename) throws IOException {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String line = br.readLine();
			while (line != null) {
				this.words.add(line);
				line = br.readLine();
			}
			System.out.println(words);
			br.close();
			
		 }
} 

public class WordList {
 public static void main(String[] args) throws IOException {
	ArrayListFile af = new ArrayListFile();
	af.ArrayListConstructor("file.txt");
	System.out.println();
    //System.out.println(words);
	}
}
