package introduction.i2.studentCourse;

public class Course {

    private final String name;
    private final int credits;

    public Course(String text, int number) {
        name = text;
        credits = number;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

}
