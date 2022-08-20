package dataStructures.treeSetComparator;

import java.util.Comparator;

class AccountNameComparator implements Comparator<BankAccount> {

    public int compare(BankAccount account1, BankAccount account2) {
        String name1 = account1.getHolderName();
        String name2 = account2.getHolderName();

        return name1.compareTo(name2);
    }
}