package introduction.i1.staticField;

public class Main {

    public static void main(String[] args) {

        System.out.println("Number of Soldiers: " + Soldier.getCounter());

        Soldier S1 = new Soldier("YX101");
        Soldier S2 = new Soldier("ZL202");

        System.out.println("Number of Soldiers: " + Soldier.getCounter());
        System.out.println("Number of Soldiers: " + Soldier.getCounter());

        System.out.println(Math.sqrt(5.4));
    }

}
