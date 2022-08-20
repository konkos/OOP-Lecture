package dataStructures.treeSetComparable;

class BankAccount implements Comparable {
    private final String id;
    private final double balance;
    private final String holderName;

    public BankAccount(String id, double balance, String holderName) {
        this.id = id;
        this.balance = balance;
        this.holderName = holderName;
    }

    public int compareTo(Object other) {
        BankAccount otherAccount = (BankAccount) other;
        if (this.balance < otherAccount.balance)
            return -1;
        else if (this.balance > otherAccount.balance)
            return 1;
        else
            return 0;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolderName() {
        return holderName;
    }

}
