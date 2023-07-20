package ch06.sec20;

public class Account {
    private String id;
    private String name;
    private int balance;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void show(){
        System.out.println(this.id+"\t"+this.name+"\t"+this.balance);
    }
    public void deposit (int money){
        this.balance+=money;
    }
    public void withdraw(int money){
        this.balance-=money;
    }

}
