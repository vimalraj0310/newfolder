package learnMethods;

public class FindAverage {
	double Average(double a, double b, double c, double d) {
		double average = (a + b + c + d) / 4.0;
		System.out.println(average);
		return average;
	}

	public static void main(String[] args) {
		FindAverage fndAvg = new FindAverage();
		fndAvg.Average(100, 34, 78, 1);
	}

}
