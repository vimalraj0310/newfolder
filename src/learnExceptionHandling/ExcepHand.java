package learnExceptionHandling;

public class ExcepHand {
//unexpected condition / situation in which our code fails to run /execute
	//runtime exception are
	//arithmetic exception ,stringIndexoutofBound exception
	//arrayIndexoutofbound exception
	
	//compile time Exception are
	//MutliThreading
	//file I/O
	public static void main(String[] args) {
		try{//1.arithmeticException
		int a=5;
		int b=0;
		System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
		
		//2.StringIndexOutOfBound Exception
		try {
		String s="vimal";
		System.out.println(s.charAt(6));//array exception same like this one
		}
		catch(Exception e) {
			System.out.println("error");
		}
	
	}

}
