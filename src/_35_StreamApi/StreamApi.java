package _35_StreamApi;

import java.util.Arrays;
import java.util.List;

/*
 * 컬렉션과 배열에 저장된 데이터를 선언형으로 처리하기 위한 추상화된 반복 프레임워크
 * 데이터로부터 메소드 체이닝 형태로 여러 연산을 연결해 수행
 *
 * 간결성
 * 메소드 체이닝으로 인한 가독성 향상 및 간결해짐
 * 함수형 프로그래밍
 * */
public class StreamApi {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김영", "김일", "김이", "김삼", "김사", "최오", "최육", "박칠");

        // filter() => 어떠한 조건을 통해 거르는 것
        List<String> namesWithKim = names.stream()
                .filter(name -> name.startsWith("김"))
                .toList();
        System.out.println("김씨들: " + namesWithKim);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Map() => 내부 요소들에게 각각 메소드를 적용하는 형태
        List<Integer> multiNumbers = numbers.stream()
                .map(n -> n * 2)
                .toList();
        System.out.println(multiNumbers);

        List<String> englishNames = Arrays.asList("alice", "anya", "smith", "pascal", "bacon", "harry", "potter");

        // a로 시작하는 애들로 거르고, 모두 다 대문자로 변경
        List<String> result = englishNames.stream()
                .filter(name -> name.startsWith("a"))
                .map(String::toUpperCase) // name -> name.toUpperCase()
                // :: 해당 타입 클래스의 메소드를 직접 호출해서 각각 요소에 적용
                .sorted()
                .toList();
        System.out.println(result);
        result.forEach(name -> System.out.println(name));
        result.forEach(System.out::println);

        // for문
        int count1 = 0;
        for (String name : englishNames) {
            if (name.length() > 5) {
                count1++;
            }
        }
        System.out.println("갯수: " + count1);

        // stream
        long count2 = englishNames.stream()
                .filter(name -> name.length() > 5)
                .count();
        System.out.println(count2);
    }
}
