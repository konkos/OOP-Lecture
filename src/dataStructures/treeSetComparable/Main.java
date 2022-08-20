package dataStructures.treeSetComparable;

import java.util.Collection;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Collection<BankAccount> set = new TreeSet<BankAccount>();

        BankAccount BA1 = new BankAccount("001", 1500, "Papadopoulos");
        BankAccount BA2 = new BankAccount("002", 2500, "Nikolaou");
        BankAccount BA3 = new BankAccount("003", 1000, "Petrou");

        set.add(BA1);
        set.add(BA2);
        set.add(BA3);

        for (BankAccount account : set) {
            System.out.println(account.getId() + ", " + account.getBalance() + ", " + account.getHolderName());
        }


    }
}
