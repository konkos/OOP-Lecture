package introduction.i2.useThis;

public class Course {

    private final String name;
    private final Student[] enrolledStudents;
    private int counter;

    public Course(String text) {
        name = text;
        enrolledStudents = new Student[20];
        counter = 0;
    }

    public void addStudent(Student s) {
        if (counter < 20) {
            enrolledStudents[counter] = s;
            s.setCourse(this);
            counter++;
        }
    }

    public void printStudentsInfo() {
        for (int i = 0; i < counter; i++) {
            enrolledStudents[i].printInfo();
        }
    }

    public String getName() {
        return name;
    }

}
