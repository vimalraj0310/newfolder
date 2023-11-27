package learnPolymorphism;

public class MethodOverridden {
	//parent have bike child already have bike so that the parent
	//method will get and the child class method will be retained
	//this was happened in method overridden

	public static void main(String[] args) {
Child c=new Child();
c.house();
c.car();
c.bike();
	}

}
