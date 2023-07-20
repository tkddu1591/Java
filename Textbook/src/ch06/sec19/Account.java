package ch06.sec19;

public class Account {
    private int balance;

    private final int MAX_BALANCE = 1000000;
    private final int MIN_BALANCE = 0;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance <= MAX_BALANCE && balance >= MIN_BALANCE)
            this.balance = balance;
    }
}
