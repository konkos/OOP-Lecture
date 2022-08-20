package dataStructures.treeSetComparator;

import java.util.Comparator;

class AccountCodeComparator implements Comparator<BankAccount> {

    public int compare(BankAccount account1, BankAccount account2) {
        String code1 = account1.getId();
        String code2 = account2.getId();

        return code1.compareTo(code2);
    }
}