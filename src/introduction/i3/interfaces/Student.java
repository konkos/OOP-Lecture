package introduction.i3.interfaces;

public class Student implements Printable {

    protected String name;
    protected String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void printInfo() {
        System.out.println("This a student");
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("--------------");
    }

}
