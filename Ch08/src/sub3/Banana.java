package sub3;

public class Banana {

	private String country;
	private int price;
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	@Override //toString() 대부분 정보 출력 메서드
	public String toString() {
		String result = "원산지 : "+country+"\n가격 : "+price;
		return result;
	}
}
