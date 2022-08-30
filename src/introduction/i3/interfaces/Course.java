package introduction.i3.interfaces;

public class Course implements Printable {

    private final String name;
    private final int credits;

    public Course(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public void printInfo() {
        System.out.println("This a Course");
        System.out.println("Name: " + name);
        System.out.println("Credits: " + credits);
        System.out.println("--------------");
    }
}
