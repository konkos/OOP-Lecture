package introduction.i2.studentCourseWithArrayList;

import java.util.ArrayList;

public class Course {

    private final String name;
    private final ArrayList<Student> enrolledStudents;

    public Course(String text) {
        name = text;
        enrolledStudents = new ArrayList<Student>();
    }

    public void addStudent(Student s) {
        enrolledStudents.add(s);
    }

    public void printStudentsInfo() {
        for (int i = 0; i < enrolledStudents.size(); i++) {
            enrolledStudents.get(i).printInfo();
        }
    }

    public String getName() {
        return name;
    }

}

