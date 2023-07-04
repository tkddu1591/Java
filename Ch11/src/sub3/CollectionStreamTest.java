package sub3;
/*
* 날짜 : 2023/07/04
* 이름 : 김상엽
* 내용 : Java 컬렉션 스트림 실습하기
*
* 스트림(Stream)
*  - 컬렉션 원소를 람다식으로 일괄(batch) 처리할 수 있는 API
*  - 내부적으로 병렬처리를 수행하여 대용량 데이터 처리에 더 나은 성능 제공
*
* */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionStreamTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("김유신");
        names.add("김춘추");
        names.add("장보고");
        names.add("강감찬");
        names.add("이순신");

        //외부반복자를 이용한 출력
        for (String name : names) {
            System.out.println("name = " + name);
        }

        //내부반복자를 이용한 출력
        Stream<String> stream = names.stream();
        stream.forEach((name) -> System.out.println("name = " + name));

        List<Person> people = new ArrayList<>();
        people.add(new Person("김유신", 23));
        people.add(new Person("김춘추", 21));
        people.add(new Person("장보고", 33));
        people.add(new Person("강감찬", 43));
        people.add(new Person("이순신", 53));

        // 외부반복자를 이용한 출력
        for (Person man : people) {
            System.out.print("이름 = " + man.getName());
            System.out.println(", 나이 = " + man.getAge());
        }

        Stream<Person> stream1 = people.stream();
        stream1.forEach((man) -> System.out.println("name = " + man.getName() + ", age =" + man.getAge()));

    }
}
