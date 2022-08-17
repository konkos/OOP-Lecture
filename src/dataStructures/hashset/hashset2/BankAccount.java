package dataStructures.hashset.hashset2;

public class BankAccount {

    private final double balance;
    private final String code;

    public BankAccount(double balance, String code) {
        this.balance = balance;
        this.code = code;
    }

    public double getBalance() {
        return balance;
    }

    public String getCode() {
        return code;
    }

    public int hashCode() {
        return code.hashCode();
    }

    public boolean equals(Object other) {
        BankAccount otherAccount = (BankAccount) other;
        return this.code.equals(otherAccount.code);
    }
}
