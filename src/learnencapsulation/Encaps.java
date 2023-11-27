package learnencapsulation;
//encapsulation only with instance data variable for data hiding
//RULES FOR ENCAPSULATION

//1.data variable should be marked as private
//2.use getter & setter method to access data variable


public class Encaps {
private	int id;
private	String name;
private	String position;
	

	public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getPosition() {
	return position;
}


public void setPosition(String position) {
	this.position = position;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
