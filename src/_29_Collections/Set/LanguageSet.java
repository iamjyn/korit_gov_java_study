package _29_Collections.Set;

import java.util.*;

/*
* 1. "Java", "Python", "C", "Python", "Java", "Java", "C++", "C#", "C", "Java"
* 요소들을 리스트에 넣기
* 2. 중복 제거 후 출력
* 3. 오름차순 정렬된 상태 출력
* 4. 특정과목 변수에 Java 대입하고 맨 처음 만든 리스트에서 몇개 있는지 출력 (검색)
* 5. 중복 제거 한 뒤의 set 이용해서 중복 제거된 후의 언어 갯수 출력
* */
public class LanguageSet {
    public static void main(String[] args) {
        List<String> subList = new ArrayList<>(Arrays.asList(
                "Java", "Python", "C", "Python", "Java", "Java", "C++", "C#", "C", "Java"));
        Set<String> subSet = new HashSet<>();
        subSet.addAll(subList);
        System.out.println("중복 제거: " + subSet);
        List<String> subList2 = new ArrayList<>();
        subList2.addAll(subSet);
        Collections.sort(subList2);
        System.out.println("오름차순 정렬: " + subList2);

        int count = 0;
        for (String sub : subList) {
            if ("Java".equals(sub)) {
                count++;
            }
        }
//        String sub = "Java";
//        int count = Collections.frequency(subList, sub);
        System.out.println("Java 갯수: " + count);
        System.out.println("중복 제거 후 갯수: " + subList2.size());
    }
}
