package multiThread;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;

class A extends Thread
{
	public void run() {
		int a = 10;
		int b = 3;
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a=" + a + " " + "b=" + b);
	}
}
class B extends Thread
{
	public void run() {
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
class C extends Thread
{
	public void run() {
		int a=10;
		int c=100;
		int d=c*a;
		System.out.println(d);
}
}
public class MT {

	public static void main(String[] args) {
A a=new A();
B b=new B();
C c=new C();
a.start();
b.start();
c.start();

	}

}
