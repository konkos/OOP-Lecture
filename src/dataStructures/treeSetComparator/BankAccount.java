package dataStructures.treeSetComparator;

class BankAccount {
    private final String id;
    private final double balance;
    private final String holderName;

    public BankAccount(String id, double balance, String holderName) {
        this.id = id;
        this.balance = balance;
        this.holderName = holderName;
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