package introduction.i3.inheritance;

public abstract class Student {
	
	protected String name;
	protected String id;
	
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public void printInfo() {
		System.out.println("This a student");
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
		System.out.println("--------------");
	}

}
