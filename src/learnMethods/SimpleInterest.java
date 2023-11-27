package learnMethods;

public class SimpleInterest {
	double SimpleIns(double p, double n, double r) {
		double SI = (p * n * r) / 100;
		System.out.println(SI);
		return SI;

	}

	void rateOfInterst() {
		System.out.println("your interst is = 7.75");

	}

	public static void main(String[] args) {

		SimpleInterest Simple = new SimpleInterest();
		Simple.SimpleIns(100000.00, 2.50, 7.75);
		Simple.rateOfInterst();

	}

}
