package sub1;
/**
 * 날짜 : 2023/06/27
 * 이름 : 김상엽
 * 내용 : Ch07. Java Object 클래스 실습하기
 *  
 *  Object 클래스
 *   - 자바의 최상위 클래스로 모든 클래스는 Object를 암시적으로 상속받음
 *   - 주요 기능은 개체 비교를 위한 equals(), 객체 정보 조회를 위한 toString() 제공
 */

public class ObejctTest {
	public static void main(String[] args) {
		
		// Object 타입으로 다형성 적용
		Object apple1 = new Apple("한국", 3000);
		Object apple3 = new Apple("한국", 3000);
		Object apple2 = new Apple("일본", 2000);
		
		// toString() : 객체의 정보 조회
		System.out.println(apple1);
		System.out.println(apple2);
		String a = "new";
		System.out.println(a.toString());
		
		
		
		// 객체 비교
		if(apple1==apple3){
			System.out.println("a1, a2 주소 동일");
		}
		else
			System.out.println("a1, a2 주소 다름");

		if(apple1.equals(apple3)){
			System.out.println("a1, a2 가리키는 객체가 동일");
		}
		else
			System.out.println("a1, a2 가리키는 객체가 다름");

		
	}
}
