package sub1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Account {
	
	String bank;
	String id;
	String name;
	int balance; //잔액
	
	void setBank(String bank) {
		this.bank = bank;
	}
	String getBank() {
		return this.bank;
	}
	
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	public void show()throws IOException {
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("---------------------\n");
		bw.write("은행명 : "+this.bank+"\n");
		bw.write("계좌번호 : "+this.id+"\n");
		bw.write("입금주 : "+this.name+"\n");
		bw.write("현재잔액 : "+String.valueOf(this.balance)+"\n");
		bw.write("---------------------"+"\n");
		bw.flush();
		
	}
	
}
