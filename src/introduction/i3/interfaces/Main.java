package introduction.i3.interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jeff Winger", "it15001");
        Student student2 = new Student("Britta Perry", "it15002");
        Student student3 = new Student("Annie Edison", "it15003");

        Course course1 = new Course("Sailing", 5);
        Course course2 = new Course("Ladders", 5);
        Course course3 = new Course("Nicolas Cage, Good or Bad?", 5);
        Course course4 = new Course("Advanced breath holding", 5);

        ArrayList<Printable> printables = new ArrayList<>();

        printables.add(student1);
        printables.add(student2);
        printables.add(student3);

        printables.add(course1);
        printables.add(course2);
        printables.add(course3);
        printables.add(course4);

        for (Printable printable : printables) {
            printable.printInfo();
        }

    }
}
