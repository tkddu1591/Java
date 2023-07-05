package sub5;
/*
 * 날짜 : 2023/07/04
 * 이름 : 김상엽
 * 내용 : Java 컬렉션 스트림 실습하기
 *
 * 맵 스트림
 *  - 스트림 요소(컬렉션 원소)를 다른 요소로 변환시키는 스트림
 *  - map(), flatMap() 등
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapStreamTest {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("김유신", 23));
        people.add(new Person("김춘추", 21));
        people.add(new Person("장보고", 33));
        people.add(new Person("강감찬", 43));
        people.add(new Person("이순신", 53));

        people.stream().map(Person::getName).forEach(name -> System.out.print(name + ", "));

        List<String> list = Arrays.asList("1,2,3", "4,5,6", "7,8,9");
        System.out.println(list);

        list.stream()
                .flatMap(str -> Arrays.stream(str.split(",")))
                .forEach(num -> System.out.println(num + ", "));

        int result = list.stream().flatMapToInt(str ->
        {
            String[] strArr = str.split(",");
            int[] nums = new int[strArr.length];

            for (int i = 0; i < strArr.length; i++)
                nums[i] = Integer.parseInt(strArr[i]);

            return Arrays.stream(nums);
        }).sum();

        System.out.println("result = " + result);
    }
}
