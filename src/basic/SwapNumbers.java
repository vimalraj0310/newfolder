package basic;

public class SwapNumbers {

	public static void main(String[] args) {
//SwapNumber without using variable using logic
		int x = 10;
		int y = 3;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("x=" + x + "  y=" + y);

		int a = 5, b = 6;
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("a=" + a + " b=" + b);

	}

}
