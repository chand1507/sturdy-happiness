package day6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFiles {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileReader inputStream = new FileReader("Sampleinput.txt");
				FileWriter outputStream = new FileWriter("sampleOutput.txt");){
			int c;
			while ((c = inputStream.read())!=-1) {
				outputStream.write(c);
				
			}
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}


