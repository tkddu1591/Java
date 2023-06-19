package sub2;

public class Account {
	private String name;
	private int balance;
	private String id;
	private String bank;
	
	//생성자 : 캡슐화된 속성을 초기화 하기 위한 메서드
	public Account(String name, String bank, String id, int balnace) {
		this.name = name;
		this.balance = balance;
		this.bank = bank;
		this.id = id;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public String getBank() {
		return this.bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	public int getBalance() {
		return this.balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	public void show() {
		System.out.println("-----------------");
		System.out.println("은행명 : "+this.bank);
		System.out.println("계좌번호 : "+this.id);
		System.out.println("예금주 : "+this.name);
		System.out.println("현재잔액 : "+this.balance);
		System.out.println("-----------------");
	}
	
	
}
