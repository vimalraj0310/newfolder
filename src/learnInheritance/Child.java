package learnInheritance;

public class Child extends Parent{
	int multiply(int a,int b) {
		int c=a*b;
		System.out.println(a+"*"+b+"="+c);
		return c;
	}
	int divide(int a,int b) {
		int c=a/b;
		System.out.println(a+"/"+b+"="+c);
		return c;
	}
	

}
