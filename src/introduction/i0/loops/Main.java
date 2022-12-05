package introduction.i0.loops;

import java.util.Iterator;
import java.util.List;

public class Main {
    private static List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7);

    public static void main(String[] args) {

        simpleForLoop();
        iteratorLoop();
        simpleIterator();
    }

    private static void simpleIterator() {
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }

    private static void iteratorLoop() {
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.println(integer);
        }
    }

    private static void simpleForLoop() {
        for (int i = 0; i < integers.size(); i++) {
            Integer currentInt = integers.get(i);
            System.out.println(currentInt);
        }
    }
}
