package sub3;

import java.util.ArrayList;
import java.util.List;


/**
 * 날짜 : 2023/06/28
 * 이름 : 김상엽
 * 내용 : Ch07. List 실습하기
 * 
 * 
 * List
 *  - 배열과 유사하지만 동적으로 생성되는 선형 자료구조
 *  - List를 구현한 ArrayList
 */
public class ListTest {
	
	public static void main(String[] args) {
		
		// List 생성
		List<Integer> list = new ArrayList<>();
		
		// 데이터 입력
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//데이터삽입
		list.add(1,6);
		
		//데이터삭제
		list.remove(2);
		
		//데이터출력
		for(int i : list) {
			System.out.println(i);
		}
		System.out.println(list);
		
		//list크기
		System.out.println(list.size());
	
		//문지열 리스트
		List<String> people=new ArrayList<>();
		people.add("김유신");
		people.add("김춘추");
		people.add("강감찬");
		people.add("이순신");
		people.add("장보고");
		
		System.out.println(people);
		
		//객체 리스트
		
		List<Apple> apples = new ArrayList<>();
		Apple a1= new Apple("한국", 3000);
		Apple a2= new Apple("미국", 2000);
		apples.add(a1);
		apples.add(a2);
		apples.add(new Apple("일본", 1000));
		System.out.println(apples);
	
		Apple apple = apples.get(0);
		System.out.println(apples.get(0));
		
		apple.show();
		apples.get(1).show();
		apples.get(2).show();
		
	}
	
	
	
	
}
