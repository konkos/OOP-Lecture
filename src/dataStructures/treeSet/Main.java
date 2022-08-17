package dataStructures.treeSet;

import java.util.Collection;
import java.util.TreeSet;

public class Main {


    public static void main(String[] args) {

        Collection<String> set = new TreeSet<String>();

        set.add("Olga");
        set.add("Nikos");
        set.add("Babis");
        set.add("Takis");

        for (String name : set)
            System.out.println(name);

    }

}
