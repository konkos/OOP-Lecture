package introduction.i2.useThis;

public class Student {

    private final String name;
    private final String id;
    private Course myCourse;

    public Student(String aName, String id) {
        name = aName;
        this.id = id;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("AM: " + id);

        System.out.println("My course is: " + myCourse.getName());
    }

    public void setCourse(Course aCourse) {
        myCourse = aCourse;
    }

}
