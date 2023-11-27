package learnPolymorphism;

public class MethodOverload {

	String emp1(int id, String name, String position) {
		System.out.println("empolyee id :" + id);
		
		System.out.println("empolyee name :" + name);
		
		System.out.println("empolyee position :" + position);
		System.out.println();


		return name;

	}

	String emp2(int id, String name) {
		System.out.println("empolyee id :" + id);
		System.out.println("empolyee name :" + name);
		System.out.println();

		return name;

	}

	String emp(int id, String name, String position,long mobileno) {
		System.out.println("empolyee id :" + id);
		System.out.println("empolyee name :" + name);
		System.out.println("empolyee position :" + position);
		System.out.println("empolyee Number :" +mobileno);


		return name;

	}

	public static void main(String[] args) {
		MethodOverload ML=new MethodOverload();
		ML.emp2(1, "vimal");
		ML.emp1(2, "yasin", "developer");
		ML.emp(1, "vimal", "developer", 7670828);
		

	}

}
