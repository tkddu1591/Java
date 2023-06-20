package sub3;

public class Account {
	
	private String name;
	private String bank;
	private String id;
	private int balance;
	
	public Account(String bank, String id, String name, int balance) {
		this.balance = balance;
		this.bank = bank;
		this.id = id;
		this.name = name;
	}
	
	public void disposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money)	{
		this.balance += money;
	}
	public void show() {
		System.out.println("*************");
		System.out.println("은행 이름: "+this.bank);
		System.out.println("예금주 이름: "+this.name);
		System.out.println("계좌 번호: "+this.id);
		System.out.println("잔액: "+this.balance );
		System.out.println("*************");
	}

}
