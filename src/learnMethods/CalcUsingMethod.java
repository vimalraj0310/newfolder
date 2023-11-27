package learnMethods;

public class CalcUsingMethod {
	public double Add(double a, double b) {
		double add = a + b;
		System.out.println(" a+b= " + add);
		return add;
	}

	public double Sub(double a, double b) {
		double sub = a - b;
		System.out.println(" a-b= " + sub);
		return sub;
	}

	public double Mul(double a, double b) {
		double mul = a * b;
		System.out.println(" a*b= " + mul);
		return mul;
	}

	public double Div(double a, double b) {
		double div = a / b;
		System.out.println(" a/b= " + div);
		return div;
	}

	public static void main(String[] args) {
		CalcUsingMethod calc = new CalcUsingMethod();
		calc.Add(1000.22, 39094.44);
		calc.Sub(323232, 2222);
		calc.Mul(180, 59);
		calc.Div(323232, 2222);

	}

}
