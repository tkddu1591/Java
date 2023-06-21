package sub5;
/*
 * 날짜: 2023/06/20
 * 이름: 김상엽
 * 내용: Ch05. Java 클래스 상속 실습하기
 */

class parent{
	private int num1;
	private int num2;
	
	public parent(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int plus() {
		return num1 + num2;
	}
}
class child extends parent{
	private int num3;
	private int num4;
	
	public child(int num1,int num2, int num3, int num4) {
		super(num1,num2); // 부모클래스 생성자 호출
		
		this.num3 = num3;
		this.num4 = num4;
	}
	
	public int minus() {
		return num3-num4;
	}
}

public class InheritTest {
	public static void main(String[] args) {
		child c1 = new child(1, 2, 3, 4);
		int rs1 = c1.plus();
		int rs2 = c1.minus();
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		sonata.speedUp(80);
		sonata.speedTurbo();
		sonata.show();
		
		Truck bongo = new Truck("봉고", "남색", 0, 0);
		bongo.load(100);
		bongo.speedUp(60);
		bongo.show();
		
		//Account 상속개체 생성
		StockAccount kb = new StockAccount("이성계", "KB증권", "101-1132-1234", 10000, "삼성전자", 60000, 10);
		kb.disposit(1000000);
		kb.buy(56000,5);
		kb.sell(52000, 2);
		kb.show();
	}
	
}
