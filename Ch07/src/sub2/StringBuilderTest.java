package sub2;
/**
 * 날짜 : 2023/06/27
 * 이름 : 김상엽
 * 내용 : Ch07. StringBuilder 클래스 실습하기
 */
public class StringBuilderTest {
	
	public static void main(String[] args) {
		
		//String immutable 특성
		String str = "Java";
		System.out.println("str 객체 주소값 : "+ System.identityHashCode(str));
		
		
		str += " Programming";
		System.out.println("str 객체 주소값 : "+ System.identityHashCode(str));
		
		//Stirng의 immutable 기능을 개선 (Stringbuilder)
		
		StringBuilder sb =new StringBuilder("Java");
		System.out.println("sb 객체 주소값 : "+ System.identityHashCode(sb));
		
		str += " Programming";
		System.out.println("sb 객체 주소값 : "+ System.identityHashCode(sb));
		
		
	}
	
}