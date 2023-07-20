package ch06.sec19;

public class Sec19 {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(10000);
        System.out.println("현재 잔고 : "+account.getBalance());
        account.setBalance(-1000);
        System.out.println("현재 잔고 : "+account.getBalance());
        account.setBalance(20000000);
        System.out.println("현재 잔고 : "+account.getBalance());
        account.setBalance(300000);
        System.out.println("현재 잔고 : "+account.getBalance());
    }
}
