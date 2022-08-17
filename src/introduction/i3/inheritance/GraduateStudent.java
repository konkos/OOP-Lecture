package introduction.i3.inheritance;

public class GraduateStudent extends Student {
	
	private String supervisor;

	public GraduateStudent(String name, String id, String supervisor) {
		super(name, id);
		this.supervisor = supervisor;
	}
	
	//��������� ��� ������� printInfo
	public void printInfo() {
		System.out.println("This a graduate student");
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
		System.out.println("Supervisor: " + supervisor);
		System.out.println("--------------");
	}
	
	

}
