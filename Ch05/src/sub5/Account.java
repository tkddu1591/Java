package sub5;

public class Account {
	protected String name;
	protected String bank;
	protected String id;
	protected int balance;
	
	public Account(String name, String bank, String id, int balance) {
		this.name = name;
		this.balance = balance;
		this.bank =bank;
		this.id = id;
	}
	public void disposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	public void show() {
		System.out.println("은행 명 : "+this.bank);
		System.out.println("예금주 : "+this.name);
		System.out.println("계좌 : "+this.id);
		System.out.println("잔액 : "+this.balance);
	}
}
