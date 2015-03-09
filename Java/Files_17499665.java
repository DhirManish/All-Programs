

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.StringTokenizer;

public class Files_17499665 {

	public static void main(String [] args){
		
		//Creating BufferedReader to accept the file name from the user
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String fileName = null;
		System.out.print("Please enter the file name with path: ");
		//try{
			fileName = (String) br.readLine();
			
			//Creating the BufferedReader to read the file
			File textFile = new File(fileName);
			BufferedReader input = new BufferedReader(new FileReader(textFile));
			
			//Creating the Map to store the words and their occurrences
			TreeMap<String, Integer> frequencyMap = new TreeMap<String, Integer>();
			String currentLine = null;
			
			//Reading line by line from the text file
			while((currentLine = input.readLine()) != null){
				
				//Parsing the words from each line
				StringTokenizer parser = new StringTokenizer(currentLine, " \t\n\r\f.,;:!?'\""); 
				while(parser.hasMoreTokens()){
					String currentWord = parser.nextToken();
					
					Integer frequency = frequencyMap.get(currentWord); 
					if(frequency == null){
						frequency = 0;						
					}
					Putting each word and its occurrence into Map 
					frequencyMap.put(currentWord, frequency + 1);
				}
				
			}
			
			//Displaying the Result
			System.out.println(frequencyMap);
			
		}catch(IOException ie){
			ie.printStackTrace();
			System.err.println("Your entered path is wrong");
		}		
		
	}
	
}
