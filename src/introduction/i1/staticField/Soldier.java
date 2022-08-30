package introduction.i1.staticField;

public class Soldier {

    private static int counter = 0;
    private final String id;

    public Soldier(String anID) {
        id = anID;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

}
