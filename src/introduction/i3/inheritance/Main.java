package introduction.i3.inheritance;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		//DataEntry de = new DataEntry();
		DataEntry.readInput(students);
		
		for(Student student:students)
			student.printInfo();       ///������������� 
	}
}
