package introduction.i2.studentCourseWithArray;

public class Student {

    private final String name;
    private final String id;

    public Student(String text1, String text2) {
        name = text1;
        id = text2;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("AM: " + id);
    }

}
