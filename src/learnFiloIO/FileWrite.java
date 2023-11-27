package learnFiloIO;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWrite {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("/home/vimalraj/Documents/FileIoIn_java/read.txt");
			String s="and i am a software Developer";
			fw.write(s);
			fw.close();
			FileReader fr=new FileReader("/home/vimalraj/Documents/FileIoIn_java/read.txt");
			int i=0;
			String s1="";
			while((i=fr.read())!=-1) {
				
				s1=s1+(char)i;
			}
			
			
			System.out.println(s1);
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println("error");
		}

	}

}
