package introduction.i3.inheritance;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DataEntry {
	
	public static void readInput(ArrayList<Student> students) {
        boolean more = true;
		
		while(more) {
			
			String type = JOptionPane.showInputDialog("What type of student? 1:Student, 2: Graduate");
			int selection = Integer.parseInt(type);
			String name = JOptionPane.showInputDialog("Please enter the name: ");
			String id = JOptionPane.showInputDialog("Please enter the id: ");
			String supervisor = null;
			
			if(selection == 2)
				supervisor = JOptionPane.showInputDialog("Please enter the supervisor: ");
			
			Student s;
			
			if(selection == 1) {
				s = new Student(name, id);
			}
			else {
				s = new GraduateStudent(name, id, supervisor);
			}	
			students.add(s);
			
			String answer = JOptionPane.showInputDialog("More students? (Y/N)");
			if(answer.equals("N"))
				more = false;
		}
		
	}

}
