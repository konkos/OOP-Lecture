package introduction.i3.inheritance;

import javax.swing.*;
import java.util.ArrayList;

public class DataEntry {

    public static void readInput(ArrayList<Student> students) {
        boolean more = true;

        while (more) {

            String type = JOptionPane.showInputDialog("What type of student? 1:Graduate, 2: PhD");
            int selection = Integer.parseInt(type);
            String name = JOptionPane.showInputDialog("Please enter the name: ");
            String id = JOptionPane.showInputDialog("Please enter the id: ");
            String supervisor = null;
            String thesis = null;
            if (selection == 1)
                supervisor = JOptionPane.showInputDialog("Please enter the supervisor: ");
            else {
                thesis = JOptionPane.showInputDialog("Please enter the thesis: ");
            }

            Student s;

            if (selection == 1) {
                s = new GraduateStudent(name, id, supervisor);
            } else {
                s = new PhDStudent(name, id, thesis);
            }
            students.add(s);

            String answer = JOptionPane.showInputDialog("More students? (Y/N)");
            if (answer.equals("N"))
                more = false;
        }

    }

}
