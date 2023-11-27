package learnFiloIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
FileReader fr;
try {
	fr = new FileReader("/home/vimalraj/Documents/FileIoIn_java/read.txt");
	int i=0;
	String s="";
	
		try {
			while((i=fr.read())!=-1) {
				
				s=s+((char)i);
				
				
			
}
			System.out.println(s);
			fr.close();
		
}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
