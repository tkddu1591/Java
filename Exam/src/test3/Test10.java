package test3;
/*
 * 날짜: 2023/06/23
 * 이름: 김상엽
 * 내용: 인터페이스 연습문제
 */
interface Buyer{
	public void buy();
}
interface Seller{
	public void sell();
}

class Customer1 implements Buyer, Seller{
	public void sell() {
		System.out.println("판매하기");
	}
	public void buy() {
		System.out.println("구매하기");
	}
}

public class Test10 {
	public static void main(String[] args) {
		Buyer buyer =  new Customer1();
		Seller seller 	= new Customer1();
		
		buyer.buy();
		seller.sell();
	}

}
