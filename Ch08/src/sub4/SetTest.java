package sub4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 날짜 : 2023/06/28
 * 이름 : 김상엽
 * 내용 : Ch07. Set 실습하기
 * 
 *  집합(Set)
 *   - 입력된 데이터의 순서를 고려하지 않고, 중복을 허용하지 않는 자료구조
 *   - 중복된 데이터를 제거 또는 데이터 존재여부 확인
 */
public class SetTest {
	public static void main(String[] args) {
		//집합생성
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(5);
		System.out.println(set);
		
		//반복자(Iterator)를 이용한 데이터 출력
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}
