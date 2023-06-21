package sub5;

public class StockAccount extends Account {

	private String stock;
	private int price;
	private int amount;
	
	public StockAccount(String name, String bank, String id, int balance, String stock, int price, int amount) {
		super(name, bank, id, balance);
		this.stock = stock;
		this.price = price;
		this.amount = amount;
	}
	
	public void sell(int price, int amount) {
		this.amount -=amount;
		this.price =price;
		this.balance += this.price*amount;
	}
	public void buy(int price, int amount) {
		this.amount +=amount;
		this.price =price;
		this.balance -= this.price*amount;	
		}
	@Override
	public void show() {
		System.out.println("증권사 : "+this.bank);
		System.out.println("계좌번호 : "+this.id);
		System.out.println("예금주 : "+this.name);
		System.out.println("현재잔액 : "+this.balance);
		System.out.println("주식종목 : "+this.stock);
		System.out.println("주식수량 : "+this.amount);
		System.out.println("현재가격 : "+this.price);
	}
	
}
