package sub3;

public class Apple {

	private String country;
	private int price;
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("원산지 : "+country);
		System.out.println("가격 : "+price);
	}
	
	@Override //toString() 대부분 정보 출력 메서드
	public String toString() {
		String result = "원산지 : "+country+"\n가격 : "+price;
		return result;
	}
}
