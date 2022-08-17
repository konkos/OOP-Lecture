package dataStructures.hashset.hashset2;

import java.util.HashSet;


public class Main {

    public static void main(String[] args) {

        BankAccount BA1 = new BankAccount(1500, "001");
        BankAccount BA2 = new BankAccount(1500, "001");

        HashSet<BankAccount> hashSet = new HashSet<BankAccount>();

        hashSet.add(BA1);
        hashSet.add(BA2);

        for (BankAccount account : hashSet)
            System.out.println(account.getCode() + ", "
                    + account.getBalance());

    }

}
