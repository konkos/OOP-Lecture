package introduction.i3.inheritance;

public class PhDStudent extends Student {
    private final String thesis;

    public PhDStudent(String name, String id, String thesis) {
        super(name, id);
        this.thesis = thesis;
    }

//    public void printInfo() {
//        System.out.println("This a PhD student");
//        System.out.println("Name: " + name);
//        System.out.println("Id: " + id);
//        System.out.println("Thesis: " + thesis);
//        System.out.println("--------------");
//    }

}
